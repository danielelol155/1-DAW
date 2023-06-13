-- crear tabla detallepedidos

CREATE TABLE detallepedidos (
    codigopedido INT,
    Codigoproducto INT,
    cantidad INT,
    preciounidad FLOAT(10,2),
    numeroLinea INT,
    PRIMARY KEY (codigopedido, Codigoproducto),
    CONSTRAINT fk_codigoproducto FOREIGN KEY codigoproducto REFERENCES productos(codigoproducto)
) engine=innodb;

INSERT INTO detallepedidos VALUES(1,2,19,27.14,23);
INSERT INTO detallepedidos (codigopedido, codigoproducto, cantidad) VALUES(1,3,19);



ALTER TABLE detallepedidos
    ADD observacion VARCHAR(100) NULL,
    ADD FOREIGN KEY codigopedido REFERENCES pedidos(codigopedido),
    MODIFY preciounidad FLOAT(10,3),
    RENAME COLUMN numeroLinea to lineanumero,
    DROP COLUMN cantidad,
    -- eliminar que sea clave foranea
    DROP FOREIGN KEY fk_codigoproducto;

UPDATE detallepedidos SET preciounidad = 14.24, lineanumero = 24
WHERE codigopedido=1;

DELETE FROM detallepedidos where codigopedido = 1 AND codigoproducto = 3;

