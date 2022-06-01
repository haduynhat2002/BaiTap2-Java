<%@ page import="java.util.HashMap" %>
<%@ page import="com.example.baitap3.entity.Product" %>
<%HashMap<String, String> errors = (HashMap<String, String>) request.getAttribute("errors");%>
<%
    Product product = (Product) request.getAttribute("product");
    if (product == null) {
        product = new Product();
    }
    if (errors != null) {
        for (String i : errors.keySet()) {
            System.out.println(errors.get(i));
        }
    }
%>
<!DOCTYPE html>
<html>
<title>W3.CSS</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<style>
    .valid {
        color: red;
        margin: 0 0 10px 0;
        font-size: 13px
    }
</style>
<body>

<div class="w3-container w3-blue">
    <h2>Create Form</h2>
</div>

<form action="/product" method="post" class="w3-container">
    <p>
        <label>Name</label>
        <input class="w3-input" name="name" value="<%=product.getName()%>" type="text"></p>
        <% if (errors != null) { %>
        <% for (String i : errors.keySet()) { %>
        <% if (i.equals("name")) { %>
        <p class="valid"><%=errors.get(i)%>
        </p>
        <% } %>
        <% } %>
        <%}%>
    <p>
        <label>Description</label>
        <input class="w3-input" name="description" type="text"></p>
        <% if (errors != null) { %>
        <% for (String i : errors.keySet()) { %>
        <% if (i.equals("description")) { %>
        <p class="valid"><%=errors.get(i)%>
        </p>
        <% } %>
        <% } %>
        <%}%>
    <p>
        <label>Detail</label>
        <input class="w3-input" name="detail" type="text"></p>
        <% if (errors != null) { %>
        <% for (String i : errors.keySet()) { %>
        <% if (i.equals("detail")) { %>
        <p class="valid"><%=errors.get(i)%>
        </p>
        <% } %>
        <% } %>
        <%}%>
    <p>
        <label>Price</label>
        <input class="w3-input" name="price" type="text"></p>
        <% if (errors != null) { %>
        <% for (String i : errors.keySet()) { %>
        <% if (i.equals("price")) { %>
        <p class="valid"><%=errors.get(i)%>
        </p>
        <% } %>
        <% } %>
        <%}%>
    <p>
        <label>Thumbnail</label>
        <input class="w3-input" name="thumbnail" type="text"></p>
    <p>
        <label>Manufacture Email</label>
        <input class="w3-input" name="manufactureEmail" type="text"></p>
        <% if (errors != null) { %>
        <% for (String i : errors.keySet()) { %>
        <% if (i.equals("manufactureEmail")) { %>
        <p class="valid"><%=errors.get(i)%>
        </p>
        <% } %>
        <% } %>
        <%}%>
    <p>
        <label>Manufacture Phone</label>
        <input class="w3-input" name="manufacturePhone" type="text"></p>
        <% if (errors != null) { %>
        <% for (String i : errors.keySet()) { %>
        <% if (i.equals("manufacturePhone")) { %>
        <p class="valid"><%=errors.get(i)%>
        </p>
        <% } %>
        <% } %>
        <%}%>
        <button type="submit" class="w3-btn w3-blue">Register</button>
        <button type="reset" class="w3-btn w3-blue">Reset</button>
</form>

</body>
</html>