package th;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PTBac2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txta;
	private JTextField txtb;
	private JTextField txtc;
	private JTextField txtkq;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PTBac2 frame = new PTBac2();
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
	public PTBac2() {
		setTitle("Phương trình bậc 2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nhập a");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNewLabel.setBounds(32, 33, 62, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblNhpB = new JLabel("Nhập b");
		lblNhpB.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNhpB.setBounds(32, 67, 62, 23);
		contentPane.add(lblNhpB);
		
		JLabel lblNhpC = new JLabel("Nhập c");
		lblNhpC.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblNhpC.setBounds(32, 101, 62, 23);
		contentPane.add(lblNhpC);
		
		txta = new JTextField();
		txta.setBounds(115, 34, 200, 20);
		contentPane.add(txta);
		txta.setColumns(10);
		
		txtb = new JTextField();
		txtb.setColumns(10);
		txtb.setBounds(115, 68, 200, 20);
		contentPane.add(txtb);
		
		txtc = new JTextField();
		txtc.setColumns(10);
		txtc.setBounds(115, 104, 200, 20);
		contentPane.add(txtc);
		
		txtkq = new JTextField();
		txtkq.setColumns(10);
		txtkq.setBounds(115, 149, 200, 20);
		contentPane.add(txtkq);
		
		JButton btnkq = new JButton("Kết qủa");
		btnkq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tinh();
			}
		});
		btnkq.setBounds(10, 148, 89, 23);
		contentPane.add(btnkq);
	}
	public void tinh() {
		String a =txta.getText();
		String b =txtb.getText();
		String c=txtc.getText();
		Double soa= Double.parseDouble(a);
		Double sob= Double.parseDouble(b);
		Double soc= Double.parseDouble(c);
		Double x1, x2;
		   if (soa == 0) {
		        if (sob == 0) {
		            if (soc == 0) {
		                txtkq.setText("Phương trình vô số nghiệm");
		        } else {
		            txtkq.setText("Phương trình vô nghiệm");
		        }
		    } else {
		        x1 = -soc / sob;
		        txtkq.setText("x = " + x1);
		    }
		}
		else {
			Double delta = Math.pow(sob, 2) - 4 * soa * soc;
			if (delta < 0) {
                txtkq.setText("Phương trình vô nghiệm");
            } else if (delta == 0) {
                x1 = -sob / (2 * soa);
                txtkq.setText("x = " + x1);
            } else {
                x1 = (-sob + Math.sqrt(delta)) / (2 * soa);
                x2 = (-sob - Math.sqrt(delta)) / (2 * soa);
                txtkq.setText("x1 = " + x1 +"x2 = "+x2 );
            }
		}
	}
}
