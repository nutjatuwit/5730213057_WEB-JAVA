<%-- 
    Document   : product
    Created on : Oct 30, 2016, 6:02:39 PM
    Author     : NUT
--%>
<%@page import="sportsell.Product"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <h1>Product JSP Hibernate </h1>
        <div style="background-color: #2EFEF7; width:100%;"> 
            
            <br />
            
            <h2><a href="ListController">List Product</a></h2>
            
            <h2><a href="addProduct.jsp">Add Product</a></h2>
            
           
            
            <h2>Product Search Form</h2>
            
            <form name="searchForm" action="SearchController">
                Enter Product ID:<input type="text" name="searchValue" value="" >
                <input type="submit" value="Find Product Details" name="searchButton" />
            </form>
            
            <form name="searchKeywordForm" action="SearchKeywordController">
                Enter Product Keyword:<input type="text" name="searchWord" value="" >
                <input type="submit" value="Find Keyword Details" name="searchButton" />
            </form>

            <%
                try {
                    // Create a session object if it is already not  created.
                    Product acc = (Product) session.getAttribute("searchResult");

                    if (acc != null) {
            %>


            <table border="1">

                <tbody>
                    <tr>
                        <td>Product ID</td>
                        <td><% out.println(acc.getPid()); %></td>
                    </tr>
                    <tr>
                        <td>Team</td>
                        <td><% out.println(acc.getPteam()); %></td>
                    </tr>
                    <tr>
                        <td>Size</td>
                        <td><% out.println(acc.getPsize()); %></td>
                    </tr>
                    <tr>
                        <td>Color</td>
                        <td><% out.println(acc.getPcolor()); %></td>
                    </tr>
                    <tr>
                        <td>Price</td>
                        <td><% out.println(acc.getPprice()); %></td>
                    </tr>
                    <tr>
                        <td>Amount</td>
                        <td><% out.println(acc.getPamount()); %></td>
                    </tr>
                </tbody>
            </table>

            <%
                    }else{out.print("null");}

                } catch (Exception e) {
                    //out.println(e.getMessage());
                }

            %>


    </body>
</html>
