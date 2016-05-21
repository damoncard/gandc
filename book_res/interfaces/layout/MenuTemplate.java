package book_res.interfaces.layout;

import book_res.functions.AddFunction;
import book_res.interfaces.ReserveFace;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JTable;

public abstract class MenuTemplate {

	protected ArrayList<JButton> allMenus;
	protected AddFunction af;

	public MenuTemplate() {
		allMenus = new ArrayList<JButton>();
		af = new AddFunction();
		ReserveFace.pnlMenuButton.removeAll();
	}
		
	protected abstract void createButton(String n, double price, JTable t);
	protected abstract void setPanel();
}