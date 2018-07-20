/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rcpl;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author User
 */
public class registerbean extends org.apache.struts.action.ActionForm {
    
    private String name;
     private String source1;
      private String destination1;
       private String date1;
       private String email;
       private String phone;
       private Integer seats;
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

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
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return the seats
     */
    public Integer getSeats() {
        return seats;
    }

    /**
     * @param seats the seats to set
     */
    public void setSeats(Integer seats) {
        this.seats = seats;
    }

    /**
     * @return the seats
     */

}
