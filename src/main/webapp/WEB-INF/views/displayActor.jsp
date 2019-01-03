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
			<th>Id</th><th>ActorName</th><th>Age</th><th>Gender</th>
		</tr>
		
		<c:forEach var="u" items="${list1}">
			<tr>
				<td>${u.actorId}</td>
				<td>${u.actorName}</td>
				<td>${u.age}</td>
				<td>${u.gender}</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>