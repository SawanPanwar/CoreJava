/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.16
 * Generated at: 2020-04-18 06:43:14 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.DecimalFormat;
import in.co.sunrays.proj4.controller.GetMarksheetCtl;
import in.co.sunrays.proj4.util.DataUtility;
import in.co.sunrays.proj4.util.ServletUtility;
import in.co.sunrays.proj4.bean.RoleBean;
import in.co.sunrays.proj4.controller.LoginCtl;
import in.co.sunrays.proj4.bean.UserBean;
import in.co.sunrays.proj4.controller.ORSView;

public final class GetMarksheetView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/jsp/Footer.jsp", Long.valueOf(1555646480000L));
    _jspx_dependants.put("/jsp/Header.jsp", Long.valueOf(1582190656993L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("in.co.sunrays.proj4.controller.ORSView");
    _jspx_imports_classes.add("in.co.sunrays.proj4.bean.RoleBean");
    _jspx_imports_classes.add("in.co.sunrays.proj4.controller.LoginCtl");
    _jspx_imports_classes.add("java.text.DecimalFormat");
    _jspx_imports_classes.add("in.co.sunrays.proj4.util.ServletUtility");
    _jspx_imports_classes.add("in.co.sunrays.proj4.bean.UserBean");
    _jspx_imports_classes.add("in.co.sunrays.proj4.controller.GetMarksheetCtl");
    _jspx_imports_classes.add("in.co.sunrays.proj4.util.DataUtility");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>Get Marksheet</title>\r\n");
      out.write("<link rel=\"icon\" type=\"image/png\"\r\n");
      out.write("\thref=\"");
      out.print(ORSView.APP_CONTEXT);
      out.write("/img/logo.png\" sizes=\"16x16\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<link rel=\"icon\" type=\"image/png\"\r\n");
      out.write("\thref=\"");
      out.print(ORSView.APP_CONTEXT);
      out.write("/img/logo.png\" sizes=\"16x16\" />\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"/ORSProject4/css/angular-datepicker.css\">\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"/ORSProject4/js/angular.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"/ORSProject4/js/angular-locale_en.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"/ORSProject4/js/angular-datepicker.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"/ORSProject4/js/index.js\"></script>\r\n");
      out.write("</head>\r\n");

	UserBean userBean = (UserBean) session.getAttribute("user");

	boolean userLoggedIn = userBean != null;

	String welcomeMsg = "Hi, ";

	if (userLoggedIn) {
		String role = (String) session.getAttribute("role");
		welcomeMsg += userBean.getFirstName() + " (" + role + ")";
	} else {
		welcomeMsg += "Guest";
	}

      out.write("\r\n");
      out.write("\r\n");
      out.write("<table>\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td width=\"90%\"><a style=\"text-decoration: none;\"\r\n");
      out.write("\t\t\thref=\"");
      out.print(ORSView.WELCOME_CTL);
      out.write("\"><b>Welcome</b></a> | ");

			if (userLoggedIn) {
		
      out.write(" <a style=\"text-decoration: none;\"\r\n");
      out.write("\t\t\thref=\"");
      out.print(ORSView.LOGIN_CTL);
      out.write("?operation=");
      out.print(LoginCtl.OP_LOG_OUT);
      out.write("\"><b>Logout</b></a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t");

				} else {
			
      out.write(" <a style=\"text-decoration: none;\" href=\"");
      out.print(ORSView.LOGIN_CTL);
      out.write("\"><b>Login</b></a>\r\n");
      out.write("\t\t\t");

				}
			
      out.write("</td>\r\n");
      out.write("\t\t<td rowspan=\"2\">\r\n");
      out.write("\t\t\t<h1 align=\"Right\">\r\n");
      out.write("\t\t\t\t<img src=\"");
      out.print(ORSView.APP_CONTEXT);
      out.write("/img/customLogo.jpg\" width=\"318\"\r\n");
      out.write("\t\t\t\t\theight=\"90\">\r\n");
      out.write("\t\t\t</h1>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\r\n");
      out.write("\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td>\r\n");
      out.write("\t\t\t<h3>\r\n");
      out.write("\t\t\t\t");
      out.print(welcomeMsg);
      out.write("</h3>\r\n");
      out.write("\t\t</td>\r\n");
      out.write("\t</tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t");

		if (userLoggedIn) {
	
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<td colspan=\"2\"><a href=\"");
      out.print(ORSView.MY_PROFILE_CTL);
      out.write("\">My\r\n");
      out.write("\t\t\t\tProfile</a> | <a href=\"");
      out.print(ORSView.CHANGE_PASSWORD_CTL);
      out.write("\">Change\r\n");
      out.write("\t\t\t\tPassword</a> | <a href=\"");
      out.print(ORSView.GET_MARKSHEET_CTL);
      out.write("\">Get\r\n");
      out.write("\t\t\t\tMarksheet</a> | <a href=\"");
      out.print(ORSView.MARKSHEET_MERIT_LIST_CTL);
      out.write("\">Marksheet\r\n");
      out.write("\t\t\t\tMerit List </a> ");

 	if (userBean.getRoleId() == RoleBean.ADMIN) {
 
      out.write(" | <a href=\"");
      out.print(ORSView.COLLEGE_CTL);
      out.write("\">Add College</a> | <a\r\n");
      out.write("\t\t\thref=\"");
      out.print(ORSView.COLLEGE_LIST_CTL);
      out.write("\">College List</a> | <a\r\n");
      out.write("\t\t\thref=\"");
      out.print(ORSView.MARKSHEET_CTL);
      out.write("\">Add Marksheet</a> | <a\r\n");
      out.write("\t\t\thref=\"");
      out.print(ORSView.MARKSHEET_LIST_CTL);
      out.write("\">Marksheet List</a> | <a\r\n");
      out.write("\t\t\thref=\"");
      out.print(ORSView.USER_CTL);
      out.write("\">Add User</a> | <a\r\n");
      out.write("\t\t\thref=\"");
      out.print(ORSView.USER_LIST_CTL);
      out.write("\">User List</a> | <a\r\n");
      out.write("\t\t\thref=\"");
      out.print(ORSView.ROLE_CTL);
      out.write("\">Add Role</a> | <a\r\n");
      out.write("\t\t\thref=\"");
      out.print(ORSView.ROLE_LIST_CTL);
      out.write("\">Role List</a> ");

 	}

 		if (userBean.getRoleId() == RoleBean.COLLEGE || userBean.getRoleId() == RoleBean.ADMIN) {
 
      out.write(" | <a href=\"");
      out.print(ORSView.STUDENT_CTL);
      out.write("\">Add Student</a> | <a\r\n");
      out.write("\t\t\thref=\"");
      out.print(ORSView.STUDENT_LIST_CTL);
      out.write("\">Student List</a> | <a\r\n");
      out.write("\t\t\thref=\"");
      out.print(ORSView.COURSE_CTL);
      out.write("\">Add Course</a> | <a\r\n");
      out.write("\t\t\thref=\"");
      out.print(ORSView.COURSE_LIST_CTL);
      out.write("\">Course List</a> | <a\r\n");
      out.write("\t\t\thref=\"");
      out.print(ORSView.SUBJECT_CTL);
      out.write("\">Add Subject</a> | <a\r\n");
      out.write("\t\t\thref=\"");
      out.print(ORSView.SUBJECT_LIST_CTL);
      out.write("\">Subject List</a> | <a\r\n");
      out.write("\t\t\thref=\"");
      out.print(ORSView.FACULTY_CTL);
      out.write("\">Add Faculty</a> | <a\r\n");
      out.write("\t\t\thref=\"");
      out.print(ORSView.FACULTY_LIST_CTL);
      out.write("\">Faculty List</a> ");

 	}
 		if (userBean.getRoleId() == RoleBean.COLLEGE || userBean.getRoleId() == RoleBean.FACULTY
 				|| userBean.getRoleId() == RoleBean.ADMIN) {
 
      out.write(" | <a href=\"");
      out.print(ORSView.TIMETABLE_CTL);
      out.write("\">Add Timetable</a> | <a\r\n");
      out.write("\t\t\thref=\"");
      out.print(ORSView.TIMETABLE_LIST_CTL);
      out.write("\">Timetable List</a> ");

 	}

 		if (userBean.getRoleId() == RoleBean.ADMIN) {
 
      out.write(" | <a href=\"");
      out.print(ORSView.JAVA_DOC_VIEW);
      out.write("\" target=\"blank\">Java Doc</a> ");

 	}
 	} else {
 
      out.write(" <a href=\"");
      out.print(ORSView.LOGIN_CTL);
      out.write("\"></a> ");

 	}
 
      out.write("</td>\r\n");
      out.write("\r\n");
      out.write("\t</tr>\r\n");
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("<hr>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t");
      in.co.sunrays.proj4.bean.MarksheetBean bean = null;
      bean = (in.co.sunrays.proj4.bean.MarksheetBean) _jspx_page_context.getAttribute("bean", javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      if (bean == null){
        bean = new in.co.sunrays.proj4.bean.MarksheetBean();
        _jspx_page_context.setAttribute("bean", bean, javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      }
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t");
      in.co.sunrays.proj4.bean.CourseBean coursebean = null;
      coursebean = (in.co.sunrays.proj4.bean.CourseBean) _jspx_page_context.getAttribute("coursebean", javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      if (coursebean == null){
        coursebean = new in.co.sunrays.proj4.bean.CourseBean();
        _jspx_page_context.setAttribute("coursebean", coursebean, javax.servlet.jsp.PageContext.REQUEST_SCOPE);
      }
      out.write("\r\n");
      out.write("\t<div align=\"center\">\r\n");
      out.write("\t\t<h1 align=\"center\" style=\"margin-bottom: -15; color: navy\">Get\r\n");
      out.write("\t\t\tMarksheet</h1>\r\n");
      out.write("\t\t<div style=\"height: 15px; margin-bottom: 12px\">\r\n");
      out.write("\t\t\t<h3>\r\n");
      out.write("\t\t\t\t<font color=\"red\"> ");
      out.print(ServletUtility.getErrorMessage(request));
      out.write("\r\n");
      out.write("\t\t\t\t</font>\r\n");
      out.write("\t\t\t</h3>\r\n");
      out.write("\t\t\t<H3>\r\n");
      out.write("\t\t\t\t<font color=\"green\"> ");
      out.print(ServletUtility.getSuccessMessage(request));
      out.write("\r\n");
      out.write("\t\t\t\t</font>\r\n");
      out.write("\t\t\t</H3>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<form action=\"");
      out.print(ORSView.GET_MARKSHEET_CTL);
      out.write("\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"id\" value=\"");
      out.print(bean.getId());
      out.write("\">\r\n");
      out.write("\t\t\t<table>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th align=\"left\">Roll No :-</th>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"text\" name=\"rollNo\"\r\n");
      out.write("\t\t\t\t\t\tplaceholder=\"Enter Roll No.\" maxlength=\"5\"\r\n");
      out.write("\t\t\t\t\t\tvalue=\"");
      out.print(ServletUtility.getParameter("rollNo", request));
      out.write("\">&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t<td><input type=\"submit\" name=\"operation\"\r\n");
      out.write("\t\t\t\t\t\tvalue=\"");
      out.print(GetMarksheetCtl.OP_GO);
      out.write("\"></td>\r\n");
      out.write("\t\t\t\t\t<td style=\"position: fixed;\"><font color=\"red\">");
      out.print(ServletUtility.getErrorMessage("rollNo", request));
      out.write("</font></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t\t");

				int physics = DataUtility.getInt(DataUtility.getStringData(bean.getPhysics()));
				int chemistry = DataUtility.getInt(DataUtility.getStringData(bean.getChemistry()));
				int maths = DataUtility.getInt(DataUtility.getStringData(bean.getMaths()));

				int total = physics + chemistry + maths;
				float percentage = (float) total / 3;
				percentage = Float.parseFloat(new DecimalFormat("##.##").format(percentage));

				if (bean.getRollNo() != null && bean.getRollNo().trim().length() > 0) {
			
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<table border=\"1\" style=\"border: groove; width: 35%\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td align=\"center\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"background-color: #fdebc5; color: maroon;\"><h2>Rays\r\n");
      out.write("\t\t\t\t\t\t\tTechnologies, Indore</h2></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<table border=\"1\" style=\"border: groove; width: 35%\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td align=\"center\" style=\"width: 15%\">Name</td>\r\n");
      out.write("\t\t\t\t\t<th align=\"center\" style=\"width: 35%; text-transform: capitalize;\">");
      out.print(DataUtility.getStringData(bean.getName()));
      out.write("</th>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<td align=\"center\" style=\"width: 15%\">Roll No</td>\r\n");
      out.write("\t\t\t\t\t<th align=\"center\" style=\"width: 25%; text-transform: uppercase;\">");
      out.print(DataUtility.getStringData(bean.getRollNo()));
      out.write("</th>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td align=\"center\" style=\"width: 15%\">Status</td>\r\n");
      out.write("\t\t\t\t\t<th align=\"center\" style=\"width: 35%\">Regular</th>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<td align=\"center\" style=\"width: 15%\">Course</td>\r\n");
      out.write("\t\t\t\t\t<th align=\"center\" style=\"width: 25%; text-transform: uppercase;\">");
      out.print(DataUtility.getStringData(coursebean.getName()));
      out.write("\"</th>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<table border=\"1\" style=\"border: groove; width: 35%\">\r\n");
      out.write("\t\t\t\t<tr style=\"background-color: #e6e6e485;\">\r\n");
      out.write("\t\t\t\t\t<th align=\"center\" style=\"width: 25%\">Subject</th>\r\n");
      out.write("\t\t\t\t\t<th align=\"center\" style=\"width: 25%\">Earned Credits</th>\r\n");
      out.write("\t\t\t\t\t<th align=\"center\" style=\"width: 25%\">Total Credits</th>\r\n");
      out.write("\t\t\t\t\t<th align=\"center\" style=\"width: 25%\">Grade</th>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td align=\"center\">Physics</td>\r\n");
      out.write("\t\t\t\t\t<td align=\"center\">");
      out.print(physics);
      out.write(' ');

 	if (physics < 33) {
 
      out.write("<span style=\"color: red\">*</span> ");

 	}
 
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<td align=\"center\">100</td>\r\n");
      out.write("\t\t\t\t\t<td align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t");

							if (physics > 90 && physics <= 100) {
						
      out.write('A');
      out.write('+');
      out.write(' ');

							} else if (physics > 80 && physics <= 90) {
						
      out.write('A');
      out.write(' ');

							} else if (physics > 70 && physics <= 80) {
						
      out.write('B');
      out.write('+');
      out.write(' ');

							} else if (physics > 70 && physics <= 80) {
						
      out.write('B');
      out.write(' ');

							} else if (physics > 60 && physics <= 70) {
						
      out.write('C');
      out.write('+');
      out.write(' ');

							} else if (physics > 50 && physics <= 60) {
						
      out.write('C');
      out.write(' ');

							} else if (physics >= 33 && physics <= 50) {
						
      out.write('D');
      out.write(' ');

							} else if (physics >= 0 && physics < 33) {
						
      out.write("<span style=\"color: red;\">F</span> ");

 	}
 
      out.write("\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td align=\"center\">Chemistry</td>\r\n");
      out.write("\t\t\t\t\t<td align=\"center\">");
      out.print(chemistry);
      out.write(' ');

 	if (chemistry < 33) {
 
      out.write("<span style=\"color: red\">*</span> ");

 	}
 
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<td align=\"center\">100</td>\r\n");
      out.write("\t\t\t\t\t<td align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t");

							if (chemistry > 90 && chemistry <= 100) {
						
      out.write('A');
      out.write('+');
      out.write(' ');

							} else if (chemistry > 80 && chemistry <= 90) {
						
      out.write('A');
      out.write(' ');

							} else if (chemistry > 70 && chemistry <= 80) {
						
      out.write('B');
      out.write('+');
      out.write(' ');

							} else if (chemistry > 70 && chemistry <= 80) {
						
      out.write('B');
      out.write(' ');

							} else if (chemistry > 60 && chemistry <= 70) {
						
      out.write('C');
      out.write('+');
      out.write(' ');

							} else if (chemistry > 50 && chemistry <= 60) {
						
      out.write('C');
      out.write(' ');

							} else if (chemistry >= 33 && chemistry <= 50) {
						
      out.write('D');
      out.write(' ');

							} else if (chemistry >= 0 && chemistry < 33) {
						
      out.write("<span style=\"color: red;\">F</span> ");

 	}
 
      out.write("\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td align=\"center\">Maths</td>\r\n");
      out.write("\t\t\t\t\t<td align=\"center\">");
      out.print(maths);
      out.write(' ');

 	if (maths < 33) {
 
      out.write("<span style=\"color: red\">*</span> ");

 	}
 
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t<td align=\"center\">100</td>\r\n");
      out.write("\t\t\t\t\t<td align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t");

							if (maths > 90 && maths <= 100) {
						
      out.write('A');
      out.write('+');
      out.write(' ');

							} else if (maths > 80 && maths <= 90) {
						
      out.write('A');
      out.write(' ');

							} else if (maths > 70 && maths <= 80) {
						
      out.write('B');
      out.write('+');
      out.write(' ');

							} else if (maths > 70 && maths <= 80) {
						
      out.write('B');
      out.write(' ');

							} else if (maths > 60 && maths <= 70) {
						
      out.write('C');
      out.write('+');
      out.write(' ');

							} else if (maths > 50 && maths <= 60) {
						
      out.write('C');
      out.write(' ');

							} else if (maths >= 33 && maths <= 50) {
						
      out.write('D');
      out.write(' ');

							} else if (maths >= 0 && maths < 33) {
						
      out.write("<span style=\"color: red;\">F</span> ");

 	}
 
      out.write("\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<table border=\"1\" style=\"border: groove; width: 35%\">\r\n");
      out.write("\t\t\t\t<tr style=\"background-color: #e6e6e485;\">\r\n");
      out.write("\t\t\t\t\t<th align=\"center\" style=\"width: 25%\">Total Marks</th>\r\n");
      out.write("\t\t\t\t\t<th align=\"center\" style=\"width: 25%\">Percentage (%)</th>\r\n");
      out.write("\t\t\t\t\t<th align=\"center\" style=\"width: 25%\">Division</th>\r\n");
      out.write("\t\t\t\t\t<th align=\"center\" style=\"width: 25%\">Result</th>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th align=\"center\">");
      out.print(total);
      out.write(' ');

 	if (total < 99 || physics < 33 || chemistry < 33 || maths < 33) {
 
      out.write("<span style=\"color: red;\">*</span> ");

 	}
 
      out.write("</th>\r\n");
      out.write("\t\t\t\t\t<th align=\"center\">");
      out.print(percentage);
      out.write(" %</th>\r\n");
      out.write("\t\t\t\t\t<th align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t");

							if (percentage >= 60 && percentage <= 100) {
						
      out.write("1<sup>st</sup> ");

 	} else if (percentage >= 40 && percentage < 60) {
 
      out.write("2<sup>nd</sup> ");

 	} else if (percentage >= 0 && percentage < 40) {
 
      out.write("3<sup>rd</sup> ");

 	}
 
      out.write("\r\n");
      out.write("\t\t\t\t\t</th>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<th align=\"center\">\r\n");
      out.write("\t\t\t\t\t\t");

							if (physics >= 33 && chemistry >= 33 && maths >= 33) {
						
      out.write("<span style=\"color: forestgreen;\">Pass</span> ");

 	} else {
 
      out.write("<span style=\"color: red;\">Fail</span> ");

 	}
 
      out.write("\r\n");
      out.write("\t\t\t\t\t</th>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\t");

				}
			
      out.write("\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("div.sticky {\r\n");
      out.write("\tposition: -webkit-sticky;\r\n");
      out.write("\tposition: sticky;\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tbottom: 0;\r\n");
      out.write("\ttop: 100%;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<div class=\"sticky\">\r\n");
      out.write("\t<HR>\r\n");
      out.write("\t<strong>Copyrights &copy; Rays Technologies</strong>\r\n");
      out.write("</div>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
