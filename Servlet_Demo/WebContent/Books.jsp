<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body bgcolor:"#000000";>

<header>
<div class="logo">
<a ><img src="/Miniproject/images/shopify.jpg" style="height:50px;" style="width:50px;"></a>
<a href="">shopify</a>
</div>
<div class="menu">
<nav>
<ul>
<a href="home.jsp">Home</a>&nbsp&nbsp&nbsp&nbsp
<a href="sigin.jsp">Sign In</a>&nbsp&nbsp&nbsp&nbsp
<a href="signup.jsp">Sign Up</a>&nbsp&nbsp&nbsp&nbsp
<a ><img src="/Miniproject/images/cart.jpg" style="height:25px;" style="width:25px;"></a>
<a href="#">Cart</a>&nbsp&nbsp&nbsp&nbsp
</ul>

</nav>
</div>
<div class="headimage">
<a><img src="/Miniproject/images/header.jpg" width="100%;" style="height:100px;" style="width:300px;"></a>
</div>
</header>
<div>
<%@page  import="java.util.ArrayList,com.deva.pojo.BookTable,com.deva.dao.GroceryDAO,com.deva.servlet.DisplayServlet" %>
<table border="1">
<tr>
<th>Product Name</th>
<th >Product Price</th>
        <%ArrayList<BookTable> BList =(ArrayList<BookTable>)request.getAttribute("arrayList"); 
        for(BookTable Btable:BList){%> 
       <tr>
            
              <td>  <%=Btable.getName()%></td>
                <td><%=Btable.getPrice()%> </td>
                <td><input type="button" name="AddToCart" value="Add to Cart"></td>
          </tr>      
            <%}%>
           </table>
           </div> 
</body>
</html>