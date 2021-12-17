Insert into shop values(200, '스타벅스 임시점', '동성로 2길');

ALTER TABLE manager 
ADD CONSTRAINT manager_shop_id_fk FOREIGN KEY(shop_id) 
REFERENCES shop(shop_id);

INSER INTO 
INSERT INTO MANAGER VALUES(5, 'LES', 4321312, 800);

SELECT m.manager_id, m.manager_name, s.shop_name
FROM shop s
JOIN manager m
ON s.shop_id = m.shop_id
WHERE s.shop_id = 200;

SELECT m.manager_id, m.manager_name, s.shop_name
FROM shop s, manager m
WHERE s.shop_id = m.shop_id 
AND s.shop_id = 200;

COMMIT;

SELECT * 
FROM manager 
WHERE manager_id = 1 
AND manager_pwd = '1234';

--ALTER TABLE manager add CONSTRAINT manager_shop_id_fk FOREIGN KEY(shop_id) REFERENCES
commit;

insert into manager values(2, 'lee', 2222, 400);

SELECT CONSTRAINT_NAME
      ,CONSTRAINT_TYPE
      ,TABLE_NAME
      ,R_CONSTRAINT_NAME -- 부모 테이블
  FROM USER_CONSTRAINTS
 WHERE CONSTRAINT_NAME = 'MANAGER_SHOP_ID_FK';
 
 SELECT TABLE_NAME, CONSTRAINT_NAME STATUS
 FROM USER_CONSTRAINTS
 WHERE CONSTRAINT_NAME = 'MANAGER_SHOP_ID_FK';
 
 SELECT * FROM ALL_CONSTRAINTS WHERE TABLE_NAME = 'SHOP';
 
 ALTER TABLE manager ADD PRIMARY KEY(manager_id);
 
 ALTER TABLE manager ADD CONSTRAINT manager_shop_id_fk FOREIGN KEY (shop_id)
 REFERENCES SHOP(shop_id);
 
 ALTER TABLE manager drop constraint manager_shop_id_fk;
 
 ALTER TABLE manager DROP CONSTRAINT manager_shop_id_fk;
 
ALTER TABLE MANAGER
ADD CONSTRAINT MANAGER_FK1 FOREIGN KEY(SHOP_ID)
REFERENCES SHOP(SHOP_ID);

select shop_id from manager
minus 
select manager from shop;

commit;

SELECT m.manager_name, s.shop_name
FROM manager m
JOIN shop s
ON m.shop_id = s.shop_id
WHERE m.shop_id = 200;

SELECT m.manager_id, m.manager_name, s.shop_name
FROM shop s
JOIN manager m
ON s.shop_id = m.shop_id
WHERE s.shop_id = 200;