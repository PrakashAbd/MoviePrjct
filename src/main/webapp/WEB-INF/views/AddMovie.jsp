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
    	<form action="addMovie" method="post">
        <table>
        <tr><td><b>MovieId:</b></td><td><input type = "text" name="movieId"></input></td></tr>
        <tr><td><b>MovieName:</b></td><td><input type = "text" name="movieName"></input></td></tr>
        <tr><td><b>Movie Genre:</b></td><td><input type = "text" name="genreId"></input></td></tr>
        <tr><td><b>Actor id:</b></td><td><input type = "text" name="actorId"></input></td></tr>
        <tr><td><b>Movie type:</b></td><td><input type = "text" name="type"></input></td></tr>
        <tr><td><b>Box Office:</b></td><td><input type = "number" step="any" name="boxOffice"></input></td></tr>
        <!-- <tr><td><b>Genre :</b></td><td><input type = "text" name="genreId"></input></td></tr>
        <tr><td><b>Actor :</b></td><td><input type = "text" name="actorId"></input></td></tr> -->
        <tr><td><input type="submit" value="SUBMIT" id="1"></input></td><td>
        <input type="reset" value="CLEAR" onclick="location.reload()"></input></td></tr>
        </table>
    	</form>
    </body>
</html>