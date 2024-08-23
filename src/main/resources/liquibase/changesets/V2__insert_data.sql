insert into users (name, username, password)
values ('John Doe', 'johndoe@gmail.com', '$2a$12$vo0VuXWAM6CmHXm9RhltDO8is0UBaizD3Es0eNsFZbWRdx84pa312'),
       ('Mike Smith', 'mikesmith@gmail.com', '$2a$12$vo0VuXWAM6CmHXm9RhltDO8is0UBaizD3Es0eNsFZbWRdx84pa312');

insert into tasks(title, description, status, expiration_date)
values ('Buy cheese', null, 'ToDo', '2025-01-24 12:00:00'),
       ('Do homework', 'Math, Phisics, Literature', 'IN_PROGRESS', '20205-01-31 00:00:00'),
       ('Clean rooms', null, 'DONE', null),
       ('Call Mike', 'Ask aboit meeting', 'TODO', '2025-02-01 00:00:00');

insert into users_tasks(user_id, task_id)
values (2, 1),
       (2, 2),
       (2, 3),
       (1, 4);

insert into users_roles(user_id, role)
values (1, 'ROLE_ADMIN'),
       (1, 'ROLE_USER'),
       (2, 'ROLE_USER')
