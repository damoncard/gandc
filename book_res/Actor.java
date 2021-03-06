package book_res;

import book_res.interfaces.LogFace;
import book_res.interfaces.TableFace;
import book_res.interfaces.Main;
import book_res.functions.*;
import book_res.interfaces.ReserveFace;

public class Actor {

	// Gui Objects
	private static LogFace logface = new LogFace();
	private static TableFace tableface = new TableFace();
	private static ReserveFace reserveface = new ReserveFace();
		
	// Function Objects
	private static LogIn login = new LogIn();
	private static FoodFunction ff = new FoodFunction();

	// This Object
	private static Actor actor = new Actor();

	public void start() {
		login.setSignInButton(logface);
		logface.setVisible(true);
                logface.setLocationRelativeTo(null);
	}

	public void mainPart() {
		if(login.checkLogIn(logface)){
		Main mainface = new Main();
		System.out.println("pass");
		logface.dispose();
		mainface.setVisible(true);
                mainface.setLocationRelativeTo(null);
		}
	}

	public static void main(String[] args) {
		actor.start();
//			Main m = new Main();
//			ff.setButtons(reserveface.getFoodTypeBtn(), reserveface.getTables());
//			System.out.println(reserveface.getMenuButtons()[0].getText());
//			System.out.println(reserveface.getMenuButtons()[1].getText());
//			System.out.println(reserveface.getMenuButtons()[2].getText());
//			//System.out.println(reserveface.getFoodTypeBtn()[0].getText());
//			m.setVisible(true);
//                        m.setLocationRelativeTo(null);
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
