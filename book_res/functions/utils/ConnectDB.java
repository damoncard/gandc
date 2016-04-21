package book_res.functions.utils;

import edu.sit.cs.db.CSDbDelegate;

public class ConnectDB {
    
    protected static CSDbDelegate db;
    
    public ConnectDB() {
        connect();
    }
    
    public static void connect() {
        db = new CSDbDelegate("csprog-in.kmutt.ac.th", "3306", "CSC105_G5", "csc105_2014", "csc105");
        System.out.println(db.connect());
    }
    
    public static void disconnect() {
        System.out.println(db.disconnect());
    }
}


