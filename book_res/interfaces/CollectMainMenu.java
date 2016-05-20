
package book_res.interfaces;

public class CollectMainMenu {
    ReserveFace reserveFace;
    
    public CollectMainMenu() {
        reserveFace = new ReserveFace();
    }
    
    public void getReserve() {
        reserveFace.init();
    }
}
