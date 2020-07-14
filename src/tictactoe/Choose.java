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
public class Choose extends JFrame implements ActionListener {
    JPanel jpanel=new JPanel();
    JLabel jlabel=new JLabel("Choose Difficulty Level");
    JButton b1=new JButton("Easy");
    JButton b2=new JButton("Hard");
    
    Choose(){
        setSize(400,400);
        setLocation(400,200);
        jpanel.setBackground(Color.ORANGE);
        jpanel.setLayout(null);
        jlabel.setBounds(50,50,300,100);
        jlabel.setFont(new Font("Serif", Font.BOLD, 25));
        b1.setBounds(130,200,100,50);
        b2.setBounds(130,275,100,50);
        b1.setBackground(Color.pink);
        b2.setBackground(Color.pink);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        add(jpanel);
        jpanel.add(jlabel);
        jpanel.add(b1);
        jpanel.add(b2);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==b1){
            setVisible(false);
            new Easy();
            
        }
        if(ae.getSource()==b2){
            setVisible(false);
            new SinglePlayer();
            JOptionPane.showMessageDialog(new JFrame(), " Work in Progress");
        }
    }
    
    }
