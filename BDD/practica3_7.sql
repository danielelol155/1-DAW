DROP DATABASE IF EXISTS PARQUEECO
CREATE DATABASE PARQUEECO CHARACTER SET utf8 COLLATE utf8_general_ci
USE PARQUEECO

CREATE TABLE Especie (
    Nombre VARCHAR (20) PRIMARY KEY,
    Caracteristicas VARCHAR (90) NOT NULL,
    PeriodoMigratorio INT NOT NULL
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