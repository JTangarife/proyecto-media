CREATE DATABASE tienda;

CREATE TABLE `tienda`.`productos` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT '',
  `nombre` VARCHAR(45) NULL COMMENT '',
  `precio` INT NULL COMMENT '',
  `descripcion` VARCHAR(45) NULL COMMENT '',
  PRIMARY KEY (`id`)  COMMENT '');


CREATE TABLE `tienda`.`contactenos` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT '',
  `nombre` VARCHAR(45) NULL COMMENT '',
  `telefono` INT NULL COMMENT '',
  `direccion` VARCHAR(45) NULL COMMENT '',
  PRIMARY KEY (`id`)  COMMENT '');


CREATE TABLE `tienda`.`deudas` (
  `iddeudas` INT NOT NULL AUTO_INCREMENT COMMENT '',
  `idusuario` INT NULL COMMENT '',
  `valordeuda` INT NULL COMMENT '',
  PRIMARY KEY (`iddeudas`)  COMMENT '');

CREATE TABLE `tienda`.`inventario` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT '',
  `producto` VARCHAR(45) NULL COMMENT '',
  `precio` INT NULL COMMENT '',
  `cantidad` INT NULL COMMENT '',
  `descripcion` VARCHAR(45) NULL COMMENT '',
  PRIMARY KEY (`id`)  COMMENT '');

INSERT INTO `tienda`.`productos` (`id`, `nombre`, `precio`, `descripcion`) VALUES ('1', 'doritos', '1300', 'nachos con queso');
INSERT INTO `tienda`.`productos` (`id`, `nombre`, `precio`, `descripcion`) VALUES ('2', 'papiitas', '1300', 'papas fritas');
INSERT INTO `tienda`.`productos` (`id`, `nombre`, `precio`, `descripcion`) VALUES ('3', 'choclitos', '800', 'maiz frito ácido');
INSERT INTO `tienda`.`productos` (`id`, `nombre`, `precio`, `descripcion`) VALUES ('4', 'gaseosa', '1200', 'bebida con gas');
INSERT INTO `tienda`.`productos` (`id`, `nombre`, `precio`, `descripcion`) VALUES ('5', 'paletas', '600', 'chocolate o fresa');
INSERT INTO `tienda`.`productos` (`id`, `nombre`, `precio`, `descripcion`) VALUES ('6', 'galletas', '700', 'masa horneada');
INSERT INTO `tienda`.`productos` (`id`, `nombre`, `precio`, `descripcion`) VALUES ('7', 'vaso', '100', 'vaso desechable');
INSERT INTO `tienda`.`productos` (`id`, `nombre`, `precio`, `descripcion`) VALUES ('8', 'cuchara', '100', 'cuchara desechable');
INSERT INTO `tienda`.`productos` (`id`, `nombre`, `precio`, `descripcion`) VALUES ('9', 'limonada', '200', 'bebida refrescante');
INSERT INTO `tienda`.`productos` (`id`, `nombre`, `precio`, `descripcion`) VALUES ('10', 'arepas', '1000', 'arepa con salchichón');

ALTER TABLE `tienda`.`productos` 
ADD COLUMN `tipoproducto` VARCHAR(45) NULL COMMENT '' AFTER `descripcion`;



INSERT INTO `tienda`.`deudas` (`idusuario`, `valordeuda`) VALUES ('1', '2220');
INSERT INTO `tienda`.`deudas` (`idusuario`, `valordeuda`) VALUES ('2', '654');
INSERT INTO `tienda`.`deudas` (`idusuario`, `valordeuda`) VALUES ('3', '654');
INSERT INTO `tienda`.`deudas` (`idusuario`, `valordeuda`) VALUES ('4', '64');
INSERT INTO `tienda`.`deudas` (`idusuario`, `valordeuda`) VALUES ('5', '654');
INSERT INTO `tienda`.`deudas` (`idusuario`, `valordeuda`) VALUES ('6', '654');
INSERT INTO `tienda`.`deudas` (`idusuario`, `valordeuda`) VALUES ('7', '654');
INSERT INTO `tienda`.`deudas` (`idusuario`, `valordeuda`) VALUES ('8', '65');
INSERT INTO `tienda`.`deudas` (`idusuario`, `valordeuda`) VALUES ('9', '988488');
INSERT INTO `tienda`.`deudas` (`idusuario`, `valordeuda`) VALUES ('10', '8');

