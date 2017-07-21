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
<div class="header">ADMİN PAGE</div>
	
<div class="bodyy2" >

<br>

<div style="float: left; position: relative; ">

	<h:form>
<h:panelGrid id="pa" columns="2" 
   cellpadding="2" cellspacing="2" width="400"  >
   	
   
 				<h:outputLabel value="User Name:"/>
                	<h:inputText value="#{us.bbnewname}" required="true" styleClass="textbox"/>
                <h:outputLabel value="User Surname:"/>
                	<h:inputText value="#{us.ccnewsurname}" required="true" styleClass="textbox"/>
                <h:outputLabel value="UserName"/>
                	<h:inputText value="#{us.ddnewusername}" required="true" styleClass="textbox"/>
                	<h:outputLabel value="User Password"/>
                	<h:inputText value="#{us.eenewpassword}" required="true" styleClass="textbox"/>
                	<h:outputLabel value="User Type"/>
                	<h:inputText value="#{us.ffnewtype}" required="true" styleClass="textbox"/>
                
                <h:commandButton value="Save" action="#{us.add_user}" styleClass="button" ></h:commandButton><br><br>
                 
			   
			    
   
   
   </h:panelGrid>
</h:form>
<h:form>

<p align="center">
  <h:commandLink  action="#{us.uyeCikisiniDenetle}" >  <h:graphicImage library="resimler" name="sht.png"/> </h:commandLink>

&nbsp

 
  <h:commandLink  action="admin.jsp" >  <h:graphicImage library="resimler" name="adm.png" height="56px" width="56px"/> </h:commandLink>


</h:form>
</div>





<div style="float: left; position: relative;" >
<h:panelGrid id="panel" columns="7" 
   cellpadding="2" cellspacing="2" width="400"  >
   
	 <h:dataTable value="#{us.user}" var="u"
  	 headerClass="personel-headers"
   	rowClasses="personel-tek,personel-cift" width="1000px">
			
			<h:column >
			<f:facet  name="header"><h:outputText value="ID" /></f:facet>  
      			 <h:outputText value="#{u.aadid} "/>	
   			</h:column>	   		
   			
   			<h:column >    		
   		<f:facet  name="header"><h:outputText value="NAME" /></f:facet>  
      			 <h:outputText value="#{u.badname}" />	
   			</h:column>
   			<h:column >    				
   				<f:facet  name="header"><h:outputText value="SURNAME" /></f:facet>  
      			 <h:outputText value="#{u.cadsurname}"    />	
   			</h:column>
			<h:column >    				
   				<f:facet  name="header"><h:outputText value="USERNAME" /></f:facet>  
      			 <h:outputText value="#{u.dadusername} "    />	
   			</h:column>    	
   			<h:column>			
   				<f:facet  name="header"><h:outputText value="PASSWORD" /></f:facet>  
      			 <h:outputText value="#{u.eadpassword} "  />	
   			 </h:column>
   			 <h:column>    				
   				<f:facet  name="header"><h:outputText value="DELETE" /></f:facet>  
   				<h:form>
  <h:commandLink onclick="return confirm('Are you sure?')" action="#{us.rowDel(u)}" >  <h:graphicImage library="resimler" name="Delete.png"/> 
			   
			    </h:commandLink>	  </h:form>			</h:column>
			   
   			
   			
  
	 </h:dataTable>
	 
	 	 </h:panelGrid>
	 
</div>
</div>
</f:view>
</body>
</html>