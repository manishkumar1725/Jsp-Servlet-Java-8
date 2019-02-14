<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>DEMO CART PAGE</title>
</head>
<body>

<div>

<a href="#">Cart</a>
<%@page  import="java.util.ArrayList,com.manish.cart.Cart,com.manish.cart.Fashion,com.manish.cart.FashionDAO" %>
<table border="1">
<tr>
<th>Name</th>
<th >Price</th>
        <%ArrayList<Fashion> arr1 =(ArrayList<Fashion>)request.getAttribute("arrayList"); 
        
        for(Fashion show: arr1){%> 
            <tr>
            
                <td><%=show.getName()%></td>
                <td><%=show.getPrice()%> </td>
                
                <td><input type="button" name="AddToCart" value="Add to Cart"></td>
            </tr>      
            <%}%>
           </table>
           </div> 
</form>
</body>
</html>

        
  