

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
 
 
public class Member_List extends JFrame implements MouseListener,ActionListener{
   
    Vector v;  
    Vector cols;
    DefaultTableModel model;
    JTable jTable;
    JScrollPane pane;
    JPanel pbtn;
    JButton btnInsert, btnInsert1;
       
   
    public Member_List(){
        super("BMI 회원관리 프로그램  v0.1.1");

        MemberDAO dao = new MemberDAO();
        v = dao.getMemberList();
        System.out.println("v="+v);
        cols = getColumn();
       
   
        model = new DefaultTableModel(v, cols);

        jTable = new JTable(model);
        pane = new JScrollPane(jTable);
        add(pane);
        
    
        JLabel label1 = new JLabel(new ImageIcon("C:\\\\pbl\\\\BmiSystem.jpg"));
        add(label1,BorderLayout.NORTH);
    
       
       
        pbtn = new JPanel();
        btnInsert = new JButton("회원가입");
        btnInsert1 = new JButton("닫기");
        pbtn.add(btnInsert);
        pbtn.add(btnInsert1);
        add(pbtn,BorderLayout.SOUTH);
        
        btnInsert1.addActionListener(this);
       
       
        jTable.addMouseListener(this); //리스너 등록
        btnInsert.addActionListener(this); //회원가입버튼 리스너 등록
       
        setSize(1000,300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }//end 생성자
   
   
    //JTable의 컬럼
    public Vector getColumn(){
        Vector col = new Vector();
        col.add("아이디");
        col.add("비밀번호");
        col.add("이름");
        col.add("전화");
        col.add("주소");
        col.add("생일");
        col.add("성별");
        col.add("키");
        col.add("무게");
        col.add("BMI");
       
        return col;
    }//getColumn
   
   
    //Jtable 내용 갱신 메서드
    public void jTableRefresh(){
       
        MemberDAO dao = new MemberDAO();
        DefaultTableModel model= new DefaultTableModel(dao.getMemberList(), getColumn());
        jTable.setModel(model);    
       
    }
   
    public static void main(String[] args) {
        new Member_List();
    }//main
    @Override
    public void mouseClicked(MouseEvent e) {
        // mouseClicked 만 사용
        int r = jTable.getSelectedRow();
        String id = (String) jTable.getValueAt(r, 0);
        //System.out.println("id="+id);
        MemberProc mem = new MemberProc(id,this); //아이디를 인자로 수정창 생성
               
    }
    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
       
    }
    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
       
    }
    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
       
    }
    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
       
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        //버튼을 클릭하면
        if(e.getSource() == btnInsert ){
            new MemberProc(this);
        } 
        
        else if(e.getSource() == btnInsert1) {
        	this.dispose();
 
           
        }
       
    }
    
    
   
}