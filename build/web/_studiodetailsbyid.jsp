<%-- 
    Document   : _studiodetailsbyid.jsp
    Created on : Apr 14, 2020, 11:13:35 PM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@page import="entity.Studio" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>StudioDetails</title>
    </head>
    <body>
        <% 
            session=request.getSession();
            if(session!=null){
            Studio st=(Studio)session.getAttribute("studio");
              
        %>
            <%=st.getS_name()%>
            <%=st.getOwner_id()%>
            <%=st.getS_city()%>
            <%=st.getImage()%>
        
        <%
               }
            
        
        %>
    </body>
</html>
