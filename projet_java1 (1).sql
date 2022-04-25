-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 25, 2022 at 09:30 PM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 8.0.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `projet_java1`
--

-- --------------------------------------------------------

--
-- Table structure for table `dosage`
--

CREATE TABLE `dosage` (
  `DOS_CODE` int(11) NOT NULL,
  `DOS_QUANTITE` varchar(250) DEFAULT NULL,
  `DOS_UNITE` varchar(250) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `dosage`
--

INSERT INTO `dosage` (`DOS_CODE`, `DOS_QUANTITE`, `DOS_UNITE`) VALUES
(1, '1 pillule', '1 à 3 fois'),
(2, '1 pillule', '1 à 3 fois'),
(3, '25 ou 50 µg', ' par jour'),
(4, '6 a 8 gelules', 'par jour'),
(5, '1 suppositoire', 'par jour'),
(6, '1 ou 2 lyophilisat', ' par jour '),
(7, '1 à 3 pillules', 'par jour'),
(8, '1 à 2 sachets', 'par jour'),
(9, 'une dose ', '4 à 6 heures'),
(10, 'Quatre bains de bouche', 'par jour');

-- --------------------------------------------------------

--
-- Table structure for table `famille`
--

CREATE TABLE `famille` (
  `FAM_CODE` int(11) NOT NULL,
  `FAM_LIBELLE` varchar(80) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `famille`
--

INSERT INTO `famille` (`FAM_CODE`, `FAM_LIBELLE`) VALUES
(1, 'antalgique'),
(2, 'hypophyso-thyroïdien'),
(3, 'Hépatologie'),
(4, 'Anti-inflammatoires'),
(5, 'Laxatifs'),
(6, 'Pneumologie'),
(7, 'Gynécologie');

-- --------------------------------------------------------

--
-- Table structure for table `interagis`
--

CREATE TABLE `interagis` (
  `MED_PERTURBATEUR` int(11) NOT NULL,
  `MED_MED_PERTURBE` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `interagis`
--

INSERT INTO `interagis` (`MED_PERTURBATEUR`, `MED_MED_PERTURBE`) VALUES
(1, 2),
(1, 9),
(2, 4),
(3, 7),
(5, 2),
(5, 7),
(5, 9),
(7, 1),
(8, 1),
(8, 2),
(10, 7);

-- --------------------------------------------------------

--
-- Table structure for table `medicament`
--

CREATE TABLE `medicament` (
  `MED_DEPOTLEGAL` int(11) NOT NULL,
  `MED_NOMCOMMERCIAL` varchar(250) DEFAULT NULL,
  `FAM_CODE` int(11) DEFAULT NULL,
  `MED_COMPOSITION` varchar(255) DEFAULT NULL,
  `MED_EFFETS` varchar(255) DEFAULT NULL,
  `MED_CONTREINDIC` varchar(255) DEFAULT NULL,
  `MED_PRIXECHANTILLON` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `medicament`
--

INSERT INTO `medicament` (`MED_DEPOTLEGAL`, `MED_NOMCOMMERCIAL`, `FAM_CODE`, `MED_COMPOSITION`, `MED_EFFETS`, `MED_CONTREINDIC`, `MED_PRIXECHANTILLON`) VALUES
(1, 'DOLIPRANE 1000 mg', 1, 'Paracétamol', 'Il est utilisé pour traiter la douleur et/ou la fièvre, par exemple en cas de maux de tête, d’état grippal, de douleurs dentaires, de courbatures, de règles douloureuses.', '·Hypersensibilité à la substance active ou à l’un des excipients mentionnés· Insuffisance hépatocellulaire sévère.· Enfant de moins de 6 ans en raison des risques de fausse route.', 2.09),
(2, 'DAFALGAN 1000 mg[gélule]', 1, 'Paracétamol', 'Ce médicament contient du paracétamol : un antalgique (il calme la douleur) et un antipyrétique (il fait baisser la fièvre).', 'Ce médicament contient du paracétamol : un antalgique (il calme la douleur) et un antipyrétique (il fait baisser la fièvre).', 2.09),
(3, 'LEVOTHYROX 100mg', 1, 'Lévothyroxine sodique', 'ce médicament est une hormone thyroïdienne.Il est préconisé dans les situations suivantes :· les hypothyroïdies ,· circonstances associées ou non à une hypothyroïdie où il est nécessaire de freiner la sécrétion de TSH.', 'Hypersensibilité à la substance active ou à l’un des excipients .Hyperthyroïdie sauf lorsque celle-ci a été réduite par les médications antithyroïdiennes, l’iode 131 ou la chirurgie.·Insuffisance surrénalienne non traitée.', 2.96),
(4, 'IMODIUM 2 mg [gélule]', 3, 'Chlorhydrate de lopéramide, Quantité correspondant à lopéramide base.', 'Traitement symptomatique des diarrhées aiguës et chroniques.', '·Hypersensibilité à la substance active ou à l\'un des excipients mentionnés à la rubrique Composition.\r\n· Enfant de moins de 8 ans', 2.76),
(5, 'VOLTARENE 100 mg[supposi]', 4, 'Diclofénac sodique', 'Elles procèdent de l’activité anti-inflammatoire du diclofénac, de l’importance des manifestations d’intolérance auxquelles le médicament donne lieu et de sa place dans l’éventail des produits anti-inflammatoires actuellement disponibles.', 'Hypersensibilité à la substance active ou à l’un des excipients. antécédent d’allergie ou d’asthme déclenché par la prise de diclofénac ou de substances d’activité proche telles que d’autres AINS ou l’acide acétylsalicylique, grossesse', 2.83),
(6, 'SPASFON LYOC 160 mg[lyop]', 1, 'Phloroglucinol dihydraté, Quantité correspondant en phloroglucinol anhydre', 'Traitement symptomatique des douleurs liées aux troubles fonctionnels du tube digestif et des voies biliaires.· Traitement des manifestations spasmodiques et douloureuses aiguës des voies urinaires', 'Hypersensibilité à la substance active ou à l\'un des excipients.', 2.2),
(7, 'PARACETAMOL BIOGARAN 1 g', 1, 'Paracétamol', 'Traitement symptomatique des douleurs d\'intensité légère à modérée et/ou des états fébriles.Traitement symptomatique des douleurs de l\'arthrose.Cette présentation est réservée à l\'adulte et à l’enfant à partir de 50 kg', 'Hypersensibilité à la substance active ou à l’un des excipients  ;· insuffisance hépatocellulaire sévère ;· enfant de moins de 6 ans en raison des risques de fausse route.', 2.11),
(8, 'FORLAX 10 g', 5, 'Macrogol 4000, Sorbitol (E420), Dioxyde de soufre (E220).', 'Traitement symptomatique de la constipation chez l\'adulte et chez l’enfant à partir de 8 ans.Une cause organique devra être écartée avant d’initier le traitement.', 'Maladies inflammatoires sévères de l’intestin  ou mégacôlon toxique,· Perforation digestive ou risque de perforation digestive, syndromes douloureux abdominaux de cause indéterminée,· Hypersensibilité à la substance active ou à l’un des excipients.', 5.68),
(9, 'VENTOLINE 100 microgramme', 5, 'Sulfate de salbutamol, Quantité correspondant à salbutamol', ' Traitement symptomatique de la crise d’asthme. Traitement symptomatique des exacerbations d\'asthme ou bronchite chronique obstructive. Prévention de l’asthme d’effort.', 'Allergie à l’un des constituants.· Intolérance à ce médicament. Dans ce cas, il conviendra d’interrompre ce traitement et de prescrire d’autres thérapeutiques ou d’autres formes d’administration.', 4.56),
(10, 'BETADINE 10 %[solution v]', 7, 'Povidone iodée (titrée à 10% d’iode).', 'Traitement local d\'appoint des infections vaginales à germes sensibles et préparation vulvo-vaginale avant acte médical invasif ou acte de chirurgie de la sphère urogénitale', 'IL NE DOIT PAS ETRE UTILISE dans les situations suivantes :· Antécédent d\'hypersensibilité à l\'un des constituants, en particulier la povidone. Il n\'existe pas de réactions croisées avec les produits de contraste iodés.', 8.59);

-- --------------------------------------------------------

--
-- Table structure for table `prescrire`
--

CREATE TABLE `prescrire` (
  `MED_DEPOTLEGAL` int(11) NOT NULL,
  `TIN_CODE` int(11) NOT NULL,
  `DOS_CODE` int(11) NOT NULL,
  `PRE_POSOLOGIE` varchar(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `prescrire`
--

INSERT INTO `prescrire` (`MED_DEPOTLEGAL`, `TIN_CODE`, `DOS_CODE`, `PRE_POSOLOGIE`) VALUES
(1, 1, 2, 'un demi à 1 comprimé à 1000 mg par prise'),
(1, 4, 4, 'tous les jours'),
(1, 5, 1, 'tous les soirs'),
(2, 1, 3, '500 mg à 1 g, 1 à 3 fois par jour. Ne pa'),
(3, 2, 1, 'Ovule : 1 par jour, pendant 8 à 16 jours'),
(4, 1, 3, 'Traitement de la crise d\'asthme: 1 ou 2 '),
(5, 1, 1, 'Adulte et enfant de plus de 8 ans : 1 à '),
(6, 1, 3, 'Adulte et enfant de plus de 15 ans (pesa'),
(7, 1, 2, 'Adulte : 2 lyophilisats à 80 mg ou 1 lyo'),
(8, 1, 1, '· Traitement des poussées aiguës : 1 com'),
(9, 1, 2, 'Adulte : 1 à 3 gélules par jour.Enfant d'),
(10, 1, 3, 'Chez l\'adulte : en général, l\'hormonothé');

-- --------------------------------------------------------

--
-- Table structure for table `type_individu`
--

CREATE TABLE `type_individu` (
  `TIN_CODE` int(11) NOT NULL,
  `TIN_LIBELLE` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `type_individu`
--

INSERT INTO `type_individu` (`TIN_CODE`, `TIN_LIBELLE`) VALUES
(1, 'Adulte'),
(2, 'enfant'),
(3, 'personne agée'),
(4, 'femme enceinte'),
(5, 'enfant base age');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `idUser` int(11) NOT NULL,
  `login` varchar(250) NOT NULL,
  `password` varchar(250) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`idUser`, `login`, `password`) VALUES
(1, 'yewon', 'yewon'),
(2, 'ruth', 'ruth'),
(3, 'admin', 'admin');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `dosage`
--
ALTER TABLE `dosage`
  ADD PRIMARY KEY (`DOS_CODE`);

--
-- Indexes for table `famille`
--
ALTER TABLE `famille`
  ADD PRIMARY KEY (`FAM_CODE`);

--
-- Indexes for table `interagis`
--
ALTER TABLE `interagis`
  ADD PRIMARY KEY (`MED_PERTURBATEUR`,`MED_MED_PERTURBE`),
  ADD KEY `MED_MED_PERTURBE` (`MED_MED_PERTURBE`),
  ADD KEY `MED_PERTURBATEUR` (`MED_PERTURBATEUR`);

--
-- Indexes for table `medicament`
--
ALTER TABLE `medicament`
  ADD PRIMARY KEY (`MED_DEPOTLEGAL`),
  ADD KEY `FAM_CODE` (`FAM_CODE`);

--
-- Indexes for table `prescrire`
--
ALTER TABLE `prescrire`
  ADD PRIMARY KEY (`MED_DEPOTLEGAL`,`TIN_CODE`,`DOS_CODE`),
  ADD KEY `TIN_CODE` (`TIN_CODE`),
  ADD KEY `DOS_CODE` (`DOS_CODE`);

--
-- Indexes for table `type_individu`
--
ALTER TABLE `type_individu`
  ADD PRIMARY KEY (`TIN_CODE`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`idUser`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `dosage`
--
ALTER TABLE `dosage`
  MODIFY `DOS_CODE` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `famille`
--
ALTER TABLE `famille`
  MODIFY `FAM_CODE` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `medicament`
--
ALTER TABLE `medicament`
  MODIFY `MED_DEPOTLEGAL` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `type_individu`
--
ALTER TABLE `type_individu`
  MODIFY `TIN_CODE` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `idUser` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `interagis`
--
ALTER TABLE `interagis`
  ADD CONSTRAINT `interagis_ibfk_1` FOREIGN KEY (`MED_PERTURBATEUR`) REFERENCES `medicament` (`MED_DEPOTLEGAL`),
  ADD CONSTRAINT `interagis_ibfk_2` FOREIGN KEY (`MED_MED_PERTURBE`) REFERENCES `medicament` (`MED_DEPOTLEGAL`);

--
-- Constraints for table `medicament`
--
ALTER TABLE `medicament`
  ADD CONSTRAINT `medicament_ibfk_1` FOREIGN KEY (`FAM_CODE`) REFERENCES `famille` (`FAM_CODE`);

--
-- Constraints for table `prescrire`
--
ALTER TABLE `prescrire`
  ADD CONSTRAINT `prescrire_ibfk_1` FOREIGN KEY (`MED_DEPOTLEGAL`) REFERENCES `medicament` (`MED_DEPOTLEGAL`),
  ADD CONSTRAINT `prescrire_ibfk_2` FOREIGN KEY (`TIN_CODE`) REFERENCES `type_individu` (`TIN_CODE`),
  ADD CONSTRAINT `prescrire_ibfk_3` FOREIGN KEY (`DOS_CODE`) REFERENCES `dosage` (`DOS_CODE`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
