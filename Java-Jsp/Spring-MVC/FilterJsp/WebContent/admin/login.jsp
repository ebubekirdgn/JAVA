<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>This page is login</title>
</head>
<body>
	<fieldset>
		<legend>Login</legend>
		<br>
		${message}
		<form method="post" action="account">
			<table cellpadding="2" cellspacing="2">
				<tr>
					<td>Username</td>
					<td><input type="text" name="username"></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="password"></td>
				</tr>
				<tr>
					<td>&nbsp;</td>
					<td><input type="submit" value="Login"></td>
				</tr>
			</table>
		</form>
	</fieldset>
</body>
</html>