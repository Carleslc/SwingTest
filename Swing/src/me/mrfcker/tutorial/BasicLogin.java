package me.mrfcker.tutorial;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class BasicLogin {
	
	public static void main(String[] args) {
		String user = JOptionPane.showInputDialog(null, "Usuario");
		String password = JOptionPane.showInputDialog(null, "Contraseña");
		login(user, password);
	}
	
	public static void login(String user, String password) {
		if ("admin".equals(user) && "1234".equals(password))
			JOptionPane.showMessageDialog(null, "Logged in!", "Login successful",
												JOptionPane.INFORMATION_MESSAGE, new ImageIcon("info_icon.gif"));
		else
			JOptionPane.showMessageDialog(null, "Invalid login", "Login failed",
												JOptionPane.ERROR_MESSAGE);
	}
}
