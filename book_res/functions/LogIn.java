package book_res.functions;
import book_res.functions.utils.*;
import book_res.interfaces.LogFace;


public class LogIn {
    private static DBFunctions log = new DBFunctions();
    //private static ConnectDB con = new ConnectDB();
    private static LogFace userIn = new LogFace();
    private static String[] inUser;
    public boolean checkLogIn(){
        inUser = userIn.getForm();
        if(log.checkUser(inUser[0], inUser[1])){
            System.out.println("pass");
        }
            System.out.println(inUser[0] + inUser[1]);
            System.out.println("Not");
            return false;
    }
}
