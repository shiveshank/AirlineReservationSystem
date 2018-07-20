/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rcpl;

import static java.security.spec.PSSParameterSpec.DEFAULT;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author User
 */
public class shivesh 
{
    
public static void main(String args[])
{
    String p = "Gaya";
   Integer n = null;
        
    
 try
{
Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airline","root","root");
PreparedStatement stmt = con.prepareStatement("Insert into register (name, source, destination, date, email, phone)values(?,?,?,?,?,?)");
stmt.setString(1,"jhfekh");
stmt.setString(2,"jjmhku");
stmt.setString(3,"bjhhku");
stmt.setString(4,"mhbgjg");
stmt.setString(5,"hggukh");
stmt.setString(6,"mhmbjhgb");
int status = stmt.executeUpdate();
if(status>0)
{
	
}

}





catch(Exception e)
{
        
         System.out.println(e);
}
    
}
}