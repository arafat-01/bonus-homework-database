INSERT INTO disease_type(id, description) VALUES (1, 'disease-122');
INSERT INTO disease_type(id, description) VALUES (2, 'sars-05');
INSERT INTO disease_type(id, description) VALUES (3, 'hiv-aids');
INSERT INTO disease_type(id, description) VALUES (4, 'influenza-3');
INSERT INTO disease_type(id, description) VALUES (5, 'flu-9');
INSERT INTO disease_type(id, description) VALUES (6, 'solanum-2006');
INSERT INTO disease_type(id, description) VALUES (7, 'krippin-virus');
INSERT INTO disease_type(id, description) VALUES (8, 'virology');
INSERT INTO disease_type(id, description) VALUES (9, 'yellow-fever');
INSERT INTO disease_type(id, description) VALUES (10, 'infectious diseases');

INSERT INTO country(cname, population) VALUES ('Kazakhstan', 18000000);
INSERT INTO country(cname, population) VALUES ('Russia', 130000000);
INSERT INTO country(cname, population) VALUES ('Usa', 120000000);
INSERT INTO country(cname, population) VALUES ('China', 1800000000);
INSERT INTO country(cname, population) VALUES ('France', 500000);
INSERT INTO country(cname, population) VALUES ('Germany', 60000000);
INSERT INTO country(cname, population) VALUES ('Netherlands', 23654654);
INSERT INTO country(cname, population) VALUES ('Singapore', 4000000);
INSERT INTO country(cname, population) VALUES ('England', 8000000);
INSERT INTO country(cname, population) VALUES ('India', 200650000);
INSERT INTO country(cname, population) VALUES ('Japan', 54555555);

INSERT INTO Disease(disease_code, pathogen, description, disease_type_id) VALUES('covid-19', 'virus', 'x_disease', 1);
INSERT INTO Disease(disease_code, pathogen, description, disease_type_id) VALUES('a-1', 'bacteria', 'z_disease', 1);
INSERT INTO Disease(disease_code, pathogen, description, disease_type_id) VALUES('b-1', 'bacteria', 'z_disease', 1);
INSERT INTO Disease(disease_code, pathogen, description, disease_type_id) VALUES('c-1', 'bacteria', 'a_disease', 1);
INSERT INTO Disease(disease_code, pathogen, description, disease_type_id) VALUES('d-1', 'virus', 'c_disease', 10);
INSERT INTO Disease(disease_code, pathogen, description, disease_type_id) VALUES('e-1', 'virus', 'b_disease', 10);
INSERT INTO Disease(disease_code, pathogen, description, disease_type_id) VALUES('f-1', 'infection', 'e_disease', 10);
INSERT INTO Disease(disease_code, pathogen, description, disease_type_id) VALUES('g-1', 'food deficiency', 'd_disease', 8);
INSERT INTO Disease(disease_code, pathogen, description, disease_type_id) VALUES('h-1', 'overweight', 'f_disease', 8);
INSERT INTO Disease(disease_code, pathogen, description, disease_type_id) VALUES('i-1', 'direct contact', 'g_disease', 8);
INSERT INTO Disease(disease_code, pathogen, description, disease_type_id) VALUES('j-1', 'blood', 'p_disease', 8);
INSERT INTO Disease(disease_code, pathogen, description, disease_type_id) VALUES('k-1', 'lack of sleep', 'r_disease', 1);

INSERT INTO Discover(cname, disease_code, first_enc_date) VALUES ('Kazakhstan', 'a-1', '1930-10-10');
INSERT INTO Discover(cname, disease_code, first_enc_date) VALUES ('Russia', 'covid-19', '1930-10-10');
INSERT INTO Discover(cname, disease_code, first_enc_date) VALUES ('China', 'covid-19', '1930-10-10');
INSERT INTO Discover(cname, disease_code, first_enc_date) VALUES ('Russia', 'b-1', '1945-11-10');
INSERT INTO Discover(cname, disease_code, first_enc_date) VALUES ('Usa', 'c-1', '1922-2-10');
INSERT INTO Discover(cname, disease_code, first_enc_date) VALUES ('China', 'a-1', '1930-3-10');
INSERT INTO Discover(cname, disease_code, first_enc_date) VALUES ('Germany' ,'e-1', '2019-1-10');
INSERT INTO Discover(cname, disease_code, first_enc_date) VALUES ('Japan', 'c-1', '2021-9-10');
INSERT INTO Discover(cname, disease_code, first_enc_date) VALUES ('India', 'd-1', '2018-8-10');
INSERT INTO Discover(cname, disease_code, first_enc_date) VALUES ('Netherlands', 'h-1', '2018-7-10');
INSERT INTO Discover(cname, disease_code, first_enc_date) VALUES ('England', 'g-1', '2006-12-10');
INSERT INTO Discover(cname, disease_code, first_enc_date) VALUES ('Kazakhstan', 'k-1', '2005-9-10');

