SELECT * FROM customer.customer;
CREATE TABLE `customer`.`customer` (
  `id` INT NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  `career` VARCHAR(45) NOT NULL,
  `customercol` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`));


INSERT INTO `customer`.`customer` (`id`, `name`, `career`) VALUES ('1', 'thanh', 'tu do');
INSERT INTO `customer`.`customer` (`id`, `name`, `career`) VALUES ('2', 'linh', 'tu do');