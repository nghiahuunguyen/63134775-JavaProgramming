package thuchanh;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JFormattedTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class bai1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bai1 frame = new bai1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public bai1() {
		setTitle("From đăng nhập");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel dn = new JLabel("Tên đăng nhập");
		dn.setBounds(10, 47, 93, 29);
		contentPane.add(dn);
		
		JLabel mk = new JLabel("Mật khẩu");
		mk.setBounds(10, 102, 79, 29);
		contentPane.add(mk);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setBounds(148, 51, 199, 20);
		contentPane.add(formattedTextField);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(148, 106, 199, 20);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("Đăng nhập");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				xulydangnhap(formattedTextField.getText(), new String(passwordField.getPassword()));
			}
		});
		btnNewButton.setBounds(148, 169, 108, 23);
		contentPane.add(btnNewButton);
		
	}
	public void xulydangnhap(String username, String password) {
		if (username.equals("63CNTT") && password.equals("123")) {
			Manhinhchinh manHinhChinh = new Manhinhchinh();
			manHinhChinh.setVisible(true);
			dispose();
		} else {
			// Xử lý khi đăng nhập không thành công
			JOptionPane.showMessageDialog(null, "Đăng nhập không thành công. Vui lòng kiểm tra lại thông tin đăng nhập.");
		}
	}
}
