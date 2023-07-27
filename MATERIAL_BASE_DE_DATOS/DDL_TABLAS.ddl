-- Generado por Oracle SQL Developer Data Modeler 23.1.0.087.0806
--   en:        2023-07-25 17:50:40 GMT-06:00
--   sitio:      Oracle Database 11g
--   tipo:      Oracle Database 11g



-- predefined type, no DDL - MDSYS.SDO_GEOMETRY

-- predefined type, no DDL - XMLTYPE

CREATE TABLE ta_citas (
    id_cita                    NUMBER(10) NOT NULL,
    id_propietario             NUMBER(10) NOT NULL,
    id_paciente                NUMBER(10) NOT NULL,
    id_veterinario             NUMBER(10) NOT NULL,
    fecha_cita                 DATE,
    ta_veterinarios_cedula_vet NUMBER(10) NOT NULL
);

ALTER TABLE ta_citas ADD CONSTRAINT ta_citas_pk PRIMARY KEY ( id_cita );

CREATE TABLE ta_pacientes (
    id_paciente        NUMBER(10) NOT NULL,
    id_propietario     NUMBER(10) NOT NULL,
    id_tipo_paciente   NUMBER(1) NOT NULL,
    nombre_paciente    VARCHAR2(45 BYTE) NOT NULL,
    fecha_nac_paciente DATE,
    telefono           NUMBER(10)
);

ALTER TABLE ta_pacientes ADD CONSTRAINT ta_pacientes_pk PRIMARY KEY ( id_paciente );

CREATE TABLE ta_propietarios (
    id_propietario               NUMBER(10) NOT NULL,
    nombre_propietario           VARCHAR2(40 BYTE) NOT NULL,
    apellido_materno_propietario VARCHAR2(40 BYTE),
    apellido_paterno_propietario VARCHAR2(40 BYTE)
);

ALTER TABLE ta_propietarios ADD CONSTRAINT ta_propietarios_pk PRIMARY KEY ( id_propietario );

CREATE TABLE ta_tipo_pacientes (
    id_tipo_paciente NUMBER(1) NOT NULL,
    descripcion      VARCHAR2(20 BYTE) NOT NULL
);

ALTER TABLE ta_tipo_pacientes ADD CONSTRAINT ta_tipo_pacientea_pk PRIMARY KEY ( id_tipo_paciente );

CREATE TABLE ta_veterinarios (
    id_veterinario       NUMBER(10) NOT NULL,
    cedula_vet           NUMBER(10) NOT NULL,
    nombre_vet           VARCHAR2(40 BYTE) NOT NULL,
    apellido_paterno_vet VARCHAR2(40 BYTE) NOT NULL,
    apellido_materno_vet VARCHAR2(40 BYTE) NOT NULL
);

ALTER TABLE ta_veterinarios ADD CONSTRAINT ta_medicos_pk PRIMARY KEY ( id_veterinario,
                                                                       cedula_vet );

ALTER TABLE ta_citas
    ADD CONSTRAINT ta_citas_ta_medicos_fk FOREIGN KEY ( id_veterinario,
                                                        ta_veterinarios_cedula_vet )
        REFERENCES ta_veterinarios ( id_veterinario,
                                     cedula_vet );

ALTER TABLE ta_citas
    ADD CONSTRAINT ta_citas_ta_pacientes_fk FOREIGN KEY ( id_paciente )
        REFERENCES ta_pacientes ( id_paciente );

ALTER TABLE ta_citas
    ADD CONSTRAINT ta_citas_ta_propietarios_fk FOREIGN KEY ( id_propietario )
        REFERENCES ta_propietarios ( id_propietario );

--  ERROR: FK name length exceeds maximum allowed length(30) 
ALTER TABLE ta_pacientes
    ADD CONSTRAINT ta_pacientes_ta_propietarios_fk FOREIGN KEY ( id_propietario )
        REFERENCES ta_propietarios ( id_propietario );

