import Gui.*;
import Functions.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Actor {

	private static LogFace login;
	private static MainFace main;
	private static TableFace table;

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

	private static void checkTable() {
		table = new TableFace();
		table.getButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reserveTablePerformed(e);
			}
		})
		table.setVisible(true)
	}

	private static void signInActionPerformed(ActionEvent e) {

		// Call method in model
		if (/*checkLogin(login.getForm())*/true) {
			mainPart();
		}
	}

	private static void reserveTablePerformed(ActionEvent e) {

		// Call method in model
		/*if(lblMessage.getText().equals(message[0] + tableId)) {
			MainFrame.setTableIdAndTime(tableId, dateTimeReserve);
			
			DateFormat dateTimeFormat = new SimpleDateFormat("dd-MM-yyyy   HH:mm");
			dateTimeReserve.add(java.util.Calendar.YEAR, -543);
			String dateString = dateTimeFormat.format(dateTimeReserve.getTime());
			
			MainFrame.setLabelDateAndTime(String.valueOf(tableId), dateString);
			
			dispose();
		} else {
			javax.swing.JOptionPane.showMessageDialog(null, "You did not select the table");
		}*/
	}
}