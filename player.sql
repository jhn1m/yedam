--------------------------------------------------------
--  파일이 생성됨 - 월요일-12월-20-2021   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table PLAYER
--------------------------------------------------------

  CREATE TABLE "HR"."PLAYER" 
   (	"PLAYER_ID" NUMBER(6,0), 
	"PLAYER_NAME" VARCHAR2(10 BYTE), 
	"PLAYER_PWD" VARCHAR2(20 BYTE), 
	"PLAYER_PHONE" VARCHAR2(20 BYTE), 
	"PLAYER_PROGRESS" NUMBER(6,0), 
	"PLAYER_RANK" VARCHAR2(10 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index PLAYER_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "HR"."PLAYER_PK" ON "HR"."PLAYER" ("PLAYER_ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  Constraints for Table PLAYER
--------------------------------------------------------

  ALTER TABLE "HR"."PLAYER" ADD CONSTRAINT "PLAYER_PK" PRIMARY KEY ("PLAYER_ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
  ALTER TABLE "HR"."PLAYER" MODIFY ("PLAYER_PWD" NOT NULL ENABLE);
  ALTER TABLE "HR"."PLAYER" MODIFY ("PLAYER_NAME" NOT NULL ENABLE);
  ALTER TABLE "HR"."PLAYER" MODIFY ("PLAYER_ID" NOT NULL ENABLE);

--------------------------------------------------------
--  DATA insert
--------------------------------------------------------
INSERT INTO PLAYER VALUES(1, 'lee', 1234, 010-1234-1234, 60, 'B')
INSERT INTO PLAYER(player_id, player_name, player_pwd, player_phone) VALUES(2, 'oppp', 1234, 010-1234-1234)
INSERT INTO PLAYER(player_id, player_name, player_pwd, player_phone) VALUES(3, 'choi', 1232, 010-1234-1234)