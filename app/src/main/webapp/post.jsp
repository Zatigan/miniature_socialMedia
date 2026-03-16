<%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <%@ page import="org.simplon.models.Post" %>
        <%@ page import="java.util.List" %>
            <%@ page import="org.simplon.models.Commentary" %>

                <% Post post=(Post) request.getAttribute("post"); %>

                    <!DOCTYPE html>
                    <html lang="en">

                    <head>
                        <meta charset="UTF-8">
                        <meta name="viewport" content="width=device-width">
                        <link href="/styles/feed.css" rel="stylesheet" />
                        <link rel="stylesheet"
                            href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.3.0/css/all.min.css">
                        <title>Post</title>
                    </head>

                    <body>
                        <header>
                            <form action="" method="post">
                                <button name="backArrow" class="backArrow"><i class="fa-solid fa-arrow-left fa-3x"></i></button>
                            </form>
                            <h1>Post de <%=post.getCreatorName()%>
                            </h1>
                            <form action="" method="post">
                                <button type="submit" name="disconnect">Se déconnecter</button>
                            </form>
                        </header>
                        <main>
                            <section>
                                <p>
                                    <%=post.getCreatorName()%>
                                </p>
                                <time>
                                    <%=post.getTimestamp()%>
                                </time>
                                <p>
                                    <%=post.getDescription()%>
                                </p>
                            </section>
                            <% for (Commentary commentary : post.getCommentaires()){%>
                                <section>
                                    <p>
                                        <%=commentary.getDescription()%>
                                    </p>
                                    <p>
                                        <%=commentary.getCreator().getPseudo()%>
                                    </p>
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