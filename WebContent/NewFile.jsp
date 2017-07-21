<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<f:view>
<h1>sdasdsad</h1>
 <h:form>
           
                <h:outputLabel value="First Namer:"/>
                <h:inputText value="#{dene.newname}" /><br/>
                <h:outputLabel value="Last Name:"/>
                <h:inputText value="#{dene.newsurname}"/><br/>
                <h:outputLabel value="USERNAME"/>
                <h:inputText value="#{dene.newsusername}"/><br/>
                <h:outputLabel value="PASSWORD:"/>
                <h:inputText value="#{dene.newpassword}"/><br/>
                <h:outputLabel value="TYPE:"/>
                <h:inputText value="#{dene.newtype}" /><br/>
                    <h:commandButton value="Save" action="#{dene.add}"  >
                        </h:commandButton>
                       <br/>
                       <hr/>
                       <h:outputLabel value="ID GIRISI:"/>
                <h:inputText value="#{dene.newid}" /><br/>
                       <h:commandButton value="DELETE" action="#{dene.del}"  >
                        </h:commandButton>  <br/>
                        
                        <hr/>
                        
                         <h:outputLabel value="ID GIRISI:"/>
               			 <h:inputText value="#{dene.upid}" required="false" /><br/>
                 		<h:outputLabel value="NAME:"/>
               			 <h:inputText value="#{dene.upname}" /><br/>
               			  <h:outputLabel value="SURNAME:"/>
               			 <h:inputText value="#{dene.upsurname}" /><br/>
                       <h:commandButton value="UPDATE" action="#{dene.updt}"  >
                        </h:commandButton>
                        <br>
                         <h:outputLabel value="TYPE:"/>
               <h:inputText value="#{dene.newtype}" /><br/>
                       <h:commandButton value="TYPE" action="#{dene.submit}"  >
                        </h:commandButton>
                        
  <h:panelGrid id="panel" columns="2" border="1"
   cellpadding="10" cellspacing="1" >
                         
 	<h:dataTable value="#{dene.res}" var="em"
	 styleClass="employeeTable"
  	 headerClass="employeeTableHeader"
   	rowClasses="employeeTableOddRow,employeeTableEvenRow" bgcolor="Gray" border="2" >
			
			<h:column >    				
      			 <h:outputText value="#{em.fustype}" />	
   			</h:column>	   		
   			<h:column >    				
      			 <h:outputText value="#{em.busname}" />	
   			</h:column>
   			<h:column>    				
      			 <h:outputText value="#{em.cussurname}" />	
   			</h:column>

	 </h:dataTable> 
	 </h:panelGrid>
	 <br/>
 	 <hr/>                          
	 				
  <h:panelGrid id="panel2" columns="3" border="1"
   cellpadding="10" cellspacing="1" >
   
	 <h:dataTable value="#{dene.allOfThem}" var="em"
	 styleClass="employeeTable"
  	 headerClass="employeeTableHeader"
   	rowClasses="employeeTableOddRow,employeeTableEvenRow" bgcolor="Silver" border="2" >
			
			<h:column >    				
      			 <h:outputText value="#{em.ausid}" style="color:#{em.ausid > 3? 'white' : 'red'} "/>	
   			</h:column>	   		
   			<h:column >    				
      			 <h:outputText value="#{em.busname}" />	
   			</h:column>
   			<h:column>    				
      			 <h:outputText value="#{em.cussurname}" />	
   			</h:column>
  
	 </h:dataTable> 
	 	 </h:panelGrid>
	 
	 </h:form>                          
</f:view>
</body>
</html>