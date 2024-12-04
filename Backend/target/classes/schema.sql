CREATE TABLE IF NOT EXISTS movie (
   id INT AUTO_INCREMENT PRIMARY KEY,
   title VARCHAR(250) NOT NULL,
   movieDescription VARCHAR(700) NOT NULL,
   quality VARCHAR(50) NOT NULL,
   genre VARCHAR(50) NOT NULL,
   duration VARCHAR(250) NOT NULL,
   releaseDate VARCHAR(250) NOT NULL,
   poster VARCHAR(250) NOT NULL,
   avrRating INT,
   userIds VARCHAR(100),
   viewCount INT
);