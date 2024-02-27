package thuchanh;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tinh extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField texta;
	private JTextField textb;
	private JTextField textKq;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tinh frame = new Tinh();
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
	public Tinh() {
		setTitle("Chương trình tính ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nhập a");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel.setBounds(25, 30, 58, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblNhpB = new JLabel("Nhập b");
		lblNhpB.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNhpB.setBounds(25, 75, 58, 23);
		contentPane.add(lblNhpB);
		
		texta = new JTextField();
		texta.setBounds(102, 32, 211, 20);
		contentPane.add(texta);
		texta.setColumns(10);
		
		textb = new JTextField();
		textb.setColumns(10);
		textb.setBounds(102, 77, 211, 20);
		contentPane.add(textb);
		
		JButton btnCong = new JButton("+");
		btnCong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				xulycong();
			}
		});
		btnCong.setBounds(25, 123, 41, 33);
		contentPane.add(btnCong);
		
		JButton btnTru = new JButton("-");
		btnTru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				xulytru();
			}
		});
		btnTru.setBounds(110, 123, 41, 33);
		contentPane.add(btnTru);
		
		JButton btnNhan = new JButton("*");
		btnNhan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				xulynhan();
			}
		});
		btnNhan.setBounds(188, 123, 41, 33);
		contentPane.add(btnNhan);
		
		JButton btnChia = new JButton("/");
		btnChia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				xulychia();
			}
		});
		btnChia.setBounds(269, 123, 41, 33);
		contentPane.add(btnChia);
		
		JLabel lblKtQu = new JLabel("Kết quả");
		lblKtQu.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblKtQu.setBounds(25, 180, 58, 23);
		contentPane.add(lblKtQu);
		
		textKq = new JTextField();
		textKq.setColumns(10);
		textKq.setBounds(102, 182, 211, 20);
		contentPane.add(textKq);
	}
	void xulycong() {
		String a = texta.getText();
		String b = textb.getText();
		Double soa= Double.parseDouble(a);
		Double sob= Double.parseDouble(b);
		double tong = soa+sob;
		textKq.setText(String.valueOf(tong));
	}
	void xulytru() {
		String a = texta.getText();
		String b = textb.getText();
		Double soa= Double.parseDouble(a);
		Double sob= Double.parseDouble(b);
		double hieu = soa-sob;
		textKq.setText(String.valueOf(hieu));
	}
	void xulynhan() {
		String a = texta.getText();
		String b = textb.getText();
		Double soa= Double.parseDouble(a);
		Double sob= Double.parseDouble(b);
		double tich = soa*sob;
		textKq.setText(String.valueOf(tich));
	}
	void xulychia() {
		String a = texta.getText();
		String b = textb.getText();
		Double soa= Double.parseDouble(a);
		Double sob= Double.parseDouble(b);
		double thuong = soa/sob;
		textKq.setText(String.valueOf(thuong));
	}
}
