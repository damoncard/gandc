package book_res.functions.utils;

import java.util.HashMap;

public class DBLogin extends ConnectDB{
    
    public DBLogin() {
        super();
    }
    
    public boolean checkUser(String id, String pass) {
        connect();
        String sql = "SELECT * FROM R_ID WHERE Id = '" + id + "'";
        HashMap user = db.queryRow(sql);
        if (!user.isEmpty()) {
            if (String.valueOf(user.get("Pass")).equals(pass)) {
                return true;
            }
        }
        disconnect();
        return false;
    }
}
