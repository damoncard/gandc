import Gui.*;
import Functions.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Actor {

	private static LogFace login;
	private static MainFace main;

	public static void main (String [] args) {
		login = new LogFace();
		login.getButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				signInActionPerformed(e);
			}
		});
		login.setVisible(true);
	}

	private static void mainPart() {
		main = new MainFace();
		login.dispose();
		main.setVisible(true);
	}

	private static void signInActionPerformed(ActionEvent e) {

		// Call method in model
		if (/*checkLogin()*/true) {
			mainPart();
		}
	}
}