import javax.swing.*;



import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.sql.Connection;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.beans.EventHandler;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;



public class LabelEx extends JFrame   {
   JButton btn1,btn2,btn3,btn4,btn5,btn6;
   ImageIcon normalIcon1,normalIcon2,normalIcon3,normalIcon4,normalIcon5,normalIcon6;
   
   
   LabelEx() {
      
      
      setTitle("You know BMI?");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Container c = getContentPane();
      setLayout(new FlowLayout());
      
      JLabel label1 = new JLabel(new ImageIcon("C:\\\\pbl\\\\top.jpg"));
      

      
      c.add(label1);
      
      normalIcon1=new ImageIcon("C:\\\\pbl\\\\1w.jpg");
      normalIcon2=new ImageIcon("C:\\\\pbl\\\\2w.jpg");
      normalIcon3=new ImageIcon("C:\\\\pbl\\\\3w.jpg");
      normalIcon4=new ImageIcon("C:\\\\pbl\\\\4w.jpg");
      normalIcon5=new ImageIcon("C:\\\\pbl\\\\5w.jpg");
      
       
       
       btn1=new JButton(normalIcon1);
       btn2=new JButton(normalIcon2);
       btn3=new JButton(normalIcon3);
       btn4=new JButton(normalIcon4);
       btn5=new JButton(normalIcon5);
      
      c.add(btn1);
      c.add(btn2);
      c.add(btn3);
      c.add(btn4);
      c.add(btn5);
      btn1.setBorderPainted(false);
      btn2.setBorderPainted(false);
      btn1.setContentAreaFilled(false);
      btn2.setContentAreaFilled(false);
      btn1.setFocusPainted(false);
      btn2.setFocusPainted(false);
      btn1.setOpaque(false);
      btn2.setOpaque(false);
      btn3.setBorderPainted(false);
      btn4.setBorderPainted(false);
      btn3.setContentAreaFilled(false);
      btn4.setContentAreaFilled(false);
      btn3.setFocusPainted(false);
      btn4.setFocusPainted(false);
      btn3.setOpaque(false);
      btn4.setOpaque(false);
      btn5.setBorderPainted(false);
      btn5.setContentAreaFilled(false);
      btn5.setFocusPainted(false);
      btn5.setOpaque(false);

      
      setSize(1000,740);
      setVisible(true);
      
   
   JLabel textLabel = new JLabel();
   c.add(textLabel);

   
   normalIcon6=new ImageIcon("C:\\\\pbl\\\\BMI.png");
   
   btn6=new JButton(normalIcon6);
     
   c.add(btn6);   
   btn6.setBorderPainted(false);   
   btn6.setContentAreaFilled(false);   
   btn6.setFocusPainted(false);
   btn6.setOpaque(false);
   
   
   MyEventHandler my = new MyEventHandler();
   
   btn1.addActionListener(my);
   btn2.addActionListener(my);
   btn3.addActionListener(my);
   btn4.addActionListener(my);
   btn5.addActionListener(my);
   btn6.addActionListener(my);
  
   


   
   

   }
    
   
    class MyEventHandler implements  ActionListener {
       
        public void actionPerformed(ActionEvent e){
         Object obj = e.getSource();
         if(obj==btn1){
          //JOptionPane의 InputDialog 띄워서 "당신의 이름은?"
          //=>사용자가 입력한 이름을 타이틀에 올리기
            if(e.getSource() == btn1 ){
                  new Underweight();
            }
         }
         
         else if(obj==btn2){
          //MessageDialog 띄워서 "반가워요" 메시지를 띄우세요
            if(e.getSource() == btn2 ){
                  new Normal();
            }
         }
         
         else if(obj==btn3){
            if(e.getSource() == btn3 ){
                  new Overweight();
            }
         }
         
         else if(obj==btn4){
            if(e.getSource() == btn4 ){
                  new Obesity();
            }
         }
         
         else if(obj==btn5){

            if(e.getSource() == btn5 ){
            	new ExtremelyObese();
            }
         }
         
         else if(obj==btn6){

             if(e.getSource() == btn6 ){
                new WhatBMI();
             }
          }
         
        
     
   
        }
     }

   public static void main(String[] args) {
      LabelEx my=new LabelEx();

      my.setVisible(true);
   
      
   }       
      
   }
