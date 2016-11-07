<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html;
              charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Add Product</h1>


        <%
            String message = request.getParameter("message");
            if (message != null) {
                out.println(message);
            }

        %>

        <form name="formAddProduct" action="AddProductController">
            Team: <input type="text" name="PTeam" value="" />
            Size: <input type="text" name="PSize" value="" />
            Color: <input type="text" name="PColor" value="" />
            Price: <input type="text" name="PPrice" value="" />
            Amount: <input type="text" name="PAmount" value="" />
            <input type="submit" value="Submit" name="AddProduct" />
        </form>

        <br><br>

        <form name="formSearchProduct" action="SearchController" >

            
        </form>
    </body>
</html>