<%-- 
    Document   : getfare
    Created on : Jun 16, 2017, 11:07:52 PM
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
    background-image: url("FreeGreatPicture.com-24701-hd-sales-discount-picture.jpg");
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
        <title>JSP Page</title>
    </head>
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
        <br>
       <form action="">
       <table border="5" border-style: solid
    border-color: orange align="center">
            <tr bgcolor="orange">
                <td align="center" ><h1>Flight<h1></td>
            </tr>
            
            <tr><td>From:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                         &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                         
                         <select name="form">
                              <option selected="selected" ></option>
                    <option value="Delhi">Delhi</option>
                    <option value="Mumbai">Mumbai</option>
                    <option value="Bengaluru">Bengaluru</option>
                    <option value="Chennai">Chennai</option>
                    
                    <option value="Kolkata">Kolkata</option>
                    <option value="Hyderabad">Hyderabad</option>
                    <option value="Kochi">Kochi	</option>
                    <option value="Ahmedabad">Ahmedabad</option>
                    <option value="Patna">Patna</option>
                     <option value="Gaya">Gaya</option>
                         </select>
                    </td>
                <tr><td>
                        To:
                        &nbsp;&nbsp;&nbsp;&nbsp;
                         &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <select name ="to">
                     <option selected="selected" ></option>
                    <option value="Delhi">Delhi</option>
                    <option value="Mumbai">Mumbai</option>
                    <option value="Bengaluru">Bengaluru</option>
                    <option value="Chennai">Chennai</option>
                    
                    <option value="Kolkata">Kolkata</option>
                    <option value="Hyderabad">Hyderabad</option>
                    <option value="Kochi">Kochi	</option>
                    <option value="Ahmedabad">Ahmedabad</option>
                    <option value="Patna">Patna</option>
                     <option value="Gaya">Gaya</option>
                </select>
                        
                    </td></tr>
                
               
                
                <tr>
                    <td align="center"><input type="submit" size="16" value ="GET Fare"></td>
                    
                        &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 
                        &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 
                        &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 
                        &nbsp; &nbsp; 
                        
                    
                </tr>
        </table>
                  </td>
        </table>
                </form>
        
        
        <% String source5 = request.getParameter("form"); %>
      <% String source6 = request.getParameter("to"); %>
      
      
      
        <%
                           
                               
try
{
    
Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airline","root","root");
PreparedStatement ps = con.prepareStatement("Select * from fare where source=? and destination=? ");
            
ps.setString(1,source5 );
         
            ps.setString(2,source6);
            
            
            
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
            Cost:<%= rs.getString(3)  %>
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
