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
<div class="header">Purchased Material List</div>
<div class="content">			      			 	
			
			

<h:panelGrid rendered="#{us.bool_staf3}">
<a href="planing.jsf" class="button1">Home Page</a><br>
</h:panelGrid>

<h:panelGrid rendered="#{us.bool_staf2}">
<a href="pro.jsf" class="button1">Home Page</a><br>
</h:panelGrid>
<a href="RawList.jsf" class="button1">Raw List</a><br>

<a href="Recipe_list.jsf" class="button1">Recipe List</a><br>
<a href="product.jsf" class="button1">product_list</a><br>
<a href="Stock.jsf" class="button1">Stock</a><br>
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
<p align="center">
<h:panelGrid id="panel5" columns="3" 
   cellpadding="2" cellspacing="2" width="400"  >
   
	 <h:dataTable value="#{raw.accept}" var="b"
	 styleClass="personel-general" 
  	 headerClass="personel-headers"
   	rowClasses="personel-tek,personel-cift">
			
			<h:column >
			<f:facet  name="header"><h:outputText value="ID" /></f:facet>  
      			 <h:outputText value="#{b.apur_id} "/>	
   			</h:column>	   		
   			
   			<h:column >    		
   		<f:facet  name="header"><h:outputText value="status" /></f:facet>  
      			 <h:outputText value="#{b.bpur_status}" />	
   			</h:column>
   			<h:column >    				
   				<f:facet  name="header"><h:outputText value="name" /></f:facet>  
      			 <h:outputText value="#{b.cpur_name}"    />	
   			</h:column>
   			<h:column >    				
   				<f:facet  name="header"><h:outputText value="NUMBER" /></f:facet>  
      			 <h:outputText value="#{b.dpur_num}"    />	
   			</h:column>
   			
   			
   			<h:column >    				
   				<f:facet  name="header"><h:outputText value="date" /></f:facet>  
      			 <h:outputText value="#{b.fpur_tarih.date}-#{b.fpur_tarih.month+1}-#{b.fpur_tarih.year+1900} "    />	
   			</h:column>
   			
  
	 </h:dataTable>
	 	 </h:panelGrid></p>
	 	 
	 	 </h:form>
	 	 </div>
	 	 </div>
</f:view>
</body>
</html>