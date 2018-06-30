<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"  isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<link rel="stylesheet" href="<%= request.getContextPath() %>/resources/css/bootstrap.css"> 

<link rel="stylesheet" href="<%= request.getContextPath() %>/resources/css/bootstrap.min.css">
  
 <script type="text/javascript" src="<%= request.getContextPath() %>/resources/js/bootstrap.js"></script> 
 
 <script type="text/javascript" src="<%= request.getContextPath() %>/resources/js/bootstrap.min.js"></script>
  
 <script type="text/javascript" src="<%= request.getContextPath() %>/resources/js/jquery-3.1.1.min.js"></script>
  
 


<title>Calcul somme-produit</title>
</head>
<body>

	<form action="<%=request.getContextPath()%>/calcul" method="post">
		<div class="form-group">
			<label for="email">A:</label> <input type="text"
				class="form-control"  name="a">
		</div>
		<div class="form-group">
			<label for="pwd">B:</label> <input type="text"
				class="form-control" name="b">
		</div>
		<div class="form-group">
			<label for="pwd">Résultat : </label> ${rs }
		</div>
		
		<button type="submit" class="btn btn-primary" name="action" value="somme">Somme</button>
		<button type="submit" class="btn btn-primary" name="action" value="produit">Produit</button>
	</form>

</body>
</html>