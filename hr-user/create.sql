create table roles (id bigint not null auto_increment, name varchar(255), primary key (id)) engine=InnoDB
create table users (id bigint not null auto_increment, email varchar(255), name varchar(255), password varchar(255), primary key (id)) engine=InnoDB
create table users_has_roles (user_id bigint not null, role_id bigint not null, primary key (user_id, role_id)) engine=InnoDB
alter table users add constraint UK_6dotkott2kjsp8vw4d0m25fb7 unique (email)
alter table users_has_roles add constraint FK29e00q3gcfq3trteh62ibxujv foreign key (role_id) references roles (id)
alter table users_has_roles add constraint FKinp2sirarlxndem3m3bfo61d2 foreign key (user_id) references users (id)
create table roles (id bigint not null auto_increment, name varchar(255), primary key (id)) engine=InnoDB
create table users (id bigint not null auto_increment, email varchar(255), name varchar(255), password varchar(255), primary key (id)) engine=InnoDB
create table users_has_roles (user_id bigint not null, role_id bigint not null, primary key (user_id, role_id)) engine=InnoDB
alter table users add constraint UK_6dotkott2kjsp8vw4d0m25fb7 unique (email)
alter table users_has_roles add constraint FK29e00q3gcfq3trteh62ibxujv foreign key (role_id) references roles (id)
alter table users_has_roles add constraint FKinp2sirarlxndem3m3bfo61d2 foreign key (user_id) references users (id)
create table roles (id bigint not null auto_increment, name varchar(255), primary key (id)) engine=InnoDB
create table users (id bigint not null auto_increment, email varchar(255), name varchar(255), password varchar(255), primary key (id)) engine=InnoDB
create table users_has_roles (user_id bigint not null, role_id bigint not null, primary key (user_id, role_id)) engine=InnoDB
alter table users add constraint UK_6dotkott2kjsp8vw4d0m25fb7 unique (email)
alter table users_has_roles add constraint FK29e00q3gcfq3trteh62ibxujv foreign key (role_id) references roles (id)
alter table users_has_roles add constraint FKinp2sirarlxndem3m3bfo61d2 foreign key (user_id) references users (id)
