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
<h:form>
<div class="log">	

		<p align="center" style="font-size: 37px; color:azure; font-family:sans-serif; font-style: oblique;  ">Login Page</p>
<p align="center" style=" padding-top: 40px;">

	

				<h:outputLabel value="USERNAME:" />&nbsp
                	<h:inputText value="#{us.dnewusername}" required="true" styleClass="textbox2"/><br/>
                <h:outputLabel value="PASSWORD:"/>&nbsp
                	<h:inputSecret  value="#{us.enewpassword}" required="true" styleClass="textbox2"/><br/>
              </p>
                <p align="center">
                <h:commandButton value="LOGİN" action="#{us.controlUser}" styleClass="button" >
			   
				</h:commandButton></p>
				</div>
</h:form>
                <h:outputLabel value="#{us.dnewusername }"/><br>
                <h:outputLabel value="#{us.enewpassword }"/>
                

</f:view>
</body>
</html>