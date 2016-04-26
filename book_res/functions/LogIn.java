package book_res.functions;
import book_res.functions.utils.*;
import book_res.interfaces.LogFace;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LogIn {
    private static DBFunctions log = new DBFunctions();
    //private static ConnectDB con = new ConnectDB();
    private static String[] inUser;

    
    public boolean checkLogIn(LogFace z){
        inUser = z.getForm();
        if(log.checkUser(inUser[0], inUser[1])){
            System.out.println("pass");
        }
        System.out.println(inUser[0] + inUser[1]);
        return false;
    }
    
    public void setSignInButton(LogFace x){
        x.getButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkLogIn(x);
			}
		});
    }
}
