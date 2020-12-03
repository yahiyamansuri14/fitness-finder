<%-- 
    Document   : _addstudio
    Created on : Mar 24, 2020, 1:54:42 PM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Add-Studio-Form</h1>
        <form action="AddStudio" method="post" enctype="multipart/form-data">
            <pre>
                Enter Owner Id::<input type="text" name="owner_id"/>
                Enter Studio Name::<input type="text" name="s_name"/>
                Enter Address::<input type="text" name="s_address"/>
                Enter State::<input type="text" name="s_state"/>
                Enter City::<input type="text" name="s_city"/>
                Enter Contact::<input type="text" name="s_contact"/>
                Enter Workout available::<input type="text" name="workout_avail"/>
                Enter Amenities::<input type="text" name="amenities"/>
                Enter HotLocation::<input type="text" name="s_hotlocation"/>
                Enter Distance HotLocation::<input type="text" name="distance_hotlocation"/>
                Select Category::<select name="category">
                                        <option value="gym">GYM</option>
                                        <option value="yoga">YOGA</option>
                                        <option value="zumba">ZUMBA</option>
                                        <option value="crossfunctional">CROSS-FUNCTIONAL-TRAINING</option>
                                        <option value="dance">DANCE</option>
                                        <option value="aqua">AQUA</option>
                                 </select>
                Add Images::<input type="file" name="image"/>
                <input type="submit" value="Save"/>
            </pre>
        </form>
    </body>
</html>
