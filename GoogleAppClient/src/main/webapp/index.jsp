<html>
<body>
<%@ page import="org.mehdi.project.GoogleAppClient.RestClient"%> 
<% RestClient client = new RestClient();
   String s = RestClient.sayHello();

%>
Hello!  The time is now <%= s %>
</body>
</html>
