DROP TABLE IF EXISTS `sna`.`usuario`;
CREATE TABLE  `sna`.`usuario` (
  `id` INTEGER NOT NULL auto_increment,
  `email` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `rol` varchar(255) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

INSERT INTO usuario (email, password, rol) VALUES ("admin", "admin", "ADMIN");
INSERT INTO usuario (email, password, rol) VALUES ("pepe", "pepe", "ANALISTA");