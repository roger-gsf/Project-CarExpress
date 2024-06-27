CREATE DATABASE locadoraDeCarros;
USE locadoraDeCarros;

CREATE TABLE Marca (
    id TINYINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(50) NOT NULL
) ENGINE=INNODB;

CREATE TABLE Modelo (
    id TINYINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(50) NOT NULL,
    marca_id TINYINT,
    FOREIGN KEY (marca_id) REFERENCES Marca(id)
) ENGINE=INNODB;

CREATE TABLE Carro (
    id TINYINT AUTO_INCREMENT PRIMARY KEY,
    modelo_id TINYINT,
    ano YEAR,
    potencia_motor DECIMAL(10,2),
    cor VARCHAR(20),
    placa VARCHAR(10) UNIQUE NOT NULL,
    disponivel BOOLEAN DEFAULT TRUE,
    FOREIGN KEY (modelo_id) REFERENCES Modelo(id)
) ENGINE=INNODB;

CREATE TABLE Cliente (
    id TINYINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    telefone VARCHAR(15)
) ENGINE=INNODB;

CREATE TABLE Locacao (
    id TINYINT AUTO_INCREMENT PRIMARY KEY,
    carro_id TINYINT,
    cliente_id TINYINT,
    data_inicio DATE NOT NULL,
    data_fim DATE,
    statusCarro VARCHAR(20) DEFAULT 'ativa',
    FOREIGN KEY (carro_id) REFERENCES Carro(id),
    FOREIGN KEY (cliente_id) REFERENCES Cliente(id)
) ENGINE=INNODB;
