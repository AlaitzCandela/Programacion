-- phpMyAdmin SQL Dump
-- version 4.7.5
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 19-03-2021 a las 16:24:10
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
-- Base de datos: `practica1_ejercicio2`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empresa`
--

CREATE TABLE `empresa` (
  `NombreEmpresa` varchar(20) NOT NULL,
  `Direccion` varchar(20) NOT NULL,
  `NIF` varchar(9) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `eventos`
--

CREATE TABLE `eventos` (
  `Nombre` varchar(20) NOT NULL,
  `Lugar` varchar(20) NOT NULL,
  `Fecha` date NOT NULL,
  `HoraInicio` time NOT NULL,
  `HoraFin` time NOT NULL,
  `Aforo` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `eventos`
--

INSERT INTO `eventos` (`Nombre`, `Lugar`, `Fecha`, `HoraInicio`, `HoraFin`, `Aforo`) VALUES
('Aaaaaaa', 'Aaaaaaa', '2012-12-12', '10:30:00', '11:30:00', 150),
('Goya', 'Mendizorroza', '2021-12-12', '10:30:00', '11:30:00', 120);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona`
--

CREATE TABLE `persona` (
  `NombrePersona` varchar(20) NOT NULL,
  `Apellido` varchar(20) NOT NULL,
  `Dni` varchar(9) NOT NULL,
  `nif` varchar(9) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `relacioneventopersona`
--

CREATE TABLE `relacioneventopersona` (
  `DNIPersona` varchar(20) NOT NULL,
  `NombreEvento` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `empresa`
--
ALTER TABLE `empresa`
  ADD PRIMARY KEY (`NIF`);

--
-- Indices de la tabla `eventos`
--
ALTER TABLE `eventos`
  ADD PRIMARY KEY (`Nombre`);

--
-- Indices de la tabla `persona`
--
ALTER TABLE `persona`
  ADD PRIMARY KEY (`Dni`),
  ADD KEY `nif` (`nif`);

--
-- Indices de la tabla `relacioneventopersona`
--
ALTER TABLE `relacioneventopersona`
  ADD PRIMARY KEY (`DNIPersona`,`NombreEvento`),
  ADD KEY `NombreEvento` (`NombreEvento`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `empresa`
--
ALTER TABLE `empresa`
  ADD CONSTRAINT `empresa_ibfk_1` FOREIGN KEY (`NIF`) REFERENCES `persona` (`Dni`);

--
-- Filtros para la tabla `persona`
--
ALTER TABLE `persona`
  ADD CONSTRAINT `persona_ibfk_1` FOREIGN KEY (`nif`) REFERENCES `empresa` (`NIF`);

--
-- Filtros para la tabla `relacioneventopersona`
--
ALTER TABLE `relacioneventopersona`
  ADD CONSTRAINT `relacioneventopersona_ibfk_1` FOREIGN KEY (`DNIPersona`) REFERENCES `persona` (`Dni`),
  ADD CONSTRAINT `relacioneventopersona_ibfk_2` FOREIGN KEY (`NombreEvento`) REFERENCES `eventos` (`Nombre`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
