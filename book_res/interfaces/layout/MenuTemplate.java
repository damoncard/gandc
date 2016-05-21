package book_res.interfaces.layout;

import book_res.interfaces.ReserveFace;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JButton;

public abstract class MenuTemplate {

	protected ArrayList<JButton> allMenus;
	protected AddFunction af;

	public MenuTemplate() {
		allMenus = new ArrayList<JButton>();
		af = new AddFunction();
		ReserveFace.pnlMenuButton.removeAll();
	}
		
	protected abstract void createButton(String n, double price);
	protected abstract void setPanel();
}