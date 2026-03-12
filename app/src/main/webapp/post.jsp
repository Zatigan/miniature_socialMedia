<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="org.simplon.models.Post" %>
<%@ page import="java.util.List" %>
<%@ page import="org.simplon.models.Commentary" %>

<%
    Post post = (Post) request.getAttribute("post");
%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width">
    <link href="/styles/feed.css" rel="stylesheet"/>
    <title>Post</title>
</head>
<body>
    <h1>Post de <%=post.getCreatorName()%></h1>
    <main>
        <section>
            <p><%=post.getCreatorName()%></p>
            <time><%=post.getTimestamp()%></time>
            <p><%=post.getDescription()%></p>
        </section>
        <% for (Commentary commentary : post.getCommentaires()){%>
            <section>
                <p><%=commentary.getDescription()%></p>
                <p><%=commentary.getCreator().getPseudo()%></p>
            </section>
        <%}%>

        <section>
            <form action="" method="post">
                <input type="text" name="commentaryPostInput">
                <button type="submit" name="createCommentaryButton">Commenter</button>
            </form>
        </section>
    </main>
</body>
</html>