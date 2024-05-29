CREATE DATABASE IF NOT EXISTS ZumbaSchedule;
USE ZumbaSchedule;
CREATE USER 'student'@'localhost' IDENTIFIED BY 'Java#1Rules';
GRANT ALL PRIVILEGES ON vegasdb.* TO 'student'@'localhost' ;
CREATE TABLE IF NOT EXISTS participants (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    phone_number VARCHAR(20) NOT NULL,
    age INT NOT NULL,
    time_registered TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

INSERT INTO participants (name, email, phone_number, age) VALUES
('John Doe', 'john.doe@example.com', '555-1234', 30),
('Jane Smith', 'jane.smith@example.com', '555-5678', 25),
('Alice Johnson', 'alice.johnson@example.com', '555-9012', 28),
('Bob Williams', 'bob.williams@example.com', '555-3456', 35);
