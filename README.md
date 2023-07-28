# Skatteverket Web Application

## Introduction
The Skatteverket Web Application is a Java-based web application built using Spring Boot, HTML, CSS and MySQL. The purpose of this application is to make it easy for users to search for tax information by providing the table number and income value to retrieve relevant information.

## Setting up the Database

#### Find the MySQL dump file "skatteverket.sql", which includes the table structure and data for a database named "skatteverket". To import this database into your MySQL server, follow these steps:

1. Open MySQL Workbench or any other MySQL client tool.
2. Create a new database with the same name as the one in the dump file ("skatteverket").
3. In the MySQL client tool, go to the "Server" menu and select "Data Import".
4. In the "Import Options" section, select "Import from Self-Contained File".
5. Click on the "..." button to browse and select the dump file.
6. In the "Default Target Schema" field, select the database you created in step 2 ("skatteverket").
7. Click on the "Start Import" button to begin the import process.
8. Once the import is completed, you can view the database structure and data in the MySQL client tool.

Note: Make sure that the MySQL server you are importing the database into has the same version or a newer version than the one used to create the dump file.

## Running the Application

### Prerequirements:
You have to do the following things installed on your computer:
1. Java Development Kit (JDK): To develop and run Java applications, you need to have JDK 8 or later versions installed on your computer.
2. MySQL database: You need to have MySQL server installed on your computer.
3. IDE: You need an Integrated Development Environment (IDE) to write, test, and run your Java application. Some popular IDEs for Java development include IntelliJ IDEA, Eclipse, and NetBeans.

### Installation and configuration:
1. Clone the repository from GitHub URL.
2. Open src/main/resources/application.properties.
3. Configure the MySQL database connection properties (URL, username, and password) to match your local setup.
4. Click on "Run" from the main menu in the SalaryDataApplication class.
5. The application will be accessible at:


    http://localhost:8080

## OBS:
Please note that this project is developed independently and is not associated with any official organization.


## Contact

If you have any questions or need support, please contact omar.zarifa@gmail.com

## ScreenShots

### Main page
![Main page] ()