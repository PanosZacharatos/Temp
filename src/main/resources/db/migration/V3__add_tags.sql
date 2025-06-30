CREATE TABLE `store`.`tags` (
  `id` BIGINT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`id`));


 CREATE TABLE `store`.`user_tags` (
   `user_id` BIGINT NOT NULL,
   `tag_id` BIGINT NOT NULL,
   PRIMARY KEY (`user_id`, `tag_id`),
   CONSTRAINT `fk_user`
     FOREIGN KEY (`user_id`)
     REFERENCES `store`.`users` (`id`)
     ON DELETE NO ACTION
     ON UPDATE NO ACTION,
   CONSTRAINT `fk_tag`
     FOREIGN KEY (`tag_id`)
     REFERENCES `store`.`tags` (`id`)
     ON DELETE NO ACTION
     ON UPDATE NO ACTION
 );
