/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Chaturbhuj
 */
public class SinglePlayer extends JFrame implements ActionListener {
    int flag=1,arr[][]={{2,2,2},{2,2,2},{2,2,2}};
    
    JPanel jpanel=new JPanel();
    JLabel jlabel=new JLabel("Current Turn: ");
    
    JButton b1=new JButton();
    JButton b2=new JButton();
    JButton b3=new JButton();
    JButton b4=new JButton();
    JButton b5=new JButton();
    JButton b6=new JButton();
    JButton b7=new JButton();
    JButton b8=new JButton();
    JButton b9=new JButton();
    
    SinglePlayer(){
        setSize(475,550);
        setLocation(300,125);
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
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        
        add(jpanel);
        
        jpanel.add(b1);
        jpanel.add(b2);
        jpanel.add(b3);
        jpanel.add(b4);
        jpanel.add(b5);
        jpanel.add(b6);
        jpanel.add(b7);
        jpanel.add(b8);
        jpanel.add(b9);
        
        jpanel.add(jlabel);
        
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    void cpu(){
        Math.random();
        
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1){
            if(arr[0][0]==2){
                if(flag==1){
                    b1.setIcon(new ImageIcon(ClassLoader.getSystemResource("cross1.png")));
                    arr[0][0]=3;
                    flag=0;
                }
            }
            cpu();
        }    
        if(e.getSource()==b2){
            if(arr[0][1]==2){
                if(flag==1){
                    b2.setIcon(new ImageIcon(ClassLoader.getSystemResource("cross1.png")));
                    arr[0][1]=3;
                    flag=0;
                }
            }
            cpu();
        }
        if(e.getSource()==b3){
            if(arr[0][2]==2){
                if(flag==1){
                    b3.setIcon(new ImageIcon(ClassLoader.getSystemResource("cross1.png")));
                    arr[0][2]=3;
                    flag=0;
                } 
            }
            cpu();
        }
        if(e.getSource()==b4){
            if(arr[1][0]==2){
                if(flag==1){
                    b4.setIcon(new ImageIcon(ClassLoader.getSystemResource("cross1.png")));
                    arr[1][0]=3;
                    flag=0;
                }
            }
            cpu();
        }
        if(e.getSource()==b5){
            if(arr[1][1]==2){
                if(flag==1){
                    b5.setIcon(new ImageIcon(ClassLoader.getSystemResource("cross1.png")));
                    arr[1][1]=3;
                    flag=0;
                }
            }
            cpu();
        }
        if(e.getSource()==b6){
            if(arr[1][2]==2){
                if(flag==1){
                    b6.setIcon(new ImageIcon(ClassLoader.getSystemResource("cross1.png")));
                    arr[1][2]=3;
                    flag=0;
                }
            }
            cpu();
        }
        if(e.getSource()==b7){
            if(arr[2][0]==2){
                if(flag==1){
                    b7.setIcon(new ImageIcon(ClassLoader.getSystemResource("cross1.png")));
                    arr[2][0]=3;
                    flag=0;
                }
            }
            cpu();
        }
        if(e.getSource()==b8){
            if(arr[2][1]==2){
                if(flag==1){
                    b8.setIcon(new ImageIcon(ClassLoader.getSystemResource("cross1.png")));
                    arr[2][1]=3;
                    flag=0;
                }
            }
            cpu();
        }
        if(e.getSource()==b9){
            if(arr[2][2]==2){
                if(flag==1){
                    b9.setIcon(new ImageIcon(ClassLoader.getSystemResource("cross1.png")));
                    arr[2][2]=3;
                    flag=0;
                }
            }
            cpu();
        }
    }
    
    public static void main(String args[]){
        new SinglePlayer();
    }
}
