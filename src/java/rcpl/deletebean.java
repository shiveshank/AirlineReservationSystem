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
public class deletebean extends org.apache.struts.action.ActionForm {
    
    private Integer pnr;

    /**
     * @return the pnr
     */
    public Integer getPnr() {
        return pnr;
    }

    /**
     * @param pnr the pnr to set
     */
    public void setPnr(Integer pnr) {
        this.pnr = pnr;
    }
}
