-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 21-11-2016 a las 05:15:32
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
-- Estructura de tabla para la tabla `palabras`
--

CREATE TABLE `palabras` (
  `nivel` int(10) NOT NULL,
  `tipo` varchar(30) NOT NULL,
  `spanish` varchar(30) NOT NULL,
  `english` varchar(30) NOT NULL,
  `imagen` varchar(30) NOT NULL,
  `audio` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `palabras`
--

INSERT INTO `palabras` (`nivel`, `tipo`, `spanish`, `english`, `imagen`, `audio`) VALUES
(1, 'color', 'Negro', 'Black', 'Black.jpg', 'black.mp3'),
(1, 'color', 'Azul', 'Blue', 'Blue.jpg', 'blue.mp3'),
(1, 'color', 'Cafe', 'Brown', 'Brown.jpg', 'brown.mp3'),
(1, 'color', 'Gris', 'Gray', 'Gray.jpg', 'gray.mp3'),
(1, 'color', 'Verde', 'Green', 'Green.jpg', 'green.mp3'),
(1, 'color', 'Rosa', 'Pink', 'Pink.jpg', 'pink.mp3'),
(1, 'color', 'Morado', 'Purple', 'Purple.jpg', 'purple.mp3'),
(1, 'color', 'Rojo', 'Red', 'Red.jpg', 'red.mp3'),
(1, 'color', 'Violeta', 'Violet', 'Violet.jpg', 'violet.mp3'),
(1, 'color', 'Blanco', 'White', 'White.jpg', 'white.mp3'),
(1, 'color', 'Amarillo', 'Yellow', 'Yellow.jpg', 'yellow.mp3'),
(2, 'animal', 'Antilope', 'Antelope', 'Antelope.jpg', 'Antelope.ogg'),
(1, 'animal', 'Murcielago', 'Bat', 'Bat.jpg', 'Bat.ogg'),
(1, 'animal', 'Oso', 'Bear', 'Bear.jpg', 'Bear.ogg'),
(1, 'animal', 'Toro', 'Bull', 'Bull.jpg', 'Bull.ogg'),
(2, 'animal', 'Camello', 'Camel', 'Camel.jpg', 'Camel.ogg'),
(1, 'animal', 'Gato', 'Cat', 'Cat.jpg', 'Cat.ogg'),
(1, 'animal', 'Vaca', 'Cow', 'Cow.jpg', 'Cow.ogg'),
(1, 'animal', 'Perro', 'Dog', 'Dog.jpg', 'Dog.ogg'),
(1, 'animal', 'Burro', 'Donkey', 'Donkey.jpg', 'Donkey.ogg'),
(1, 'animal', 'Pato', 'Duck', 'Duck.jpg', 'Duck.ogg'),
(2, 'animal', 'Cabra', 'Goat', 'Goat.jpg', 'Goat.ogg'),
(2, 'animal', 'Ganso', 'Goose', 'Goose.jpg', 'Goose.mp3'),
(2, 'animal', 'Gallina', 'Hen', 'Hen.jpg', 'Hen.ogg'),
(1, 'animal', 'Caballo', 'Horse', 'Horse.jpg', 'Horse.ogg'),
(2, 'animal', 'Yegua', 'Mare', 'Mare.jpg', 'Mare.ogg'),
(1, 'animal', 'Cerdo', 'Pig', 'Pig.jpg', 'Pig.ogg'),
(2, 'animal', 'Reno', 'Reindeer', 'Reindeer.jpg', 'Reindeer.ogg'),
(2, 'animal', 'Gallo', 'Rooster', 'Rooster.jpg', 'Rooster.ogg'),
(3, 'flor', 'Begonia', 'Begonia', 'Begonia.jpg', 'begonia.mp3'),
(3, 'flor', 'Campanilla', 'Bluebell', 'Bluebell.jpg', 'bluebell.mp3'),
(3, 'flor', 'Clavel', 'Carnation', 'Carnation.jpg', 'carnation.mp3'),
(3, 'flor', 'Narciso', 'Daffodil', 'Daffodil.jpg', 'daffodil.mp3'),
(3, 'flor', 'Dalia', 'Dahlia', 'Dahlia.jpg', 'dahlia.mp3'),
(3, 'flor', 'Margarita', 'Daisy', 'Daisy.jpg', 'daisy.mp3'),
(3, 'flor', 'Gardenia', 'Gardenia', 'Gardenia.jpg', 'gardenia.mp3'),
(3, 'flor', 'Gladiola', 'Gladiolus', 'Gladiolus.jpg', 'gladiolus.mp3'),
(4, 'flor', 'Jacinto', 'Hyacinth', 'Hyacinth.jpg', 'hyacinth.mp3'),
(4, 'flor', 'Hortensia', 'Hydrangea', 'Hydrangea.jpg', 'hydrangea.mp3'),
(3, 'flor', 'Lavanda', 'Lavender', 'Lavender.jpg', 'lavender.mp3'),
(3, 'flor', 'Lirio', 'Lily', 'Lily.jpg', 'lily.mp3'),
(3, 'flor', 'Magnolia', 'Magnolia', 'Magnolia.jpg', 'magnolia.mp3'),
(4, 'flor', 'Orquidea', 'Orchid', 'Orchid.jpg', 'orchid.mp3'),
(4, 'flor', 'Pensamiento', 'Pansy', 'Pansy.jpg', 'pansy.mp3'),
(3, 'flor', 'Petunia', 'Petunia', 'Petunia.jpg', 'petunia.mp3'),
(3, 'flor', 'Rosa', 'Rose', 'Rose.jpg', 'rose.mp3'),
(3, 'flor', 'Tulipan', 'Tulip', 'Tulip.jpg', 'tulip.mp3'),
(1, 'fruta', 'Manzana', 'Apple', 'Apple.jpg', 'Apple.ogg'),
(1, 'fruta', 'Platano', 'Banana', 'Banana.jpg', 'Banana.ogg'),
(2, 'fruta', 'Mora', 'Blackberry', 'Blackberry.jpg', 'Blackberry.ogg'),
(1, 'fruta', 'Cereza', 'Cherry', 'Cherry.jpg', 'Cherry.ogg'),
(2, 'fruta', 'Coco', 'Coconut', 'Coconut.jpg', 'Coconut.ogg'),
(1, 'fruta', 'Uva', 'Grape', 'Grape.jpg', 'Grape.ogg'),
(1, 'fruta', 'Limon', 'Lemon', 'Lemon.jpg', 'Lemon.ogg'),
(1, 'fruta', 'Melon', 'Melon', 'Melon.jpg', 'Melon.ogg'),
(1, 'fruta', 'Naranja', 'Orange', 'Orange1.jpg', 'Orange.ogg'),
(1, 'fruta', 'Durazno', 'Peach', 'Peach.jpg', 'Peach.ogg'),
(1, 'fruta', 'Pera', 'Pear', 'Pear.jpg', 'Pear.ogg'),
(1, 'fruta', 'Piña', 'Pineapple', 'Pineapple.jpg', 'Pineapple.ogg'),
(2, 'fruta', 'Ciruela', 'Plum', 'Plum.jpg', 'Plum.ogg'),
(2, 'fruta', 'Granada', 'Pomegranate', 'Pomegranate.jpg', 'Pomegranate.ogg'),
(2, 'fruta', 'Frambuesa', 'Raspberry', 'Raspberry.jpg', 'Raspberry.ogg'),
(1, 'fruta', 'Fresa', 'Strawberry', 'Strawberry.jpg', 'Strawberry.ogg'),
(1, 'fruta', 'Sandia', 'Watermelon', 'Watermelon.jpg', 'Watermelon.ogg'),
(3, 'familia', 'Tia', 'Aunt', 'Aunt.jpg', 'aunt.mp3'),
(1, 'familia', 'Papá', 'Dad', 'Dad.jpg', 'dad.mp3'),
(2, 'familia', 'Hija', 'Daughter', 'Daughter.jpg', 'daughter.mp3'),
(1, 'familia', 'Abuelo', 'Grandfather', 'Grandfather.jpg', 'grandfather.mp3'),
(1, 'familia', 'Abuela', 'Grandmother', 'Grandmother.jpg', 'grandmother.mp3'),
(1, 'familia', 'Mamá', 'Mom', 'Mom.jpg', 'mom.mp3'),
(2, 'familia', 'Hijo', 'Son', 'Son.jpg', 'son.mp3'),
(3, 'familia', 'Tio', 'Uncle', 'Uncle.jpg', 'uncle.mp3'),
(4, 'casa', 'Bañera', 'Bathtub', 'Bathtub.jpg', 'Bathtub.mp3'),
(2, 'casa', 'Cama', 'Bed', 'Bed.jpg', 'bed.mp3'),
(3, 'casa', 'Closet', 'Closet', 'Closet.jpg', 'Closet.mp3'),
(3, 'casa', 'Cortinas', 'Curtains', 'Curtains.jpg', 'Curtains.mp3'),
(3, 'casa', 'Lampara', 'Lamp', 'Lamp.jpg', 'Lamp.mp3'),
(2, 'casa', 'Espejo', 'Mirror', 'Mirror.jpg', 'Mirror.mp3'),
(3, 'casa', 'Almohada', 'Pillow', 'Pillow.jpg', 'Pillow.mp3'),
(2, 'casa', 'Ducha', 'Shower', 'Shower.jpg', 'Shower.mp3'),
(2, 'casa', 'Baño', 'Toilet', 'Toilet.jpg', 'Toilet.mp3'),
(4, 'casa', 'Lavabo', 'Washbasin', 'Washbasin.jpg', 'Washbasin.mp3'),
(5, 'verbo', 'Caminar', 'Walk', 'Walk.jpg', 'Walk.mp3'),
(5, 'verbo', 'Comer', 'Eat', 'Eat.jpg', 'Eat.mp3'),
(6, 'verbo', 'Cantar', 'Sing', 'Sing.jpg', 'Sing.mp3'),
(6, 'verbo', 'Nadar', 'Swim', 'Swim.jpg', 'Swim.mp3'),
(9, 'verbo', 'Pegar', 'Hit', 'Hit.jpg', 'Hit.mp3'),
(6, 'verbo', 'Saltar', 'Jump', 'Jump.jpg', 'Jump.mp3'),
(9, 'verbo', 'Aplaudir', 'Applaud', 'Applaud.jpg', 'Applaud.mp3'),
(5, 'verbo', 'Beber', 'Drink', 'Drink.jpg', 'Drink.mp3'),
(5, 'verbo', 'Jugar', 'Play', 'Play.jpg', 'Play.mp3'),
(5, 'verbo', 'Leer', 'Read', 'Read.jpg', 'Read.mp3'),
(9, 'verbo', 'Subir', 'Climb', 'Climb.jpg', 'Climb.mp3'),
(5, 'verbo', 'Escribir', 'Write', 'Write.jpg', 'Write.mp3'),
(7, 'verbo', 'Contar', 'Count', 'Count.jpg', 'Count.mp3'),
(5, 'verbo', 'Dormir', 'Sleep', 'Sleep.jpg', 'Sleep.mp3'),
(10, 'verbo', 'Bostezar', 'Yawn', 'Yawn.jpg', 'Yawn.mp3'),
(8, 'verbo', 'Empujar', 'Push', 'Push.jpg', 'Push.mp3'),
(6, 'verbo', 'Cocinar', 'Cook', 'Cook.jpg', 'Cook.mp3'),
(5, 'verbo', 'Abrir', 'Open', 'Open.jpg', 'Open.mp3'),
(6, 'verbo', 'Manejar', 'Drive', 'Drive.jpg', 'Drive.mp3'),
(6, 'verbo', 'Bailar', 'Dance', 'Dance.jpg', 'Dance.mp3'),
(6, 'verbo', 'Cortar', 'Cut', 'Cut.jpg', 'Cut.mp3'),
(6, 'verbo', 'Dibujar', 'Draw', 'Draw.jpg', 'Draw.mp3'),
(6, 'verbo', 'Volar', 'Fly', 'Fly.jpg', 'Fly.mp3'),
(5, 'verbo', 'Estudiar', 'Study', 'Study.jpg', 'Study.mp3'),
(8, 'verbo', 'Despertar', 'Awake', 'Awake.jpg', 'Awake.mp3'),
(8, 'verbo', 'Empezar', 'Begin', 'Begin.jpg', 'Begin.mp3'),
(9, 'verbo', 'Doblar', 'Bend', 'Bend.jpg', 'Bend.mp3'),
(10, 'verbo', 'Apostar', 'Bet', 'Bet.jpg', 'Bet.mp3'),
(9, 'verbo', 'Morder', 'Bite', 'Bite.jpg', 'Bite.mp3'),
(9, 'verbo', 'Sangrar', 'Bleed', 'Bleed.jpg', 'Bleed.mp3'),
(9, 'verbo', 'Soplar', 'Blow', 'Blow.jpg', 'Blow.mp3'),
(7, 'verbo', 'Romper', 'Break', 'Break.jpg', 'Break,mp3'),
(7, 'verbo', 'Traer', 'Bring', 'Bring.jpg', 'Bring.mp3'),
(7, 'verbo', 'Construir', 'Build', 'Build.jpg', 'Build.mp3'),
(8, 'verbo', 'Quemar', 'Burn', 'Burn.jpg', 'Burn.mp3'),
(9, 'verbo', 'Estallar', 'Burst', 'Burst.jpg', 'Burst.mp3'),
(7, 'verbo', 'Comprar', 'Buy', 'Buy.jpg', 'Buy.mp3'),
(8, 'verbo', 'Atrapar', 'Catch', 'Catch.jpg', 'Catch.mp3'),
(8, 'verbo', 'Elegir', 'Choose', 'Choose.jpg', 'Choose.mp3'),
(10, 'verbo', 'Aferrarse', 'Cling', 'Cling.jpg', 'Cling.mp3'),
(6, 'verbo', 'Venir', 'Come', 'Come.jpg', 'Come.mp3'),
(10, 'verbo', 'Arrastrar', 'Creep', 'Creep.jpg', 'Creep.mp3'),
(7, 'verbo', 'Caer', 'Fall', 'Fall.jpg', 'Fall.mp3'),
(10, 'verbo', 'Alimentar', 'Feed', 'Feed.jpg', 'Feed.mp3'),
(7, 'verbo', 'Encontrar', 'Find', 'Find.jpg', 'Find.mp3'),
(10, 'verbo', 'Prohibir', 'Forbid', 'Forbid.jpg', 'Forbid.mp3'),
(7, 'verbo', 'Olvidar', 'Forget', 'Forget.jpg', 'Forget.mp3'),
(10, 'verbo', 'Huir', 'Flee', 'Flee.jpg', 'Flee.mp3'),
(8, 'verbo', 'Perdonar', 'Forgive', 'Forgive.jpg', 'Forgive.mp3'),
(8, 'verbo', 'Crecer', 'Grow', 'Grow.jpg', 'Grow.mp3'),
(10, 'verbo', 'Colgar', 'Hang', 'Hang.jpg', 'Hang.mp3'),
(7, 'verbo', 'Escuchar', 'Hear', 'Hear.jpg', 'Hear.mp3'),
(9, 'verbo', 'Arrodillarse', 'Kneel', 'Kneel.jpg', 'Kneel.mp3'),
(10, 'verbo', 'Brincar', 'Leap', 'Leap.jpg', 'Leap.mp3'),
(6, 'verbo', 'Aprender', 'Learn', 'Learn.jpg', 'Learn.mp3'),
(6, 'verbo', 'Hacer', 'Make', 'Make.jpg', 'Make.mp3'),
(6, 'verbo', 'Pagar', 'Pay', 'Pay.jpg', 'Pay.mp3'),
(7, 'verbo', 'Poner', 'Put', 'Put.jpg', 'Put.mp3'),
(6, 'verbo', 'Montar', 'Ride', 'Ride.jpg', 'Ride.mp3'),
(8, 'verbo', 'Sonar', 'Ring', 'Ring.jpg', 'Ring.mp3'),
(5, 'verbo', 'Correr', 'Run', 'Run.jpg', 'Run.mp3'),
(5, 'verbo', 'Decir', 'Say', 'Say.jpg', 'Say.mp3'),
(5, 'verbo', 'Ver', 'See', 'See.jpg', 'See.mp3'),
(8, 'verbo', 'Vender', 'Sell', 'Sell.jpg', 'Sell.mp3'),
(10, 'verbo', 'Hundir', 'Sink', 'Sink.jpg', 'Sink.mp3'),
(7, 'verbo', 'Sentar', 'Sit', 'Sit.jpg', 'Sit.mp3'),
(10, 'verbo', 'Resbalar', 'Slide', 'Slide.jpg', 'Slide.mp3'),
(9, 'verbo', 'Deletrear', 'Spell', 'Spell.jpg', 'Spell.mp3');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
