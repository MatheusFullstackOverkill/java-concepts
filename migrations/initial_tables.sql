CREATE TABLE public."user" IF NOT EXISTS (
	user_id serial primary key NOT NULL,
	first_name varchar(100) NOT NULL,
	last_name varchar(150) NOT NULL,
	email varchar NOT NULL,
	phone varchar(100) NOT NULL,
	birthdate timestamp,
	profile_picture text,
	"password" text NOT NULL,
	created_at timestamp DEFAULT now(),
	updated_at timestamp DEFAULT now(),
	deleted_at timestamp
);