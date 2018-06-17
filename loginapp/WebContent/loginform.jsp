<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Shivam software solution</h2>
<h3>User Login Form</h3>
<s:form action="login" method="POST">
<s:textfield name="uname" label="User Name"/>
<s:password name="upwd" label="Password"/>
<s:submit value="Login"></s:submit>
</s:form>
</body>
</html>