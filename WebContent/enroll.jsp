<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Enroll</title>
</head>
<body>
<form action="Enrollment">
Child Name:<input type="text" name="childName">
Age:<input type="text" name="childAge">
Program:<select id="program" name="program">
		<option value="Preschool">PreSchool</option>
  		<option value="Prek">Pre K</option>
  		<option value="Daycare">Daycare</option>
		</select>
		<input type="submit" value="Enroll">
</form>
</body>
</html>