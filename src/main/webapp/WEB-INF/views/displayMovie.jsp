<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
	<title>View Actors</title>
	<style>
		table{
			margin-left:350px;
			width: 50%;
			cellpadding: 2;
			border: 2px solid black;
			color:white;
		}
	</style>
</head>
<body style="background-color:midnightblue">

	<h1>Actors List</h1>
	<table border="2">
		<tr>
			<th>Id</th><th>MovieName</th><th>Genre</th><th>Actor</th><th>Type</th><th>BoxOffice</th>
		</tr>
		
		<c:forEach var="u" items="${list1}">
			<tr>
				<td>${u.movieId}</td>
				<td>${u.movieName}</td>
				<td>${u.genreId}</td>
				<td>${u.actorId}</td>
				<td>${u.type}</td>
				<td>${u.boxOffice}</td>
			</tr>
		</c:forEach>
	</table>
	<center><a href="update" name="update"><input type="button" name="update" value="EDIT"></a></center>
</body>
</html>