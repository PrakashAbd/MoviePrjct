<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color:midnightblue">	
    	<form action="updated" method="post">
        <table>
        <tr><td><b>MovieId:</b></td><td><input type = "text" name="movieId"></input></td></tr>
        <tr><td><b>Box Office:</b></td><td><input type = "number" step="any" name="boxOffice"></input></td></tr>
        <tr><td><input type="submit" value="SUBMIT" id="1"></input></td><td>
        <input type="reset" value="CLEAR" onclick="location.reload()"></input></td></tr>
        </table>
    	</form>
    </body>
</html>