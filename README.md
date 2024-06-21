# Projet Java Spring Boot

Ce projet consiste à créer une API RESTful avec Java et Spring Boot pour gérer les opérations liées aux films. L'API utilise une base de données en mémoire H2 pour stocker les détails des films.

## Prérequis

Avant de commencer, assurez-vous d'avoir les outils suivants installés sur votre machine :

- [JDK 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html) (ou une version supérieure pour Java 17)
- [Maven](https://maven.apache.org/download.cgi)
- [Node.js et npm](https://nodejs.org/en/download/)

## Structure du projet

Le projet est organisé selon la structure suivante :

- **Entities** :
  - `Film` : Entité représentant un film dans la base de données.
  - `Acteur` : Entité représentant un acteur dans la base de données.
- **DTOs** :
  - `FilmDTO` : pour la représentation des données des films.
  - `ActeurDTO` : pour la représentation des données des acteurs.
- **Repository** : Utilisation de `FilmRepository` pour interagir avec la base de données H2.
- **Service** : Contient la logique métier dans `FilmService` pour la manipulation des films.
- **Controller** : Contient le contrôleur `FilmController` pour gérer les opérations sur les films.

## Installation

### Clonez le dépôt

```bash
git clone https://github.com/SarahFekih/TEST-JAVA.git
cd TEST-JAVA
```

## Installation du back-end 

Compilez et packagez l'application avec Maven :

```bash
mvn clean install
```

Démarrez l'application Spring Boot :

```bash
mvn spring-boot:run
```

L'application Spring Boot sera accessible à l'adresse [http://localhost:8000](http://localhost:8000).

## Contrôleur REST Back-end 

Mon application back-end utilise un contrôleur REST pour gérer les opérations liées aux films. Voici les endpoints disponibles :

- **Endpoint GET `/api/film/{id}` :** Récupère un film par son ID.
- **Endpoint POST `/api/film` :** Ajoute un nouveau film.

## Collection Postman

Une collection Postman est incluse dans ce projet pour faciliter les tests des endpoints de l'API. Vous pouvez importer cette collection `test_java.postman_collection.json` dans votre environnement Postman pour tester les fonctionnalités de l'API.
