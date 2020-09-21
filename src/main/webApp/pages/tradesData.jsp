<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Enter Trade Details</title>
</head>
<body>
<form action = "addTradeDetails">
<from method = "post" action = "details">
Enter Trade Id <input type="text" name="trdid"><br>
Enter Security Name <input type="text" name="secName"><br>
Enter Cusip Id <input type="text" name="cusipid"><br>
Enter Trade Amount <input type="text" name="trdAmt"><br>
<input type="submit"><br>
<form>
</body>
</html>