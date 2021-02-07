<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Patient</title>
</head>
<body>
	
	<div class="container">
	  <form method = "POST" action="GetPatient" >
	  
	  <div class="row">
	      <div class="col-25">
	        <label for="fname">SSN</label>
	      </div>
	      <div class="col-75">
	        <input type="text" id="lastName" name="ssn" placeholder="ssn">
	      </div>
	    </div>
	    
	    <div class="row">
	      <div class="col-25">
	        <label for="fname">First name</label>
	      </div>
	      <div class="col-75">
	        <input type="text" id="firstName" name="firstName">
	      </div>
	    </div>
	    
	    <div class="row">
	      <div class="col-25">
	        <label for="fname">Last name</label>
	      </div>
	      <div class="col-75">
	        <input type="text" id="lastName" name="lastName">
	      </div>
	    </div>
	    
	    <div class="row">
	      <div class="col-25">
	        <label for="fname">Gender</label>
	      </div>
	      <div class="col-75">
	        <input type="text" id="gender" name="gender">
	      </div>
	    </div>
	    
	     <div class="row">
	      <div class="col-25">
	        <label for="fname">Email</label>
	      </div>
	      <div class="col-75">
	        <input type="text" id="email" name="email">
	      </div>
	    </div>
	    
	    <div class="row">
	      <div class="col-25">
	        <label for="fname">Address</label>
	      </div>
	      <div class="col-75">
	        <input type="text" id="address" name="address">
	      </div>
	    </div>
	    
	     <div class="row">
	      <div class="col-25">
	        <label for="fname">Address</label>
	      </div>
	      <div class="col-75">
	        <input type="text" id="phoneNumb" name="phoneNumb">
	      </div>
	    </div>
	    
	    <div class="row">
	      <div class="col-25">
	        <label for="fname">Address</label>
	      </div>
	      <div class="col-75">
	        <input type="text" id="RaceId" name="RaceId">
	      </div>
	    </div>
	    
	    
	    <div class="row">
	      <input type="submit" value="Submit">
	    </div>
	    
	  </form>
	</div>

</body>
</html>