DROP DATABASE IF EXISTS naruto_rober_barreto;
CREATE DATABASE naruto_rober_barreto;
USE naruto_rober_barreto;
CREATE TABLE ninja(
    id VARCHAR(20) PRIMARY KEY,
    nombre VARCHAR(50),
    rango VARCHAR(50),
    aldea VARCHAR(50)
);

CREATE TABLE mision(
    id INT PRIMARY KEY AUTO_INCREMENT,
    descripcion VARCHAR(100),
    rango VARCHAR(50),
    recompensa VARCHAR(100)
);

CREATE TABLE misionninja(
    id_ninja VARCHAR(20),
    id_mision INT,
    fechainicio TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    fechafin TIMESTAMP,
    FOREIGN KEY (id_ninja) REFERENCES ninja(id),
    FOREIGN KEY (id_mision) REFERENCES mision(id)
);

CREATE TABLE habilidad(
    id_ninja VARCHAR(20) PRIMARY KEY,
    nombre VARCHAR(50),
    descripcion VARCHAR(100),
    FOREIGN KEY (id_ninja) REFERENCES ninja(id)
);

