<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="entité.*,DAO.*,servlet.*,java.util.*" import="javax.servlet.httpServlet" %>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4" crossorigin="anonymous"></script>
<meta charset="ISO-8859-1">
<title>LOG IN</title>
</head>
<body>

<div class="row m-2 p-2 d-flex justify-content-center">
	<%@ include file="PageAcceuil.jsp" %>
	<div class="mt-5 col-6">
	<div class="display-5 mb-4">Log in</div>
	<form method="post" action="Authentification">
	  <div class="mb-3">
	    <label for="exampleInputEmail1" class="form-label">username</label>
	    <input type="text" class="form-control" name="Login" id="exampleInputEmail1" aria-describedby="emailHelp">
	  </div>
	  <div class="mb-3">
	    <label for="exampleInputPassword1" class="form-label">password</label>
	    <input type="password" name="Password" class="form-control" id="exampleInputPassword1">
	  </div>

	  <button type="submit" class="btn btn-primary">SUBMIT</button>
	</form>
	</div>
</div>
</body>
</html>