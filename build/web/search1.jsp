<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <style>
body {margin:0;}

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
            <td>
                
                <form action= "search.jsp">
        <table align="center" cellspacing="15">
            <tr bgcolor="orange">
                <td align="center" >Flight</td>
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
                
                <tr><td>Date of journey:<input type="date" name = "date"></td></tr>
                
                <tr>
                    <td align="left"><input type="submit" value="search">
                        &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 
                        &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 
                        &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 
                        &nbsp; &nbsp; 
                        
                    <input type="button" value="Reset"></td>
                </tr>
        </table>
                  </td>
        </table>
                </form>
                </body>
                </html>