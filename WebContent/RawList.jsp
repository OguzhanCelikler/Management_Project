<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="resources/css/style.css">
<title>Insert title here</title>


<meta charset="utf-8">


  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>jQuery UI Datepicker - Default functionality</title>
  <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
  <link rel="stylesheet" href="/resources/demos/style.css">
  <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
  <script>
  $( function() {
    $( ".datepicker" ).datepicker({
    	
        dateFormat: "yy-mm-dd"

    });	
  } );
  $( function() {
	    $( ".datepicker2" ).datepicker({
	    	
	        dateFormat: "yy-mm-dd"

	    });	
	  } );
  </script>


</head>
<body>
<f:view>
<div class="main">
<div class="header">Purchased Material List</div>
<div class="content">			      			 	
			
			

<a href="planing.jsf" class="button1">Home Page</a><br>


<a href="onay.jsf" class="button1">Purchased List</a><br>

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

<div>
<div style="float: left; position: relative;">



<!--   <h:form>
 				<h:outputLabel value="Raw Type:"/>
                	<h:inputText value="#{raw.newraw_type}" required="true"/><br/>
                <h:outputLabel value="Raw Name:"/>
                	<h:inputText value="#{raw.newraw_name}" required="true"/><br/>
                <h:outputLabel value="Raw number"/>
                	<h:inputText value="#{raw.newraw_num}" required="true"/><br/>
                
                <h:commandButton value="Save" action="#{raw.add}" styleClass="button" >
			   
			    </h:commandButton>
</h:form> -->
<br>

<h:form>
			<p>	<h4 align="left">Product : </h4>
					<div class="styled-select" style="position: relative;">
			<h:selectOneMenu value="#{raw.selectmenu_sonuc}" >
				<f:selectItems value="#{raw.secenek2DegerleriniAl}"/>
					</h:selectOneMenu>
			</div>		</p>
					
					<h4 align="left"> Order quantity : </h4>&nbsp
        <div style="float:left; "> &nbsp      	<h:inputText value="#{raw.siparis}" styleClass="textbox" /> </div> 
      
   <div style="float:left;clear:both;	 "> &nbsp         
          <h:commandButton value="Show" action="#{raw.sec}" styleClass="button"  >
			   
			    </h:commandButton>&nbsp<br><br>
			   
		<h:commandButton value="Order" action="#{raw.orderSave}" styleClass="button"  >
			   
			    </h:commandButton>
			    </div>
			
	</h:form>		
	<h:form>		
					<div style="float: left; clear: both; padding-top: 25px;  border:1px;    "> 
		<p>			
			    <h:panelGrid id="panel6" columns="2"  bgcolor="#b5fc7a" 
   cellpadding="2" cellspacing="2" width="400" rendered="#{raw.bool_send_pro}">
	   <h:outputLabel value=""/><h:outputLabel value=""/>
	   
   <h:outputLabel value=""/><h:outputLabel value=""/>
   <h:outputLabel value="Product Name:"/>
                	<h:inputText value="#{raw.newpro_name}" required="false" styleClass="textbox2"/>
                <h:outputLabel value="TO:"/>
                	<h:inputText value="#{raw.newpro_to}" required="false" styleClass="textbox2"/>
   <h:commandButton value="SEND" action="#{raw.up_pro}" styleClass="button" >
			   
			    </h:commandButton>
      <h:outputLabel value=""/><h:outputLabel value=""/>
      <h:outputLabel value=""/><h:outputLabel value=""/>
   
   </h:panelGrid></p>
   </div>
					

				
</h:form>
<br>


</div>


<div style="float: right; position: relative; padding-right: 80px ; padding-top: 30px; ">
<h:panelGrid id="panel3" columns="3" 
   cellpadding="2" cellspacing="2" width="400" rendered="#{raw.bool_rawlist}" >
   
	 <h:dataTable value="#{raw.allOfThem}" var="m"
	 styleClass="personel-general" 
  	 headerClass="personel-headers"
   	rowClasses="personel-tek,personel-cift">
			
			<h:column >
			<f:facet  name="header"><h:outputText value="ID" /></f:facet>  
      			 <h:outputText value="#{m.araw_id} "/>	
   			</h:column>	   		
   			
   			<h:column >    		
   		<f:facet  name="header"><h:outputText value="NAME" /></f:facet>  
      			 <h:outputText value="#{m.craw_name}" />	
   			</h:column>
   			<h:column >    				
   				<f:facet  name="header"><h:outputText value="NUMBER" /></f:facet>  
      			 <h:outputText value="#{m.draw_num}/#{raw.siparis} " style="background-color:#{m.draw_num >= raw.siparis? 'green' : 'red'}"    />	
   			</h:column>
   			
  
	 </h:dataTable>
	 	 </h:panelGrid>
	 </div>
	 <br>
	
	 <br> 
	
	
	</div>

</div>
</div>
</f:view>
</body>
</html>