package Functions.utils;

import java.util.HashMap;

public class DBFunctions extends connectDB{
    
    public DBFunctions() {
        super();
    }
    
    public boolean checkUser(String id, String pass) {
        String sql = "SELECT * FROM R_ID WHERE Id = '" + id + "'";
        HashMap user = db.queryRow(sql);
        if (!user.isEmpty()) {
            if (String.valueOf(user.get("Pass")).equals(pass)) {
                return true;
            }
        } else {
            return false;
        }
    }

}
