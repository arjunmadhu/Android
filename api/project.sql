-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: localhost:8889
-- Generation Time: Jun 12, 2020 at 10:02 AM
-- Server version: 5.7.26
-- PHP Version: 7.3.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";

--
-- Database: `project`
--

-- --------------------------------------------------------

--
-- Table structure for table `relativeinfrmn`
--

CREATE TABLE `relativeinfrmn` (
  `id` int(11) NOT NULL,
  `userId` int(11) NOT NULL,
  `name` varchar(20) NOT NULL,
  `mobno` bigint(11) NOT NULL,
  `alterno` bigint(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `relativeinfrmn`
--

INSERT INTO `relativeinfrmn` (`id`, `userId`, `name`, `mobno`, `alterno`) VALUES
(1, 1, 'Anish', 955466, 876646),
(2, 1, 'Anish', 955466, 876646);

-- --------------------------------------------------------

--
-- Table structure for table `speed`
--

CREATE TABLE `speed` (
  `Id` int(11) NOT NULL,
  `Speed` int(11) NOT NULL,
  `Datetime` datetime NOT NULL,
  `UserId` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `speed`
--

INSERT INTO `speed` (`Id`, `Speed`, `Datetime`, `UserId`) VALUES
(32, 1, '2020-06-12 15:00:05', 1),
(33, 4, '2020-06-12 15:00:07', 1),
(34, 9, '2020-06-12 15:00:10', 1),
(35, 12, '2020-06-12 15:00:11', 1),
(36, 9, '2020-06-12 15:00:13', 1),
(37, 5, '2020-06-12 15:00:15', 1),
(38, 2, '2020-06-12 15:00:17', 1),
(39, 2, '2020-06-12 15:00:18', 1),
(40, 1, '2020-06-12 15:00:19', 1),
(41, 1, '2020-06-12 15:00:21', 1),
(42, 1, '2020-06-12 15:00:23', 1),
(43, 0, '2020-06-12 15:00:25', 1),
(44, 0, '2020-06-12 15:00:27', 1),
(45, 1, '2020-06-12 15:00:29', 1),
(46, 1, '2020-06-12 15:00:31', 1),
(47, 1, '2020-06-12 15:00:33', 1),
(48, 0, '2020-06-12 15:00:35', 1),
(49, 0, '2020-06-12 15:00:37', 1),
(50, 0, '2020-06-12 15:00:39', 1),
(51, 0, '2020-06-12 15:00:41', 1),
(52, 0, '2020-06-12 15:00:43', 1),
(53, 0, '2020-06-12 15:00:45', 1),
(54, 8, '2020-06-12 15:00:47', 1),
(55, 9, '2020-06-12 15:00:49', 1),
(56, 4, '2020-06-12 15:00:51', 1),
(57, 1, '2020-06-12 15:00:53', 1),
(58, 90, '2020-06-12 15:00:55', 1),
(59, 89, '2020-06-12 15:00:57', 1);

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `Name` varchar(20) NOT NULL,
  `Email` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `mobile_no` bigint(11) NOT NULL,
  `blood_group` varchar(20) NOT NULL,
  `address` varchar(150) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `Name`, `Email`, `password`, `mobile_no`, `blood_group`, `address`) VALUES
(1, 'Anish', 'ani@g.com', '12345', 9526674440, 'A', 'tets addres'),
(2, 'Anih', 'global@g.com', '12345', 9496873618, 'A+', 'Test generator');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `relativeinfrmn`
--
ALTER TABLE `relativeinfrmn`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `speed`
--
ALTER TABLE `speed`
  ADD PRIMARY KEY (`Id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `relativeinfrmn`
--
ALTER TABLE `relativeinfrmn`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `speed`
--
ALTER TABLE `speed`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=60;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;