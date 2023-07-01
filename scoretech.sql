-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 01-07-2023 a las 17:42:44
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `scoretech`
--
CREATE DATABASE IF NOT EXISTS `scoretech` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `scoretech`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alumno`
--

CREATE TABLE `alumno` (
  `id_alumno` int(11) NOT NULL,
  `nombre` varchar(25) NOT NULL,
  `apellidos` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `alumno`
--

INSERT INTO `alumno` (`id_alumno`, `nombre`, `apellidos`) VALUES
(1, 'Luis Axel', 'Rovira Macario'),
(2, 'Jonathan Salvador', 'Hernández Santos'),
(3, 'Víctor José', 'Cruz Xala'),
(4, 'Eduardo Abisai', 'Toto Bautista'),
(5, 'Leonardo', 'Hernández Azamar'),
(6, 'Ángel', 'Hernández López'),
(7, 'Óscar', 'Peña Hernández'),
(8, 'Pamela', 'Paredes Méndez'),
(9, 'Héctor', 'Barrera Romero'),
(10, 'Lucía Luisa', 'Gallardo Barrera'),
(11, 'Félix Manuel', 'Jiménez Méndez'),
(12, 'Tomás', 'Fernández Paredes'),
(13, 'Ernesto Arturo', 'Méndez Fuentes'),
(14, 'Pedro Hugo', 'Álvarez Molina'),
(15, 'Verónica Guadalupe', 'Méndez Montes'),
(16, 'Gabriela', 'Acosta Pérez'),
(17, 'Montserrat', 'Ruiz Álvarez'),
(18, 'Andrés', 'Peña Méndez'),
(19, 'Alejandro', 'Delgado Escobar'),
(20, 'Arturo Ricardo', 'Aguilar Mora'),
(21, 'Rafael', 'Jiménez Acosta'),
(22, 'Ángela Beatriz', 'Torres Romero'),
(23, 'Verónica', 'Delgado López'),
(24, 'Maximiliano', 'Gómez Montes'),
(25, 'Paula', 'Torres Méndez');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `calificacion`
--

CREATE TABLE `calificacion` (
  `id_alumno` int(11) NOT NULL,
  `id_materia` int(11) NOT NULL,
  `promedio` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `calificacion`
--

INSERT INTO `calificacion` (`id_alumno`, `id_materia`, `promedio`) VALUES
(1, 1, 99.9),
(2, 1, 65),
(3, 1, 45),
(4, 1, 75),
(5, 1, 90),
(11, 1, 79),
(14, 1, 99.6);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `materia`
--

CREATE TABLE `materia` (
  `id_materia` int(11) NOT NULL,
  `nombre` varchar(30) NOT NULL,
  `id_usuario` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `materia`
--

INSERT INTO `materia` (`id_materia`, `nombre`, `id_usuario`) VALUES
(1, 'Informática', 3),
(2, 'Inglés', 4),
(3, 'Arte y Música', 3),
(4, 'Geografía', 4);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `materia_alumno`
--

CREATE TABLE `materia_alumno` (
  `id_materia` int(11) NOT NULL,
  `id_alumno` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `materia_alumno`
--

INSERT INTO `materia_alumno` (`id_materia`, `id_alumno`) VALUES
(1, 2),
(1, 3),
(1, 4),
(1, 5),
(3, 15),
(3, 16),
(3, 17),
(3, 18),
(3, 19),
(3, 20),
(3, 21),
(3, 22),
(3, 23),
(1, 1),
(1, 11),
(1, 12),
(1, 13),
(1, 14),
(3, 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `id_usuario` int(11) NOT NULL,
  `usuario` varchar(20) NOT NULL,
  `contrasena` varchar(15) NOT NULL,
  `nombre` varchar(20) NOT NULL,
  `apellidos` varchar(30) NOT NULL,
  `puesto` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`id_usuario`, `usuario`, `contrasena`, `nombre`, `apellidos`, `puesto`) VALUES
(1, 'admin_scoretech', 'root123', 'ScoreTech', 'Administrador', 'Administrador'),
(2, 'EMMÉVADOC', 'XAmdlQm', 'Emilia', 'Méndez Vargas', 'Docente'),
(3, 'LUCHSIDOC', 'P8O5mSA', 'Luis Axel', 'Chávez Silva', 'Docente'),
(4, 'JIORDEDOC', 'UyImCye', 'Jimena', 'Orozco Delgado', 'Docente'),
(5, 'RAGOCADOC', 'tc09bv9', 'Raul', 'González Campos', 'Docente');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `alumno`
--
ALTER TABLE `alumno`
  ADD PRIMARY KEY (`id_alumno`);

--
-- Indices de la tabla `calificacion`
--
ALTER TABLE `calificacion`
  ADD KEY `FK_1` (`id_alumno`),
  ADD KEY `FK_2` (`id_materia`);

--
-- Indices de la tabla `materia`
--
ALTER TABLE `materia`
  ADD PRIMARY KEY (`id_materia`),
  ADD KEY `FK_1` (`id_usuario`);

--
-- Indices de la tabla `materia_alumno`
--
ALTER TABLE `materia_alumno`
  ADD KEY `FK_1` (`id_materia`),
  ADD KEY `FK_2` (`id_alumno`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id_usuario`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `alumno`
--
ALTER TABLE `alumno`
  MODIFY `id_alumno` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;

--
-- AUTO_INCREMENT de la tabla `materia`
--
ALTER TABLE `materia`
  MODIFY `id_materia` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `id_usuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `calificacion`
--
ALTER TABLE `calificacion`
  ADD CONSTRAINT `FK_2` FOREIGN KEY (`id_alumno`) REFERENCES `alumno` (`id_alumno`) ON DELETE CASCADE ON UPDATE NO ACTION,
  ADD CONSTRAINT `FK_3` FOREIGN KEY (`id_materia`) REFERENCES `materia` (`id_materia`) ON DELETE CASCADE ON UPDATE NO ACTION;

--
-- Filtros para la tabla `materia`
--
ALTER TABLE `materia`
  ADD CONSTRAINT `FK_1` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id_usuario`) ON DELETE CASCADE ON UPDATE NO ACTION;

--
-- Filtros para la tabla `materia_alumno`
--
ALTER TABLE `materia_alumno`
  ADD CONSTRAINT `FK_4` FOREIGN KEY (`id_materia`) REFERENCES `materia` (`id_materia`) ON DELETE CASCADE ON UPDATE NO ACTION,
  ADD CONSTRAINT `FK_5` FOREIGN KEY (`id_alumno`) REFERENCES `alumno` (`id_alumno`) ON DELETE CASCADE ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
