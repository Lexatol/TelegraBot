create table users(
        chat_id          bigserial primary key,
        first_name       varchar(255),
        user_name        varchar(255),
        register_at       timestamp default current_timestamp
);

create table ads_table(
        id              bigserial primary key,
        ad              varchar(255)
);