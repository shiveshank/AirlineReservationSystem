package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_s_form_action;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_s_form_action = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_s_form_action.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("body {margin:0;}\n");
      out.write("\n");
      out.write(".topnav {\n");
      out.write("  overflow: hidden;\n");
      out.write("  background-color: #333;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".topnav a {\n");
      out.write("  float: left;\n");
      out.write("  display: block;\n");
      out.write("  color: #f2f2f2;\n");
      out.write("  text-align: center;\n");
      out.write("  padding: 14px 16px;\n");
      out.write("  text-decoration: none;\n");
      out.write("  font-size: 17px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".topnav a:hover {\n");
      out.write("  background-color: #ddd;\n");
      out.write("  color: black;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".topnav a.active {\n");
      out.write("    background-color: #4CAF50;\n");
      out.write("    color: white;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"topnav\">\n");
      out.write("    <a class=\"active\" href=\"\">Add filgth </a>\n");
      out.write(" \n");
      out.write("  \n");
      out.write("    \n");
      out.write("  <a href=\"index.jsp\">LogOut</a>\n");
      out.write("</div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("             <table border=\"5\" border-style: solid\n");
      out.write("    border-color: orange align=\"center\">\n");
      out.write("            <td>\n");
      out.write("                \n");
      out.write("                ");
      if (_jspx_meth_s_form_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        <table>\n");
      out.write("            \n");
      out.write("        </table>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_s_form_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:form
    org.apache.struts.taglib.html.FormTag _jspx_th_s_form_0 = (org.apache.struts.taglib.html.FormTag) _jspx_tagPool_s_form_action.get(org.apache.struts.taglib.html.FormTag.class);
    _jspx_th_s_form_0.setPageContext(_jspx_page_context);
    _jspx_th_s_form_0.setParent(null);
    _jspx_th_s_form_0.setAction("/saket");
    int _jspx_eval_s_form_0 = _jspx_th_s_form_0.doStartTag();
    if (_jspx_eval_s_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("        <table align=\"center\" cellspacing=\"15\">\n");
        out.write("            <tr bgcolor=\"orange\">\n");
        out.write("                <td align=\"center\" >Flight</td>\n");
        out.write("            </tr>\n");
        out.write("            \n");
        out.write("            <tr><td>From:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
        out.write("                         &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
        out.write("                         \n");
        out.write("                         <select name=\"form\">\n");
        out.write("                              <option selected=\"selected\" ></option>\n");
        out.write("                    <option value=\"Delhi\">Delhi</option>\n");
        out.write("                    <option value=\"Mumbai\">Mumbai</option>\n");
        out.write("                    <option value=\"Bengaluru\">Bengaluru</option>\n");
        out.write("                    <option value=\"Chennai\">Chennai</option>\n");
        out.write("                    <option value=\"Delhi\">Delhi</option>\n");
        out.write("                    <option value=\"Kolkata\">Kolkata</option>\n");
        out.write("                    <option value=\"Hyderabad\">Hyderabad</option>\n");
        out.write("                    <option value=\"Kochi\">Kochi\t</option>\n");
        out.write("                    <option value=\"Ahmedabad\">Ahmedabad</option>\n");
        out.write("                    <option value=\"Patna\">Patna</option>\n");
        out.write("                     <option value=\"Gaya\">Gaya</option>\n");
        out.write("                         </select>\n");
        out.write("                    </td>\n");
        out.write("                <tr><td>\n");
        out.write("                        To:\n");
        out.write("                        &nbsp;&nbsp;&nbsp;&nbsp;\n");
        out.write("                         &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
        out.write("                <select name =\"to\">\n");
        out.write("                     <option selected=\"selected\" ></option>\n");
        out.write("                    <option value=\"Delhi\">Delhi</option>\n");
        out.write("                    <option value=\"Mumbai\">Mumbai</option>\n");
        out.write("                    <option value=\"Bengaluru\">Bengaluru</option>\n");
        out.write("                    <option value=\"Chennai\">Chennai</option>\n");
        out.write("                    <option value=\"Delhi\">Delhi</option>\n");
        out.write("                    <option value=\"Kolkata\">Kolkata</option>\n");
        out.write("                    <option value=\"Hyderabad\">Hyderabad</option>\n");
        out.write("                    <option value=\"Kochi\">Kochi\t</option>\n");
        out.write("                    <option value=\"Ahmedabad\">Ahmedabad</option>\n");
        out.write("                    <option value=\"Patna\">Patna</option>\n");
        out.write("                     <option value=\"Gaya\">Gaya</option>\n");
        out.write("                </select>\n");
        out.write("                        \n");
        out.write("                    </td></tr>\n");
        out.write("                \n");
        out.write("                <tr><td>Date of journey:<input type=\"date\" name = \"date\"></td></tr>\n");
        out.write("                <tr><td>Enter seats available:<input type=\"text\" name=\"seats\"></td></tr>\n");
        out.write("                \n");
        out.write("                <tr>\n");
        out.write("                    <td align=\"left\"><input type=\"submit\">\n");
        out.write("                        &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; \n");
        out.write("                        &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; \n");
        out.write("                        &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; \n");
        out.write("                        &nbsp; &nbsp; \n");
        out.write("                        \n");
        out.write("                    <input type=\"button\" value=\"Reset\"></td>\n");
        out.write("                </tr>\n");
        out.write("        </table>\n");
        out.write("                  </td>\n");
        out.write("        </table>\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_s_form_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_s_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_form_action.reuse(_jspx_th_s_form_0);
      return true;
    }
    _jspx_tagPool_s_form_action.reuse(_jspx_th_s_form_0);
    return false;
  }
}
