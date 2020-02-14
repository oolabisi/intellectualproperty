drop user if exists 'ip'@'localhost';

create user 'ip'@'localhost' identified by 'ipUser12345';

use intellectualproperty;

grant all privileges on intellectualproperty.* to 'ip'@'localhost';

flush privileges;