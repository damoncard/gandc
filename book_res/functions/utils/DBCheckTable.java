package book_res.functions.utils;

import java.util.HashMap;

public class DBCheckTable extends ConnectDB {

    public DBCheckTable() {
        super();
    }

    /**
     * @param date in 'YYYY-MM-DD' format
     * @param time in 'HH:MM' format
     * @param chairs
     * @return tableID that available in this date and time, -1 is in case that
     * don't have available tables
     */
    public int checkAvailable(String date, String time, int chairs) {
        int tableId = -1;
        String innerSelect = "SELECT * FROM OOSD_RESERVES AS R WHERE R.tableID = T.tableID";
        
        String sql = "SELECT tableID FROM OOSD_TABLES AS T WHERE chairs = " + chairs
                + " AND (NOT EXISTS (" + innerSelect + ")" // to get tableID that don't have any reserves
                +      " OR NOT EXISTS (" + innerSelect + " AND dateReserve = '" + date + "')" // get tableID that don't have reserve in this date
                +      " OR NOT EXISTS (" + innerSelect + " AND ('" + time + "' BETWEEN timeReserve + interval -2 hour AND timeReserve + interval 2 hour)) );";
        System.out.println(sql);
        HashMap table = db.queryRow(sql);

        if (table.isEmpty()) {
            return tableId; // if can't get any tables return -1
        }

        tableId = Integer.parseInt(String.valueOf(table.get("tableID")));
        return tableId;
    }
}

