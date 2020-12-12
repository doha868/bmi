import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class MyActionListener implements ActionListener {
	BodyIndex b;
	
	public MyActionListener(BodyIndex b) {
		this.b = b;
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton)e.getSource();
		BMI();
	}
	
	private void BMI() {
		try {
			String name = b.tf[0].getText();
			double height = Integer.parseInt(b.tf[1].getText());
			double weight = Integer.parseInt(b.tf[2].getText());
			double BMI_result = Math.round(weight/((height/100)*(height/100))*100)/100.0;
			
			b.la2.setText(String.valueOf(BMI_result));
	
			if(b.cb[0].isSelected()==true)
				b.la3.setText("술 그만 마셔요 !! ");
			if(b.cb[1].isSelected()==true)
				b.la3.setText(b.la3.getText()+"담배 끊으세요!! ");
			if(b.cb[2].isSelected()==true)
				b.la3.setText(b.la3.getText()+"운동 좀 하세요!!");
			
			if(b.women.isSelected()==true) {
				if(BMI_result>=30) {
					b.la2.setText("아름다운 "+name+"님의 BMI는 "+b.la2.getText()+"(고도비만)입니다.");
					b.la1.setBackground(Color.RED);
				}
				else if(BMI_result>=25 && BMI_result<=29.9) {
					b.la2.setText("아름다운 "+name+"님의 BMI는 "+b.la2.getText()+"(비만)입니다.");
					b.la1.setBackground(Color.RED);
				}
				else if(BMI_result>=23 && BMI_result<=24.9) {
					b.la2.setText("아름다운 "+name+"님의 BMI는 "+b.la2.getText()+"(과체중)입니다.");
					b.la1.setBackground(Color.RED);
				}
				else if(BMI_result>=18.5 && BMI_result<=22.9) {
					b.la2.setText("아름다운 "+name+"님의 BMI는 "+b.la2.getText()+"(정상)입니다.");
					b.la1.setBackground(Color.GREEN);
				}
				else {
					b.la2.setText("아름다운 "+name+"님의 BMI는 "+b.la2.getText()+"(저체중)입니다.");
					b.la1.setBackground(Color.BLUE);
				}
			}	
			else {
				if(BMI_result>=30) {
					b.la2.setText("멋진 "+name+"님의 BMI는 "+b.la2.getText()+"(고도비만)입니다.");
					b.la1.setBackground(Color.RED);
				}
				else if(BMI_result>=25 && BMI_result<=29.9) {
					b.la2.setText("멋진  "+name+"님의 BMI는 "+b.la2.getText()+"(비만)입니다.");
					b.la1.setBackground(Color.RED);
				}
				else if(BMI_result>=23 && BMI_result<=24.9) {
					b.la2.setText("멋진  "+name+"님의 BMI는 "+b.la2.getText()+"(과체중)입니다.");
					b.la1.setBackground(Color.RED);
				}
				else if(BMI_result>=18.5 && BMI_result<=22.9) {
					b.la2.setText("멋진  "+name+"님의 BMI는 "+b.la2.getText()+"(정상)입니다.");
					b.la1.setBackground(Color.GREEN);
				}
				else {
					b.la2.setText("멋진  "+name+"님의 BMI는 "+b.la2.getText()+"(저체중)입니다.");
					b.la1.setBackground(Color.BLUE);
				}
			}
		}
		catch(NumberFormatException e) {
			b.la2.setText("이름, 키, 체중을 정확히 입력하세요.");
			b.la3.setText("");
			
			
		}
	}
}
