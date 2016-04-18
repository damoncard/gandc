package Gui;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.WindowConstants;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Cursor;
import org.jdesktop.beansbinding.Binding;
import org.jdesktop.beansbinding.Bindings;
import org.jdesktop.beansbinding.BindingGroup;
import org.jdesktop.beansbinding.ELProperty;
import org.jdesktop.beansbinding.BeanProperty;
import org.jdesktop.beansbinding.AutoBinding.UpdateStrategy;

public class LogFace extends JFrame {

	//Queuing queue;

	// Constant Value
	private final Color BLACK = new Color(0, 0, 0);
	private final Color GREY = new Color(102, 102, 102);
	private final Color PERIWINKLE_LIGHT = new Color(204, 204, 255);
	private final Font FL_LIGHT = new Font("Footlight MT Light", 1, 36);

	// Declare Variable
	private JButton signIn;
	private JLabel username;
	private JLabel password;
	private JLabel resName;
	private JLabel alertMessage;
	private JPasswordField txtPass;
	private JTextField txtUser;
	private BindingGroup bindingGroup;

	public LogFace() {
		setTitle("Log-In Page");
		setLocationRelativeTo(null);
		addIcon();
		addComponents();
	}

	private void addIcon() {
		ImageIcon img = new ImageIcon("items/icon.jpg");
		setIconImage(img.getImage());
	}

	private void addComponents() {

		// Assign variables
		bindingGroup = new BindingGroup();
		alertMessage = new JLabel();
		username = new JLabel();
		password = new JLabel();
		resName = new JLabel();
		signIn = new JButton();
		txtUser = new JTextField();
		txtPass = new JPasswordField();

 		// Set Default Usage
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		// Set Label
		username.setText("Username");
		username.setBackground(BLACK);
		password.setText("Password");
		resName.setFont(FL_LIGHT);
		resName.setForeground(GREY);
		resName.setText("10PM Restaruant");

		// Set Button
		signIn.setText("Sign in");
		signIn.setBackground(GREY);
		signIn.setForeground(PERIWINKLE_LIGHT);

		// Set layout
		Binding binding = Bindings.createAutoBinding(UpdateStrategy.READ_WRITE, this, ELProperty.create("${background}"), this, BeanProperty.create("background"));
		bindingGroup.addBinding(binding);

		GroupLayout layout = new GroupLayout(getContentPane());
		getContentPane().setLayout(layout);

		layout.setHorizontalGroup(
			layout.createParallelGroup(Alignment.LEADING)
			.addGroup(layout.createSequentialGroup()
				.addGap(27, 27, 27)
				.addComponent(resName, GroupLayout.PREFERRED_SIZE, 304, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(69, Short.MAX_VALUE))
			.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
				.addGroup(layout.createParallelGroup(Alignment.TRAILING)
					.addGroup(layout.createSequentialGroup()
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(signIn))
					.addGroup(Alignment.LEADING, layout.createSequentialGroup()
						.addGap(51, 51, 51)
						.addGroup(layout.createParallelGroup(Alignment.LEADING)
							.addComponent(alertMessage, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGroup(layout.createSequentialGroup()
								.addGroup(layout.createParallelGroup(Alignment.LEADING)
									.addComponent(username)
									.addComponent(password))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(layout.createParallelGroup(Alignment.LEADING)
									.addComponent(txtPass)
									.addComponent(txtUser))))))
				.addGap(81, 81, 81))
		);

		layout.setVerticalGroup(
			layout.createParallelGroup(Alignment.LEADING)
			.addGroup(layout.createSequentialGroup()
				.addContainerGap()
				.addComponent(resName, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
				.addGap(57, 57, 57)
				.addComponent(alertMessage, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(layout.createParallelGroup(Alignment.BASELINE)
					.addComponent(username)
					.addComponent(txtUser, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.RELATED)
				.addGroup(layout.createParallelGroup(Alignment.BASELINE)
					.addComponent(password)
					.addComponent(txtPass, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addComponent(signIn)
				.addContainerGap(69, Short.MAX_VALUE))
		);

		bindingGroup.bind();
		pack();
	}
}