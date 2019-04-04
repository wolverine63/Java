<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <div align="center">
        <form action="Login" method="POST">
            User Name:<input type="text" name="usernam" required="required"><br>
            Password : <input type="password" name="password" required="required"><br>
            <input type="submit" value="Login" />
            <input type="reset" value="RESET" />
            
        </form>
    </div>
    </body>
</html>