<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width">
    <link href="/styles/feed.css" rel="stylesheet"/>
    <title>Login</title>
</head>
<body>
    <h1>Login</h1>
    <main>
        <form method="post">
            <label>
                Username :
                <input type="text" name="usernameLogin" required>
            </label>
            <label>
                Password :
                <input type="password" name="passwordLogin" required>
            </label>
            <button name="loginButton">Login</button>
        </form>
    </main>
</body>
</html>