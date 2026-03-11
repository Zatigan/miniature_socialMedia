<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="org.simplon.models.Post" %>
<%@ page import="java.util.List" %>

<%
    Post post = request.getAttribute("post");
%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width">
    <title>Post</title>
</head>
<body>
    <h1>Welcome to Post</h1>
    <main>
        <section>
            <p><%=post.getCreatorName()%></p>
            <time><%=post.getTimestamp()%></time>
            <p><%=post.getDescription()%></p>
        </section>
        <section>
            <form action="" method="post">
                <input type="text" name="commentaryPostInput">
                <button type="submit" name="createCommentaryButton">Commenter</button>
            </form>
        </section>
    </main>
</body>
</html>