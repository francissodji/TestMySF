<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div class="container">
	  <form method = "POST" action="GetRace" >
	    <div class="row">
	      <div class="col-25">
	        <label for="fname">Race Title</label>
	      </div>
	      <div class="col-75">
	        <input type="text" id="RaceTitle" name="RaceTitle" placeholder="Race Title">
	      </div>
	    </div>
	    
	    
	    <div class="row">
	      <input type="submit" value="Submit">
	    </div>
	    
	  </form>
	</div>
	
</body>
</html>