INSERT INTO Users (email,name,surname,salary, phone , cname) VALUES('george@gmail.com', 'Georgebek', 'Washington' ,45000, '87774445566', 'Usa');
INSERT INTO Users (email,name,surname,salary, phone , cname) VALUES('armanbek@gmail.com', 'Armanbek', 'Boranbek', 75000, '8777655166', 'Kazakhstan');
INSERT INTO Users (email,name,surname,salary, phone , cname) VALUES('akhmet@gmail.com', 'Akhmet', 'Baitursynuly', 8500, '87874445566', 'Kazakhstan');
INSERT INTO Users (email,name,surname,salary, phone , cname) VALUES('pushkin@gmail.com', 'Pushkin', 'alexander', 3452, '87774444454', 'Russia');
INSERT INTO Users (email,name,surname,salary, phone , cname) VALUES('mao@gmail.com', 'Bekmo', 'Zedong' ,5345, '46545566', 'China');
INSERT INTO Users (email,name,surname,salary, phone , cname) VALUES('macron@gmail.com', 'Macron', 'Emanuel' ,13123, '4533776', 'France');
INSERT INTO Users (email,name,surname,salary, phone , cname) VALUES('eizabeth@gmail.com', 'Quin', 'Elizabeth' ,12354, '6456454', 'England');
INSERT INTO Users (email,name,surname,salary, phone , cname) VALUES('saken@gmail.com', 'Saken', 'Seifullin' ,6657, '123134456', 'Kazakhstan');
INSERT INTO Users (email,name,surname,salary, phone , cname) VALUES('gandi@gmail.com', 'Mahatma', 'Gandi' ,45654, '789789987', 'India');
INSERT INTO Users (email,name,surname,salary, phone , cname) VALUES('angela@gmail.com', 'Angela', 'Merkel' ,4564, '54645312', 'Germany');
INSERT INTO Users (email,name,surname,salary, phone , cname) VALUES('asgeorge@gmail.com', 'Georgebek', 'Washington' ,45000, '87774445566', 'Usa');
INSERT INTO Users (email,name,surname,salary, phone , cname) VALUES('fsdarmanbek@gmail.com', 'Armanbek', 'Boranbek', 75000, '8777655166', 'Kazakhstan');
INSERT INTO Users (email,name,surname,salary, phone , cname) VALUES('asdakhmet@gmail.com', 'Akhmet', 'Baitursynuly', 8500, '87874445566', 'Kazakhstan');
INSERT INTO Users (email,name,surname,salary, phone , cname) VALUES('pusdfshkin@gmail.com', 'Pushkin', 'alexander', 3452, '87774444454', 'Russia');
INSERT INTO Users (email,name,surname,salary, phone , cname) VALUES('maasdo@gmail.com', 'Bekmo', 'Zedong' ,5345, '46545566', 'China');
INSERT INTO Users (email,name,surname,salary, phone , cname) VALUES('maasdcron@gmail.com', 'Macron', 'Emanuel' ,13123, '4533776', 'France');
INSERT INTO Users (email,name,surname,salary, phone , cname) VALUES('edsaizabeth@gmail.com', 'Quin', 'Elizabeth' ,12354, '6456454', 'England');
INSERT INTO Users (email,name,surname,salary, phone , cname) VALUES('sakasden@gmail.com', 'Saken', 'Seifullin' ,6657, '123134456', 'Kazakhstan');
INSERT INTO Users (email,name,surname,salary, phone , cname) VALUES('ganaddi@gmail.com', 'Mahatma', 'Gandi' ,45654, '789789987', 'India');
INSERT INTO Users (email,name,surname,salary, phone , cname) VALUES('angsdfela@gmail.com', 'Angela', 'Merkel' ,4564, '54645312', 'Germany');

INSERT INTO public_servant(email, department) VALUES('asgeorge@gmail.com', 'it');
INSERT INTO public_servant(email, department) VALUES('fsdarmanbek@gmail.com', 'security');
INSERT INTO public_servant(email, department) VALUES('asdakhmet@gmail.com', 'health');
INSERT INTO public_servant(email, department) VALUES('pusdfshkin@gmail.com', 'medicine');
INSERT INTO public_servant(email, department) VALUES('maasdcron@gmail.com', 'police');
INSERT INTO public_servant(email, department) VALUES('maasdo@gmail.com', 'health');
INSERT INTO public_servant(email, department) VALUES('pushkin@gmail.com', 'police');
INSERT INTO public_servant(email, department) VALUES('edsaizabeth@gmail.com', 'education');
INSERT INTO public_servant(email, department) VALUES('sakasden@gmail.com', 'agro');
INSERT INTO public_servant(email, department) VALUES('angsdfela@gmail.com', 'food');

