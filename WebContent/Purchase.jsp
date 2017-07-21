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
<div class="header">PURCHASE</div>
<div class="content">			      			 	
			
			

<a href="finance.jsf" class="button1">Home Page</a><br>
<a href="staff.jsf" class="button1">Staff</a><br>
<a href="expenses_add.jsf" class="button1">Expenses Add</a><br>
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
<p>
<h:panelGrid id="pane33" columns="2" 
   cellpadding="2" cellspacing="2" width="400"  >
 				<h:outputLabel value=" Purchase name:"/>
                	<h:inputText value="#{fin.newpur_name}" required="true" styleClass="textbox"/>
                <h:outputLabel value="Number of Material:"/>
                	<h:inputText value="#{fin.newpur_num}" required="true" styleClass="textbox"/>
                <h:outputLabel value="Purchase cost"/>
                	<h:inputText value="#{fin.newpur_cost}" required="true" styleClass="textbox"/>
                
                <h:commandButton value="Save" action="#{fin.add_pur}" styleClass="button" >
			   
			    </h:commandButton>
			    </h:panelGrid></p>
</h:form>
<h:form>
<h:panelGrid id="panel3" columns="3" 
   cellpadding="2" cellspacing="2" width="400"  >
   
	 <h:dataTable value="#{fin.allOfThem}" var="m2"
  	 headerClass="personel-headers"
   	rowClasses="personel-tek,personel-cift" width="1000px">
			
			<h:column >
			<f:facet  name="header"><h:outputText value="ID" /></f:facet>  
      			 <h:outputText value="#{m2.apur_id} "/>	
   			</h:column>	   		
   			
   			<h:column >    		
   		<f:facet  name="header"><h:outputText value="NAME" /></f:facet>  
      			 <h:outputText value="#{m2.cpur_name}" />	
   			</h:column>
   			<h:column >    				
   				<f:facet  name="header"><h:outputText value="NUMBER" /></f:facet>  
      			 <h:outputText value="#{m2.dpur_num}"    />	
   			</h:column>
			<h:column >    				
   				<f:facet  name="header"><h:outputText value="COST" /></f:facet>  
      			 <h:outputText value="#{m2.epur_cost} $"    />	
   			</h:column>
   			<h:column >    				
   				<f:facet  name="header"><h:outputText value="Total" /></f:facet>  
      			 <h:outputText value="#{m2.tpur_total} $"    />	
   			</h:column>
   			<h:column >    				
   				<f:facet  name="header"><h:outputText value="DATE" /></f:facet>  
      			 <h:outputText value="#{m2.fpur_tarih.date}-#{m2.fpur_tarih.month+1}-#{m2.fpur_tarih.year+1900} "  />	
   			</h:column>
   			 <h:column >    				
   				<f:facet  name="header"><h:outputText value="update" /></f:facet>  
  <h:commandLink onclick="return confirm('Are you sure?')" action="#{fin.save_to_raw(m2)}" >  <h:graphicImage library="resimler" name="sv.png"/> 
			   
			    </h:commandLink>	  			</h:column>
			     <h:column >    				
   				<f:facet  name="header"><h:outputText value="delete" /></f:facet>  
  <h:commandLink onclick="return confirm('Are you sure?')" action="#{fin.up_to(m2)}" >  <h:graphicImage library="resimler" name="ss.png"/> 
			   
			    </h:commandLink>	  			</h:column>
   			
   			
  
	 </h:dataTable>
	 
	 	 </h:panelGrid>
	 	 </h:form>
	 	 </div>
	 	 </div>
</f:view>
</body>
</html>