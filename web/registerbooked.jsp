<%-- 
    Document   : registerbooked
    Created on : Jun 16, 2017, 9:48:51 PM
    Author     : User
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
body {
    background-image: url("pexels-photo.jpg");
    margin:0;}

.topnav {
  overflow: hidden;
  background-color: #333;
}

.topnav a {
  float: left;
  display: block;
  color: #f2f2f2;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 17px;
}

.topnav a:hover {
  background-color: #ddd;
  color: black;
}

.topnav a.active {
    background-color: #4CAF50;
    color: white;
}
</style>
    </head>
    <body>
        <div class="topnav">
    <a class="active" href="Main.html">Home</a>
    <a href="search.jsp">Search For flight </a>
    <a href="Registration.jsp">Reservation Of Tickets</a>
    <a href="delete.jsp">Cancellation of Tickets</a>
    <a href="PNR.jsp">Check PNR Status</a>
    <a href="getfare.jsp">Get Fare</a>
  
  
    
  <a href="index.jsp">LogOut</a>
</div>
        
        <h1>Your Ticket has been book Succesfully</h1>
       
        
        <% String source5 = request.getParameter("phone"); %>
        
          <%
                           
                               
try
{
    
Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airline","root","root");
PreparedStatement ps = con.prepareStatement("Select * from register where phone=? ");
            
ps.setString(1,source5 );
         
            
            
            
            ResultSet rs = ps.executeQuery();
            

while(rs.next())
{
   
%>

<table border = 1 font size="20">
    
    <tr>
        <td>
         <%= rs.getString(1) %>
        </td>
        <td>
            <%= rs.getString(2) %>
        </td>
        <td>
            <%= rs.getString(3)  %>
        </td>
        <td>
            <%= rs.getString(4) %>
        </td>
        <td>
            <%= rs.getString(5) %>
        </td>
        <td>
            <%= rs.getString(6) %>
        </td>
        <td>
            PNR:<%= rs.getString(7) %>
        </td>
        <td>
            No of seats:<%= rs.getString(8) %>
        </td>
    </tr>
 
  
   
    
    </table>
        
            <%
            
}    
      

}



catch(Exception e)
{
    System.out.println(e);
}
                   
%>

    </body>
</html>
