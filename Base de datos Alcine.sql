-- phpMyAdmin SQL Dump
-- version 2.10.2
-- http://www.phpmyadmin.net
-- 
-- Servidor: localhost
-- Tiempo de generación: 09-08-2020 a las 18:55:05
-- Versión del servidor: 5.0.45
-- Versión de PHP: 5.2.3

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";

-- 
-- Base de datos: `alcine`
-- 

-- --------------------------------------------------------

-- 
-- Estructura de tabla para la tabla `cliente`
-- 



CREATE DATABASE puntodeventa;
use DATABASE puntodeventa;
CREATE TABLE `cliente` (
  `idCliente` int(11) unsigned NOT NULL auto_increment,
  `Cedula` varchar(10) default NULL,
  `Nombre` varchar(200) default NULL,
 `Apellido` varchar(200) default NULL,
  `Direccion` varchar(200) default NULL,
  `Telefono` varchar(11) default NULL,
  PRIMARY KEY  (`idCliente`)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 AUTO_INCREMENT=26 ;


CREATE TABLE `info_ventas` (
  `idInfoVentas` int(10) unsigned NOT NULL auto_increment,
  `Ventas_idVentas` int(11) default NULL,
  `Peliculas_IdPeli` int(11) default NULL,
  `Cantidad` int(11) default NULL,
  `PrecioVenta` double default NULL,
  PRIMARY KEY  (`idInfoVentas`)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 AUTO_INCREMENT=83 ;

CREATE TABLE `pelicula` (
  `idProducto` int(10) unsigned NOT NULL auto_increment,
  `CodigoPro` varchar(11) default NULL,
  `Nombre` varchar(200) default NULL,
  `Precio` double default NULL,
  `stock` int(11) default NULL,
  PRIMARY KEY  (`idProducto`)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 AUTO_INCREMENT=11 ;

CREATE TABLE `ventaspeli` (
  `IdVentas` int(10) unsigned NOT NULL auto_increment,
  `NumSerie` varchar(12) default NULL,
  `idCliente` int(11) default NULL,
  `FechaVenta` date default NULL,
  `Monto` double default NULL,
  PRIMARY KEY  (`IdVentas`)
) ENGINE=MyISAM  DEFAULT CHARSET=utf8 AUTO_INCREMENT=46 ;

