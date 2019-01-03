<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
	table
        	{
        		width: 350px;
        		height:200px;
        		margin-top : 300px;
        		margin-left:38em;
        		color: white;
        	}
        	td{
        		margin-left: 10px;
        	}
</style>


</head>
   <body style="background-color:midnightblue">	
    	<form action="addActor" method="post">
        <table>
        <tr><td><b>ActorId:</b></td><td><input type = "text" name="actorId"></input></td></tr>
        <tr><td><b>ActorName:</b></td><td><input type = "text" name="actorName"></input></td></tr>
        <tr><td><b>ActorAge:</b></td><td><input type = "number" name="age"></input></td></tr>
        <tr><td><b>Gender:</b></td><td><input type = "text" name="gender"></input></td></tr>
        <tr><td><input type="submit" value="SUBMIT" id="1"></input></td><td>
        <input type="reset" value="CLEAR" onclick="location.reload()"></input></td></tr>
        </table>
    	</form>
    </body>
</html>