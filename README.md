# miniature_socialMedia

```mermaid
classDiagram

message <|-- post
message <|-- commentaire
post *-- commentaire : contient (*)
user *-- message

class user{
	-int id
	-String pseudo
	-String mdp
	-String email
	-List<int> idPost
	+ajoutIdPostCreate()
	+ajoutUserSuivi()
}

class message{
	<<abstract>>
	- int nbOfMessage
	- UUID id
	- String description
	- Date timestamp
	- User creator
}

class post{
	-int likes
	-List<Commentary> commentaires
	+ajoutLike()
	+ajoutCommentaire()
}

class commentaire{
}
```

```
src/com/votreprojet/
├── presentation/                      <- COUCHE PRÉSENTATION : Gère le HTTP
│   ├── webapp/
│       ├── feed.jsp                   <- Entité métier principale
│       ├── post.jsp                   <- Page d'un seul post
│       ├── login.jsp                  <- Page Login
│       └── register.jsp               <- Page Register
│   ├── styles/
│       └── feed.css                   <- Mise en page
│
├── application/                       <- COUCHE APPLICATION : Orchestration
│   ├── controller/
│       ├── FeedController.java
│       ├── LoginController.java
│       ├── PostController.java
│       ├── RegisterController.java
│       ├── UserController.java
│   ├── dto/
│   │   ├── UserRegistrationDTO.java   <- Objet simple pour transporter les données en entrée
│   │   └── UserResponseDTO.java       <- Objet simple pour transporter les données en sortie
│
├── domain/                            <- COUCHE DOMAINE : Cœur métier indépendant
│   ├── model/
│       ├── User.java                  <- Entité métier principale
│       ├── Post.java                  <- Autre entité métier
│       ├── Message.java               <- Autre entité métier
│       └── Commentary.java            <- Autre entité métier
│   ├── repository/
│   │   └── UserRepository.java        <- Interface : Contrat pour sauvegarder/récupérer un User
│   └── exception/
│       └── UserNotEligibleException.java <- Exception purement métier (ex: âge minimum non respecté)
│
└── infrastructure/                    <- COUCHE INFRASTRUCTURE : Détails techniques
    ├── persistence/
    │   ├── PostgresUserRepository.java<- Implémentation réelle de UserRepository (JDBC/SQL)
    │   └── InMemoryUserRepository.java<- Implémentation en mémoire de UserRepository
└── App.java                          <- porte d'entrée du programme
```
