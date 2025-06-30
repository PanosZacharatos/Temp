 CREATE TABLE `store`.`wishlist` (
   `user_id` BIGINT NOT NULL,
   `product_id` BIGINT NOT NULL,
   PRIMARY KEY (`user_id`, `product_id`),
   INDEX `idx_user_id` (`user_id`),
   INDEX `idx_product_id` (`product_id`),
   CONSTRAINT `fk_wishlist_user`
     FOREIGN KEY (`user_id`)
     REFERENCES `store`.`users` (`id`)
     ON DELETE NO ACTION
     ON UPDATE NO ACTION,
   CONSTRAINT `fk_wishlist_product`
     FOREIGN KEY (`product_id`)
     REFERENCES `store`.`products` (`id`)
     ON DELETE NO ACTION
     ON UPDATE NO ACTION
 );