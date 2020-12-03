<%-- 
    Document   : _indexsearchresult
    Created on : Apr 15, 2020, 10:09:47 PM
    Author     : hp
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="entity.Studio"%>


<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css"> 
<!--        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Allerta+Stencil"> -->
        <link rel="stylesheet" href="https://www.w3schools.com/lib/w3-theme-yellow.css">
        <style>
            *{font-family: "Allerta Stencil", Sans-serif;margin:0px;}`
            .w3-allerta {font-family: "Allerta Stencil", Sans-serif;}
            #main-container{display:inline-flex;width:100%;height:100%;}
            #left-container{width:20%;}
            #middle-container{width:60%;}
            #right-container{width:20%;}
            #distance-container{heigth:20%;width:100%;}
            #data-container{display:inline-flex;height:30%;width:100%;margin-bottom:20px;}
            #img-container{height:100%;width:25%;}
            #text-container{height:100%;width:75%;display:block;padding-left:10px;}
            #upper-text-container{height:40%;}
            #middle-text-container{height:20%;}
            #lower-text-container{height:40%;}
            <!--.w3-panel{padding-top:16px;padding-bottom:16px;}-->
        </style>
    </head>
    <body>
        <% 
            session=request.getSession();
            ArrayList<Studio> studioList=(ArrayList<Studio>)session.getAttribute("studioList");
        %>
        <div class="w3-mobile w3-container w3-border w3-light-grey" id="main-container">
            <div class="w3-mobile w3-border w3-panel" id="left-container">

            </div>
            <div class="w3-mobile w3-border w3-panel" id="middle-container">
                <div class="w3-mobile w3-border w3-panel w3-round-xlarge w3-white" id="distance-container">
                    Search within <a href="#">2Km...</a><a href="#">5Km...</a>
                </div>
                <%
                    for(Studio st:studioList){
                %>
                <div class="w3-mobile w3-border w3-round-xlarge" id="data-container">
                    <div class="w3-mobile w3-border w3-round-xlarge" id="img-container">
                        <img src="StudioImageLoader?id=<%=st.getStudio_id()%>" height="100%" width="100%" class="w3-round"/>
                    </div>
                    <div class="w3-mobile w3-white" id="text-container">
                        <div class="w3-mobile" id="upper-text-container">
                            <span class=""><b><%=st.getS_name()%></b></span><br>
                            <span class=""><%=st.getS_address()%></span> 
                        </div>
                        <div class="w3-mobile" id="middle-text-container">
                            <span><%=st.getCategory()%></span>
                        </div>
                        <div class="w3-mobile" id="lower-text-container">
                            <a href="#" class="w3-button w3-theme w3-small w3-round-large w3-right-align" style="align:right;">EXPLORE</a>
                        </div>
                    </div>
                </div>
                <%}%>
            </div>
            <div class="w3-mobile w3-border w3-panel" id="right-container">

            </div>
        </div>
    </body>
</html>