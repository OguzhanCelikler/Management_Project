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
<div class="header">Expenses Add</div>
<div class="content">			      			 	
			
			
<a href="finance.jsf" class="button1">Home Page</a><br>
<a href="Purchase.jsf" class="button1">Purchase</a><br>
<a href="staff.jsf" class="button1">Staff</a><br>
<a href="report.jsf" class="button1">Report</a>
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
<h:form>
<p align="left">
<h:panelGrid id="panel8" columns="2" 
   cellpadding="2" cellspacing="2" width="400"  >
 				<h:outputLabel value="Expense Type:"/>
                	<h:inputText value="#{exp.newexname}" required="true" styleClass="textbox"/>
                <h:outputLabel value="Spending amount:"/>
                	<h:inputText value="#{exp.newexcost}" required="true" styleClass="textbox"/>
               
                <h:commandButton value="Save" action="#{exp.add_exp}" styleClass="button" >
			   
			    </h:commandButton>
			    </p>
			    </h:panelGrid>
</h:form>

</f:view>
</div>
</div>
</body>
</html>