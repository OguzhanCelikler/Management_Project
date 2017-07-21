<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="resources/css/style.css">
<style type="text/css">
@media print
{
body, html, #bod {
          width: 100%;
          height: 100%;
      }
body * { visibility: hidden; }
#bod * { visibility: visible; }
#bod { position: absolute; top: 40px; left: 30px; }

}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
<div class="header">REPORT</div>
<div class="content">			      			 	
	
	
	<h:form>
			
<h:commandLink action="planing.jsf"  rendered="#{us.bool_staf3}" styleClass="button1" value="Home Page"/><br>
<h:commandLink action="finance.jsf"  rendered="#{us.bool_staf}"	 styleClass="button1" value="Home Page"/></h:form>	
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
<div id="bod" class="bodyy">
 <h:form>
 <p>
	 <h:panelGrid id="pane29" columns="7" 
   cellpadding="2" cellspacing="2" width="400"  >

	 				 <h:outputLabel value="First Date:"/>
               <h:inputText value="#{rep.firstTime}" styleClass="datepicker"/>
                <h:outputLabel value="Second Date:"/>
                	<h:inputText value="#{rep.seconTime}" styleClass="datepicker2" />&nbsp
                <h:commandButton value="Time" action="#{raw.submitt}" styleClass="button" >
			   
			    </h:commandButton>
			    	 			    <button class="button" onclick="window.print();return false;">Print</button>
				    
	 </h:panelGrid> 
	 </h:form>
	 </p>
	   <br>
	   
<h:panelGrid id="pane21" columns="7" 
   cellpadding="2" cellspacing="2" width="400"  >
   
	 <h:dataTable value="#{rep.purchase}" var="a"
  	 headerClass="personel-headers"
   	rowClasses="personel-tek,personel-cift" width="1000px">
			
			<h:column >
			<f:facet  name="header"><h:outputText value="ID" /></f:facet>  
      			 <h:outputText value="#{a.apur_id} "/>	
   			</h:column>	   		
   			
   			<h:column >    		
   		<f:facet  name="header"><h:outputText value="NAME" /></f:facet>  
      			 <h:outputText value="#{a.cpur_name}" />	
   			</h:column>
   			<h:column >    				
   				<f:facet  name="header"><h:outputText value="NUMBER" /></f:facet>  
      			 <h:outputText value="#{a.dpur_num}"    />	
   			</h:column>
			<h:column >    				
   				<f:facet  name="header"><h:outputText value="Unit Price" /></f:facet>  
      			 <h:outputText value="#{a.epur_cost} $"    />	
   			</h:column>    	
   			<h:column >    				
   				<f:facet  name="header"><h:outputText value="Total" /></f:facet>  
      			 <h:outputText value="#{a.tpur_total} $"    />	
   			</h:column>    	
   			<h:column>			
   				<f:facet  name="header"><h:outputText value="DATE" /></f:facet>  
      			 <h:outputText value="#{a.fpur_tarih.date}-#{a.fpur_tarih.month+1}-#{a.fpur_tarih.year+1900} "  />	
   			 </h:column>
   		
	 </h:dataTable>
	 
	 	 </h:panelGrid>
	 	 
	 	 
	 	 <br>
	 	      <h:outputText  value="Total Raw Material Cost :"    />&nbsp&nbsp&nbsp	
	       			        			 <h:outputText value="#{rep.purchaseCost} $"    />	
	 	 <hr>
	 	 <br>
	 	 
	 	 <h:panelGrid id="pane20" columns="7" 
   cellpadding="2" cellspacing="2" width="400"  >
   
	 <h:dataTable value="#{rep.staff}" var="d"
  	 headerClass="personel-headers"
   	rowClasses="personel-tek,personel-cift" width="1000px">
			
			<h:column >
			<f:facet  name="header"><h:outputText value="ID" /></f:facet>  
      			 <h:outputText value="#{d.astid} "/>	
   			</h:column>	   		
   			
   			<h:column >    		
   		<f:facet  name="header"><h:outputText value="NAME" /></f:facet>  
      			 <h:outputText value="#{d.bstname}" />	
   			</h:column>
   			<h:column >    				
   				<f:facet  name="header"><h:outputText value="SURNAME" /></f:facet>  
      			 <h:outputText value="#{d.cstsurname}"    />	
   			</h:column>
			<h:column >    				
   				<f:facet  name="header"><h:outputText value="SALARY" /></f:facet>  
      			 <h:outputText value="#{d.dsrsalary} $"    />	
   			</h:column>    	
   			<h:column>			
   				<f:facet  name="header"><h:outputText value="DATE" /></f:facet>  
      			 <h:outputText value="#{d.fstdate.date}-#{d.fstdate.month+1}-#{d.fstdate.year+1900} "  />	
   			 </h:column>
   		  
   		    
	 </h:dataTable>
	 
	 
	 	 </h:panelGrid><br>
	 	 
	 	  <h:outputText  value="Total Salary :"    />&nbsp&nbsp&nbsp	
	       			        			 <h:outputText value="#{rep.staffCostL} $"    />	
	 	 <br>
	 <hr>
	  	 <h:panelGrid id="pane23" columns="7" 
   cellpadding="2" cellspacing="2" width="400"  >
   
	 <h:dataTable value="#{rep.expense}" var="f"
  	 headerClass="personel-headers"
   	rowClasses="personel-tek,personel-cift" width="1000px">
			
			<h:column >
			<f:facet  name="header"><h:outputText value="ID" /></f:facet>  
      			 <h:outputText value="#{f.aexid} "/>	
   			</h:column>	   		
   			
   			<h:column >    		
   		<f:facet  name="header"><h:outputText value="NAME" /></f:facet>  
      			 <h:outputText value="#{f.bexname}" />	
   			</h:column>
			<h:column >    				
   				<f:facet  name="header"><h:outputText value="SALARY" /></f:facet>  
      			 <h:outputText value="#{f.cexcost} $"    />	
   			</h:column>    	
   			<h:column>			
   				<f:facet  name="header"><h:outputText value="DATE" /></f:facet>  
      			 <h:outputText value="#{f.dex_tarih.date}-#{f.dex_tarih.month+1}-#{f.dex_tarih.year+1900} "  />	
   			 </h:column>
   		  
   		    
	 </h:dataTable>
	 
	 
	 	 </h:panelGrid>
	     <br>  			 
	
	 	  <h:outputText  value="Other Total Cost :"    />&nbsp&nbsp&nbsp	
	       			        			 <h:outputText value="#{rep.expenCostL} $"    />	 
	 <br>
	 <hr>
	  <br>
	  			
	 	      <h:outputText  value="TOTAL RESULT :"    />&nbsp&nbsp&nbsp	
	       			        			 <h:outputText value="#{rep.total} $"  style="color:red; font-size:44px;"  />
	       			        	<br>		
	       			        	<br>
	       			        	 </div>
	      </div>	
	      <br>
</f:view>
</body>
</html>