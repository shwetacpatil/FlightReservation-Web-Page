<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Registration</title>
</head>
<body>
      <h2>New Registration</h2>
      <form action="saveReg" method="post">
      <pre>
         First name<input type="text" name="firstName"/>
         last name<input type="text" name="lastName"/>
         email<input type="text" name="email"/>
         Password<input type="text" name="password"/>
         <input type="submit" name="save"/>
      
      </pre>
      </form>

</body>
</html>