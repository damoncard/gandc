import Gui.*;
import Functions.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Actor {

	// Gui Objects
	private static LogFace logface;
	private static MainFace mainface;
	private static TableFace tableface;

	// Function Objects
	private static LogIn login;

	public static void main (String [] args) {
		logface = new LogFace();
		/*logface.getButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				signInActionPerformed(e);
			}
		});*/
		logface.setVisible(true);
	}
	/*
	private static void signInActionPerformed(ActionEvent e) {
		login = new LogIn();
		if (login.checkLogin(logface.getForm())) {
			mainPart();
		}
	}

	private static void mainPart() {
		mainface = new MainFace();
		logface.dispose();
		mainface.setVisible(true);
	}

	private static void checkSeat() {
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkPerformed(e);
			}
		});
	}

	private static void checkTable() {
		tableface = new TableFace();
		tableface.getAddButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reserveTablePerformed(e);
			}
		});
		tableface.setVisible(true);
	}

	private void checkPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
 
		boolean available = queue.checkAvailable((Date)spnDate.getValue(), (Date)spnTime.getValue(), chairs);
			
		if(available) {
			alertMessage.setText(message[1]);
			alertMessage.setForeground(new Color(255, 0, 0));
		} else {
			alertMessage.setText(message[0] + tableId);
			alertMessage.setForeground(new Color(0, 204, 0));
			this.tableId = tableId;
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
		}
	}

	private static Calendar dateTimeReserve;

	public static void setDateTimeReserve(Calendar time) {
		dateTimeReserve = new GregorianCalendar();
		dateTimeReserve.setTime(time.getTime());
	}*/
}