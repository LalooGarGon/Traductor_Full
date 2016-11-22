-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 21-11-2016 a las 05:15:41
-- Versión del servidor: 10.1.16-MariaDB
-- Versión de PHP: 5.6.24

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `traductor`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `nombre` varchar(30) NOT NULL,
  `apellido` varchar(30) NOT NULL,
  `edad` int(20) NOT NULL,
  `nomUsuario` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL,
  `correo` varchar(30) NOT NULL,
  `nivel` int(20) NOT NULL,
  `foto` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`nombre`, `apellido`, `edad`, `nomUsuario`, `password`, `correo`, `nivel`, `foto`) VALUES
('Jose Eduardo', 'Garcia', 19, 'Lalouw', '05121996', 'joseeduardogg@hotmail.com', 76, 'img9.jpg'),
('Maricarmen', 'Campos', 22, 'Maly', 'Maly', 'mari@hotmail.com', 14, 'img1.jpg'),
('Paola', 'Lopez', 20, 'Pao', 'Pao', 'pao@gmail', 1, 'img17.jpg'),
('Jorge', 'Perez', 24, 'jorge', '123', 'jorge@gmail', 148, 'jorge_img9.jpg'),
('Pedro', 'Garcia', 26, 'pedro', '123', 'pedro@hotmail.com', 16, 'pedro_img17.jpg'),
('Andres', 'Gonzalez', 26, 'andres', '123', 'dsvhgkj', 1, 'andres_img9.jpg'),
('Alexis', 'Alva', 20, 'Alexis', 'Alexis', 'alexis@hotmail.com', 18, 'Alexis_img1.jpg');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
