delete from itemSubmit;
delete from users;
delete from role;
INSERT INTO users VALUES (1,'Joe','Coyne','jcoyne','supersecret1','joecoyne@gmail.com');
INSERT INTO users VALUES (2,'Fred','Hensen','fhensen','supersecret2','fredhensen@gmail.com');
INSERT INTO users VALUES (3,'Barney','Curry','bcurry','supersecret3','bcurry@yahoo.com');
INSERT INTO users VALUES (4,'Karen','Mack','kmack','supersecret4','kmack@hotmail.com');
INSERT INTO users VALUES (5,'Dianne','Klein','dklein','supersecret5','dianne.klein@gmail.com');
INSERT INTO users VALUES (6,'Dawn','Tillman','dtillman','supersecret6','dawntillman@aol.com');
INSERT INTO users VALUES (7,'Peter','Dark','admin','admin','peterdark@gmail.com');
INSERT INTO itemSubmit VALUES (1, 1, "Money", 200.00, 'March of Dimes', "2018-02-19");
INSERT INTO itemSubmit VALUES (2, 1, "Vase", 7.00, 'Goodwill', "2018-02-12");
INSERT INTO itemSubmit VALUES (3, 2, "Dress", 30.00, 'Goodwill', "2018-02-14");
INSERT INTO role VALUES (1, 'admin', 'jcoyne', 1);
INSERT INTO role VALUES (2, 'admin', 'admin', 7);
INSERT INTO role VALUES (3, 'user', 'bcurry', 3);