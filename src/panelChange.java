import java.awt.event.*;
import javax.swing.*;
public class panelChange implements ActionListener {
	BodyIndex bi;
	public panelChange(BodyIndex bi) {
		this.bi=bi;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()==bi.btn2) {
			newFrame nf= new newFrame();
		}
	}

}
