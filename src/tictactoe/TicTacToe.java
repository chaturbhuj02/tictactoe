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
public class TicTacToe extends JFrame implements ActionListener {

    /**
     * @param args the command line arguments
     */
    
    JLabel jlabel=new JLabel("Tic Tac Toe");
    JButton jbutton=new JButton("Start Game");
    
    JPanel panel=new JPanel(); 
    
    TicTacToe(){
        panel.setBounds(80,80,400,400);    
        panel.setBackground(Color.black);
        jlabel.setBounds(60,70,250,30);
        jlabel.setFont(new Font("Serif", Font.BOLD, 30));
        jlabel.setForeground(Color.pink);
        jbutton.setBounds(60,175,150,30);
        jbutton.setBackground(Color.pink);
        jbutton.addActionListener(this);
        
        panel.add(jlabel);
        panel.add(jbutton);
        add(panel);
        setSize(300,300);
        setLocation(400,225);
        panel.setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public void actionPerformed(ActionEvent e) {
     
          if(e.getSource()==jbutton)
          {
              new Gui();
              setVisible(false);
          }
    }      
          
    
    public static void main(String[] args) {
        // TODO code application logic here
        TicTacToe t1=new TicTacToe();
        t1.setVisible(true);
    }
    
}
