<%@ page contentType="text/html;charset=UTF-8" language="java" %>

    <!DOCTYPE html>
    <html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width">
        <link href="/styles/feed.css" rel="stylesheet"/>
        <title>Register</title>
    </head>

    <body>
        <h1>Bienvenue sur Miniature !</h1>
        <h2>Veuillez vous créer un compte pour accéder au contenu.</h2>
        <form action="" method="post">
            <label for="pseudo">Votre pseudo :</label>
            <input type="text" name="pseudo" required>
            <label for="email">Votre email : </label>
            <input type="email" name="email" required>
            <label for="password">Votre mot de passe :</label>
            <input type="password" name="password" required>
            <label for="confirmedPassword">Confirmer votre mot de passe :</label>
            <input type="password" name="confirmedPassword" required>
            <button type="submit" value="registerForm" name="registerForm">Valider</button>
        </form>
    </body>

    </html>