--  ERROR: FK name length exceeds maximum allowed length(30) 
ALTER TABLE ta_pacientes
    ADD CONSTRAINT ta_pacientes_ta_tipo_pacientes_fk FOREIGN KEY ( id_tipo_paciente )
        REFERENCES ta_tipo_pacientes ( id_tipo_paciente );

CREATE SEQUENCE ta_citas_id_cita_seq START WITH 1 NOCACHE ORDER;

CREATE OR REPLACE TRIGGER ta_citas_id_cita_trg BEFORE
    INSERT ON ta_citas
    FOR EACH ROW
    WHEN ( new.id_cita IS NULL )
BEGIN
    :new.id_cita := ta_citas_id_cita_seq.nextval;
END;
/

CREATE SEQUENCE ta_pacientes_id_paciente_seq START WITH 1 NOCACHE ORDER;

CREATE OR REPLACE TRIGGER ta_pacientes_id_paciente_trg BEFORE
    INSERT ON ta_pacientes
    FOR EACH ROW
    WHEN ( new.id_paciente IS NULL )
BEGIN
    :new.id_paciente := ta_pacientes_id_paciente_seq.nextval;
END;
/

CREATE SEQUENCE ta_propietarios_id_propietario START WITH 1 NOCACHE ORDER;

CREATE OR REPLACE TRIGGER ta_propietarios_id_propietario BEFORE
    INSERT ON ta_propietarios
    FOR EACH ROW
    WHEN ( new.id_propietario IS NULL )
BEGIN
    :new.id_propietario := ta_propietarios_id_propietario.nextval;
END;
/

CREATE SEQUENCE ta_tipo_pacientes_id_tipo_paci START WITH 1 NOCACHE ORDER;

CREATE OR REPLACE TRIGGER ta_tipo_pacientes_id_tipo_paci BEFORE
    INSERT ON ta_tipo_pacientes
    FOR EACH ROW
    WHEN ( new.id_tipo_paciente IS NULL )
BEGIN
    :new.id_tipo_paciente := ta_tipo_pacientes_id_tipo_paci.nextval;
END;
/

CREATE SEQUENCE ta_veterinarios_id_veterinario START WITH 1 NOCACHE ORDER;

CREATE OR REPLACE TRIGGER ta_veterinarios_id_veterinario BEFORE
    INSERT ON ta_veterinarios
    FOR EACH ROW
    WHEN ( new.id_veterinario IS NULL )
BEGIN
    :new.id_veterinario := ta_veterinarios_id_veterinario.nextval;
END;
/



-- Informe de Resumen de Oracle SQL Developer Data Modeler: 
-- 
-- CREATE TABLE                             5
-- CREATE INDEX                             0
-- ALTER TABLE                             10
-- CREATE VIEW                              0
-- ALTER VIEW                               0
-- CREATE PACKAGE                           0
-- CREATE PACKAGE BODY                      0
-- CREATE PROCEDURE                         0
-- CREATE FUNCTION                          0
-- CREATE TRIGGER                           5
-- ALTER TRIGGER                            0
-- CREATE COLLECTION TYPE                   0
-- CREATE STRUCTURED TYPE                   0
-- CREATE STRUCTURED TYPE BODY              0
-- CREATE CLUSTER                           0
-- CREATE CONTEXT                           0
-- CREATE DATABASE                          0
-- CREATE DIMENSION                         0
-- CREATE DIRECTORY                         0
-- CREATE DISK GROUP                        0
-- CREATE ROLE                              0
-- CREATE ROLLBACK SEGMENT                  0
-- CREATE SEQUENCE                          5
-- CREATE MATERIALIZED VIEW                 0
-- CREATE MATERIALIZED VIEW LOG             0
-- CREATE SYNONYM                           0
-- CREATE TABLESPACE                        0
-- CREATE USER                              0
-- 
-- DROP TABLESPACE                          0
-- DROP DATABASE                            0
-- 
-- REDACTION POLICY                         0
-- 
-- ORDS DROP SCHEMA                         0
-- ORDS ENABLE SCHEMA                       0
-- ORDS ENABLE OBJECT                       0
-- 
-- ERRORS                                   2
-- WARNINGS                                 0
