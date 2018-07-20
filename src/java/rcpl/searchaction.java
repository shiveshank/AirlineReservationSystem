/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rcpl;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author User
 */
public class searchaction extends org.apache.struts.action.Action {

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
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
       searchbean lb = (searchbean)form;
       String from = lb.getSource1();
       String to = lb.getDestination1();
       String date = lb.getDate1();
        try
        {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airline","root","root");
        PreparedStatement ps = con.prepareStatement("SELECT * FROM search");
           
            ResultSet rs = ps.executeQuery();
            if(rs.next())
            {
                SUCCESS="pass";
            }
            rs.close();
            ps.close();
        }
        catch(Exception e)
        {
            SUCCESS ="fail";
        }
        return mapping.findForward(SUCCESS);
    }
}
