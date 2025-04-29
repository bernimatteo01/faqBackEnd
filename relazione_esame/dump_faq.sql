-- MySQL dump 10.13  Distrib 8.0.42, for Win64 (x86_64)
--
-- Host: localhost    Database: webapp
-- ------------------------------------------------------
-- Server version	8.0.42

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `faq`
--

DROP TABLE IF EXISTS `faq`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `faq` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `domanda` varchar(255) DEFAULT NULL,
  `risposta` varchar(255) DEFAULT NULL,
  `data_creazione` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `data_modifica` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `faq`
--

LOCK TABLES `faq` WRITE;
/*!40000 ALTER TABLE `faq` DISABLE KEYS */;
INSERT INTO `faq` VALUES (1,'Come posso creare un nuovo account?','Per creare un nuovo account, clicca sul pulsante \'Registrati\' in alto a destra e compila il modulo con i tuoi datiii personali.','2025-04-28 10:49:37','2025-04-28 15:54:26'),(2,'Ho dimenticato la password, cosa posso fare?','Clicca su \'Password dimenticata?\' nella schermata di login e segui le istruzioni per reimpostarla tramite email.','2025-04-28 10:49:37','2025-04-28 10:49:37'),(3,'Come posso modificare i miei dati personali?','Accedi al tuo profilo e clicca su \'Modifica Profilo\' per aggiornare le tue informazioni personali.','2025-04-28 10:49:37','2025-04-28 10:49:37'),(4,'Posso cancellare il mio account?','Sì, puoi cancellare il tuo account inviando una richiesta tramite il nostro modulo di contatto. La cancellazione richiede fino a 48 ore.','2025-04-28 10:49:37','2025-04-28 10:49:37'),(5,'Come posso contattare il supporto?','Puoi contattare il nostro supporto tramite la sezione \'Contattaci\' disponibile nel menu del sito.','2025-04-28 10:49:37','2025-04-28 10:49:37'),(6,'Quanto tempo ci vuole per ricevere una risposta dal supporto?','Di solito rispondiamo entro 24-48 ore lavorative.','2025-04-28 10:49:37','2025-04-28 10:49:37'),(7,'Dove posso trovare la documentazione del servizio?','La documentazione completa è disponibile nella sezione \'Aiuto\' o \'Documentazione\' del sito.','2025-04-28 10:49:37','2025-04-28 10:49:37'),(8,'Il servizio è gratuito?','Offriamo sia piani gratuiti che a pagamento. Consulta la sezione \'Prezzi\' per maggiori dettagli.','2025-04-28 10:49:37','2025-04-28 10:49:37'),(9,'Posso utilizzare il servizio su dispositivi mobili?','Sì, il nostro sito è completamente responsive e ottimizzato per dispositivi mobili.','2025-04-28 10:49:37','2025-04-28 10:49:37'),(10,'Come posso eliminare una FAQ dal mio profilo?','Se sei un amministratore, puoi eliminare una FAQ cliccando sull\'icona del cestino accanto alla domanda.','2025-04-28 10:49:37','2025-04-28 10:49:37');
/*!40000 ALTER TABLE `faq` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-04-29 18:32:58
