-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 13, 2017 at 01:09 PM
-- Server version: 5.7.14
-- PHP Version: 5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `factorymanagementsys`
--

-- --------------------------------------------------------

--
-- Table structure for table `products`
--

CREATE TABLE `products` (
  `pid` int(10) NOT NULL,
  `pname` varchar(50) NOT NULL,
  `pquantity` int(10) NOT NULL,
  `pprice_of_carton` int(10) NOT NULL,
  `pexp_date` varchar(20) NOT NULL,
  `ppro_date` varchar(20) NOT NULL,
  `pfavor` varchar(50) NOT NULL,
  `ptype` varchar(50) DEFAULT NULL,
  `pmade_from` varchar(150) DEFAULT NULL,
  `Diet` tinyint(1) NOT NULL,
  `pwhight_of_carton` float DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `products`
--

INSERT INTO `products` (`pid`, `pname`, `pquantity`, `pprice_of_carton`, `pexp_date`, `ppro_date`, `pfavor`, `ptype`, `pmade_from`, `Diet`, `pwhight_of_carton`) VALUES
(7, 'Fanta', 1000, 16, '12/6/2018', '12/12/2017', 'Orange', 'Drink', 'soda w', 0, NULL),
(6, 'aaaaa', 111, 21, '21/2/2019', '21/2/2018', 'dasda', 'Drink', 'aaaaassssssdddd sda', 0, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `productsmanger`
--

CREATE TABLE `productsmanger` (
  `mid` int(11) NOT NULL,
  `mname` varchar(50) NOT NULL,
  `mdate_of_barth` varchar(50) NOT NULL,
  `mphone_number` varchar(20) NOT NULL,
  `memail` varchar(100) NOT NULL,
  `muser_name` varchar(50) NOT NULL,
  `mpassword` varchar(100) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `productsmanger`
--

INSERT INTO `productsmanger` (`mid`, `mname`, `mdate_of_barth`, `mphone_number`, `memail`, `muser_name`, `mpassword`) VALUES
(1, 'Ayman Ayyad', '24/9/1996', '0597690292', 'ayman@adil.ayyad', 'ayman@ayyad', '123456'),
(5, 'Anas', '12/12/1998', '059785858', 'Anas@Anas.com', 'Anas@Anas', '123');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `products`
--
ALTER TABLE `products`
  ADD PRIMARY KEY (`pid`);

--
-- Indexes for table `productsmanger`
--
ALTER TABLE `productsmanger`
  ADD PRIMARY KEY (`mid`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `products`
--
ALTER TABLE `products`
  MODIFY `pid` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT for table `productsmanger`
--
ALTER TABLE `productsmanger`
  MODIFY `mid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
