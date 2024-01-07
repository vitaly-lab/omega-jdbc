CREATE DATABASE IF NOT EXISTS omega;
CREATE USER 'root'@'localhost' IDENTIFIED BY 'root';
GRANT ALL PRIVILEGES ON omega.* TO 'root'@'localhost';

USE omega;

DROP TABLE IF EXISTS pilots;

CREATE TABLE pilots
(
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(75) NOT NULL,
    age INT NOT NULL,
    isCertified VARCHAR(25) NOT NULL,
    email VARCHAR(120) NOT NULL
);