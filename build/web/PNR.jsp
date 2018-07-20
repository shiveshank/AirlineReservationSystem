<%-- 
    Document   : PNR
    Created on : Jun 16, 2017, 10:31:37 PM
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
    
    background-image: url("Plane desktop wallpapers hd  HD Wallpaper.jpg");
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
        <br>
        <br>
        <br>
        <br>
        <br>
        <font color ="white" align="center"> <h1>Enter Your PNR:</h1><font>
    <center>
         <form action="PNR.jsp">
             
        <input type="text" name="pnr">
        <input type="submit" value="Get Status">
         </form>
    </center>
         <br>
         <br>
         
        <% String source5 = request.getParameter("pnr"); %>
        
        
<%
try
{
    
Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airline","root","root");
PreparedStatement ps = con.prepareStatement("Select * from register where pnr=? ");
            
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
            <%= rs.getString(7) %>
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
