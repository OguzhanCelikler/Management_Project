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

<f:view>
<h:form>

<div class="main">
<div class="header">Recipe List</div>
<div class="content">			      			 	
			

<h:panelGrid rendered="#{us.bool_staf3}">
<a href="planing.jsf" class="button1">Home Page</a><br>
</h:panelGrid>

<h:panelGrid rendered="#{us.bool_staf2}">
<a href="pro.jsf" class="button1">Home Page</a><br>
</h:panelGrid>


<a href="product.jsf" class="button1">Product List</a><br>
<a href="staff.jsf" class="button1">Staff</a><br>
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

<h:panelGrid id="pane21" columns="2" 
   cellpadding="2" cellspacing="2" width="400" rendered="#{us.bool_staf2}">
           
                <h:outputLabel value="Recipe Type:"/>
                <h:inputText value="#{rec.newrec_type}"  styleClass="textbox" required="true"/>
                <h:outputLabel value="Recipe Name:"/>
                 <h:inputText value="#{rec.newrec_name}"  styleClass="textbox" required="true"/>
                <h:outputLabel value="Recipe Motherboard:"/>
                <h:inputText value="#{rec.newrec_motherb}" styleClass="textbox" required="true"/>
                <h:outputLabel value="Ram Name:"/>
                <h:inputText value="#{rec.newrec_ram}" styleClass="textbox" required="true"/>
                <h:outputLabel value="Case Name:"/>
                <h:inputText value="#{rec.newrec_case}" styleClass="textbox" required="true" />
                <h:outputLabel value="Monitor Name:"/>
                <h:inputText value="#{rec.newrec_monit}" styleClass="textbox" required="true" />
                <h:outputLabel value="Processer Name:"/>
                <h:inputText value="#{rec.newrec_proc}" styleClass="textbox" required="true"/>
                <h:outputLabel value="graphcard name"/>
                <h:inputText value="#{rec.newrec_graph}" styleClass="textbox"  required="true"/>
                    <h:commandButton value="Save" action="#{rec.add}"   styleClass="button">
                        </h:commandButton>
                        
                        </h:panelGrid>
                       
                      <br>   
                    
                  
    <h:panelGrid id="panel2" columns="3" 
   cellpadding="2" cellspacing="1" >
   
	 <h:dataTable value="#{rec.allOfThem}" var="em"
	  headerClass="personel-headers"
   	rowClasses="personel-tek,personel-cift" width="900px">
			 
			
			<h:column >    
			<f:facet  name="header"><h:outputText value="Model Id" /></f:facet>  				
      			 <h:outputText value="#{em.arec_id} "/>	
   			</h:column>	   		
   			<h:column >    
   			<f:facet  name="header"><h:outputText value="Model Name" /></f:facet>  				
      			 <h:outputText value="#{em.crec_name}" />	
   			</h:column>
   			<h:column >  
   			<f:facet  name="header"><h:outputText value="MotherBoard" /></f:facet>    				
      			 <h:outputText value="#{em.drec_motherb} "/>	
   			</h:column>	   	
   			<h:column >  
   			<f:facet  name="header"><h:outputText value="RAM" /></f:facet>    				
      			 <h:outputText value="#{em.erec_ram}" />	
   			</h:column>	   	
   			<h:column > 
   			<f:facet  name="header"><h:outputText value="CASE" /></f:facet>     				
      			 <h:outputText value="#{em.frec_case}" />	
   			</h:column>	   	
   			<h:column > 
   			<f:facet  name="header"><h:outputText value="Monitör" /></f:facet>     				
      			 <h:outputText value="#{em.grec_monit}" />	
   			</h:column>	   	
   			<h:column >  
   			<f:facet  name="header"><h:outputText value="Processor" /></f:facet>    				
      			 <h:outputText value="#{em.hrec_proc}" />	
   			</h:column>	   	
   			<h:column > 
   			<f:facet  name="header"><h:outputText value="Graph Card" /></f:facet>     				
      			 <h:outputText value="#{em.irec_graph}" />	
   			</h:column>	   	
   			
  
	 </h:dataTable> 
	 </h:panelGrid>
	 
	 </div>
	 </div>
 </h:form>
</f:view>
</body>
</html>