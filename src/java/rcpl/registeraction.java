/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rcpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author User
 */
public class registeraction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static  String SUCCESS = "success";

    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        registerbean lb = (registerbean)form;
       String name = lb.getName();
     String source1 = lb.getSource1();
      String destination1 = lb.getDestination1();
       String date1= lb.getDate1();
      String email =lb.getEmail();
      String phone = lb.getPhone();
      Integer seats = lb.getSeats();
     try
{
Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airline","root","root");
PreparedStatement ps = con.prepareStatement("Select * from search where source=? and destination=? and journeydate =? ");
            ps.setString(1,source1);
            ps.setString(2,destination1);
            ps.setString(3, date1);
            ResultSet rs = ps.executeQuery();
            if(rs.next())
            {
               PreparedStatement stmt = con.prepareStatement("Insert into register (name, source, destination, date, email, phone,seats)values(?,?,?,?,?,?,?)");
stmt.setString(1,name);
stmt.setString(2,source1);
stmt.setString(3,destination1);
stmt.setString(4,date1);
stmt.setString(5,email);
stmt.setString(6,phone);
stmt.setInt(7,seats);

int status = stmt.executeUpdate();
if(status>0)
{
	SUCCESS ="pass";
}
PreparedStatement fg = con.prepareStatement("Update search set seats = seats - (?) where source =? and destination =?");
fg.setInt(1,seats);
fg.setString(2,source1);
fg.setString(3,destination1);
int status1 = fg.executeUpdate();

            }
            
            else
            {
                SUCCESS = "not";
                  
                
            }


 


}

catch(Exception e)
{
         SUCCESS ="fail";
         System.out.println(e);
}
        return mapping.findForward(SUCCESS);
    }
}
