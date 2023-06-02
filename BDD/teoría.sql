DROP DATABASE IF EXISTS Prueba1
CREATE DATABASE Prueba1
Create table productos (
    codProd int AUTO_INCREMENT primary key,
    nombre VARCHAR (45) not null,
    Descripcion varchar(90),
    Peso double not null,
    Stock int not null,
    Categoria int not  null REFERENCES CATEGORIAS (CodCaT),
);
Create table CATEGORIAS (
    CodCat int AUTO_INCREMENT primary_key,
    Nombre varchar(45) not null unique,

    )

insert into CATEGORIAS (Nombre, Descricion)
    values
        ('Bebidas con', 'bebidas con alcohol'), --Las fechasa y las cadenas de caracteres van entre comillas, los numeros no son necesarios--
        ('bebidas sin' , 'bebidas sin alcohol'),
        ('Comida', 'alimentos normales');
insert into productos (Nombre, Descricion, Peso, Stock)
    values
    ('Cerveza Alhambra tercio','Botellin de cerveza','Cerveza cruzcampo quinto sin alcohol', 0.7, 120, 2 )

select * from Categoria;
select * from productos;