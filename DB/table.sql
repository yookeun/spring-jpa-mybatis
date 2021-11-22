-- test.`user` definition

CREATE TABLE `user` (
                        `user_code` int(11) NOT NULL AUTO_INCREMENT,
                        `user_id` varchar(20) NOT NULL,
                        `user_name` varchar(20) NOT NULL,
                        `create_date` datetime(6) NOT NULL,
                        PRIMARY KEY (`user_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;

insert into `user` (user_id, user_name, create_date) values ('hong', '홍길동', NOW());

CREATE TABLE `board` (
                         `board_no` int(11) NOT NULL AUTO_INCREMENT,
                         `title` varchar(100) NOT NULL,
                         `content` varchar(500) NOT NULL,
                         `user_code` int(11) DEFAULT NULL,
                         `create_date` datetime(6) NOT NULL,
                         PRIMARY KEY (`board_no`),
                         KEY `FK_user_code` (`user_code`),
                         CONSTRAINT `FK_user_code` FOREIGN KEY (`user_code`) REFERENCES `user` (`user_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;