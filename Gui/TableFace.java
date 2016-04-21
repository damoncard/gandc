package Gui;

import java.awt.Dimension;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JSpinner.DateEditor;
import javax.swing.SwingConstants;
import javax.swing.SpinnerDateModel;
import javax.swing.WindowConstants;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TableFace extends SimpleFace {
	
	private String[] message = {"Available - table No.", "Not Available"};
	private JSpinner spnDate;
	private JSpinner spnTime;
	
	private JButton addButton;
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
	private JLabel alertMessage;

	private ArrayList<JButton> buttons;

	public TableFace() {
		super("Checking", WindowConstants.DISPOSE_ON_CLOSE);
		addComponents();
	}

	public JButton getAddButton() {
		return addButton;
	}

	public ArrayList<JButton> getChairButtons() {
		return buttons;
	}

	@Override
	protected void addComponents() {

		// Assign variables
		date = new JLabel();
		time = new JLabel();
		chairs = new JLabel();
		alertMessage = new JLabel();
		jPanel1 = new JPanel();
		jPanel2 = new JPanel();
		jPanel3 = new JPanel();
		addButton = new JButton();
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

		alertMessage.setFont(TAHOMA);
		alertMessage.setHorizontalAlignment(SwingConstants.CENTER);
		alertMessage.setPreferredSize(new Dimension(22, 19));

		addButton.setFont(TAHOMA);
		addButton.setText("Add");
		addButton.setPreferredSize(new Dimension(75, 27));

		// Set Layout
		GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(
			jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
			.addGroup(jPanel2Layout.createSequentialGroup()
				.addGap(50, 50, 50)
				.addComponent(addButton, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
				.addGap(50, 50, 50))
		);
		jPanel2Layout.setVerticalGroup(
			jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
			.addGroup(jPanel2Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
				.addComponent(addButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
					.addComponent(alertMessage, GroupLayout.PREFERRED_SIZE, 311, GroupLayout.PREFERRED_SIZE)
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
				.addComponent(alertMessage, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
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

	private void setButtons() {
		buttons.add(twoSeats);
		buttons.add(fourSeats);
		buttons.add(sixSeats);
		buttons.add(tenSeats);
	}

	private JButton buttonTemplate(int seats) {
		JButton b = new JButton();
		b.setText(String.valueOf(seats));
		b.setPreferredSize(new Dimension(50, 25));
		return b;
	}
}