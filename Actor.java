import Gui.*;
import Functions.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Actor {

	private static LogFace login;
	private static MainFace main;


	public static void main (String [] args) {
		login = new LogFace();
		signIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				signInActionPerformed(e);
			}
		});
		login.setVisible(true);
	}

	private void signInActionPerformed(ActionEvent e) {

		// Call method in model

		if (/*checkLogin()*/) {
			main = new MainFace();
			login.dispose();
			main.setVisible(true);
		}

		/*alertMessage.setForeground(Color.RED);

		if (txtUser.getText().equals("") || txtPass.getText().equals("")) {
			alertMessage.setText("Please check your username and password");
		} else {
			int res = queue.checkLogin(txtUser.getText(), txtPass.getText());
			switch (res) {
				case -1:
					alertMessage.setText("Wrong username");
					break;
				case 0:
					alertMessage.setText("Wrong Password");
					break;
				case 1:
					MainFrame.setUser(txtUser.getText());
					queue.disConnectDb();
					dispose();
					new MainFrame().setVisible(true);
			}
		}*/
	}
}