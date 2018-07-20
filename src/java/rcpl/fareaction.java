/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rcpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author User
 */
public class fareaction extends org.apache.struts.action.Action {

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
        farebean lb = (farebean)form;
       String source = lb.getForm();
       String destination = lb.getTo();
       String fare = lb.getFare();
     try
{
Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airline","root","root");
PreparedStatement stmt = con.prepareStatement("Insert into fare values(?,?,?)");
stmt.setString(1,source);
stmt.setString(2,destination);
stmt.setString(3, fare);

int status = stmt.executeUpdate();
if(status>0)
{
	SUCCESS ="pass";
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
