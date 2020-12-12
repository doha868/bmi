import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;

public class BodyIndex extends JPanel {
	JTextField tf[] = new JTextField[3];
	ButtonGroup g = new ButtonGroup();
	JRadioButton women = new JRadioButton("여자");
	JRadioButton men = new JRadioButton("남자");
	JCheckBox[] cb = new JCheckBox[3];
	String[] habit = {"음주","흡연","운동X"};
	JLabel la1 = new JLabel("",JLabel.LEFT); //건강색상
	JLabel la2 = new JLabel("",JLabel.LEFT); //결과
	JLabel la3 = new JLabel("",JLabel.LEFT); //소견
	JButton btn = new JButton("신체 상태 측정");
	JButton btn2 = new JButton("당신의 BMI치수에 대해 궁금하다면?");



	
	
	class Index_p1 extends JPanel{
		Index_p1(){
			for(int i = 0; i<tf.length;i++)
				tf[i] = new JTextField(7);
			
			g.add(women);
			g.add(men);
			
			add(new JLabel(" 성  별 : ",JLabel.LEFT));
			add(women);
			add(men);
			
			setLayout(new GridLayout(5,3));
			add(new JLabel(" 이  름 : " ,JLabel.LEFT));
			add(tf[0]);
			add(new JLabel(" "));
			
			add(new JLabel("    키    :  ",JLabel.LEFT));
			add(tf[1]);
			add(new JLabel(" (cm)"));
			
			add(new JLabel(" 체  중 : ",JLabel.LEFT));
			add(tf[2]);
			add(new JLabel(" (kg)"));
			
			
			
			
			
			for(int i = 0; i<cb.length;i++) {
				cb[i]=new JCheckBox(habit[i]);
				add(cb[i]);
			}
		}
	}

	class btnPanel extends JPanel{
		btnPanel(/*String str*/){
			//JButoom btn = new jBtutton(str);
			add(btn);
		}
	}

	class btn2Panel extends JPanel{
		btn2Panel(){
			add(btn2);
		}
	}
	
	class result extends JPanel{
		result(){
			setLayout(new GridLayout(5,1,0,0));

			add(new JLabel("BMI 결과 : " ,JLabel.LEFT));
			add(la2); //결과
			add(la1); //건강색상
			add(new JLabel("소견 : ",JLabel.LEFT));
			add(la3); //소견

			la1.setOpaque(true);
			
		}
	}
	 
	public BodyIndex(){
		btnPanel btn1 =new btnPanel(/*"신체상태 측정"*/);
		result r1 =new result();
		Index_p1 p1 = new Index_p1();
		btn2Panel btn3 = new btn2Panel();
		setLayout(null);
		p1.setSize(300, 150);
		p1.setLocation(52, 27);
		
		r1.setSize(300, 150);
		r1.setLocation(32, 180);
		
		btn1.setSize(300, 100);
		btn1.setLocation(33, 335);
		btn3.setSize(300,100);
		btn3.setLocation(33,435);
		
		add(p1);
		add(r1);
		add(btn1);
		add(btn3);
		


		MyActionListener lis = new MyActionListener(BodyIndex.this);
		panelChange lis2 = new panelChange(BodyIndex.this);
		btn.addActionListener(lis);
		btn2.addActionListener(lis2);
		
		
	}
}
