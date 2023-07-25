#Skatteverket Web Application

The Skatteverket Web Application is a Java-based web application built using Spring Boot, HTML, and MySQL. The purpose of this application is to make it easy for users to search for tax information by providing the table number and income value to retrieve relevant information.
Getting Started

To run the Skatteverket Web Application locally, follow these instructions:
Prerequisites

    Java Development Kit (JDK) 8 or higher
    Maven
    MySQL Server

Installation

    Clone the repository from GitHub URL.
    Navigate to the project directory.

Configuration

    Open src/main/resources/application.properties.
    Configure the MySQL database connection properties (URL, username, and password) to match your local setup.

Database Setup

    Create a MySQL database with the required schema for the application. You can find the SQL script in src/main/resources/db-scripts/init.sql.
    Run the SQL script to create the necessary tables.

Running the Application

    Open a terminal or command prompt.
    Navigate to the project directory.
    Run the following command to build and run the application:

arduino

mvn spring-boot:run

    The application will be accessible at http://localhost:8080.

How to Use

    Launch the Skatteverket Web Application in your web browser using http://localhost:8080.
    You will be presented with a simple user interface to search for tax information.
    Enter the table number and income value you wish to retrieve information for.
    Click the "Search" button to initiate the search.
    The application will query the MySQL database and display the relevant tax information based on your input.

Contributions

Contributions to the Skatteverket Web Application are welcome! If you find any issues or want to add new features, feel free to submit a pull request.

Contact

If you have any questions or need support, please contact omar.zarifa@gmail.com
