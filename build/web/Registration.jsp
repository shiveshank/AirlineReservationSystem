<%-- 
    Document   : Registration
    Created on : Jun 16, 2017, 8:52:24 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib  uri="http://struts.apache.org/tags-html" prefix="s"%>
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
    .table b.active1{
  width: 100%;
  max-width: 100%;
  margin-bottom: 1rem;
}

.table th,
.table td {
  padding: 0.75rem;
  vertical-align: top;
  border-top: 1px solid #eceeef;
}

.table thead th {
  vertical-align: bottom;
  border-bottom: 2px solid #eceeef;
}

.table tbody + tbody {
  border-top: 2px solid #eceeef;
}

.table .table {
  background-color: #fff;
}

.table-sm th,
.table-sm td {
  padding: 0.3rem;
}

.table-bordered {
  border: 1px solid #eceeef;
}

.table-bordered th,
.table-bordered td {
  border: 1px solid #eceeef;
}

.table-bordered thead th,
.table-bordered thead td {
  border-bottom-width: 2px;
}

.table-striped tbody tr:nth-of-type(odd) {
  background-color: rgba(0, 0, 0, 0.05);
}

.table-hover tbody tr:hover {
  background-color: rgba(0, 0, 0, 0.075);
}

.table-active,
.table-active > th,
.table-active > td {
  background-color: rgba(0, 0, 0, 0.075);
}

.table-hover .table-active:hover {
  background-color: rgba(0, 0, 0, 0.075);
}

.table-hover .table-active:hover > td,
.table-hover .table-active:hover > th {
  background-color: rgba(0, 0, 0, 0.075);
}

.table-success,
.table-success > th,
.table-success > td {
  background-color: #dff0d8;
}

.table-hover .table-success:hover {
  background-color: #d0e9c6;
}

.table-hover .table-success:hover > td,
.table-hover .table-success:hover > th {
  background-color: #d0e9c6;
}

.table-info,
.table-info > th,
.table-info > td {
  background-color: #d9edf7;
}

.table-hover .table-info:hover {
  background-color: #c4e3f3;
}

.table-hover .table-info:hover > td,
.table-hover .table-info:hover > th {
  background-color: #c4e3f3;
}

.table-warning,
.table-warning > th,
.table-warning > td {
  background-color: #fcf8e3;
}

.table-hover .table-warning:hover {
  background-color: #faf2cc;
}

.table-hover .table-warning:hover > td,
.table-hover .table-warning:hover > th {
  background-color: #faf2cc;
}

.table-danger,
.table-danger > th,
.table-danger > td {
  background-color: #f2dede;
}

.table-hover .table-danger:hover {
  background-color: #ebcccc;
}

.table-hover .table-danger:hover > td,
.table-hover .table-danger:hover > th {
  background-color: #ebcccc;
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
        
        <table border="5" border-style: solid
    border-color: orange align="center">
            <s:form action ="/shivesh">
                <tr><td>Name &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        <input type="text" size="16" name="name"></td></td>
            <tr><td>From:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                         &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                         <select name="source1">
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
                         <select name ="destination1">
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
                
                <tr><td>Date of journey:<input type="date"  name = "date1">
                       
                    </td></tr>
                <tr><td>Email  &nbsp;  Id&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;<input type="text" size="16" name="email"></td></td>
                <tr><td>Phone no&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;<input type="text" size="16" name="phone"></td></td> 
                    <tr><td>Number of seats&nbsp;<input type="text" size="10" name="seats"></td></td> 
                    <tr>
                        <td align="left"><center><input type="submit" value="Book Now"></center></td>
                        &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 
                        &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 
                        &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 
                        &nbsp; &nbsp; 
                        
                    
                </tr>
            </s:form>
        </table>
        
    </body>
</html>
