--------------------------------------------------------
--  파일이 생성됨 - 월요일-12월-20-2021   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table MANAGER
--------------------------------------------------------

  CREATE TABLE "HR"."MANAGER" 
   (	"MANAGER_ID" NUMBER(6,0), 
	"MANAGER_NAME" VARCHAR2(20 BYTE), 
	"MANAGER_PWD" VARCHAR2(20 BYTE), 
	"MANAGER_PHONE" VARCHAR2(20 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index MANAGER_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "HR"."MANAGER_PK" ON "HR"."MANAGER" ("MANAGER_ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  Constraints for Table MANAGER
--------------------------------------------------------

  ALTER TABLE "HR"."MANAGER" ADD CONSTRAINT "MANAGER_PK" PRIMARY KEY ("MANAGER_ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
  ALTER TABLE "HR"."MANAGER" MODIFY ("MANAGER_ID" NOT NULL ENABLE);


---------------------------------------------------------
-- data insert
---------------------------------------------------------
INSERT INTO MANAGER VALUES(1, 'lee3', 1111, '010-1111-1111');
INSERT INTO MANAGER VALUES(2, 'kim', 1233, '010-1234-1234');
INSERT INTO MANAGER VALUES(3, 'choi', 1232, '010-1234-1234');
INSERT INTO MANAGER VALUES(4, 'lie', 1111, '010-1111-1111');

