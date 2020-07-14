/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Chaturbhuj
 */

public class Gui1 implements ActionListener {
    int flag=1,arr[][]={{2,2,2},{2,2,2},{2,2,2}};
    
    JFrame jframe=new JFrame("Single ");
    JPanel jpanel=new JPanel();
    JLabel jlabel=new JLabel("Current Turn: X");
    JButton b1=new JButton();
    JButton b2=new JButton();
    JButton b3=new JButton();
    JButton b4=new JButton();
    JButton b5=new JButton();
    JButton b6=new JButton();
    JButton b7=new JButton();
    JButton b8=new JButton();
    JButton b9=new JButton();
    JButton br=new JButton("Reset");

    public Gui1() {
        
        jframe.setSize(475,550);
        jframe.setLocation(300,125);
        jpanel.setBackground(Color.darkGray);
        jpanel.setLayout(null);
        jlabel.setBounds(50,30,300,50);
        jlabel.setFont(new Font("Serif", Font.BOLD,30));
        jlabel.setForeground(Color.RED);
        
        b1.setBounds(50,100,100,100);
        b2.setBounds(175,100,100,100);
        b3.setBounds(300,100,100,100);
        b4.setBounds(50,225,100,100);
        b5.setBounds(175,225,100,100);
        b6.setBounds(300,225,100,100);
        b7.setBounds(50,350,100,100);
        b8.setBounds(175,350,100,100);
        b9.setBounds(300,350,100,100);
        br.setBounds(50,460,80,40);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        br.addActionListener(this);
        
        
        jframe.add(jpanel);
        
        jpanel.add(b1);
        jpanel.add(b2);
        jpanel.add(b3);
        jpanel.add(b4);
        jpanel.add(b5);
        jpanel.add(b6);
        jpanel.add(b7);
        jpanel.add(b8);
        jpanel.add(b9);
        jpanel.add(br);
        
        jpanel.add(jlabel);
        
        jframe.setVisible(true);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    void turn(){
        if(flag==1){
            jlabel.setText("Current Turn: O");
        }
        else{
            jlabel.setText("Current Turn: X");
        }
    }
    
 public void actionPerformed(ActionEvent e){
     if(e.getSource()==b1){
         turn();
         if(arr[0][0]==2){
            if(flag==1){
            b1.setIcon(new ImageIcon(ClassLoader.getSystemResource("cross1.png")));
            arr[0][0]=3;
            flag=0;
        }
            else if(flag==0){
            b1.setIcon(new ImageIcon(ClassLoader.getSystemResource("naught.png")));
            arr[0][0]=5;
            flag=1;
        }check();
     }
     }    
     if(e.getSource()==b2){
         turn();
         if(flag==1){
         b2.setIcon(new ImageIcon(ClassLoader.getSystemResource("cross1.png")));
         arr[0][1]=3;
         flag=0;
     }
     else if(flag==0){
         b2.setIcon(new ImageIcon(ClassLoader.getSystemResource("naught.png")));
         arr[0][1]=5;
         flag=1;
     }check();
     }
     if(e.getSource()==b3){
         turn();
         if(flag==1){
         b3.setIcon(new ImageIcon(ClassLoader.getSystemResource("cross1.png")));
         arr[0][2]=3;
         flag=0;
     }
     else if(flag==0){
         b3.setIcon(new ImageIcon(ClassLoader.getSystemResource("naught.png")));
         arr[0][2]=5;
         flag=1;
     }check();  
     }
     if(e.getSource()==b4){
         turn();
         if(flag==1){
         b4.setIcon(new ImageIcon(ClassLoader.getSystemResource("cross1.png")));
         arr[1][0]=3;
         flag=0;
     }
     else if(flag==0){
         b4.setIcon(new ImageIcon(ClassLoader.getSystemResource("naught.png")));
         arr[1][0]=5;
         flag=1;
     }check();
     }
     if(e.getSource()==b5){
         turn();
         if(flag==1){
         b5.setIcon(new ImageIcon(ClassLoader.getSystemResource("cross1.png")));
         arr[1][1]=3;flag=0;
     }
     else if(flag==0){
         b5.setIcon(new ImageIcon(ClassLoader.getSystemResource("naught.png")));
         arr[1][1]=5;
         flag=1;
     }check();
     }
     if(e.getSource()==b6){
         turn();
         if(flag==1){
         b6.setIcon(new ImageIcon(ClassLoader.getSystemResource("cross1.png")));
         arr[1][2]=3;
         flag=0;
     }
     else if(flag==0){
         b6.setIcon(new ImageIcon(ClassLoader.getSystemResource("naught.png")));
         arr[1][2]=5;
         flag=1;
     }check();
     }
     if(e.getSource()==b7){
         turn();
         if(flag==1){
         b7.setIcon(new ImageIcon(ClassLoader.getSystemResource("cross1.png")));
         arr[2][0]=3;
         flag=0;
     }
     else if(flag==0){
         b7.setIcon(new ImageIcon(ClassLoader.getSystemResource("naught.png")));
         arr[2][0]=5;
         flag=1;
     }check();
     }
     if(e.getSource()==b8){
         turn();
         if(flag==1){
         b8.setIcon(new ImageIcon(ClassLoader.getSystemResource("cross1.png")));
         arr[2][1]=3;
         flag=0;
     }
     else if(flag==0){
         b8.setIcon(new ImageIcon(ClassLoader.getSystemResource("naught.png")));
         arr[2][1]=5;
         flag=1;
     }check();
     }
     if(e.getSource()==b9){
         turn();
         if(flag==1){
         b9.setIcon(new ImageIcon(ClassLoader.getSystemResource("cross1.png")));
         arr[2][2]=3;
         flag=0;
     }
     else if(flag==0){
         b9.setIcon(new ImageIcon(ClassLoader.getSystemResource("naught.png")));
         arr[2][2]=5;
         flag=1;
     }check();
     }
     if(e.getSource()==br){
         jframe.setVisible(false);
         new Gui1();
     }
    }
 
 void check(){
     int r1,r2,r3,c1,c2,c3,d1,d2;
     r1=arr[0][0]*arr[0][1]*arr[0][2];
     r2=arr[1][0]*arr[1][1]*arr[1][2];
     r3=arr[2][0]*arr[2][1]*arr[2][2];
     c1=arr[0][0]*arr[1][0]*arr[2][0];
     c2=arr[0][1]*arr[1][1]*arr[2][1];
     c3=arr[0][2]*arr[1][2]*arr[2][2];
     d1=arr[0][0]*arr[1][1]*arr[2][2];
     d2=arr[0][2]*arr[1][1]*arr[2][0];
     
     
     if(r1==27 || r2==27 || r3==27 || c1==27 || c2==27 || c3==27 || d1==27 || d2==27){
         JOptionPane.showMessageDialog(new JFrame(), "Player 1 Wins");
         flag=-1;
         for(int i=0;i<=2;i++){
             for(int j=0;j<=2;j++){
                 arr[i][j]=2;
             }    
         }
     }
     else if(r1==125 || r2==125 || r3==125 || c1==125 || c2==125 || c3==125 || d1==125 || d2==125){
         JOptionPane.showMessageDialog(new JFrame(), "Player 2 Wins");
         flag=-1;
         for(int i=0;i<=2;i++){
             for(int j=0;j<=2;j++){
                 arr[i][j]=2;
             }    
         }
 }
     else if(arr[0][0]!=2 && arr[0][1]!=2 && arr[0][2]!=2 && arr[1][0]!=2 && arr[1][1]!=2 && arr[1][2]!=2 && 
     arr[2][0]!=2 && arr[2][1]!=2 && arr[2][2]!=2){
         JOptionPane.showMessageDialog(new JFrame(), "Draw");
         flag=-1;
         for(int i=0;i<=2;i++){
             for(int j=0;j<=2;j++){
                 arr[i][j]=2;
             }    
         }
 }
 }
 
}
