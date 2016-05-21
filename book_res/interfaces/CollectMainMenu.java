
package book_res.interfaces;

public class CollectMainMenu {
    ReserveFace reserveFace;
    BillingFace billingFace;
    BacklogFace backlogFace;
    
    public CollectMainMenu() {
        reserveFace = new ReserveFace();
        billingFace = new BillingFace();
        backlogFace = new BacklogFace();
    }
    
    public void getReserve() {
        reserveFace.init();
    }
    
    public void getBilling() {
        billingFace.init();
    }
    
    public void getBacklog() {
        backlogFace.init();
    }
}
