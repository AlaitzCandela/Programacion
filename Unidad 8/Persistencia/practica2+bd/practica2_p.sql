-- phpMyAdmin SQL Dump
-- version 4.7.5
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 26-04-2021 a las 13:10:19
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
-- Base de datos: `practica2_p`
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
('11111111L', 'Llllllllll', 'Llllllllll', 'Llllllll'),
('12345678A', 'Aaaa', 'Aaab', 'Aaaaa');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `abogadocaso`
--

CREATE TABLE `abogadocaso` (
  `NumExp` int(4) NOT NULL,
  `DniAbogado` varchar(9) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `casojuicio`
--

CREATE TABLE `casojuicio` (
  `NumExp` int(4) NOT NULL,
  `FechaInicio` date NOT NULL,
  `FechaFin` date DEFAULT NULL,
  `Estado` varchar(20) NOT NULL,
  `DniCliente` varchar(9) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

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
('12345678A', 'Aaaa', 'Aaaaa', 'Aaaaaaaaa', 123456780, 'Aaaaaa');

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
  ADD PRIMARY KEY (`NumExp`,`DniAbogado`),
  ADD KEY `DniAbogado` (`DniAbogado`);

--
-- Indices de la tabla `casojuicio`
--
ALTER TABLE `casojuicio`
  ADD PRIMARY KEY (`NumExp`),
  ADD KEY `DniCliente` (`DniCliente`),
  ADD KEY `DniCliente_2` (`DniCliente`);

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
  ADD CONSTRAINT `abogadocaso_ibfk_1` FOREIGN KEY (`DniAbogado`) REFERENCES `abogado` (`Dni`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `abogadocaso_ibfk_2` FOREIGN KEY (`NumExp`) REFERENCES `casojuicio` (`NumExp`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
