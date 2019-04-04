<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div align="center">
        <form action="Registeration" method="POST">
            User Name:<input type="text" name="usernam" required="required"><br>
            Password : <input type="password" name="password" required="required"><br>
            Age : <input type="text" name="age" required="required" /><br>
            Gender : <select name="gender">
                <option>Male</option>
                <option>Female</option>
                <option>Transgender</option>
            </select><br>
            Event : <select name="event" multiple="multiple">
                <option>Mr.Tanwar Body Building</option>
                <option>Fashion Show</option>
                <option>Dance</option>
                <option>Singing</option>
                <option>Coding</option>
            </select><br>
            <input type="submit" value="REGISTER" />
            <input type="reset" value="RESET" />
            
        </form>
    </div>
    </body>
</html>