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
import javax.swing.*;

/**
 *
 * @author Chaturbhuj
 */
public class Gui extends JFrame implements ActionListener {
    
    JPanel panel1=new JPanel();
    JLabel l1=new JLabel("Choose");
    JButton b1=new JButton("1 Player");
    JButton b2=new JButton("2 Player");
    
    Gui(){
        panel1.setBounds(140,80,400,400);    
        panel1.setBackground(Color.black);
       
        l1.setForeground(Color.pink);
        l1.setFont(new Font("Serif", Font.BOLD, 30));
         
        l1.setBounds(90,70,200,30);
        b1.setBounds(60,150,150,30);
        b1.setBackground(Color.pink);
        b1.addActionListener(this); 
        b2.setBounds(60,200,150,30);
        b2.setBackground(Color.pink);
        b2.addActionListener(this);
        panel1.add(l1);
        panel1.add(b1);
        panel1.add(b2);
        add(panel1);
        setSize(300,300); 
        setLocation(400,225);
        panel1.setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1){
            setVisible(false);
            new Choose();
        }
        else if(e.getSource()==b2){
            new Gui1();
            setVisible(false);
        }
        
    }
    
}
