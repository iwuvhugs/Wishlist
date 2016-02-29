
CREATE TABLE IF NOT EXISTS `PRODUCT` (
  `id_product` int(11) NOT NULL AUTO_INCREMENT,
  `product_name` varchar(255) NOT NULL,
  `description` varchar(255) NOT NULL,
  `price` decimal(10,0) NOT NULL,
  `link` varchar(3000) NOT NULL,
  PRIMARY KEY (`id_product`)
);


CREATE TABLE IF NOT EXISTS `PRODUCT_LIST` (
  `id_wishlist` int(11) NOT NULL,
  `id_product` int(11) NOT NULL,
  `reserved` varchar(250) NOT NULL,
  `purchased` varchar(250) NOT NULL,
  PRIMARY KEY (`id_wishlist`,`id_product`),
  KEY `id_product` (`id_product`),
  KEY `id_wishlist` (`id_wishlist`)
);



CREATE TABLE IF NOT EXISTS `THEME` (
  `id_theme` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) NOT NULL,
  PRIMARY KEY (`id_theme`)
);


CREATE TABLE IF NOT EXISTS `USER` (
  `id_user` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(255) NOT NULL,
  `last_name` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  PRIMARY KEY (`id_user`)
);



CREATE TABLE IF NOT EXISTS `WISHLIST` (
  `id_wishlist` int(11) NOT NULL AUTO_INCREMENT,
  `id_user` int(11) NOT NULL,
  `id_theme` int(11) NOT NULL,
  PRIMARY KEY (`id_wishlist`),
  KEY `id_user` (`id_user`),
  KEY `id_theme` (`id_theme`)
);


ALTER TABLE `PRODUCT_LIST`
  ADD CONSTRAINT `PRODUCT_LIST_ibfk_1` FOREIGN KEY (`id_wishlist`) REFERENCES `WISHLIST` (`id_wishlist`),
  ADD CONSTRAINT `PRODUCT_LIST_ibfk_2` FOREIGN KEY (`id_product`) REFERENCES `PRODUCT` (`id_product`);


ALTER TABLE `WISHLIST`
  ADD CONSTRAINT `WISHLIST_ibfk_2` FOREIGN KEY (`id_theme`) REFERENCES `THEME` (`id_theme`),
  ADD CONSTRAINT `WISHLIST_ibfk_1` FOREIGN KEY (`id_user`) REFERENCES `USER` (`id_user`);


