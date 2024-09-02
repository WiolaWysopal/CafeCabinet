CREATE DATABASE IF NOT EXISTS `CafeDB`;
USE `CafeDB`;

CREATE TABLE user (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    contact_number VARCHAR(255),
    email VARCHAR(255),
    password VARCHAR(255),
    status VARCHAR(255),
    role VARCHAR(255)
);