INSERT INTO Record(email,cname , disease_code ,total_deaths, total_patients) VALUES('asgeorge@gmail.com', 'Kazakhstan', 'covid-19', 12333, 4233231);
INSERT INTO Record(email,cname , disease_code ,total_deaths, total_patients) VALUES('asgeorge@gmail.com', 'Usa', 'covid-19', 12333, 4322231);
INSERT INTO Record(email,cname , disease_code ,total_deaths, total_patients) VALUES('asgeorge@gmail.com', 'China', 'covid-19', 12333, 434231);
INSERT INTO Record(email,cname , disease_code ,total_deaths, total_patients) VALUES('asgeorge@gmail.com', 'Russia', 'covid-19', 12333, 432331);
INSERT INTO Record(email,cname , disease_code ,total_deaths, total_patients) VALUES('fsdarmanbek@gmail.com', 'Kazakhstan', 'covid-19', 12333, 143231);
INSERT INTO Record(email,cname , disease_code ,total_deaths, total_patients) VALUES('fsdarmanbek@gmail.com', 'Germany', 'covid-19', 12333, 243231);
INSERT INTO Record(email,cname , disease_code ,total_deaths, total_patients) VALUES('fsdarmanbek@gmail.com', 'France', 'covid-19', 12333, 43231);
INSERT INTO Record(email,cname , disease_code ,total_deaths, total_patients) VALUES('fsdarmanbek@gmail.com', 'Usa', 'covid-19', 12333, 43231);
INSERT INTO Record(email,cname , disease_code ,total_deaths, total_patients) VALUES('asdakhmet@gmail.com', 'France', 'a-1', 12333, 43231);
INSERT INTO Record(email,cname , disease_code ,total_deaths, total_patients) VALUES('asdakhmet@gmail.com', 'Kazakhstan', 'c-1', 12333, 43231);
INSERT INTO Record(email,cname , disease_code ,total_deaths, total_patients) VALUES('pusdfshkin@gmail.com', 'Kazakhstan', 'f-1', 12333, 43231);
INSERT INTO Record(email,cname , disease_code ,total_deaths, total_patients) VALUES('angsdfela@gmail.com', 'Russia', 'g-1', 12333, 43231);
INSERT INTO Record(email,cname , disease_code ,total_deaths, total_patients) VALUES('edsaizabeth@gmail.com', 'Kazakhstan', 'e-1', 12333, 43231);
INSERT INTO Record(email,cname , disease_code ,total_deaths, total_patients) VALUES('edsaizabeth@gmail.com', 'France', 'k-1', 12333, 43231);
INSERT INTO Record(email,cname , disease_code ,total_deaths, total_patients) VALUES('maasdcron@gmail.com', 'Kazakhstan', 'a-1', 12333, 43231);
INSERT INTO Record(email,cname , disease_code ,total_deaths, total_patients) VALUES('maasdo@gmail.com', 'Netherlands', 'c-1', 12333, 43231);
INSERT INTO Record(email,cname , disease_code ,total_deaths, total_patients) VALUES('maasdo@gmail.com', 'Russia', 'c-1', 12333, 43231);
INSERT INTO Record(email,cname , disease_code ,total_deaths, total_patients) VALUES('maasdo@gmail.com', 'Japan', 'c-1', 12333, 43231);
INSERT INTO Record(email,cname , disease_code ,total_deaths, total_patients) VALUES('maasdo@gmail.com', 'Kazakhstan', 'c-1', 12333, 43231);
INSERT INTO Record(email,cname , disease_code ,total_deaths, total_patients) VALUES('sakasden@gmail.com', 'Russia', 'b-1', 12333, 43231);
INSERT INTO Record(email,cname , disease_code ,total_deaths, total_patients) VALUES('sakasden@gmail.com', 'Japan', 'd-1', 12333, 43231);
INSERT INTO Record(email,cname , disease_code ,total_deaths, total_patients) VALUES('sakasden@gmail.com', 'Germany', 'a-1', 12333, 43231);

INSERT INTO Doctor(email, degree) VALUES('macron@gmail.com', 'Masters Degree');
INSERT INTO Doctor(email, degree) VALUES('armanbek@gmail.com', 'Professional Degree');
INSERT INTO Doctor(email, degree) VALUES('george@gmail.com', 'Bachelors Degree');
INSERT INTO Doctor(email, degree) VALUES('pushkin@gmail.com', 'Bachelors Degree');
INSERT INTO Doctor(email, degree) VALUES('mao@gmail.com', 'Bachelors Degree');
INSERT INTO Doctor(email, degree) VALUES('akhmet@gmail.com', 'Professional Degree');
INSERT INTO Doctor(email, degree) VALUES('angela@gmail.com', 'Masters Degree');
INSERT INTO Doctor(email, degree) VALUES('saken@gmail.com', 'Professional Degree');
INSERT INTO Doctor(email, degree) VALUES('gandi@gmail.com', 'Associate Degree');
INSERT INTO Doctor(email, degree) VALUES('eizabeth@gmail.com', 'Doctoral Degree');
