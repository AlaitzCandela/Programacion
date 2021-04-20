-- phpMyAdmin SQL Dump
-- version 4.7.5
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 20-04-2021 a las 09:40:02
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
-- Base de datos: `practica1_ejercicio2_p`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empresa`
--

CREATE TABLE `empresa` (
  `NombreEmpresa` varchar(20) NOT NULL,
  `Direccion` varchar(20) NOT NULL,
  `NIF` int(9) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `empresa`
--

INSERT INTO `empresa` (`NombreEmpresa`, `Direccion`, `NIF`) VALUES
('Aaaaaaaa', 'Aaaaaaaaaa', 111111126),
('Aaaaaaaaa', 'Aaaaaaaa', 123456789),
('Sssssssssss', 'Sssssssssss', 123457896);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `evento`
--

CREATE TABLE `evento` (
  `Nombre` varchar(20) NOT NULL,
  `Lugar` varchar(20) NOT NULL,
  `Fecha` date DEFAULT NULL,
  `HoraInicio` time NOT NULL,
  `HoraFin` time NOT NULL,
  `Aforo` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `evento`
--

INSERT INTO `evento` (`Nombre`, `Lugar`, `Fecha`, `HoraInicio`, `HoraFin`, `Aforo`) VALUES
('Goya', 'Mendizorroza', '2021-06-15', '16:00:00', '21:00:00', 245);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona`
--

CREATE TABLE `persona` (
  `Nombre` varchar(20) NOT NULL,
  `Apellido` varchar(20) NOT NULL,
  `Dni` varchar(9) NOT NULL,
  `NIF` int(9) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `persona`
--

INSERT INTO `persona` (`Nombre`, `Apellido`, `Dni`, `NIF`) VALUES
('Aaaaaaaa', 'Aaaaaaaaa', '11111111A', 111111126),
('Aaaaaaaaaaaa', 'Aaaaaaaaaa', '11111235S', 123457896),
('Alaitz', 'Candela', '12345678A', 123456789);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `personaevento`
--

CREATE TABLE `personaevento` (
  `DNI` varchar(20) NOT NULL,
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
-- Indices de la tabla `evento`
--
ALTER TABLE `evento`
  ADD PRIMARY KEY (`Nombre`);

--
-- Indices de la tabla `persona`
--
ALTER TABLE `persona`
  ADD PRIMARY KEY (`Dni`),
  ADD KEY `NIF` (`NIF`);

--
-- Indices de la tabla `personaevento`
--
ALTER TABLE `personaevento`
  ADD PRIMARY KEY (`DNI`,`NombreEvento`),
  ADD KEY `NombreEvento` (`NombreEvento`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `persona`
--
ALTER TABLE `persona`
  ADD CONSTRAINT `persona_ibfk_1` FOREIGN KEY (`NIF`) REFERENCES `empresa` (`NIF`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `personaevento`
--
ALTER TABLE `personaevento`
  ADD CONSTRAINT `personaevento_ibfk_1` FOREIGN KEY (`NombreEvento`) REFERENCES `evento` (`Nombre`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `personaevento_ibfk_2` FOREIGN KEY (`DNI`) REFERENCES `persona` (`Dni`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
