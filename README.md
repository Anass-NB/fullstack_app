# Système de gestion d'utilisateurs

Une application fullstack CRUD pour la gestion d'utilisateurs, développée avec Spring Boot (backend) et React (frontend).

## Fonctionnalités

- Création de nouveaux utilisateurs
- Affichage des utilisateurs dans un tableau
- Modification des utilisateurs existants
- Suppression d'utilisateurs
- Design responsive avec Bootstrap
- Mises à jour en temps réel

## Technologies utilisées

### Backend

- Java 17
- Spring Boot 3.x
- Spring Data JPA
- MySQL

### Frontend

- React 18
- Axios (client HTTP)
- React Bootstrap (composants UI)
- Bootstrap 5 (stylisation)

## Prérequis

- Java JDK 17+
- Node.js 16+
- MySQL 8+
- Maven 3.6+

## Installation

### Configuration du backend

1. **Créer la base de données MySQL**

   ```sql
   CREATE DATABASE userdb;
   ```

2. **Configurer la base de données**

   Modifier `src/main/resources/application.properties` avec vos identifiants MySQL :

   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/userdb
   spring.datasource.username=votre_nom_utilisateur
   spring.datasource.password=votre_mot_de_passe
   ```

3. **Compiler et exécuter**
   ```bash
   mvn spring-boot:run
   ```

### Configuration du frontend

1. **Installer les dépendances**

   ```bash
   cd user-crud-frontend
   npm install
   ```

2. **Configurer l'URL de l'API**

   Vérifier que l'API_URL dans `src/App.js` correspond à votre backend :

   ```javascript
   const API_URL = "http://localhost:8080/api/users";
   ```

3. **Lancer l'application**
   ```bash
   npm start
   ```

## Exécution de l'application

1. Démarrer le serveur MySQL
2. Lancer l'application Spring Boot (port 8080)
3. Lancer l'application React (port 3000)
4. Accéder à l'application sur : http://localhost:3000

## Points de terminaison API

| Méthode | Endpoint        | Description               |
| ------- | --------------- | ------------------------- |
| GET     | /api/users      | Récupérer tous les users  |
| POST    | /api/users      | Créer un nouvel user      |
| PUT     | /api/users/{id} | Modifier un user existant |
| DELETE  | /api/users/{id} | Supprimer un user         |

## Structure d'un utilisateur

```json
{
  "id": 1,
  "firstName": "Jean",
  "lastName": "Dupont",
  "email": "jean.dupont@exemple.com"
}
```
