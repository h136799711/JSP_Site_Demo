/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2006-1-1 02:36:50                            */
/*==============================================================*/

drop database if exists newsmanager;
create database  newsmanager;

use newsmanager;

drop table if exists FocusNews;

drop table if exists News;

drop table if exists NewsType;

drop table if exists Notice;

drop table if exists Users;

/*==============================================================*/
/* Table: FocusNews                                             */
/*==============================================================*/
create table FocusNews
(
   focus_id             int  not null AUTO_INCREMENT,
   user_id               int,
   focus_title          varchar(100),
   focus_content        text,
   focus_pubtime        date,
   primary key (focus_id)
);

/*==============================================================*/
/* Table: News                                                  */
/*==============================================================*/
create table News
(
   news_id              int   not null AUTO_INCREMENT,
   user_id               int,
   news_title           varchar(100),
   news_content         text,
   news_pubtime         date,
   newstype_id          int,
   primary key (news_id)
);

/*==============================================================*/
/* Table: NewsType                                              */
/*==============================================================*/
create table NewsType
(
   newstype_id              int not null AUTO_INCREMENT,
   newstype_name            varchar(100),
   primary key (newstype_id)
);

/*==============================================================*/
/* Table: Notice                                                */
/*==============================================================*/
create table Notice
(
   no_id                int not null AUTO_INCREMENT,
   user_id               int,
   no_title             varchar(100),
   no_content           text,
   no_pubtime           date,
   primary key (no_id)
);

/*==============================================================*/
/* Table: Users                                                 */
/*==============================================================*/
create table Users
(
   user_id                   int not null AUTO_INCREMENT,
   user_name                 varchar(20),
   user_account              varchar(100),
   user_password             varchar(100),
   primary key (user_id)
);

alter table FocusNews add constraint FK_user_focus foreign key (user_id)
      references Users (user_id) on delete restrict on update restrict;

alter table News add constraint FK_type_news foreign key (newstype_id)
      references NewsType (newstype_id) on delete restrict on update restrict;

alter table News add constraint FK_user_news foreign key (user_id)
      references Users (user_id) on delete restrict on update restrict;

alter table Notice add constraint FK_user_notice foreign key (user_id)
      references Users (user_id) on delete restrict on update restrict;
      
alter table Users add unique(user_name);

alter table Users add unique(user_account);



