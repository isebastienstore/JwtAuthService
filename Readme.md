### Documentation de l'API

---

Bienvenue dans la documentation de l'API de notre service d'authentification JWT. Cette API vous permet de gérer l'authentification des utilisateurs, ainsi que l'accès aux fonctionnalités de compte. Voici les endpoints disponibles :

---

### Authentification

#### 1. Enregistrement d'un utilisateur

- **Endpoint** : `POST /auth/register`
- **Description** : Permet à un nouvel utilisateur de s'inscrire en temps que ADMIN ou MEMBER en fournissant les informations requises.
- **Corps de la requête** :
    ```json
    {
        "firstName": "John",
        "lastName": "Doe",
        "email": "johndoe@example.com",
        "password": "password123",
        "role": "MEMBER"
    }
    ```
- **Réponse réussie** : Retourne un jeton d'authentification JWT.
- **Statut de réponse** : `200 OK`
- **Exemple de réponse** :
    ```json
    {
        "access_token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiJqb2huZG9lQGV4YW1wbGUuY29tIiwicm9sZSI6Ik1FTUJFUlQiLCJpYXQiOjE2NDk5NTY2NjAsImV4cCI6MTY0OTk1NzA2MH0.jM3wZ39_-g4C4CDLLkh_3EKLXbB2F5pG7mG0gAx6q1M"
    }
    ```

#### 2. Authentification d'un utilisateur

- **Endpoint** : `POST /auth/authenticate`
- **Description** : Permet à un utilisateur existant de s'authentifier en fournissant son email et son mot de passe.
- **Corps de la requête** :
    ```json
    {
        "email": "johndoe@example.com",
        "password": "password123"
    }
    ```
- **Réponse réussie** : Retourne un jeton d'authentification JWT.
- **Statut de réponse** : `200 OK`
- **Exemple de réponse** :
    ```json
    {
        "access_token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiJqb2huZG9lQGV4YW1wbGUuY29tIiwicm9sZSI6Ik1FTUJFUlQiLCJpYXQiOjE2NDk5NTY2NjAsImV4cCI6MTY0OTk1NzA2MH0.jM3wZ39_-g4C4CDLLkh_3EKLXbB2F5pG7mG0gAx6q1M"
    }
    ```

#### 3. Changement de mot de passe

- **Endpoint** : `POST /auth/changepwd`
- **Description** : Permet à un utilisateur authentifié de changer son mot de passe.
- **Corps de la requête** :
    ```json
    {
        "email": "johndoe@example.com",
        "password": "newpassword456"
    }
    ```
- **Statut de réponse** : `200 OK`

---

### Gestion des comptes

#### 1. Récupération de tous les utilisateurs

- **Endpoint** : `GET /account`
- **Description** : Récupère la liste de tous les utilisateurs enregistrés.
- **Statut de réponse** : `200 OK`

#### 2. Récupération d'un utilisateur par ID

- **Endpoint** : `GET /account/{id}`
- **Description** : Récupère les informations d'un utilisateur spécifique en fonction de son ID.
- **Statut de réponse** :
    - `200 OK` : Si l'utilisateur est trouvé.
    - `204 No Content` : Si aucun utilisateur correspondant à l'ID n'est trouvé.
