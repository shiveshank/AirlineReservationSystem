package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<!--[if lt IE 7 ]> <html lang=\"en\" class=\"no-js ie6 lt8\"> <![endif]-->\n");
      out.write("<!--[if IE 7 ]>    <html lang=\"en\" class=\"no-js ie7 lt8\"> <![endif]-->\n");
      out.write("<!--[if IE 8 ]>    <html lang=\"en\" class=\"no-js ie8 lt8\"> <![endif]-->\n");
      out.write("<!--[if IE 9 ]>    <html lang=\"en\" class=\"no-js ie9\"> <![endif]-->\n");
      out.write("<!--[if (gt IE 9)|!(IE)]><!--> <html lang=\"en\" class=\"no-js\"> <!--<![endif]-->\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\" />\n");
      out.write("        <!-- <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">  -->\n");
      out.write("        <title>Airline Reservation System</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"> \n");
      out.write("        <meta name=\"description\" content=\"Login and Registration Form with HTML5 and CSS3\" />\n");
      out.write("        <meta name=\"keywords\" content=\"html5, css3, form, switch, animation, :target, pseudo-class\" />\n");
      out.write("        <meta name=\"author\" content=\"Codrops\" />\n");
      out.write("        <link rel=\"shortcut icon\" href=\"../favicon.ico\"> \n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/demo.css\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\" />\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/animate-custom.css\" />\n");
      out.write("                \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div class=\"container\">\n");
      out.write("            <!-- Codrops top bar -->\n");
      out.write("            \n");
      out.write("            <header>\n");
      out.write("                <h1 ><font color =\"black\">Airline Reservation System</font></h1>\n");
      out.write("\t\t\t\t\n");
      out.write("            </header>\n");
      out.write("            <section>\t\t\t\t\n");
      out.write("                <div id=\"container_demo\" >\n");
      out.write("                    <!-- hidden anchor to stop jump http://www.css3create.com/Astuce-Empecher-le-scroll-avec-l-utilisation-de-target#wrap4  -->\n");
      out.write("                    <a class=\"hiddenanchor\" id=\"toregister\"></a>\n");
      out.write("                    <a class=\"hiddenanchor\" id=\"tologin\"></a>\n");
      out.write("                    <div id=\"wrapper\">\n");
      out.write("                        <div id=\"login\" class=\"animate form\">\n");
      out.write("                            ");
      if (_jspx_meth_s_form_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div id=\"register\" class=\"animate form\">\n");
      out.write("                            ");
      if (_jspx_meth_s_form_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("                    </div>\n");
      out.write("                </div>  \n");
      out.write("            </section>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
    _jspx_th_s_form_0.setAction("/chintu");
    int _jspx_eval_s_form_0 = _jspx_th_s_form_0.doStartTag();
    if (_jspx_eval_s_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" \n");
        out.write("                                <h1>Log in</h1> \n");
        out.write("                                <p> \n");
        out.write("                                    <label for=\"username\" class=\"uname\" data-icon=\"u\" > Your username </label>\n");
        out.write("                                    <input id=\"username\" name=\"username\" required=\"required\" type=\"text\" placeholder=\"myusername or mymail@mail.com\"/>\n");
        out.write("                                </p>\n");
        out.write("                                <p> \n");
        out.write("                                    <label for=\"password\" class=\"youpasswd\" data-icon=\"p\"> Your password </label>\n");
        out.write("                                    <input id=\"password\" name=\"password\" required=\"required\" type=\"password\" placeholder=\"eg. X8df!90EO\" /> \n");
        out.write("                                </p>\n");
        out.write("                                <p class=\"keeplogin\"> \n");
        out.write("\t\t\t\t\t\t\t\t\t<input type=\"checkbox\" name=\"loginkeeping\" id=\"loginkeeping\" value=\"loginkeeping\" /> \n");
        out.write("\t\t\t\t\t\t\t\t\t<label for=\"loginkeeping\">Keep me logged in</label>\n");
        out.write("\t\t\t\t\t\t\t\t</p>\n");
        out.write("                                <p class=\"login button\"> \n");
        out.write("                                    <input type=\"submit\" value=\"Login\" /> \n");
        out.write("\t\t\t\t\t\t\t\t</p>\n");
        out.write("                                <p class=\"change_link\">\n");
        out.write("\t\t\t\t\t\t\t\t\tNot a member yet ?\n");
        out.write("\t\t\t\t\t\t\t\t\t<a href=\"#toregister\" class=\"to_register\">Join us</a>\n");
        out.write("\t\t\t\t\t\t\t\t</p>\n");
        out.write("                            ");
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

  private boolean _jspx_meth_s_form_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  s:form
    org.apache.struts.taglib.html.FormTag _jspx_th_s_form_1 = (org.apache.struts.taglib.html.FormTag) _jspx_tagPool_s_form_action.get(org.apache.struts.taglib.html.FormTag.class);
    _jspx_th_s_form_1.setPageContext(_jspx_page_context);
    _jspx_th_s_form_1.setParent(null);
    _jspx_th_s_form_1.setAction("/mintu");
    int _jspx_eval_s_form_1 = _jspx_th_s_form_1.doStartTag();
    if (_jspx_eval_s_form_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" \n");
        out.write("                                <h1> Sign up </h1> \n");
        out.write("                                <p> \n");
        out.write("                                    <label for=\"usernamesignup\" class=\"uname\" data-icon=\"u\">Your username</label>\n");
        out.write("                                    <input id=\"usernamesignup\" name=\"usernamesignup\" required=\"required\" type=\"text\" placeholder=\"mysuperusername690\" />\n");
        out.write("                                </p>\n");
        out.write("                                <p> \n");
        out.write("                                    <label for=\"emailsignup\" class=\"youmail\" data-icon=\"e\" > Your email</label>\n");
        out.write("                                    <input id=\"emailsignup\" name=\"emailsignup\" required=\"required\" type=\"email\" placeholder=\"mysupermail@mail.com\"/> \n");
        out.write("                                </p>\n");
        out.write("                                <p> \n");
        out.write("                                    <label for=\"passwordsignup\" class=\"youpasswd\" data-icon=\"p\">Your password </label>\n");
        out.write("                                    <input id=\"passwordsignup\" name=\"passwordsignup\" required=\"required\" type=\"password\" placeholder=\"eg. X8df!90EO\"/>\n");
        out.write("                                </p>\n");
        out.write("                                <p> \n");
        out.write("                                    <label for=\"passwordsignup_confirm\" class=\"youpasswd\" data-icon=\"p\">Please confirm your password </label>\n");
        out.write("                                    <input id=\"passwordsignup_confirm\" name=\"passwordsignup_confirm\" required=\"required\" type=\"password\" placeholder=\"eg. X8df!90EO\"/>\n");
        out.write("                                </p>\n");
        out.write("                                <p class=\"signin button\"> \n");
        out.write("\t\t\t\t\t\t\t\t\t<input type=\"submit\" value=\"Sign up\"/> \n");
        out.write("\t\t\t\t\t\t\t\t</p>\n");
        out.write("                                <p class=\"change_link\">  \n");
        out.write("\t\t\t\t\t\t\t\t\tAlready a member ?\n");
        out.write("\t\t\t\t\t\t\t\t\t<a href=\"#tologin\" class=\"to_register\"> Go and log in </a>\n");
        out.write("\t\t\t\t\t\t\t\t</p>\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_s_form_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_s_form_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_s_form_action.reuse(_jspx_th_s_form_1);
      return true;
    }
    _jspx_tagPool_s_form_action.reuse(_jspx_th_s_form_1);
    return false;
  }
}
