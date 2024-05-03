create table sample (num int, title varchar2(50), res timestamp default sysdate);

select * from sample;

insert into sample values (1, '基敲1', default);
insert into sample values (2, '基敲2', default);
insert into sample values (3, '基敲3', default);
insert into sample values (4, '基敲4', default);

commit;