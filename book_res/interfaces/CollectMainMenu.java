
package book_res.interfaces;

public class CollectMainMenu {
    ReserveFace reserveFace;
    BillingFace billingFace;
    
    public CollectMainMenu() {
        reserveFace = new ReserveFace();
        billingFace = new BillingFace();
    }
    
    public void getReserve() {
        reserveFace.init();
    }
    
    public void getBilling() {
        billingFace.init();
    }
}
