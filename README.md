TourMate - Tour Guide Finder
Backend
Java Version: Java 11 (LTS)

To run the project:

Clone the repository
Install Java 11
Open terminal (preferably CMD) and run the following commands:
cd backend
gradlew bootrun
This will start a localhost server on port 8080.
H2DB Console:

Navigate to localhost:8080/database
JDBC URL: jdbc:h2:file:./build/h2db/db/TourMate
User ID: sa1
Password: password1
Swagger URL: http://localhost:8080/swagger-ui/index.html#/

Frontend
Used Angular CLI
To run the project:
Install NodeJS from https://nodejs.org/en/download/
Open terminal (preferably CMD) and run the following commands:
npm install -g @angular/cli
cd ui
npm start
This will start a localhost server on port 4200.
By following these steps, you will be able to run the TourMate application on your local machine.
