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
<div class="header">PERSONNEL</div>
<div class="content">			      			 	
	<h:form>		

<h:panelGrid rendered="#{us.bool_staf3}">
<a href="planing.jsf" class="button1">Home Page</a>
</h:panelGrid><br>
<h:commandLink action="pro.jsf"  rendered="#{us.bool_staf2}"	 styleClass="button1" value="Home Page"/><br>
<h:commandLink action="finance.jsf"  rendered="#{us.bool_staf}"	 styleClass="button1" value="Home Page"/><br>

<h:form>
 <p style="padding-left:45px;">
  <h:commandLink  action="#{us.uyeCikisiniDenetle}" >  <h:graphicImage library="resimler" name="sht.png"/> </h:commandLink>
</p>
</h:form>
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
<p>
<h:panelGrid id="panel3" columns="2" 
   cellpadding="2" cellspacing="2" width="400"  rendered="#{us.bool_staf}" >

				<h:outputLabel value="Staff Name:"/>
                	<h:inputText value="#{stf.newstname}" required="true" styleClass="textbox"/>
                <h:outputLabel value="Staff Surname:"/>
                	<h:inputText value="#{stf.newstsurname}" required="true" styleClass="textbox"/>
                	<h:outputLabel value="Staff Salary:"/>
                	<h:inputText value="#{stf.newsrsalary}" required="true" styleClass="textbox"/>
                	<h:outputLabel value="Staff Mail:"/>
                	<h:inputText value="#{stf.newstmail}" required="true" styleClass="textbox"/>
                	<h:outputLabel value="Staff Department:"/>
                	<h:inputText value="#{stf.newstdepartment}" required="true" styleClass="textbox"/>
              
                
                <h:commandButton value="LOGİN" action="#{stf.add_staff}" styleClass="button" >
			   
				</h:commandButton>
				</h:panelGrid>
				</h:form>
				<br>
				<h:panelGrid id="panel3" columns="3" 
   cellpadding="2" cellspacing="2" width="400"  >
   </p>
	 <h:dataTable value="#{stf.allOfStaff}" var="s"
	 styleClass="personel-general" 
  	 headerClass="personel-headers"
   	rowClasses="personel-tek,personel-cift">
			
			<h:column >
			<f:facet  name="header"><h:outputText value="ID" /></f:facet>  
      			 <h:outputText value="#{s.astid} "/>	
   			</h:column>	   		
   			
   			<h:column >    		
   		<f:facet  name="header"><h:outputText value="NAME" /></f:facet>  
      			 <h:outputText value="#{s.bstname}" />	
   			</h:column>
   			<h:column >    				
   				<f:facet  name="header"><h:outputText value="Surname" /></f:facet>  
      			 <h:outputText value="#{s.cstsurname}"     />	
   			</h:column>
   			<h:column >    				
   				<f:facet  name="header"><h:outputText value="Department" /></f:facet>  
      			 <h:outputText value="#{s.hstdepartment}"     />	
   			</h:column>
   			<h:column >    				
   				<f:facet  name="header"><h:outputText value="Contact" /></f:facet>  
      			 <h:outputText value="#{s.estmail}"     />	
   			</h:column>
  
	 </h:dataTable>
	 	 </h:panelGrid>
</f:view>
</body>
</html>