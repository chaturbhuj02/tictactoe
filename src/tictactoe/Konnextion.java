/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.sql.*; 
class Konnection { 
    public static void main(String args[]) {
        try { 
            Class.forName("com.mysql.jdbc.Driver"); 
            Connection con =DriverManager.getConnection("Jdbc:mysql:///billing","root",""); 
            Statement stmt = con.createStatement(); 
            String query = "create table list(id int, name varchar(20))";
            stmt.executeUpdate(query); 
        } 
        catch(Exception e) {
            System.out.println("Exception has occured "+e);
        } 
    }    
}
