
package Functions.util;

import java.util.HashMap;

public class LogQueuing extends Queuing{
    
    public LogQueuing() {
        super();
    }
    
    public int checkLogin(String id, String pass) {
        String sql = "SELECT * FROM R_ID WHERE Id = '" + id + "'";
        HashMap user = db.queryRow(sql);
        if (!user.isEmpty()) {
            if (String.valueOf(user.get("Pass")).equals(pass)) {
                return 1;
            } else {
                return 0;
            }
        } else {
            return -1;
        }
    }

}
