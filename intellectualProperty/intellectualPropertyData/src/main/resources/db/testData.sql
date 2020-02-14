USE `intellectualproperty` ;

insert into ipusers 
values
(1, "Test", "Tester", "test@tester.com", "pass123", "123456789", "malaysia"),
(2, "Ade", "Adeoye", "ade@adeoye.com", "passwd123", "1256789998", "nigeria");

insert into usercompany 
values(1, "Testing Inc.", "122, Test Inc Drive, Teston", "info@tester.com", "123448888"),
(2, "Amazing Legal", "12, Legal Drive, Legalston", "info@amazing.com", "123449998");

insert into userrole 
values(1, "Agent", "IP Legal Agent"),
(2, "Admin", "IP Administrator"),
(3, "Client", "IP Client");

insert into usercompanyrole 
values
(1, 1, 3),
(2, 1, 1);

