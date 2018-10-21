INSERT INTO beer(name,abv) VALUES ('Bartek IPA',6.16);
INSERT INTO beer(name,abv) VALUES ('Mateusz APA',3.16);
INSERT INTO beer(name,abv) VALUES ('Kacper Pils',1.16);

INSERT INTO user(login,password,name,lastname,mail) VALUES ('test','test','bartek','gawron','cos@cos.pl');
INSERT INTO user(login,password,name,lastname,mail) VALUES ('Bartek1','test','bartek','gawron','cos@cos.pl');
INSERT INTO user(login,password,name,lastname,mail) VALUES ('Bartek2','test','bartek','gawron','cos@cos.pl');

COMMIT;