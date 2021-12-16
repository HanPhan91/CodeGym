
CREATE TABLE `customer` (
  `cID` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `cAge` tinyint NOT NULL,
  PRIMARY KEY (`cID`)
);
CREATE TABLE `order` (
  `oID` int NOT NULL AUTO_INCREMENT,
  `cID` int NOT NULL,
  `oDate` datetime NOT NULL,
  `oTotalPrice` int DEFAULT NULL,
  PRIMARY KEY (`oID`),
  KEY `cID_key_idx` (`cID`),
  CONSTRAINT `cID_key` FOREIGN KEY (`cID`) REFERENCES `customer` (`cID`)
) ;
CREATE TABLE `orderdetail` (
  `oID` int NOT NULL AUTO_INCREMENT,
  `pID` int NOT NULL,
  `odQTY` int NOT NULL,
  PRIMARY KEY (`oID`),
  KEY `pID_key_idx` (`pID`),
  CONSTRAINT `pID_key` FOREIGN KEY (`pID`) REFERENCES `product` (`pID`)
);
CREATE TABLE `product` (
  `pID` int NOT NULL AUTO_INCREMENT,
  `pName` varchar(45) NOT NULL,
  `pPrice` int NOT NULL,
  PRIMARY KEY (`pID`)
);