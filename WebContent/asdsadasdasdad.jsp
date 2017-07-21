<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Insert title here</title>
 <meta charset="utf-8">
  <title>toggle demo</title>
  <style>
  p {
  	display:none;
    background: #dad;
    font-weight: bold;
    font-size: 16px;
  }
  </style>
  <script src="https://code.jquery.com/jquery-1.10.2.js"></script>
</head>
<body>
<f:view>

<button>Toggle 'em</button>
<p>Hiya</p>
<p>Such interesting text, eh?</p>
 
<script>
$( "button" ).click(function() {
  $( "p" ).toggle( "slow" );
});
</script>
 
</body>
</f:view>
</body>
</html>