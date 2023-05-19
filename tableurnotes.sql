-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le :  ven. 19 juin 2020 à 16:56
-- Version du serveur :  5.7.17
-- Version de PHP :  5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `tableurnotes`
--

-- --------------------------------------------------------

--
-- Structure de la table `classe`
--

CREATE TABLE `classe` (
  `idClasse` int(11) NOT NULL,
  `nomClasse` varchar(255) NOT NULL,
  `appreciation` varchar(2801) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

--
-- Déchargement des données de la table `classe`
--

INSERT INTO `classe` (`idClasse`, `nomClasse`, `appreciation`) VALUES
(5, 'BTS Greta', 'super classe.'),
(6, 'BTS Chaptal', 'classe motivée');

-- --------------------------------------------------------

--
-- Structure de la table `examen`
--

CREATE TABLE `examen` (
  `idExamen` int(11) NOT NULL,
  `dateExamen` date NOT NULL,
  `classeExamen` int(11) NOT NULL,
  `matiereExamen` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

--
-- Déchargement des données de la table `examen`
--

INSERT INTO `examen` (`idExamen`, `dateExamen`, `classeExamen`, `matiereExamen`) VALUES
(1, '2019-05-08', 5, 8),
(2, '2019-05-10', 5, 7),
(3, '2019-05-21', 5, 10),
(4, '2019-05-03', 6, 10),
(5, '2019-05-09', 6, 9),
(6, '2019-05-10', 5, 8);

-- --------------------------------------------------------

--
-- Structure de la table `matiere`
--

CREATE TABLE `matiere` (
  `idMatiere` int(11) NOT NULL,
  `nomMatiere` varchar(30) NOT NULL,
  `coefficient` int(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

--
-- Déchargement des données de la table `matiere`
--

INSERT INTO `matiere` (`idMatiere`, `nomMatiere`, `coefficient`) VALUES
(7, 'Math', 1),
(8, 'Informatique', 2),
(9, 'Français', 3),
(10, 'Anglais', 4),
(12, '1', NULL),
(13, '2', NULL),
(14, '1', NULL),
(15, '1', NULL),
(16, '1', NULL),
(17, '1', NULL),
(18, '1', NULL),
(19, '1', NULL),
(20, '1', NULL),
(21, '1', NULL),
(22, '1', NULL),
(23, '1', NULL),
(24, '1', NULL),
(25, '1', NULL),
(26, '1', NULL),
(27, '1', NULL),
(28, '1', NULL),
(29, '1', NULL),
(30, '1', NULL),
(31, '1', NULL),
(32, '1', NULL),
(33, '1', NULL),
(34, '1', NULL),
(35, '1', NULL),
(36, '1', NULL),
(37, '1', NULL),
(38, '1', NULL),
(39, '1', NULL),
(40, '1', NULL),
(41, '1', NULL),
(42, '1', NULL),
(43, '1', NULL),
(44, '1', NULL),
(45, '1', NULL),
(46, '1', NULL),
(47, '1', NULL),
(48, '1', NULL),
(49, '1', NULL),
(50, '1', NULL),
(51, '1', NULL),
(52, '1', NULL),
(53, '1', NULL),
(54, '1', NULL),
(55, '1', NULL),
(56, '1', NULL),
(57, '1', NULL),
(58, '1', NULL),
(59, '1', NULL),
(60, '1', NULL),
(61, '1', NULL),
(62, '1', NULL),
(63, '1', NULL),
(64, '1', NULL),
(65, '1', NULL),
(66, '1', NULL),
(67, '1', NULL),
(68, '1', NULL),
(69, '1', NULL),
(70, '1', NULL),
(71, '1', NULL),
(72, '1', NULL),
(73, '1', NULL),
(74, '1', NULL),
(78, 'Reseaux', 2),
(79, 'Anglais', 1),
(80, 'Test', 3);

-- --------------------------------------------------------

--
-- Structure de la table `note`
--

CREATE TABLE `note` (
  `idNote` int(11) NOT NULL,
  `idStagiaire` int(11) NOT NULL,
  `idExamen` int(11) NOT NULL,
  `valeurNote` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

--
-- Déchargement des données de la table `note`
--

INSERT INTO `note` (`idNote`, `idStagiaire`, `idExamen`, `valeurNote`) VALUES
(46, 1, 1, 14),
(47, 4, 1, 16),
(48, 1, 2, 12),
(49, 4, 2, 15),
(50, 1, 3, 9),
(51, 4, 3, 14.7),
(52, 2, 4, 12),
(53, 3, 4, 11),
(54, 2, 5, 12.5),
(55, 3, 5, 9.5),
(56, 1, 6, 18),
(57, 4, 6, 16);

-- --------------------------------------------------------

--
-- Structure de la table `stagiaire`
--

CREATE TABLE `stagiaire` (
  `idStagiaire` int(11) NOT NULL,
  `nomStagiaire` varchar(30) NOT NULL,
  `prenomStagiaire` varchar(30) NOT NULL,
  `classeStagiaire` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

--
-- Déchargement des données de la table `stagiaire`
--

INSERT INTO `stagiaire` (`idStagiaire`, `nomStagiaire`, `prenomStagiaire`, `classeStagiaire`) VALUES
(1, 'Nedelec', 'Romain', 5),
(2, 'Let', 'Gerard', 6),
(3, 'Lamotte', 'Bernard', 6),
(4, 'Jean', 'Jean', 5);

-- --------------------------------------------------------

--
-- Structure de la table `utilisateur`
--

CREATE TABLE `utilisateur` (
  `idUser` int(10) NOT NULL,
  `nom` varchar(25) NOT NULL,
  `password` varchar(255) NOT NULL,
  `fonction` varchar(100) NOT NULL,
  `numStagiaire` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `utilisateur`
--

INSERT INTO `utilisateur` (`idUser`, `nom`, `password`, `fonction`, `numStagiaire`) VALUES
(1, 'admin', 'admin', 'administrateur', NULL),
(6, 'Nedelec', 'Romain', 'eleve', 1),
(5, 'sala', 'sala', 'professeur', NULL),
(7, 'Let', 'Gerard', 'eleve', 2),
(8, 'Lamotte', 'Bernard', 'eleve', 3),
(9, 'Jean', 'Jean', 'eleve', 4);

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `classe`
--
ALTER TABLE `classe`
  ADD PRIMARY KEY (`idClasse`);

--
-- Index pour la table `examen`
--
ALTER TABLE `examen`
  ADD PRIMARY KEY (`idExamen`,`classeExamen`,`matiereExamen`),
  ADD KEY `fk_examen_classe1_idx` (`classeExamen`),
  ADD KEY `fk_examen_matiere1_idx` (`matiereExamen`);

--
-- Index pour la table `matiere`
--
ALTER TABLE `matiere`
  ADD PRIMARY KEY (`idMatiere`);

--
-- Index pour la table `note`
--
ALTER TABLE `note`
  ADD PRIMARY KEY (`idNote`,`idStagiaire`,`idExamen`),
  ADD KEY `fk_note_stagiaire1_idx` (`idStagiaire`),
  ADD KEY `fk_note_examen1_idx` (`idExamen`);

--
-- Index pour la table `stagiaire`
--
ALTER TABLE `stagiaire`
  ADD PRIMARY KEY (`idStagiaire`,`classeStagiaire`),
  ADD KEY `fk_stagiaire_classe_idx` (`classeStagiaire`);

--
-- Index pour la table `utilisateur`
--
ALTER TABLE `utilisateur`
  ADD PRIMARY KEY (`idUser`),
  ADD UNIQUE KEY `numStagiaire` (`numStagiaire`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `classe`
--
ALTER TABLE `classe`
  MODIFY `idClasse` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT pour la table `examen`
--
ALTER TABLE `examen`
  MODIFY `idExamen` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT pour la table `matiere`
--
ALTER TABLE `matiere`
  MODIFY `idMatiere` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=81;
--
-- AUTO_INCREMENT pour la table `note`
--
ALTER TABLE `note`
  MODIFY `idNote` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=58;
--
-- AUTO_INCREMENT pour la table `stagiaire`
--
ALTER TABLE `stagiaire`
  MODIFY `idStagiaire` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT pour la table `utilisateur`
--
ALTER TABLE `utilisateur`
  MODIFY `idUser` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `examen`
--
ALTER TABLE `examen`
  ADD CONSTRAINT `fk_examen_classe1` FOREIGN KEY (`classeExamen`) REFERENCES `classe` (`idClasse`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_examen_matiere1` FOREIGN KEY (`matiereExamen`) REFERENCES `matiere` (`idMatiere`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Contraintes pour la table `note`
--
ALTER TABLE `note`
  ADD CONSTRAINT `fk_note_examen1` FOREIGN KEY (`idExamen`) REFERENCES `examen` (`idExamen`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_note_stagiaire1` FOREIGN KEY (`idStagiaire`) REFERENCES `stagiaire` (`idStagiaire`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Contraintes pour la table `stagiaire`
--
ALTER TABLE `stagiaire`
  ADD CONSTRAINT `fk_stagiaire_classe` FOREIGN KEY (`classeStagiaire`) REFERENCES `classe` (`idClasse`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
