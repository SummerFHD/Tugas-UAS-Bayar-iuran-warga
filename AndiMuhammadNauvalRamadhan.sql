-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 23, 2023 at 09:33 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `uasinifixbanget`
--

-- --------------------------------------------------------

--
-- Table structure for table `data_iuran`
--

CREATE TABLE `data_iuran` (
  `nomor_rumah` varchar(5) NOT NULL,
  `nama_kepala_keluarga` varchar(64) NOT NULL,
  `nominal_bayar` varchar(64) DEFAULT NULL,
  `keterangan` varchar(64) DEFAULT NULL,
  `status` enum('Belum Bayar','Sudah Bayar') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `data_iuran`
--

INSERT INTO `data_iuran` (`nomor_rumah`, `nama_kepala_keluarga`, `nominal_bayar`, `keterangan`, `status`) VALUES
('00001', 'Sutomo', 'Rp. 20.000', 'Untuk Bulan Januari', 'Sudah Bayar');

-- --------------------------------------------------------

--
-- Table structure for table `data_warga`
--

CREATE TABLE `data_warga` (
  `nomor_rumah` varchar(5) NOT NULL,
  `nama_kepala_keluarga` varchar(64) NOT NULL,
  `nomor_telepon` varchar(13) NOT NULL,
  `alamat` varchar(64) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `data_warga`
--

INSERT INTO `data_warga` (`nomor_rumah`, `nama_kepala_keluarga`, `nomor_telepon`, `alamat`) VALUES
('00001', 'Sutomo', '08123456789', 'Jl. Raya No. 1'),
('00002', 'Sulistyo', '08234567890', 'Jl. Baru No. 2'),
('00003', 'Susanti', '08345678901', 'Jl. Maju No. 3'),
('00004', 'Sukirman', '08456789012', 'Jl. Sejahtera No. 4'),
('00005', 'Sukiman', '08567890123', 'Jl. Indah No. 5'),
('00006', 'Sudirman', '08678901234', 'Jl. Asri No. 6'),
('00007', 'Suryadi', '08789012345', 'Jl. Damai No. 7'),
('00008', 'Surya', '08890123456', 'Jl. Makmur No. 8'),
('00009', 'Sulastri', '08901234567', 'Jl. Harmoni No. 9'),
('00010', 'Sukardi', '09012345678', 'Jl. Sentosa No. 10'),
('00011', 'Sunardi', '09123456789', 'Jl. Cemerlang No. 11'),
('00012', 'Sugianto', '09234567890', 'Jl. Bahagia No. 12'),
('00013', 'Suprianto', '09345678901', 'Jl. Jujur No. 13'),
('00014', 'Sukiman', '09456789012', 'Jl. Damai Sejahtera No. 14'),
('00015', 'Suryani', '09567890123', 'Jl. Mawar No. 15'),
('00016', 'Jupri', '081295891852', 'Jal BANDUNG RAYA');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id_user` varchar(5) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id_user`, `username`, `password`) VALUES
('00000', 'admin', 'password');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `data_iuran`
--
ALTER TABLE `data_iuran`
  ADD KEY `nomor_rumah` (`nomor_rumah`),
  ADD KEY `nama_kepala_keluarga` (`nama_kepala_keluarga`);

--
-- Indexes for table `data_warga`
--
ALTER TABLE `data_warga`
  ADD PRIMARY KEY (`nomor_rumah`),
  ADD KEY `nama_kepala_keluarga` (`nama_kepala_keluarga`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id_user`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `data_iuran`
--
ALTER TABLE `data_iuran`
  ADD CONSTRAINT `data_iuran_ibfk_1` FOREIGN KEY (`nomor_rumah`) REFERENCES `data_warga` (`nomor_rumah`) ON DELETE CASCADE,
  ADD CONSTRAINT `data_iuran_ibfk_2` FOREIGN KEY (`nama_kepala_keluarga`) REFERENCES `data_warga` (`nama_kepala_keluarga`) ON DELETE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
