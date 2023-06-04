DROP DATABASE IF EXISTS citas
CREATE DATABASE citas CHARACTER SET utf8 COLLATE utf8_general_ci
USE citas

CREATE TABLE Usuario (
    email VARCHAR (100) PRIMARY KEY,
    Nombre VARCHAR (20) NOT NULL,
    foto INT NOT NULL
)engine-innodb;

CREATE TABLE Biologo (
    Nombre VARCHAR (20) PRIMARY KEY,
    Direccion VARCHAR (25) NOT NULL,
    Provincia VARCHAR (20) NOT NULL,
    FechaTitulacion INT NOT NULL
)engine-innodb;

CREATE TABLE Individuo (
    Codigo VARCHAR (20) PRIMARY KEY,
    Peso INT NOT NULL,
    Dimensiones INT NOT NULL,
    FOREIGN KEY (Nombre) REFERENCES Especie(Nombre)
)engine-innodb;

CREATE TABLE Torreta (
    Codigo VARCHAR (20) PRIMARY KEY
)engine-innodb;

CREATE TABLE pasa