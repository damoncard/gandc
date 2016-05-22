package book_res.functions.utils;

import java.util.ArrayList;
import java.util.HashMap;

public class DBBilling extends ConnectDB {

    public DBBilling() {
        super();
    }

    /**
     * to get all reserves in particular date
     *
     * @param date in format of "YYYY-MM-DD"
     * @return
     */
    public ArrayList<HashMap> getReserve(String date) {
        connect();
        String sql = "SELECT reserveID, tableID, customerName, timeReserve, timeReserve + interval 2 hour AS timeout "
                + " FROM OOSD_RESERVES AS R JOIN OOSD_CUSTOMERS AS C ON R.customerID = C.customerID"
                + " WHERE dateReserve = '" + date + "'"
                + " ORDER BY timeReserve";
        ArrayList<HashMap> queries = db.queryRows(sql);
        disconnect();
        return queries;
    }

    public ArrayList<HashMap> getBilling(int reserveID) {
        connect();
        String sql = "SELECT foodName, quantity, (price*quantity) AS total"
                + " FROM OOSD_RESERVES AS R, OOSD_ORDERS AS O, OOSD_FOODS AS F"
                + " WHERE R.reserveID = " + reserveID
                + " AND R.reserveID = O.reserveID and O.foodID = F.foodID";
        ArrayList<HashMap> queries = db.queryRows(sql);
        disconnect();
        return queries;
    }

    public void removeOrder(int reserveID) {
        connect();
        String sql = "DELETE FROM OOSD_ORDERS WHERE reserveID = " + reserveID;
        db.executeQuery(sql);
        
        sql = "DELETE FROM OOSD_RESERVES WHERE reserveID = " + reserveID;
        db.executeQuery(sql);
        disconnect();
    }

    public void updateBacklog(String date, int revenue, int tableID) {
        connect();
        String sql = "SELECT chairs FROM OOSD_TABLES WHERE tableID = " + tableID;
        int chairs = Integer.parseInt(String.valueOf(db.queryRow(sql).get("chairs")));

        sql = "SELECT * FROM OOSD_BACKLOG WHERE date = '" + date + "'";
        HashMap d = db.queryRow(sql);

        if (d.isEmpty()) {
            sql = "INSERT INTO OOSD_BACKLOG(date, revenue, noOfCustomer) VALUES( '"
                    + date + "', "
                    + revenue + ", "
                    + chairs + ") ";
            db.executeQuery(sql);
        } else {
            revenue += Double.parseDouble(String.valueOf(d.get("revenue")));
            chairs += Integer.parseInt(String.valueOf(d.get("noOfCustomer")));
            sql = "UPDATE OOSD_BACKLOG SET revenue = " + revenue + ", noOfCustomer = " + chairs + " WHERE date = '" + date + "'";
            db.executeQuery(sql);
        }
        disconnect();
    }

}
