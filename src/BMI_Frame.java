import java.awt.*;
import javax.swing.*;

public class BMI_Frame extends JFrame {
	public BMI_Frame() {
		setTitle("BMI계산기 ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(new BodyIndex());

		setSize(400,600);
		setVisible(true);
	}
	
}
