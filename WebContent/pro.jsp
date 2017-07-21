<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="resources/css/style.css">

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<f:view>

<div class="main">
<div class="header">Production Department</div>
<div class="content">			      			 	
			
			

<a href="product.jsf" class="button1">Product List</a><br>
<a href="staff.jsf" class="button1">Staff</a><br>
<a href="Recipe_list.jsf" class="button1">Recipe List</a><br>
<a href="Stock.jsf" class="button1">Stock</a>
 <h:form>
 <p style="padding-left:45px;">
  <h:commandLink  action="#{us.uyeCikisiniDenetle}" >  <h:graphicImage library="resimler" name="sht.png"/> </h:commandLink>
</p>
</h:form>
<h:panelGrid rendered="#{us.bool_staf4}">
<h:form>
 <p style="padding-left:35px;">
  <h:commandLink  action="admin.jsp" >  <h:graphicImage library="resimler" name="adm.png" height="56px" width="56px"/> </h:commandLink>
</p>

</h:form>
</h:panelGrid>
</div>
<div class="bodyy">
 <p align="CENTER" style="font-size:26px;"> WELCOM :<h:outputText value="#{us.bnewname} " /> &nbsp <h:outputText value="#{us.cnewsurname} "/> </p>
<br><h:graphicImage style="width:40%; height:60%;" library="resimler" name="pro.png"/>
</div>
</div>
</f:view>
</body>
</html>

<!--  
<a href="product.jsf">Product List</a><br>
<a href="staff.jsf">Staff List</a><br>
<a href="Recipe_list.jsf">Recipe List</a><br>
<a href="Stock.jsf">Stock</a><br> -->