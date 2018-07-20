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
import java.sql.Statement;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author User
 */
public class LoginAction1 extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static String SUCCESS = "success";

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
    
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        LoginBean lb = (LoginBean)form;
        String username1 = lb.getUsername();
        String password1 = lb.getPassword();
         Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airline","root","root");
        try
        {
            PreparedStatement ps = con.prepareStatement("Select * from shiv where username=? and password=?");
            ps.setString(1,username1);
            ps.setString(2,password1);
            ResultSet rs = ps.executeQuery();
            if(username1.equals("admin") && password1.equals("123"))
            {
                SUCCESS ="admin";
            }
            else if(rs.next())
            {
               
                SUCCESS="pass";
            }
            else
            {
                SUCCESS="fail";
            }
            rs.close();
            ps.close();
            
            
               
        }
        catch(Exception e)
        {
            
            SUCCESS = "fail";
        }
    
        return mapping.findForward(SUCCESS);
    }
}
