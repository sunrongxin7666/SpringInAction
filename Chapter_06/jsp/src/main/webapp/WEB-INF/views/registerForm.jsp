<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<%--表单标签sf:spring form--%>
<%@ page session="false" %>
<html>
  <head>
    <title>Spitter</title>
    <link rel="stylesheet" type="text/css" 
          href="<c:url value="/resources/style.css" />" >
  </head>
  <body>
    <h1>Register</h1>

    <%--commandName:表示model的类名--%>
    <sf:form method="POST" commandName="spitter" >
      <%--默认情况下，errors会被渲染成<span>,但是不适合多行，所以设置成<div>标签，同时css要设置成div.errors以对应--%>
      <sf:errors path="*" element="div" cssClass="errors" />
      <sf:label path="firstName" 
          cssErrorClass="error">First Name</sf:label>: 
        <sf:input path="firstName" cssErrorClass="error" /><br/>
      <sf:label path="lastName" 
          cssErrorClass="error">Last Name</sf:label>: 
        <sf:input path="lastName" cssErrorClass="error" /><br/>
      <sf:label path="email" 
          cssErrorClass="error">Email</sf:label>: 
        <sf:input path="email" cssErrorClass="error" /><br/>
      <sf:label path="username" 
          cssErrorClass="error">Username</sf:label>: 
        <sf:input path="username" cssErrorClass="error" /><br/>
      <sf:label path="password" 
          cssErrorClass="error">Password</sf:label>: 
        <sf:password path="password" cssErrorClass="error" /><br/>
      <input type="submit" value="Register" />
    </sf:form>
  </body>
</html>
