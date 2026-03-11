<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="org.simplon.models.Post" %>
<%@ page import="java.util.List" %>

<%
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
            <form action="" method="post">
                <input type="text" name="descriptionPostInput">
                <button type="submit" name="createPostButton">Créer un post</button>
            </form>
        </section>
        <ul>
            <%for(Post post : posts){%>
                <li>
                    <a href=<%=post.getId()%>>
                        <section id="card" name="<%=post.getId()%>">
                            <p><%=post.getCreatorName()%></p>
                            <time><%=post.getTimestamp()%></time>
                            <p><%=post.getDescription()%></p>
                        </section>
                    </a>
                </li>
            <%}%>
        </ul>
    </main>
</body>
</html>