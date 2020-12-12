package BMI;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

public class frame extends JFrame {

   private JPanel contentPane;
   private JTextField textHeight;
   private JTextField textName;
   private JTextField textFeet;

   /**
    * Launch the application.
    */
   public static void main(String[] args) {
      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               frame frame = new frame();
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
   public frame() {
      setIconImage(Toolkit.getDefaultToolkit().getImage(frame.class.getResource("/BMI/Img/q.jpg")));
      setTitle("BMI Calculator");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setBounds(100, 100, 713, 862);
      contentPane = new JPanel();
      contentPane.setBackground(UIManager.getColor("Button.background"));
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
      setContentPane(contentPane);
      contentPane.setLayout(null);
      
      JLabel lblHeight = new JLabel("키 :");
      lblHeight.setFont(new Font("굴림", Font.BOLD, 16));
      lblHeight.setBounds(17, 158, 82, 21);
      contentPane.add(lblHeight);
      
      textHeight = new JTextField();
      textHeight.setFont(new Font("굴림", Font.BOLD, 16));
      textHeight.setBounds(103, 151, 101, 34);
      contentPane.add(textHeight);
      textHeight.setColumns(10);
      
      JLabel lblfeet = new JLabel("몸무게 :");
      lblfeet.setFont(new Font("굴림", Font.BOLD, 16));
      lblfeet.setBounds(17, 205, 82, 21);
      contentPane.add(lblfeet);
      
      JTextPane txtpnResult = new JTextPane();
      txtpnResult.setBackground(UIManager.getColor("Button.background"));
      txtpnResult.setFont(new Font("굴림", Font.BOLD, 16));
      txtpnResult.setText("Result : ");
      txtpnResult.setBounds(42, 255, 632, 49);
      contentPane.add(txtpnResult);
      
      JLabel lblName = new JLabel("이름 :");
      lblName.setFont(new Font("굴림", Font.BOLD, 16));
      lblName.setBounds(17, 112, 82, 21);
      contentPane.add(lblName);
      
      textName = new JTextField();
      textName.setFont(new Font("굴림", Font.BOLD, 16));
      textName.setColumns(10);
      textName.setBounds(103, 102, 101, 34);
      contentPane.add(textName);
      
      textFeet = new JTextField();
      textFeet.setFont(new Font("굴림", Font.BOLD, 16));
      textFeet.setColumns(10);
      textFeet.setBounds(103, 202, 101, 34);
      contentPane.add(textFeet);
      
      JTextPane statusBar = new JTextPane();
      statusBar.setBackground(UIManager.getColor("Button.background"));
      statusBar.setFont(new Font("굴림", Font.BOLD, 20));
      statusBar.setBounds(42, 306, 632, 49);
      contentPane.add(statusBar);
      
      JLabel lbl1 = new JLabel("");
      lbl1.setIcon(new ImageIcon(frame.class.getResource("/BMI/Img/저체중.png")));
      lbl1.setBounds(42, 370, 600, 400);
      contentPane.add(lbl1);
      
      JLabel lbl2 = new JLabel("");
      lbl2.setIcon(new ImageIcon(frame.class.getResource("/BMI/Img/정상.png")));
      lbl2.setBounds(42, 370, 600, 400);
      contentPane.add(lbl2);
      
      JLabel lbl3 = new JLabel("");
      lbl3.setIcon(new ImageIcon(frame.class.getResource("/BMI/Img/과체중.png")));
      lbl3.setBounds(42, 370, 600, 400);
      contentPane.add(lbl3);
      
      JLabel lbl4 = new JLabel("");
      lbl4.setIcon(new ImageIcon(frame.class.getResource("/BMI/Img/비만.png")));
      lbl4.setBounds(42, 370, 600, 400);
      contentPane.add(lbl4);
      
      JLabel lbl5 = new JLabel("");
      lbl5.setIcon(new ImageIcon(frame.class.getResource("/BMI/Img/고도비만.png")));
      lbl5.setBounds(42, 370, 600, 400);
      contentPane.add(lbl5);
      
      JLabel lbl6 = new JLabel("");
      lbl6.setIcon(new ImageIcon(frame.class.getResource("/BMI/Img/last.PNG")));
      lbl6.setBounds(42, 370, 600, 400);
      contentPane.add(lbl6);
      
      lbl1.setVisible(false);
      lbl2.setVisible(false);
      lbl3.setVisible(false);
      lbl4.setVisible(false);
      lbl5.setVisible(false);
      lbl6.setVisible(true);
      
      
      
      JButton btnSubmit = new JButton("측정하기");
      btnSubmit.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
            try {
               String Name = textName.getText();
               double height = Integer.parseInt(textHeight.getText());
               double weight = Integer.parseInt(textFeet.getText());
               double BMI_result = Math.round(weight/((height/100)*(height/100))*100)/100.0;
            
               txtpnResult.setText(String.valueOf(BMI_result));
            
               if(BMI_result>=30) {
                  txtpnResult.setText("결과: "+ Name + " 님의 BMI 지수는 "+txtpnResult.getText()+"(고도비만)입니다.");
                  statusBar.setBackground(Color.RED);
                  lbl5.setVisible(true);
                  lbl6.setVisible(false);
                  statusBar.setVisible(true);
               
               }
               else if(BMI_result>=25 && BMI_result<=29.9) {
                  txtpnResult.setText("결과: "+ Name + " 님의 BMI 지수는 "+txtpnResult.getText()+"(비만)입니다.");
                  statusBar.setBackground(Color.RED);
                  lbl4.setVisible(true);
                  lbl6.setVisible(false);
                  statusBar.setVisible(true);
               }
               else if(BMI_result>=23 && BMI_result<=24.9) {
                  txtpnResult.setText("결과: "+ Name + " 님의 BMI 지수는 "+txtpnResult.getText()+"(과체중)입니다.");
                  statusBar.setBackground(Color.RED);
                  lbl3.setVisible(true);
                  lbl6.setVisible(false);
                  statusBar.setVisible(true);
               }
               else if(BMI_result>=18.5 && BMI_result<=22.9) {
                  txtpnResult.setText("결과: "+ Name + " 님의 BMI 지수는 "+txtpnResult.getText()+"(정상)입니다.");
                  statusBar.setBackground(Color.GREEN);
                  lbl2.setVisible(true);
                  lbl6.setVisible(false);
                  statusBar.setVisible(true);
               }
               else {
                  txtpnResult.setText("결과: "+ Name + " 님의 BMI 지수는 "+txtpnResult.getText()+"(저체중)입니다.");
                  statusBar.setBackground(Color.BLUE);
                  lbl1.setVisible(true);
                  lbl6.setVisible(false);
                  statusBar.setVisible(true);
               }
            
           
            }
            catch (Exception e) {
               txtpnResult.setText("이름, 키, 체중을 정확히 입력하세요.");
            }  
         }
      });
      btnSubmit.setFont(new Font("굴림", Font.BOLD, 16));
      btnSubmit.setBounds(338, 207, 129, 44);
      contentPane.add(btnSubmit);
      
      JLabel lblNewLabel = new JLabel("");
      lblNewLabel.setIcon(new ImageIcon(frame.class.getResource("/BMI/Img/4.png")));
      lblNewLabel.setBounds(17, 15, 254, 82);
      contentPane.add(lblNewLabel);
      
      JButton btnReset = new JButton("다시입력");
      btnReset.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent arg0) {
            textName.setText("");
            textHeight.setText("");
            textFeet.setText("");
            txtpnResult.setText("Result :");
            lbl1.setVisible(false);
            lbl2.setVisible(false);
            lbl3.setVisible(false);
            lbl4.setVisible(false);
            lbl5.setVisible(false);
            lbl6.setVisible(true);
            statusBar.setVisible(false);
         }
      });
      btnReset.setFont(new Font("굴림", Font.BOLD, 16));
      btnReset.setBounds(474, 207, 129, 44);
      contentPane.add(btnReset);
      

      



      
      
   }
}