package book_res.interfaces.layout;

import book_res.interfaces.MainFace;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JPanel;

abstract class MenuTemplate {

	protected ArrayList<JButton> allMenus;
	protected JPanel panel;

	public MenuTemplate(MainFace m) {
		panel = m.getMenuPane();
		allMenus = new ArrayList<JButton>();
	}

	protected abstract void createButton(String n, double price);
	protected abstract void setPanel();
}