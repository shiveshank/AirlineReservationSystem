-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.0.67-community-nt


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema unisoft
--

CREATE DATABASE IF NOT EXISTS unisoft;
USE unisoft;

--
-- Definition of table `students`
--

DROP TABLE IF EXISTS `students`;
CREATE TABLE `students` (
  `RollNumber` int(10) unsigned NOT NULL,
  `Name` varchar(45) NOT NULL,
  `Gender` varchar(45) NOT NULL,
  `Email` varchar(45) NOT NULL,
  `MobileNumber` varchar(45) NOT NULL,
  `Course` varchar(45) NOT NULL,
  PRIMARY KEY  (`RollNumber`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `students`
--

/*!40000 ALTER TABLE `students` DISABLE KEYS */;
INSERT INTO `students` (`RollNumber`,`Name`,`Gender`,`Email`,`MobileNumber`,`Course`) VALUES 
 (1,'Shiv','Female','shiv@gmail.com','969052943','Core Java'),
 (3,'Namita','Female','namita@gmail.com','9835442187','Adv Java'),
 (5,'Shiv','Female','shivesh@gmail.com','983544218','Adv Java'),
 (6,'Ankit','Male','ankit@gmail.com','9835442187','Core Java'),
 (9,'Shivesh','Male','shiveshank@gmail.com','9690529432','Core Java'),
 (10,'Shiv','Male','shivesh@gmail.com','9690529432','PHP'),
 (12,'Ank','Female','ank@gmail.com','9835442187','Core Java'),
 (14,'Shiv','Male','shivesh@gmail.com','98898779','PHP'),
 (15,'Shiv','Male','shiv@gmail.com','9690529432','PHP'),
 (16,'Shiv','Male','shiv@gmail.com','9897978','Andorid'),
 (19,'Shiv','Male','shiv@gmail.com','9690529432','PHP'),
 (20,'Shiv','Male','shiv@gmail.com','9690529432','PHP'),
 (21,'Ankit','Male','ankit@gmail.com','9690529432','Adv Java'),
 (22,'Rashmi','Female','rashmi@gmail.com','9690529432','Adv Java'),
 (23,'Shiv','Male','ankit@gmail.com','9690529432','Adv Java'),
 (24,'Rashmi','Female','rashmi@gmail.com','9690529432','Adv Java'),
 (25,'Rashmi','Female','rashmi@gmail.com','9905472032','PHP '),
 (26,'Ankit','Male','ank@gmail.com','9905472032','Adv Java'),
 (27,'Shubham','Male','shubham@gmail.com','9905472032','PHP '),
 (28,'Arjun','Male','arjun@gmail.com','9905472032','PHP '),
 (45,'Shiv','Male','shivant@gmail.com','98889099','JDBC'),
 (46,'Sandip','Male','sandip@gmail.com','8868788979','J2EE'),
 (47,'Ankit','Male','ankit@gmail.com','8979870709','Andorid'),
 (56,'Shiv','Male','shiv@gmail.com','9690529432','Core Java'),
 (90,'shiv','Male','shiv@gmail.com','768698797','PHP'),
 (1234567,'Neerav','Male','Neerav@gmail.com','9690529432','Core Java');
/*!40000 ALTER TABLE `students` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
