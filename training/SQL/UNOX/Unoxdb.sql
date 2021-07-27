CREATE database IF NOT EXISTS Unox;

USE Unox;

-- Class table
CREATE TABLE IF NOT EXISTS Class (id INT auto_increment primary key, class_name VARCHAR(50), rate numeric(13,2));

-- Screen table
CREATE TABLE IF NOT EXISTS Screen (id INT auto_increment primary key, screen_name VARCHAR(50), class_id INT, seats INT,
		 FOREIGN KEY(class_id) references Class(id)
        );
        
-- Shows table
CREATE TABLE IF NOT EXISTS Shows (id INT auto_increment primary key, show_name VARCHAR(50), timing VARCHAR(20));

-- Movie table
CREATE TABLE IF NOT EXISTS  Movie (id INT auto_increment primary key, title varchar(50), genre varchar(20), rating numeric(13,2), status varchar(20), poster_image varchar(30));

-- Cast table
CREATE TABLE IF NOT EXISTS Casts (id INT auto_increment primary key, actor_name varchar(50));

-- MovieCast table
CREATE TABLE IF NOT EXISTS  MovieCast (movie_id INT,
			cast_id INT, 
				role_played varchar(20),
                primary key (movie_id, cast_id),
                foreign key(cast_id)  references Casts(id),
                foreign key(movie_id) references Movie(id)
        );

-- Review table
create table if not exists Review (id int auto_increment primary key, review varchar(100), author varchar(20), review_date timestamp, movie_id INT,
			foreign key(movie_id) references Movie(id)
        );
        
-- MovieList table
create table if not exists MovieList(id int auto_increment primary key, screen_id int, show_id int, movie_id int, seats_left int,
		foreign key(screen_id) references Screen(id),
        foreign key(show_id) references Shows(id),
        foreign key (movie_id) references Movie(id),
        constraint screen_shows unique(screen_id, show_id)
	);
    
-- User table
create table if not exists Users (id int auto_increment primary key, user_name varchar(20), address varchar(50));

-- Booking table
create table if not exists Booking(id int auto_increment primary key, user_id int, movie_list_id int, tickets int,
		foreign key(user_id) references Users(id),
        foreign key(movie_list_id) references MovieList(id)
	);
    
-- Payment table
create table if not exists Payment(id int auto_increment primary key, booking_id INT, card_number long, pin int, cost numeric(13, 2),
		foreign key(booking_id) references Booking(id)
    );