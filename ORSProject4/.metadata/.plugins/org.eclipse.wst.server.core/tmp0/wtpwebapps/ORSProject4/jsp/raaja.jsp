<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Raaja</title>
</head>
<body>
<form>
<%@ include file ="Header.jsp"%>
<h1 align="center" style="border-bottom: thick; color: navy;">Login</h1>
<br>
<table align="center">
<tr>
<th align="left">First Name<span style="color:red">*</span></th>
<td align="center"><input type="text" placeholder="First Name"></td>
</tr>
<tr>
<th align="left">Last Name<span style="color:red">*</span></th>
<td align="center"><input type="text" placeholder="Last Name"></td>
</tr>
<tr>
<th align="left">Email Id<span style="color:red">*</span></th>
<td align="center"><input type="text" placeholder="Email Id"></td>
</tr>
<tr>
<th align="left">Mob. No.<span style="color:red">*</span></th>
<td align="center"><input type="text" placeholder="Mobile Number"></td>
</tr>
<tr>
<th></th>
<td></td>
</tr>
<tr>
<th></th>
<td></td>
</tr>
<tr>
<th></th>
<td colspan="2"><input type="submit" value="Sign In">&nbsp; <input type="submit" value="Sign Up">&nbsp;</td>
</tr>
<tr>
<th></th>
<td></td>
</tr>
<tr>
<th></th>
<td><a href="<%=ORSView.WELCOME_CTL%>"><b>Forget My Password??</b></a></td>
</tr>
</table>
<br> <br>
</form>
<%@ include file ="Footer.jsp"%>
</body>
</html>