<%-- 
    Document   : productlist
    Created on : Oct 30, 2016, 5:52:27 PM
    Author     : NUT
--%>
<%@page import="sportsell.ProductService"%>
<%@page import="sportsell.Product"%>
<%@page import="java.util.List"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Product List</h1>
        <%
            try {

                List<Product> productList = (List<Product>) session.getAttribute("listResult");

                if (productList != null) {
                    //    out.println("not null");
                    //   out.println(filmList.size());

        %>
        <table border="1">

            <tbody>
                <tr>
                    <td>ProductID</td>
                    <td>Team</td>
                    <td>Size</td>
                    <td>Color</td>
                    <td>Price</td>
                    <td>Amount</td>

                </tr>
                <%                        for (Product acc : productList) {
                %>
                <tr>
                    <td><% out.println(acc.getPid()); %></td>
                    <td><% out.println(acc.getPteam()); %></td>
                    <td><% out.println(acc.getPsize()); %></td>
                    <td><% out.println(acc.getPcolor()); %></td>
                    <td><% out.println(acc.getPprice()); %></td>
                    <td><% out.println(acc.getPamount()); %></td>
                </tr>
                <% } %>
            </tbody>
        </table>  


        <%

                } else {
                    out.println("return null");
                }
            } catch (Exception e) {
                e.printStackTrace();
                out.println("error");
            }

        %>

    </body>
</html>
