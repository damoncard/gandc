package Gui;

import java.awt.Dimension;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JSpinner.DateEditor;
import javax.swing.SpinnerDateModel;
import javax.swing.WindowConstants;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TableFace extends SimpleFace {

	private int tableId;
	private static Calendar dateTimeReserve;
	
	private String[] message = {"Available - table No.", "Not Available", "Please reserve at least 1 hour in advance", "Bookable in 08:00 - 20:00"};
	private JSpinner spnDate;
	private JSpinner spnTime;
	
	private JButton btnCancel;
	private JButton btnDone;
	private JButton fourSeats;
	private JButton sixSeats;
	private JButton tenSeats;
	private JButton twoSeats;
	private JLabel date;
	private JLabel time;
	private JLabel chairs;
	private JPanel jPanel1;
	private JPanel jPanel2;
	private JPanel jPanel3;
	private JLabel lblMessage;

	public TableFace() {
		super("Checking", WindowConstants.DISPOSE_ON_CLOSE);
		this.tableId = -1;
		this.dateTimeReserve = new GregorianCalendar();
		addComponents();
	}

	@Override
	protected void addComponents() {

		// Assign variables
		jPanel1 = new JPanel();
		date = new JLabel();
		time = new JLabel();
		lblMessage = new JLabel();
		jPanel2 = new JPanel();
		btnDone = new JButton();
		btnCancel = new JButton();
		jPanel3 = new JPanel();
		chairs = new JLabel();
		tenSeats = buttonTemplate(10);
		sixSeats = buttonTemplate(6);
		fourSeats = buttonTemplate(4);
		twoSeats = buttonTemplate(2);

		// Set date-Time
		spnDate = new JSpinner(new SpinnerDateModel());
		spnTime = new JSpinner(new SpinnerDateModel());
		DateEditor dateEditor = new DateEditor(spnDate, "dd-MM-yyyy");
		DateEditor timeEditer = new DateEditor(spnTime, "HH:mm");
		spnDate.setEditor(dateEditor);
		spnTime.setEditor(timeEditer);	
		spnDate.setFont(TAHOMA);
		spnTime.setFont(TAHOMA);

		// Set Label
		date.setFont(TAHOMA);
		date.setText("Date");
		time.setFont(TAHOMA);
		time.setText("Time");
		chairs.setFont(TAHOMA);
		chairs.setText("Chairs");

		lblMessage.setFont(TAHOMA); // NOI18N
		lblMessage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		lblMessage.setPreferredSize(new Dimension(22, 19));

		btnDone.setFont(TAHOMA); // NOI18N
		btnDone.setText("Done");
		btnDone.setPreferredSize(new Dimension(75, 27));
		btnDone.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				btnDoneMouseClicked(evt);
			}
		});

		btnCancel.setFont(TAHOMA); // NOI18N
		btnCancel.setText("Cancel");
		btnCancel.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				btnCancelMouseClicked(evt);
			}
		});

		// Set Layout
		GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(
			jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
			.addGroup(jPanel1Layout.createSequentialGroup()
				.addContainerGap()
				.addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
					.addComponent(time)
					.addComponent(date))
				.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		jPanel1Layout.setVerticalGroup(
			jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
			.addGroup(jPanel1Layout.createSequentialGroup()
				.addContainerGap()
				.addComponent(date)
				.addGap(18, 18, 18)
				.addComponent(time)
				.addContainerGap(17, Short.MAX_VALUE))
		);

		GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(
			jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
			.addGroup(jPanel2Layout.createSequentialGroup()
				.addGap(50, 50, 50)
				.addComponent(btnDone, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
				.addComponent(btnCancel)
				.addGap(50, 50, 50))
		);
		jPanel2Layout.setVerticalGroup(
			jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
			.addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				.addComponent(btnCancel)
				.addComponent(btnDone, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);

		GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout.setHorizontalGroup(
			jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
			.addGroup(jPanel3Layout.createSequentialGroup()
				.addContainerGap()
				.addComponent(chairs)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
				.addComponent(twoSeats, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
				.addComponent(fourSeats, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
				.addComponent(sixSeats, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
				.addComponent(tenSeats, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		jPanel3Layout.setVerticalGroup(
			jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
			.addGroup(GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
				.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addGroup(jPanel3Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
					.addComponent(chairs)
					.addComponent(twoSeats, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addComponent(fourSeats, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addComponent(sixSeats, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addComponent(tenSeats, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addContainerGap())
		);

		GroupLayout layout = new GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
			layout.createParallelGroup(GroupLayout.Alignment.LEADING)
			.addGroup(layout.createSequentialGroup()
				.addGap(81, 81, 81)
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
					.addComponent(lblMessage, GroupLayout.PREFERRED_SIZE, 311, GroupLayout.PREFERRED_SIZE)
					.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
						.addComponent(jPanel1, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jPanel3, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
				.addContainerGap(81, Short.MAX_VALUE))
		);
		layout.setVerticalGroup(
			layout.createParallelGroup(GroupLayout.Alignment.LEADING)
			.addGroup(layout.createSequentialGroup()
				.addGap(25, 25, 25)
				.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addGap(8, 8, 8)
				.addComponent(jPanel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
				.addComponent(lblMessage, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
				.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(35, Short.MAX_VALUE))
		);

		GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(
			jPanel1Layout.createParallelGroup(Alignment.LEADING)
			.addGroup(jPanel1Layout.createSequentialGroup()
				.addContainerGap()
				.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
					.addComponent(time)
					.addComponent(date))
				.addGap(18, 18, 18)
				.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
					.addComponent(spnDate, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)
					.addComponent(spnTime, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE))
				.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		jPanel1Layout.setVerticalGroup(
			jPanel1Layout.createParallelGroup(Alignment.LEADING)
			.addGroup(jPanel1Layout.createSequentialGroup()
				.addContainerGap()
				.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
					.addComponent(date)
					.addComponent(spnDate, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(18, 18, 18)
				.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
					.addComponent(time)
					.addComponent(spnTime, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);

		pack();
	}

	private JButton buttonTemplate(int seats) {
		JButton b = new JButton();
		b.setText(String.valueOf(seats));
		b.setPreferredSize(new Dimension(50, 25));
		b.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				buttonClicked(e);
			}
		});
		return b;
	}

	private void buttonClicked(MouseEvent e) {
		JButton b = (JButton) e.getSource();

		/*lblMessage.setText("");

		try {  
			int tableId = queue.checkAvailable((Date)spnDate.getValue(), (Date)spnTime.getValue(), chairs);
			
			switch(tableId) {
				case -1 :
					lblMessage.setText(message[1]);
					lblMessage.setForeground(new java.awt.Color(255, 0, 0));
					break;
				case -2 :
					lblMessage.setText(message[3]);
					lblMessage.setForeground(new java.awt.Color(255, 0, 0));
					break;
				case -3 :					
					lblMessage.setText("<HTML><I>" + message[2] + "</I></HTML>");
					lblMessage.setForeground(new java.awt.Color(255, 0, 0));
					break;
				default :
					lblMessage.setText(message[0] + tableId);
					lblMessage.setForeground(new java.awt.Color(0, 204, 0));
					this.tableId = tableId;
			}
		} catch (ParseException ex) {
			Logger.getLogger(CheckAvailable.class.getName()).log(Level.SEVERE, null, ex);
		}*/
	}

	private void btnDoneMouseClicked(java.awt.event.MouseEvent evt) {
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

	private void btnCancelMouseClicked(java.awt.event.MouseEvent evt) {
		dispose();
	}
	
	public static void setDateTimeReserve(Calendar time) {
		dateTimeReserve.setTime(time.getTime());
	}
}