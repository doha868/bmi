import java.awt.*;
import java.sql.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.JTextComponent;

import java.awt.event.*;

public class WhatBMI extends JFrame implements ActionListener{
   JButton btnCancel, btnDelete;
  
   ImageIcon normalIcon1,normalIcon2;
   WhatBMI(){
      setTitle("WhatBMI");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Container c = getContentPane();
      c.setBackground(Color.WHITE);
      c.setLayout(new FlowLayout());
      
      ImageIcon img = new ImageIcon("C:\\pbl\\t.png");
      JLabel imageLabel = new JLabel(img);
      c.add(imageLabel);
      
     
      
      setSize(800, 580);
       setVisible(true);
       setDefaultCloseOperation(DISPOSE_ON_CLOSE);
   }
    public static void main(String[] args) {
         new WhatBMI();         
      }
    @Override
      public void actionPerformed(ActionEvent ae) {
         if (ae.getSource() == btnCancel) {
            this.dispose(); //창닫기 (현재창만 닫힘)
         }
         
      }


}