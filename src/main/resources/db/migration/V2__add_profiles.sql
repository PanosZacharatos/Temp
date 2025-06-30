CREATE TABLE `store`.`profiles` (
  `id` BIGINT NOT NULL,
	`bio` VARCHAR(255) NULL,
  `phone_number` VARCHAR(255) NULL,
  `date_of_birth` DATETIME NULL,
  `loyalty_points` INT UNSIGNED NULL DEFAULT 0,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_profiles_user`
    FOREIGN KEY (`id`)
    REFERENCES `store`.`users` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION);