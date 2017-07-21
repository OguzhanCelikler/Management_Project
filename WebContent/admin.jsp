<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="resources/css/style.css">
<style type="text/css">


ul {
    list-style-type: none;
    margin: 0;
    padding-left: 160px;
    text-align:center;
    overflow: hidden;
}

li {
    float: left;
}
li:hover {
    float: left;
    -webkit-filter: grayscale(100%);filter: grayscale(100%);
}

</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<f:view>
<div class="main">
<div class="header">ADMİN PAGE</div>
			
<div class="bodyy2" >
<h:form>
 <p align="center">
  <h:commandLink  action="#{us.uyeCikisiniDenetle}" >  <h:graphicImage library="resimler" name="sht.png"/> </h:commandLink>
</p><br><br><br>
</h:form>
<ul >
 
<li><h:form>
 <p align="left" style="padding-left:25px; ">
  <h:commandLink  action="pro.jsf" >  <h:graphicImage library="resimler" name="pro.png" height="250px" width="250px"/> </h:commandLink>
</p>
</h:form></li>
<li><h:form>
 <p align="left"  style="padding-left:25px;">
  <h:commandLink  action="planing.jsf" >  <h:graphicImage library="resimler" name="plan.jpg" height="250px" width="250px"/> </h:commandLink>
</p>
</h:form></li>
<li><h:form>
 <p align="left" style="padding-left:25px;">
  <h:commandLink  action="finance.jsf" >  <h:graphicImage library="resimler" name="fin2.png" height="250px" width="250px"/> </h:commandLink>
</p>
</h:form></li>&nbsp
<li><h:form>
 <p align="left" style="padding-left:50px;">
  <h:commandLink  action="admin_crud.jsf" >  <h:graphicImage library="resimler" name="adit.png" height="250px" width="250px"/> </h:commandLink>
</p>
</h:form></li>
</ul>

</div>
</div>
</f:view>
</body>
</html>