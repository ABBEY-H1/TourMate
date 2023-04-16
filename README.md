# TourMate - Tour Guide Finder

## Backend
Java Version: Java 11 (LTS)

## Getting Started

Clone the repository
Install Java 11 <br>
Open terminal (preferably CMD) and run the following commands: <br>
cd backend <br>
gradlew bootrun <br>
This will start a localhost server on port 8080. <br>
H2DB Console: <br>

Navigate to localhost:8080/database <br>
JDBC URL: jdbc:h2:file:./build/h2db/db/TourMate <br>
User ID: sa1 <br>
Password: password1 <br>
Swagger URL: http://localhost:8080/swagger-ui/index.html#/ <br>

Frontend <br>
Used Angular CLI <br>
To run the project: <br>
Install NodeJS from https://nodejs.org/en/download/ <br>
Open terminal (preferably CMD) and run the following commands: <br>
npm install -g @angular/cli <br>
cd ui <br>
npm start <br>
This will start a localhost server on port 4200. <br>
By following these steps, you will be able to run the TourMate application on your local machine. <br>
