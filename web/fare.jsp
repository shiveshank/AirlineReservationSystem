<%-- 
    Document   : fare
    Created on : Jun 16, 2017, 10:45:20 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="s" %>
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
    </head>
    <body>
    <div class="topnav">
     <a class="active" href="admin.jsp">Add Flight </a>
     <a  href="fare.jsp">Get Fare</a>
     <a href="index.jsp">LogOut</a>
     </div>
        <br>
        <br>
        <br>
        <br>
        <br>
        
             <table border="5" border-style: solid
    border-color: orange align="center">
            <td>
                
                <s:form action="/abhinesh">
        <table align="center" cellspacing="15">
            <tr bgcolor="orange">
                <td align="center" ><h1>Flight</h1></td>
            </tr>
            
            <tr><td>From:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                         &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                         
                         <select name="form">
                              <option selected="selected" ></option>
                    <option value="Delhi">Delhi</option>
                    <option value="Mumbai">Mumbai</option>
                    <option value="Bengaluru">Bengaluru</option>
                    <option value="Chennai">Chennai</option>
                    <option value="Delhi">Delhi</option>
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
                    <option value="Delhi">Delhi</option>
                    <option value="Kolkata">Kolkata</option>
                    <option value="Hyderabad">Hyderabad</option>
                    <option value="Kochi">Kochi	</option>
                    <option value="Ahmedabad">Ahmedabad</option>
                    <option value="Patna">Patna</option>
                     <option value="Gaya">Gaya</option>
                </select>
                        
                    </td></tr>
                
               <tr><td>Enter Fare:&nbsp; &nbsp; &nbsp; &nbsp; 
                       <input type="text" size="09" name = "fare">
                
                <tr>
                    <td align="center"><input type="submit" size="16" value="GeT Fare"></td>
                    
                        &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 
                        &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 
                        &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 
                        &nbsp; &nbsp; 
                        
                                    </tr>
        </table>
                  </td>
        </table>
                </s:form>
    </body>
</html>
