import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class newFrame extends JFrame{
    
    JLabel img = new JLabel(new ImageIcon("C:/pbl/2ww.jpg"));
    public newFrame(){
   
            this.setLayout(new GridLayout(0,2));        
            JPanel panel1 = new JPanel(new BorderLayout());
            panel1.add(img);
            setContentPane(panel1);
            this.setSize(600,800);
            this.setVisible(true);
           
         
    }
}

/*class test_Frame2 extends JDialog{
    JLabel jlb = new JLabel("");
    public test_Frame2(String str){
            getContentPane().add(jlb);
           
            jlb.setText(str.toString());
           
            this.setSize(200,100);
            this.setModal(true);
            this.setVisible(true);
           
    }
}*/

