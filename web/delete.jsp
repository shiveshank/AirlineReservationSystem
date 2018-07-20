<%-- 
    Document   : delete
    Created on : Jun 16, 2017, 10:06:31 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri ="http://struts.apache.org/tags-html" prefix="s" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
body {
    background-image: url("2fEeUOk.jpg");
    
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
    <center>&nbsp;&nbsp;<h1>Please Enter Your PNR for Canceling Ticket:</h1></center>
       
        <table align="center">
             <s:form action="/abhi">
             <tr><td><input type="text" name ="pnr"></td></tr>
            <tr><td align="center"><input type="submit" value ="Cancel Ticket"></td></tr>
             </s:form>
        </table>
        
    </body>
</html>
