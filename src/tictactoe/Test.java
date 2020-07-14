/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.util.Random;

/**
 *
 * @author Chaturbhuj
 */
public class Test {
   static  int  arr[][]={{2,3,2},{2,2,5},{3,2,2}};
    public static void main(String args[]){
        int  n1 = new Random().nextInt(2);
        int  n2 = new Random().nextInt(2);
        for(;arr[n1][n2]!=2;){
            n1 = new Random().nextInt(2);
            n2 = new Random().nextInt(2);
            
        }System.out.println(n1+"  "+n2);
    }
    
}
