package hellofram;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.WindowConstants;

public class chuongtrinh {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setTitle("Ví dụ JFrame");
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setSize(300, 200); // kích thước cửa sổ
        //qui định layout
        f.setLayout(new FlowLayout());
        JButton btnok = new JButton("Nhấn tôi đi");
        JButton btnkhac = new JButton("Nhấn em đi");
        f.add(btnok);
        f.add(btnkhac);
        f.show(); // hiện cửa sổ
        
    }
    class bolangngheok implements ActionListener{
    	public void actionPerformed(ActionEvent e) {
    		JDialog dialog = new JDialog();
    		
    	}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
    	
    }
}