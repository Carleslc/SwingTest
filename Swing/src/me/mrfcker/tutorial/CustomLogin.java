package me.mrfcker.tutorial;

import java.util.concurrent.TimeUnit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class CustomLogin {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Login app");
		frame.setSize(375, 110);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		JPanel panel = new JPanel();
		frame.add(panel);
		placeComponents(panel);

		frame.setVisible(true);

		JFrame frame2 = new JFrame();
		frame2.setSize(250, 100);

		JPanel panel2 = new JPanel();
		frame2.add(panel2);

		panel2.setLayout(null);

		JLabel timerLabel = new JLabel("", SwingConstants.CENTER);
		timerLabel.setBounds(20, 20, 180, 25);
		panel2.add(timerLabel);

		frame2.setVisible(true);

		int secondsToWait = 10;
		while (secondsToWait > 0) {
			timerLabel.setText("Timer: " + secondsToWait + " seconds remaining...");
			sleep(1, TimeUnit.SECONDS);
			secondsToWait--;
		}

		timerLabel.setText("See you!");
		sleep(1, TimeUnit.SECONDS);

		frame2.dispose();
	}

	private static void placeComponents(JPanel panel) {
		panel.setLayout(null);

		JLabel userLabel = new JLabel("User");
		userLabel.setBounds(10, 10, 80, 25);
		panel.add(userLabel);

		JTextField userText = new JTextField(20);
		userText.setBounds(100, 10, 160, 25);
		panel.add(userText);

		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(10, 40, 80, 25);
		panel.add(passwordLabel);

		JPasswordField passwordText = new JPasswordField(20);
		passwordText.setBounds(100, 40, 160, 25);
		panel.add(passwordText);

		JButton loginButton = new JButton("Login");
		loginButton.setBounds(270, 10, 80, 55);
		loginButton.addActionListener(e -> {
			BasicLogin.login(userText.getText(),
					String.valueOf(passwordText.getPassword()));
		});
		panel.add(loginButton);
	}

	/**
	 * Wait for an amount of time.
	 * @param time amount to sleep this thread
	 * @param unit unit of the time
	 */
	public static void sleep(int time, TimeUnit unit) {
		try {
			unit.sleep(time);
		} catch (InterruptedException ignore) {}
	}
}
