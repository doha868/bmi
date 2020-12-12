import javax.swing.*;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Obesity extends JFrame implements ActionListener {
	ImageIcon normalIcon1,normalIcon2,normalIcon3;
	JButton btn1,btn2,btn3;
	Obesity() {
      setTitle("비만 가이드");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Container c = getContentPane();
      c.setBackground(Color.WHITE);
      c.setLayout(new FlowLayout());

      JLabel textLabel = new JLabel("당신이 비만이라면? 비만 BMI 수치는 30~34.9 사이");               
      JLabel textLabel2 = new JLabel("정상적인 건강을 찾기 위해서 식습관 관리와 규칙적인 운동이 중요");
      
      ImageIcon img = new ImageIcon("C:\\pbl\\4ww.jpg");
      JLabel imageLabel = new JLabel(img); 
      
               
  
       new BorderLayout(30,40); 
       String combobox2[] = {"고혈압","당뇨병", "대장암", "지방간", "허리디스크"}; 
      JComboBox strCombo2= new JComboBox(combobox2);
      strCombo2.setBounds(30, 270, 100, 30);
      this.add(strCombo2);
            
      
      new BorderLayout(30,40); 
      String [] goodfood = {"과일","생선","콩", "닭걀", "견과류"}; 
      ImageIcon[] images = { new ImageIcon("C:\\pbl\\f1.jpg"),   new ImageIcon("C:\\pbl\\f2.jpg"),
   	       new ImageIcon("C:\\\\pbl\\\\f3.jpg"), new ImageIcon("C:\\\\pbl\\\\f4.jpg"),new ImageIcon("C:\\\\pbl\\\\f5.jpg")  };
     
     

   	   setTitle("ComboBox1");
   	   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	  
   	   c.setLayout(new FlowLayout());

   	  

   	   JComboBox strCombo4 = new JComboBox(goodfood); // 콤보박스 생성

   	   strCombo4.addActionListener(new ActionListener() {
   	        public void actionPerformed(ActionEvent e) {
   	             JComboBox cb = (JComboBox) e.getSource(); // 콤보박스 알아내기

   	                   int index = cb.getSelectedIndex();// 선택된 아이템의 인덱스

   	             imageLabel.setIcon(images[index]); // 인덱스의 이미지를 이미지 레이블에 출력
   	        }
   	   });
   	   
        
      
   	    new BorderLayout(30,40); 
   	       String [] badfood = {"밀가루", "소금", "찬 음식","담배", "술"}; 
   	       ImageIcon[] image1= { new ImageIcon("C:\\pbl\\nf1.jpg"),   new ImageIcon("C:\\pbl\\nf2.jpg"),
   	    	       new ImageIcon("C:\\\\pbl\\\\nf3.jpg"), new ImageIcon("C:\\\\pbl\\\\nf4.jpg"),new ImageIcon("C:\\\\pbl\\\\nf5.jpg")  };
     

   	   setTitle("ComboBox2");
   	   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	  
   	   c.setLayout(new FlowLayout());

   	  

   	   JComboBox strCombo5 = new JComboBox(badfood); // 콤보박스 생성

   	   strCombo5.addActionListener(new ActionListener() {
   	        public void actionPerformed(ActionEvent e) {
   	             JComboBox cb = (JComboBox) e.getSource(); // 콤보박스 알아내기

   	                   int index = cb.getSelectedIndex();// 선택된 아이템의 인덱스

   	             imageLabel.setIcon(image1[index]); // 인덱스의 이미지를 이미지 레이블에 출력
   	        }
   	   });
   	   
   	   
   	   
   	   
   	   
   	   c.add(textLabel);      
   	   c.add(textLabel2);
   	   c.add(imageLabel);
   	   add(new JButton("위험 질병"));
   	   c.add(strCombo2);
   	   add(new JButton("좋은 음식"));
   	   c.add(strCombo4);
   	   add(new JButton("나쁜 음식"));
   	   c.add(strCombo5);
   	   
  
   	   normalIcon1=new ImageIcon("C:\\\\pbl\\\\ex.png");
	   normalIcon2=new ImageIcon("C:\\\\pbl\\\\eat.png");
	   normalIcon3=new ImageIcon("C:\\\\pbl\\\\esc.png");

	   
	   btn1=new JButton(normalIcon1);
	   btn2=new JButton(normalIcon2);
	   btn3=new JButton(normalIcon3);
	   
	   c.add(btn1);
	   c.add(btn2);
	   c.add(btn3);
	
	   btn3.addActionListener(this);
	   
	   btn1.setBorderPainted(false);
    btn1.setContentAreaFilled(false);
    btn1.setFocusPainted(false);
    btn1.setOpaque(false);
    btn2.setBorderPainted(false);
    btn2.setContentAreaFilled(false);
    btn2.setFocusPainted(false);
    btn2.setOpaque(false);  
    btn3.setBorderPainted(false);
    btn3.setContentAreaFilled(false);
    btn3.setFocusPainted(false);
    btn3.setOpaque(false);  

    
   	   
   	   MyEventHandler my = new MyEventHandler();
	     
	   btn1.addActionListener(my);
	   btn2.addActionListener(my);
	     
   	     
     
   	   
   	   
     setSize(600, 600);
     setVisible(true);
  }
	 class MyEventHandler implements  ActionListener {
	       
	        public void actionPerformed(ActionEvent e){
	         Object obj = e.getSource();
	         if(obj==btn1){
	          //JOptionPane의 InputDialog 띄워서 "당신의 이름은?"
	          //=>사용자가 입력한 이름을 타이틀에 올리기
	            if(e.getSource() == btn1 ){
	                  new ObesityEx();
	            }
	         }
	         
	         else if(obj==btn2){
	          //MessageDialog 띄워서 "반가워요" 메시지를 띄우세요
	            if(e.getSource() == btn2 ){
	                  new Obesityfood();
	            }
	         }
	        }
	 }
  
  public static void main(String[] args) {
     new Obesity();
     
  }
  @Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == btn3) {
			this.dispose(); //창닫기 (현재창만 닫힘)
		}
		
	}

}