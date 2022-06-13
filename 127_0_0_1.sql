-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 13, 2022 at 11:07 PM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.4.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `a_9_tiketpesawat`
--
CREATE DATABASE IF NOT EXISTS `a_9_tiketpesawat` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `a_9_tiketpesawat`;

-- --------------------------------------------------------

--
-- Table structure for table `bandara`
--

CREATE TABLE `bandara` (
  `id` int(11) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `kota` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `bandara`
--

INSERT INTO `bandara` (`id`, `nama`, `kota`) VALUES
(1, 'Ngurah Rai', 'Bali'),
(2, 'Adi Sucipto', 'Yogyakarta'),
(4, 'Ir Soekarno', 'Jakarta'),
(5, 'Moh Hatta', 'Semarang'),
(6, 'Padjajaran', 'Kalteng');

-- --------------------------------------------------------

--
-- Table structure for table `menu`
--

CREATE TABLE `menu` (
  `id` int(11) NOT NULL,
  `nama` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `menu`
--

INSERT INTO `menu` (`id`, `nama`) VALUES
(1, 'Spageti'),
(2, 'Beef Wellington'),
(6, 'Salted Egg'),
(7, 'Sate'),
(8, 'Rendang');

-- --------------------------------------------------------

--
-- Table structure for table `pesanan`
--

CREATE TABLE `pesanan` (
  `id` int(11) NOT NULL,
  `id_pesawat` int(11) NOT NULL,
  `id_menu` int(11) DEFAULT NULL,
  `nama_pemesan` varchar(255) NOT NULL,
  `jumlah_penumpang` int(11) NOT NULL,
  `total` int(11) NOT NULL,
  `tanggal` date NOT NULL,
  `no_tiket` varchar(100) NOT NULL,
  `bagasi` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pesanan`
--

INSERT INTO `pesanan` (`id`, `id_pesawat`, `id_menu`, `nama_pemesan`, `jumlah_penumpang`, `total`, `tanggal`, `no_tiket`, `bagasi`) VALUES
(1, 3, NULL, 'Tayo', 2, 450000, '2022-06-15', '3213', 5),
(3, 4, NULL, 'dia', 10, 100000, '2022-06-14', '23123', 2),
(4, 3, NULL, 'awd', 1, 620000, '2020-09-09', 'FSFHW4', 1);

-- --------------------------------------------------------

--
-- Table structure for table `pesawat`
--

CREATE TABLE `pesawat` (
  `id` int(11) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `id_bandara_asal` int(11) NOT NULL,
  `id_bandara_tujuan` int(11) NOT NULL,
  `maskapai` varchar(100) NOT NULL,
  `kapasitas` int(11) DEFAULT NULL,
  `kelas` enum('ekonomi','bisnis') NOT NULL,
  `harga` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pesawat`
--

INSERT INTO `pesawat` (`id`, `nama`, `id_bandara_asal`, `id_bandara_tujuan`, `maskapai`, `kapasitas`, `kelas`, `harga`) VALUES
(3, 'Garuda 212', 1, 2, 'Garuda', 49, 'ekonomi', 600000),
(4, 'Boeing', 2, 1, 'Lion', 100, 'bisnis', 1000000),
(6, 'LION 299', 4, 5, 'LION', 100, 'bisnis', 200000),
(7, 'ELang', 2, 6, 'Garuda', 300, 'ekonomi', 100000),
(8, 'Kutilang 183', 4, 1, 'Garuda', 12, 'ekonomi', 1500000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `bandara`
--
ALTER TABLE `bandara`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `menu`
--
ALTER TABLE `menu`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `pesanan`
--
ALTER TABLE `pesanan`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `pesawat`
--
ALTER TABLE `pesawat`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `bandara`
--
ALTER TABLE `bandara`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `menu`
--
ALTER TABLE `menu`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `pesanan`
--
ALTER TABLE `pesanan`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `pesawat`
--
ALTER TABLE `pesawat`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
