-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 11, 2017 at 01:57 PM
-- Server version: 5.7.14
-- PHP Version: 5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `university`
--

-- --------------------------------------------------------

--
-- Table structure for table `courses`
--

CREATE TABLE `courses` (
  `courses_id` int(5) NOT NULL,
  `courses_course_name` varchar(50) NOT NULL,
  `courses_course_section` varchar(50) NOT NULL,
  `courses_course_houres` varchar(50) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `courses`
--

INSERT INTO `courses` (`courses_id`, `courses_course_name`, `courses_course_section`, `courses_course_houres`) VALUES
(3, '', '', ''),
(2, 'aaq', 'aa', '1'),
(4, '22', '22', '22');

-- --------------------------------------------------------

--
-- Table structure for table `coursesofstudent`
--

CREATE TABLE `coursesofstudent` (
  `Student_courses_student_id` int(11) NOT NULL,
  `Student_courses_course_id` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `coursesofstudent`
--

INSERT INTO `coursesofstudent` (`Student_courses_student_id`, `Student_courses_course_id`) VALUES
(1, 2),
(1, 2),
(7, 2),
(7, 2),
(7, 2),
(7, 2),
(7, 2),
(7, 2),
(7, 2),
(7, 2),
(7, 2),
(7, 2),
(7, 2),
(7, 2),
(7, 2),
(7, 2),
(7, 2),
(7, 2),
(7, 2),
(7, 2),
(7, 2),
(7, 2),
(7, 2),
(7, 2),
(7, 2),
(7, 2),
(7, 2),
(7, 2),
(7, 2),
(7, 2),
(7, 2),
(7, 2),
(7, 2),
(1, 2),
(1, 2);

-- --------------------------------------------------------

--
-- Table structure for table `students`
--

CREATE TABLE `students` (
  `Student_id` int(5) NOT NULL,
  `Student_First_Name` varchar(50) NOT NULL,
  `Student_Last_Name` varchar(50) NOT NULL,
  `Student_Email` varchar(100) NOT NULL,
  `Student_City` varchar(30) NOT NULL,
  `Student_Contry` varchar(30) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `students`
--

INSERT INTO `students` (`Student_id`, `Student_First_Name`, `Student_Last_Name`, `Student_Email`, `Student_City`, `Student_Contry`) VALUES
(1, 'aa', 'aa', 'aa', 'aa', 'aa'),
(2, 'aaaaa', 'aaa', 'aa', 'aa', 'aa'),
(3, 'ayman', 'ayyad', 'a@a.com', 'Palestine', 'gaza'),
(4, 'ayman', 'ayyad', 'a@a.com', 'Palestine', 'gaza'),
(5, 'ayman', 'ayyad', 'a@a.com', 'Palestine', 'gaza'),
(6, 'ayman', 'ayyad', 'a@a.com', 'Palestine', 'gaza'),
(7, 'ayman', 'ayyad', 'a@a.com', 'Palestine', 'gaza'),
(8, 'as', 'as', 'sa', 'as', 'as');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `courses`
--
ALTER TABLE `courses`
  ADD PRIMARY KEY (`courses_id`);

--
-- Indexes for table `coursesofstudent`
--
ALTER TABLE `coursesofstudent`
  ADD KEY `Student_courses_student_id` (`Student_courses_student_id`),
  ADD KEY `Student_courses_course_id` (`Student_courses_course_id`);

--
-- Indexes for table `students`
--
ALTER TABLE `students`
  ADD PRIMARY KEY (`Student_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `courses`
--
ALTER TABLE `courses`
  MODIFY `courses_id` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `students`
--
ALTER TABLE `students`
  MODIFY `Student_id` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
