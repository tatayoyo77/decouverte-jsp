# Exercice de découverte de la technologie JSP

Petit projet permettant de prendre en main les bases des JSP

Nécessite :

- Apache Maven
- Un IDE avec un plugin Tomcat 8.x ou supérieur

Une fois tout configuré en local avec le port 8080 et l'application lancée, l'url suivante devrait répondre "Hello World" : http://localhost:8080/decouverte-jsp/bonjour

Activités proposées :

- étape 1 : prendre connaissance de la base de code et éprouver l'application
- étape 2 : créer un fichier *hello.jsp* dans le répertoire src/main/webapp, dont la responsabilité va être d’afficher le texte “Hello World”. Dans la méthode doPost de la Servlet HelloWorld, rediriger la réponse vers hello.jsp
- étape 3 : rendre *hello.jsp* dynamique en affichant le nom saisi dans le formulaire initial (*index.jsp*) de manière à afficher “Hello Eric” si “Eric” a été saisi dans le formulaire (tout en gardant “Hello World” si rien n’a été saisi.
