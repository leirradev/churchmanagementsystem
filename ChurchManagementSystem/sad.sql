-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Mar 15, 2015 at 12:11 AM
-- Server version: 5.6.21
-- PHP Version: 5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `sad`
--

-- --------------------------------------------------------

--
-- Table structure for table `emp`
--

CREATE TABLE IF NOT EXISTS `emp` (
  `emp_no` int(11) NOT NULL,
  `firstname` varchar(64) NOT NULL,
  `middlename` varchar(64) NOT NULL,
  `lastname` varchar(64) NOT NULL,
  `gender` varchar(64) NOT NULL,
  `contactnum` varchar(64) NOT NULL,
  `position` varchar(64) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `emp`
--

INSERT INTO `emp` (`emp_no`, `firstname`, `middlename`, `lastname`, `gender`, `contactnum`, `position`) VALUES
(307, 'khei', 'asd', 'nagao', 'female', '09152753912', 'Secretary'),
(1136, 'lester', 'manta', 'buenaventura', 'male', '09366699599', 'Secretary'),
(2997, 'chin', 'kuyuske', 'yamaguchi', 'male', '09192793232', 'Administrator'),
(3107, 'camille', 'silvestre', 'orot', 'female', '09361342352', 'Secretary'),
(4395, 'mau', 'zxc', 'reyes', 'female', '09123456789', 'Secretary'),
(5095, 'maynard', 'asdf', 'bicos', 'male', '09983753123', 'Secretary'),
(5566, 'mau', 'qwe', 'reyes', 'female', '09182705024', 'Secretary'),
(5795, 'erik', 'santos', 'suarez', 'female', '09367889234', 'Secretary'),
(8758, 'mejhie', 'kayabyab', 'brusko', 'male', '09323234565', 'Secretary'),
(13451, 'allan', 'hjgd', 'dela cruz', 'male', '09192793212', 'Secretary'),
(16976, 'lester', 'miro', 'buenaventura', 'male', '09366699599', 'Administrator'),
(17155, 'panget', 'bonifacio', 'tangcay', 'female', '09223377261', 'Secretary'),
(20984, 'camille', 'silvestre', 'orot', 'female', '09236791456', 'Secretary'),
(21081, 'khanji', 'kashiwagi', 'huahue', 'male', '09152793923', 'Administrator'),
(21145, 'lester', 'malupet', 'buenaventura', 'male', '09366699599', 'Secretary'),
(21233, 'maynard', 'haha', 'bicos', 'male', '09182703015', 'Secretary'),
(24696, 'richard', 'buenaventura', 'ng', 'male', '09234567891', 'Secretary'),
(28159, 'lester', 'master', 'buenaventura', 'male', '09366699599', 'Secretary');

-- --------------------------------------------------------

--
-- Table structure for table `reserved`
--

CREATE TABLE IF NOT EXISTS `reserved` (
  `client_no` int(11) NOT NULL,
  `client_name` varchar(64) NOT NULL,
  `address` varchar(64) NOT NULL,
  `contactnum` varchar(64) NOT NULL,
  `date_in` varchar(64) NOT NULL,
  `date_out` varchar(64) NOT NULL,
  `time_in` varchar(64) NOT NULL,
  `time_out` varchar(64) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `reserved`
--

INSERT INTO `reserved` (`client_no`, `client_name`, `address`, `contactnum`, `date_in`, `date_out`, `time_in`, `time_out`) VALUES
(19132, 'haha', 'hehe', '09366699599', '2015/03/14', '03 15 2015', '10:22', '12:45 p.m'),
(2022, 'haha', 'hehe', '09366699599', '2015/03/14', '03 16 2015', '10:30', '10:00 a.m'),
(1512, 'hehe', 'haha', '09366699599', '2015/03/14', '03 14 2015', '10:33', '10:33 p.m'),
(4154, 'hehe', 'haha', '09366699599', '2015/03/14', '03 14 2015', '10:36', '10:37 p.m');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `emp`
--
ALTER TABLE `emp`
 ADD PRIMARY KEY (`emp_no`), ADD UNIQUE KEY `emp_no` (`emp_no`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
