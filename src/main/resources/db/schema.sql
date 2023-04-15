-- public.contact_messages definition

-- Drop table

-- DROP TABLE public.contact_messages;

CREATE TABLE public.contact_messages (
	id bigserial NOT NULL,
	email varchar(255) NOT NULL,
	message text NOT NULL,
	"name" varchar(255) NOT NULL,
	CONSTRAINT contact_messages_pkey PRIMARY KEY (id)
);


-- public.projects definition

-- Drop table

-- DROP TABLE public.projects;

CREATE TABLE public.projects (
	id int8 NOT NULL,
	"name" varchar(255) NOT NULL,
	created_on timestamp(6) NOT NULL,
	description varchar(255) NULL,
	updated_on timestamp(6) NOT NULL,
	CONSTRAINT projects_pkey PRIMARY KEY (id)
);


-- public.project_pictures definition

-- Drop table

-- DROP TABLE public.project_pictures;

CREATE TABLE public.project_pictures (
	id int8 NOT NULL,
	alternative_text varchar(255) NULL,
	created_on timestamp(6) NOT NULL,
	desktop_url varchar(255) NOT NULL,
	mobile_url varchar(255) NULL,
	updated_on timestamp(6) NOT NULL,
	project_id int8 NULL,
	tablet_url varchar(255) NULL,
	CONSTRAINT project_pictures_pkey PRIMARY KEY (id),
	CONSTRAINT fkscsrhhpisrju2cpp3j094kev2 FOREIGN KEY (project_id) REFERENCES public.projects(id)
);