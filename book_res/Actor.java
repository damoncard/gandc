package book_res;

import book_res.interfaces.LogFace;
import book_res.interfaces.TableFace;
import book_res.functions.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;

public class Actor {

	// Gui Objects
	private static LogFace logface = new LogFace();
	private static TableFace tableface = new TableFace();

	// Function Objects
	private static LogIn login = new LogIn();

	public static void main(String[] args) {
		start();
	}

	private static void start() {
		login.setSignInButton(logface);
		logface.setVisible(true);
	}


	private static void mainPart() {
            if(login.checkLogIn(logface)){
		//mainface = new MainFace();
                System.out.println("pass");
		logface.dispose();
		//mainface.setVisible(true);
            }
	}

	/*
	private static void setButtons() {
		
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