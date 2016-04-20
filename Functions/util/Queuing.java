
package Functions.util;

import edu.sit.cs.db.CSDbDelegate;

public class Queuing {
    
    protected static CSDbDelegate db;
    
    public Queuing() {
        connectDb();
    }
    
    public static void connectDb() {
        db = new CSDbDelegate("csprog-in.kmutt.ac.th", "3306", "CSC105_G5", "csc105_2014", "csc105");
        System.out.println(db.connect());
    }
    
    public static void disConnectDb() {
        System.out.println(db.disconnect());
    }
}

class Main {
    //public static void main
}

