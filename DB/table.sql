CREATE TABLE `user`
(
    `user_no`     bigint      NOT NULL,
    `user_id`     varchar(20) NOT NULL,
    `user_name`   varchar(20) NOT NULL,
    `create_date` timestamp   NOT NULL DEFAULT current_timestamp,
    PRIMARY KEY(`user_no`),
    UNIQUE KEY(`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE `board`
(
    `board_no`       bigint       NOT NULL,
    `title`          varchar(100) NOT NULL,
    `content`        text         NOT NULL,
    `create_user_id` varchar(20)  NOT NULL,
    `create_date`    timestamp    NOT NULL DEFAULT current_timestamp,
    `update_user_id` varchar(20)           DEFAULT NULL,
    `update_date`    timestamp NULL DEFAULT NULL ON UPDATE current_timestamp () COMMENT '수정일시',
    PRIMARY KEY(`board_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4