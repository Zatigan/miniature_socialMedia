<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="org.simplon.models.Post" %>
<%@ page import="java.util.List" %>

<%!
%><%
    List<Post> posts = (List<Post>) request.getAttribute("postList");
%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width">
    <title>Feed</title>
</head>
<body>
    <h1>Welcome to Feed</h1>
    <main>
        <section>
            <form>
                <input type="text" name="descriptionPostInput">
                <button>Créer un post</button>
            </form>
        </section>
        <section>
            <ul>
                <%for(Post post : posts){%>
                        <li name="<%=post.getId()%>">
                            <p><%=post.getCreatorName()%></p>
                            <time><%=post.getTimestamp()%></time>
                            <p><%=post.getDescription()%></p>
                        </li>
                <%}%>
            </ul>
        </section>
    </main>
</body>
</html>