-- phpMyAdmin SQL Dump
-- version 4.4.14
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Apr 18, 2016 at 03:59 AM
-- Server version: 5.6.26
-- PHP Version: 5.6.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `wishlist`
--

-- --------------------------------------------------------

--
-- Table structure for table `PRODUCT`
--

CREATE TABLE IF NOT EXISTS `PRODUCT` (
  `id_product` int(11) NOT NULL,
  `product_name` varchar(255) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `price` decimal(10,0) DEFAULT NULL,
  `link` varchar(255) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `PRODUCT`
--

INSERT INTO `PRODUCT` (`id_product`, `product_name`, `description`, `price`, `link`) VALUES
(1, 'MacBook', '13 inch 256GB', '1400', 'apple.com'),
(2, 'MacBook Air', '11 inch 256GB', '1000', 'apple.com'),
(3, 'iPhone', 'new iphone 7 that is not released', '1000', 'apple.com'),
(4, 'car', 'for example BMW m3', '30000', 'bmw.com');

-- --------------------------------------------------------

--
-- Table structure for table `PRODUCT_LIST`
--

CREATE TABLE IF NOT EXISTS `PRODUCT_LIST` (
  `id_wishlist` int(11) NOT NULL,
  `id_product` int(11) NOT NULL,
  `reserved` char(1) NOT NULL DEFAULT 'F',
  `purchased` char(1) NOT NULL DEFAULT 'F'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `PRODUCT_LIST`
--

INSERT INTO `PRODUCT_LIST` (`id_wishlist`, `id_product`, `reserved`, `purchased`) VALUES
(2, 1, '', ''),
(2, 2, '', ''),
(2, 3, '', ''),
(2, 4, '', ''),
(3, 1, '', ''),
(3, 3, '', '');

-- --------------------------------------------------------

--
-- Table structure for table `THEME`
--

CREATE TABLE IF NOT EXISTS `THEME` (
  `id_theme` int(11) NOT NULL,
  `title` varchar(255) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `THEME`
--

INSERT INTO `THEME` (`id_theme`, `title`) VALUES
(1, 'Birthday'),
(2, 'Christmas');

-- --------------------------------------------------------

--
-- Table structure for table `USER`
--

CREATE TABLE IF NOT EXISTS `USER` (
  `id_user` int(11) NOT NULL,
  `first_name` varchar(255) NOT NULL,
  `last_name` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `USER`
--

INSERT INTO `USER` (`id_user`, `first_name`, `last_name`, `email`, `password`) VALUES
(1, 'Kirill', 'Suslov', 'kirill@email.com', '111111'),
(2, 'Seth', 'McEachran', 'seth@email.com', '111111'),
(3, 'Abdul', 'Fagbenro', 'abdul@email.com', '111111'),
(4, 'Elohor', 'Akporehe', 'elohor@mail.com', '111111');

-- --------------------------------------------------------

--
-- Table structure for table `WISHLIST`
--

CREATE TABLE IF NOT EXISTS `WISHLIST` (
  `id_wishlist` int(11) NOT NULL,
  `id_user` int(11) NOT NULL,
  `id_theme` int(11) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `WISHLIST`
--

INSERT INTO `WISHLIST` (`id_wishlist`, `id_user`, `id_theme`) VALUES
(2, 1, 1),
(3, 1, 2),
(4, 3, 1),
(6, 2, 2),
(17, 4, 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `PRODUCT`
--
ALTER TABLE `PRODUCT`
  ADD PRIMARY KEY (`id_product`);

--
-- Indexes for table `PRODUCT_LIST`
--
ALTER TABLE `PRODUCT_LIST`
  ADD KEY `id_product` (`id_product`),
  ADD KEY `id_wishlist` (`id_wishlist`);

--
-- Indexes for table `THEME`
--
ALTER TABLE `THEME`
  ADD PRIMARY KEY (`id_theme`);

--
-- Indexes for table `USER`
--
ALTER TABLE `USER`
  ADD PRIMARY KEY (`id_user`);

--
-- Indexes for table `WISHLIST`
--
ALTER TABLE `WISHLIST`
  ADD PRIMARY KEY (`id_wishlist`),
  ADD KEY `id_user` (`id_user`),
  ADD KEY `id_theme` (`id_theme`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `PRODUCT`
--
ALTER TABLE `PRODUCT`
  MODIFY `id_product` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `THEME`
--
ALTER TABLE `THEME`
  MODIFY `id_theme` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `USER`
--
ALTER TABLE `USER`
  MODIFY `id_user` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `WISHLIST`
--
ALTER TABLE `WISHLIST`
  MODIFY `id_wishlist` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=18;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `PRODUCT_LIST`
--
ALTER TABLE `PRODUCT_LIST`
  ADD CONSTRAINT `PRODUCT_LIST_ibfk_1` FOREIGN KEY (`id_wishlist`) REFERENCES `WISHLIST` (`id_wishlist`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `PRODUCT_LIST_ibfk_2` FOREIGN KEY (`id_product`) REFERENCES `PRODUCT` (`id_product`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `WISHLIST`
--
ALTER TABLE `WISHLIST`
  ADD CONSTRAINT `WISHLIST_ibfk_1` FOREIGN KEY (`id_user`) REFERENCES `USER` (`id_user`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `WISHLIST_ibfk_2` FOREIGN KEY (`id_theme`) REFERENCES `THEME` (`id_theme`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
