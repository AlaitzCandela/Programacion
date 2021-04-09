-- phpMyAdmin SQL Dump
-- version 4.7.5
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 07-04-2021 a las 17:35:31
-- Versión del servidor: 5.6.34
-- Versión de PHP: 5.6.32

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `practica_2`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `abogado`
--

CREATE TABLE `abogado` (
  `Dni` varchar(9) NOT NULL,
  `Nombre` varchar(20) NOT NULL,
  `Apellido` varchar(20) NOT NULL,
  `Direccion` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `abogado`
--

INSERT INTO `abogado` (`Dni`, `Nombre`, `Apellido`, `Direccion`) VALUES
('11111111A', 'a', 'ab', 'a'),
('11111111B', 'b', 'b', 'b'),
('11111111E', 'e', 'e', 'e'),
('11111111H', 'h', 'h', 'h'),
('12345678U', 'r', 'r', 'r'),
('33333333R', 'r', 'r', 'r'),
('44444444G', 'g', 'g', 'g'),
('55555555T', 'tt', 't', 't'),
('98765432L', 'l', 'l', 'l');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `abogadocaso`
--

CREATE TABLE `abogadocaso` (
  `NumExpediente` int(4) NOT NULL,
  `DniAbogado` varchar(9) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `casojuicio`
--

CREATE TABLE `casojuicio` (
  `NumExpediente` int(4) NOT NULL,
  `FechaInicio` date NOT NULL,
  `FechaFin` date DEFAULT NULL,
  `Estado` varchar(20) NOT NULL,
  `DniCliente` varchar(9) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `casojuicio`
--

INSERT INTO `casojuicio` (`NumExpediente`, `FechaInicio`, `FechaFin`, `Estado`, `DniCliente`) VALUES
(967, '2021-03-31', NULL, 'ANULADO', '11111111A');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `Dni` varchar(9) NOT NULL,
  `Nombre` varchar(20) NOT NULL,
  `Apellido` varchar(20) NOT NULL,
  `Direccion` varchar(20) NOT NULL,
  `Telefono` int(9) NOT NULL,
  `Correo` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`Dni`, `Nombre`, `Apellido`, `Direccion`, `Telefono`, `Correo`) VALUES
('11111111A', 'a', 'a', 'a', 111111111, 'a'),
('11111111H', 'h', 'h', 'h', 111111111, 'h'),
('44444444F', 'f', 'f', 'f', 444444444, 'f');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `abogado`
--
ALTER TABLE `abogado`
  ADD PRIMARY KEY (`Dni`);

--
-- Indices de la tabla `abogadocaso`
--
ALTER TABLE `abogadocaso`
  ADD PRIMARY KEY (`NumExpediente`,`DniAbogado`),
  ADD KEY `DniAbogado` (`DniAbogado`);

--
-- Indices de la tabla `casojuicio`
--
ALTER TABLE `casojuicio`
  ADD PRIMARY KEY (`NumExpediente`),
  ADD KEY `DniCliente` (`DniCliente`);

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`Dni`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `abogadocaso`
--
ALTER TABLE `abogadocaso`
  ADD CONSTRAINT `abogadocaso_ibfk_1` FOREIGN KEY (`DniAbogado`) REFERENCES `abogado` (`Dni`),
  ADD CONSTRAINT `abogadocaso_ibfk_2` FOREIGN KEY (`NumExpediente`) REFERENCES `casojuicio` (`NumExpediente`);

--
-- Filtros para la tabla `casojuicio`
--
ALTER TABLE `casojuicio`
  ADD CONSTRAINT `casojuicio_ibfk_1` FOREIGN KEY (`DniCliente`) REFERENCES `cliente` (`Dni`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
