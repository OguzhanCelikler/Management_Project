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
<div class="header">Stock List</div>
<div class="content">			      			 	
			

<h:panelGrid rendered="#{us.bool_staf3}">
<a href="planing.jsf" class="button1">Home Page</a><br>
</h:panelGrid>

<h:panelGrid rendered="#{us.bool_staf2}">
<a href="pro.jsf" class="button1">Home Page</a><br>
</h:panelGrid>

<a href="product.jsf" class="button1">Product List</a><br>
<a href="staff.jsf" class="button1">Staff</a><br>
<a href="Recipe_list.jsf" class="button1">Recipe List</a>
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
				<p>
<h:panelGrid id="panel9" columns="2" 
   cellpadding="2" cellspacing="2" width="400"  >
   
				<h:outputLabel value=" Stock Name:"/>
                	<h:inputText value="#{pro.newst_name}" required="true" styleClass="textbox"/>
                <h:outputLabel value="Stok num:"/>
                	<h:inputText value="#{pro.newst_num}" required="true" styleClass="textbox"/>
                <h:outputLabel value="Stock to"/>
                	<h:inputText value="#{pro.newst_to}" required="true" styleClass="textbox"/>
                 
                <h:commandButton value="Save" action="#{pro.add_stk}" styleClass="button" >
			   
			    </h:commandButton>

</h:panelGrid>
</h:form> </p>
<h:panelGrid id="panel9" columns="7" 
   cellpadding="2" cellspacing="2" width="400"  >
   
	 <h:dataTable value="#{pro.allStok}" var="r"
  	 headerClass="personel-headers"
   	rowClasses="personel-tek,personel-cift" width="1000px">
			
			<h:column >
			<f:facet  name="header"><h:outputText value="ID" /></f:facet>  
      			 <h:outputText value="#{r.ast_id} "/>	
   			</h:column>	   		
   			
   			<h:column >    		
   		<f:facet  name="header"><h:outputText value="NAME" /></f:facet>  
      			 <h:outputText value="#{r.cst_name}" />	
   			</h:column>
   			<h:column >    				
   				<f:facet  name="header"><h:outputText value="NUMBER" /></f:facet>  
      			 <h:outputText value="#{r.dst_num}"    />	
   			</h:column>
			<h:column >    				
   				<f:facet  name="header"><h:outputText value="TO" /></f:facet>  
      			 <h:outputText value="#{r.est_to} "    />	
   			</h:column>    	
   			<h:column>			
   				<f:facet  name="header"><h:outputText value="DATE" /></f:facet>  
      			 <h:outputText value="#{r.fst_tarih.date}-#{r.fst_tarih.month+1}-#{r.fst_tarih.year+1900} "  />	
   			 </h:column>
   		
	 </h:dataTable>
	 
	 	 </h:panelGrid>
	 	 </div>
	 	 </div>
</f:view>
</body>
</html>