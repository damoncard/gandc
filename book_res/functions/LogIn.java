package book_res.functions;

import book_res.functions.utils.*;
import book_res.interfaces.LogFace;
import book_res.interfaces.Main;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import book_res.Actor;

public class LogIn {

    private static DBLogin log = new DBLogin();
    //private static ConnectDB con = new ConnectDB();
    private static String[] inUser;
    private Actor main = new Actor();

    public boolean checkLogIn(LogFace z) {
        inUser = z.getForm();
        if (log.checkUser(inUser[0], inUser[1])) {
            Main main = new Main();
            main.setVisible(true);
            main.setLocationRelativeTo(null);
        }
        return false;
    }

    public void setSignInButton(LogFace x) {
        x.getButton().addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                log.connect();
                checkLogIn(x);
                x.dispose();
                //log.disconnect();
            }
        });

    }
}
