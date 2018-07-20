/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rcpl;

import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author User
 */
public class searchbean extends org.apache.struts.action.ActionForm {
    
   private String source1;
   private String destination1 ;
   private String date1;

    /**
     * @return the source1
     */
    public String getSource1() {
        return source1;
    }

    /**
     * @param source1 the source1 to set
     */
    public void setSource1(String source1) {
        this.source1 = source1;
    }

    /**
     * @return the destination1
     */
    public String getDestination1() {
        return destination1;
    }

    /**
     * @param destination1 the destination1 to set
     */
    public void setDestination1(String destination1) {
        this.destination1 = destination1;
    }

    /**
     * @return the date1
     */
    public String getDate1() {
        return date1;
    }

    /**
     * @param date1 the date1 to set
     */
    public void setDate1(String date1) {
        this.date1 = date1;
    }
   
    /**
     * @return the from
     */
  

    /**
     * @return the to
     */
    
    /**
     * @return the date
     */
   
}
