create table sample (num int, title varchar2(50), res timestamp default sysdate);

select * from sample;

insert into sample values (1, '����1', default);
insert into sample values (2, '����2', default);
insert into sample values (3, '����3', default);
insert into sample values (4, '����4', default);

commit;