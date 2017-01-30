create table greetings (
    id                 serial primary key,
    value              varchar(1024) not null,
    CONSTRAINT registrations_uk UNIQUE (value)
);
