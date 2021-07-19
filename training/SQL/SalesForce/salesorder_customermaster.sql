CREATE DATABASE  IF NOT EXISTS `salesorder` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `salesorder`;
-- MySQL dump 10.13  Distrib 5.1.40, for Win32 (ia32)
--
-- Host: localhost    Database: salesorder
-- ------------------------------------------------------
-- Server version	5.5.9

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `customermaster`
--

DROP TABLE IF EXISTS `customermaster`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `customermaster` (
  `CustomerId` int(11) NOT NULL AUTO_INCREMENT,
  `ShortName` char(5) NOT NULL,
  `RegionCode` char(5) NOT NULL,
  PRIMARY KEY (`CustomerId`),
  UNIQUE KEY `UnqId_UNIQUE` (`CustomerId`)
) ENGINE=InnoDB AUTO_INCREMENT=3553 DEFAULT CHARSET=latin1 COMMENT='This table is to store details regarding a customer';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customermaster`
--

LOCK TABLES `customermaster` WRITE;
/*!40000 ALTER TABLE `customermaster` DISABLE KEYS */;
INSERT INTO `customermaster` VALUES (775,'AAI','DE'),(776,'AMT','DE'),(777,'ABI','CH'),(783,'AIO','CH'),(785,'ALB','BA'),(786,'ALE','CH'),(790,'AMS','BA'),(800,'BPA','BA'),(805,'BAT','PU'),(806,'BBE','BA'),(809,'BEB','BA'),(815,'BHH','HY'),(817,'BIL','CH'),(818,'BIN','CH'),(819,'BIP','CH'),(824,'CAR','PU'),(827,'CHE','BA'),(828,'CIL','PU'),(829,'SCL','CH'),(831,'CWC','BA'),(834,'DIL','DE'),(841,'EEC','BA'),(847,'EJC','DE'),(853,'FED','DE'),(857,'EYM','DE'),(858,'FES','BA'),(859,'FIC','BA'),(864,'MFD','BA'),(865,'SMD','BA'),(870,'GRR','CH'),(871,'G09','MU'),(872,'GPE','CH'),(876,'GUI','BA'),(883,'HBS','DE'),(885,'HHM','DE'),(887,'HIT','DE'),(891,'HML','BA'),(894,'HPP','BA'),(896,'HTL','BA'),(897,'HYU','CH'),(904,'IRW','DE'),(910,'JEW','HY'),(918,'KDD','BA'),(921,'KEY','CH'),(924,'KOE','PU'),(928,'KGK','PU'),(929,'KPP','BA'),(930,'KSB','PU'),(931,'KSL','BA'),(933,'KTT','BA'),(936,'LF1','CH'),(938,'LJD','PU'),(939,'LML','HY'),(941,'LMW','CH'),(944,'LEO','CH'),(948,'MAP','BA'),(949,'MBS','CH'),(950,'MCD','BA'),(952,'MGC','BA'),(953,'MII','BA'),(954,'MIJ','DE'),(956,'MIM','BA'),(957,'MIN','BA'),(959,'MMF','CH'),(961,'MAM','MU'),(963,'MNA','MU'),(967,'MPP','BA'),(968,'MRI','GU'),(969,'MTC','BA'),(971,'MUL','DE'),(974,'NEW','DE'),(976,'NTI','BA'),(979,'PRA','MU'),(997,'RCO','DE'),(999,'RLC','BA'),(1000,'RLM','CH'),(1003,'RPT','BA'),(1004,'RTP','BA'),(1012,'SAN','BA'),(1013,'SBC','DE'),(1017,'SIM','CH'),(1022,'SFL','BA'),(1023,'SFM','CH'),(1024,'SHA','BA'),(1026,'SIE','MU'),(1028,'SMC','PU'),(1030,'SON','DE'),(1031,'SOP','DE'),(1032,'SUP','MU'),(1033,'SPM','PU'),(1034,'SEA','BA'),(1035,'SPR','DE'),(1037,'STL','BA'),(1038,'STR','MU'),(1039,'STS','BA'),(1043,'TAF','CH'),(1047,'TCL','CA'),(1048,'TEL','PU'),(1050,'TEN','DE'),(1052,'TIL','BA'),(1057,'TPH','DE'),(1058,'TPL','BA'),(1061,'TTT','CH'),(1062,'TUR','CH'),(1063,'TVS','BA'),(1065,'UCL','CH'),(1066,'UPL','CH'),(1068,'VCA','BA'),(1073,'VPC','CH'),(1075,'VSS','CH'),(1077,'VXL','DE'),(1080,'WIB','BA'),(1081,'WIH','HY'),(1087,'AAL','DE'),(1102,'SLN','BA'),(1117,'EMT','MU'),(1136,'UPE','BA'),(1144,'GBM','MU'),(1147,'KBI','DE'),(1156,'SPH','BA'),(1163,'PEW','BA'),(1178,'FIN','NA'),(1194,'MBL','BA'),(1196,'FGL','PU'),(1213,'UST','CH'),(1214,'AIB','CH'),(1230,'CES','DE'),(1244,'MBI','BA'),(1247,'STP','HY'),(1249,'TAC','CH'),(1252,'IWV','BA'),(1265,'HIL','DE'),(1266,'FOR','MU'),(1267,'RKT','CH'),(1268,'BPT','CA'),(1273,'UFS','DE'),(1278,'TEC','BA'),(1280,'GMB','NA'),(1283,'BRA','CH'),(1284,'RAP','BA'),(1298,'SUA','PU'),(1299,'HMS','DE'),(1301,'PTP','BA'),(1309,'MBC','BA'),(1312,'REI','BA'),(1333,'AKA','DE'),(1334,'GUA','EX'),(1340,'DVS','BA'),(1341,'BFM','PU'),(1342,'BFC','PU'),(1345,'BWT','PU'),(1346,'BTM','PU'),(1350,'BAM','PU'),(1351,'BAP','PU'),(1352,'BCM','PU'),(1355,'BMM','PU'),(1356,'BWM','PU'),(1357,'BMT','PU'),(1358,'SRP','DE'),(1359,'CEC','DE'),(1378,'SPC','BA'),(1384,'VPL','BA'),(1385,'LF2','CH'),(1387,'FVA','MU'),(1395,'ASB','MU'),(1406,'GB7','MU'),(1417,'GIL','BA'),(1423,'FCL','MU'),(1425,'ELO','MU'),(1429,'MML','MU'),(1438,'GIC','NA'),(1443,'ABT','CH'),(1445,'STE','BA'),(1471,'GAS','BA'),(1478,'G16','MU'),(1479,'MAT','MU'),(1480,'NIT','DE'),(1482,'UNI','BA'),(1492,'JAP','BA'),(1499,'SMI','MU'),(1501,'AAS','CH'),(1504,'NRB','MU'),(1507,'LMD','CH'),(1512,'BAC','BA'),(1536,'LTM','CH'),(1540,'MGM','CH'),(1543,'HPA','CA'),(1550,'GKM','MU'),(1558,'BEM','BA'),(1559,'AAX','BA'),(1562,'PAM','BA'),(1563,'IMA','BA'),(1568,'ACM','BA'),(1569,'TAE','BA'),(1584,'VMT','BA'),(1593,'MMM','BA'),(1597,'VEL','PU'),(1599,'ZPL','BA'),(1604,'CVR','CH'),(1608,'TML','PU'),(1629,'DDP','BA'),(1630,'LMN','MU'),(1631,'PRS','PU'),(1632,'SEJ','PU'),(1633,'SFD','CH'),(1645,'UP0','CH'),(1652,'ITC','PU'),(1660,'GRE','PU'),(1661,'LOM','PU'),(1664,'MEP','BA'),(1667,'CPT','BA'),(1668,'ZTC','BA'),(1673,'TUC','MU'),(1677,'SSN','BA'),(1679,'PAI','MU'),(2416,'PIP','MU'),(2417,'SUI','DE'),(2418,'ESQ','CH'),(2420,'SDF','CH'),(2423,'SMO','MU'),(2429,'G08','MU'),(2431,'MTR','HY'),(2433,'SCP','MU'),(2437,'DHI','HY'),(2459,'JSL','PU'),(2463,'ESD','BA'),(2464,'ASA','BA'),(2470,'SYS','BA'),(3191,'TE1','CA'),(3199,'TRU','CH'),(3206,'CNC','BA'),(3217,'SUZ','DE'),(3218,'TVM','BA'),(3221,'GOE','BA'),(3232,'NRS','CA'),(3235,'MUS','DE'),(3236,'ES2','PU'),(3237,'ES1','PU'),(3238,'MTP','DE'),(3240,'SAT','PU'),(3245,'ZCL','BA'),(3248,'CTU','DE'),(3249,'TPP','PU'),(3254,'LGE','DE'),(3255,'ROC','DE'),(3258,'VIS','MP'),(3261,'AYU','PU'),(3263,'SAS','HY'),(3264,'GCL','MU'),(3265,'CSG','MU'),(3266,'ETS','PU'),(3267,'MGT','DE'),(3268,'S1C','BA'),(3270,'EPI','BA'),(3271,'PPL','DE'),(3272,'ANZ','BA'),(3273,'LAS','PU'),(3274,'TKA','BA'),(3275,'SSL','BA'),(3281,'MAR','DE'),(3282,'PFL','DE'),(3286,'SNK','MU'),(3287,'AAC','BA'),(3288,'GAT','DE'),(3289,'PMV','BA'),(3290,'RSP','DE'),(3295,'MHL','DE'),(3296,'HHW','BA'),(3298,'PML','PU'),(3299,'NTC','BA'),(3300,'NRE','BA'),(3304,'SYP','BA'),(3305,'TTS','DE'),(3306,'BEL','DE'),(3307,'AEI','DE'),(3311,'SPX','BA'),(3312,'CEW','DE'),(3313,'MSS','BA'),(3315,'RJI','BA'),(3316,'IIP','PU'),(3323,'KRI','BA'),(3324,'ELF','CH'),(3325,'ABK','CH'),(3326,'RP2','BA'),(3327,'CMC','BA'),(3328,'SRA','BA'),(3329,'ACE','PU'),(3331,'MNS','CH'),(3332,'ATT','CH'),(3333,'MNE','MU'),(3334,'TDF','PU'),(3335,'SED','DE'),(3336,'BTC','CH'),(3337,'SER','PU'),(3339,'ANU','PU'),(3340,'AEN','BA'),(3341,'BNR','BA'),(3348,'KCL','BA'),(3349,'WAR','DE'),(3350,'GET','DE'),(3351,'BRI','PU'),(3352,'BKL','PU'),(3353,'PPP','BA'),(3357,'JEN','MU'),(3367,'SMH','BA'),(3368,'IUS','BA'),(3372,'TNC','BA'),(3373,'VFA','HY'),(3374,'UEP','DE'),(3377,'SEB','BA'),(3378,'JEI','BA'),(3380,'ATL','PU'),(3382,'HMP','BA'),(3383,'SVE','GU'),(3384,'DOL','DE'),(3385,'UAA','PU'),(3386,'DIP','PU'),(3388,'TCB','BA'),(3389,'RAS','MU'),(3391,'PC1','BA'),(3392,'EIP','BA'),(3393,'PRO','BA'),(3394,'NEC','GU'),(3395,'ST1','PU'),(3396,'SUK','DE'),(3400,'BAJ','MU'),(3404,'GAA','DE'),(3405,'EQE','NA'),(3407,'LKP','BA'),(3408,'KTC','BA'),(3409,'SA2','DE'),(3410,'SMA','PU'),(3411,'HTG','DE'),(3415,'ACR','CA'),(3416,'SMR','PU'),(3417,'GWE','BA'),(3418,'RDL','HY'),(3419,'LSL','DE'),(3420,'RAI','DE'),(3421,'SKS','DE'),(3422,'MDY','MU'),(3423,'BBB','DE'),(3424,'ILT','DE'),(3426,'ETI','PU'),(3427,'VGE','DE'),(3428,'AMU','GU'),(3429,'JIL','PU'),(3431,'BEG','DE'),(3433,'GOS','EX'),(3435,'AAB','BA'),(3437,'KET','MU'),(3438,'UMT','CH'),(3441,'IPC','GU'),(3443,'SII','DE'),(3444,'GKL','PU'),(3445,'ACP','GU'),(3446,'QUE','BA'),(3447,'AS1','BA'),(3448,'BAD','PU'),(3449,'AKR','BA'),(3450,'SMS','MU'),(3451,'GAM','DE'),(3452,'TPI','CH'),(3453,'KGM','GU'),(3455,'FML','PU'),(3456,'HSP','DE'),(3457,'JJG','BA'),(3458,'MGS','GU'),(3459,'PAR','MU'),(3460,'MFT','PU'),(3461,'BFG','BA'),(3462,'WAL','PU'),(3463,'ADR','BA'),(3464,'KRL','PU'),(3465,'RAA','DE'),(3466,'PCI','DE'),(3467,'PAC','BA'),(3468,'SRM','PU'),(3470,'HYD','BA'),(3472,'KBC','DE'),(3473,'PCE','HY'),(3474,'OCP','DE'),(3475,'GLE','BA'),(3477,'WDS','CH'),(3478,'MKS','PU'),(3479,'TMA','CA'),(3480,'FCT','PU'),(3481,'ANE','MU'),(3482,'MLT','PU'),(3483,'MVI','BA'),(3484,'PDF','DE'),(3485,'MCP','MU'),(3486,'BTE','BA'),(3488,'ISR','MU'),(3489,'MPT','CH'),(3492,'IIT','CH'),(3493,'RTL','CA'),(3495,'SGF','MU'),(3498,'SFT','MU'),(3499,'TSL','DE'),(3500,'MOT','BA'),(3504,'TGP','BA'),(3505,'UPS','DE'),(3506,'AVL','MP'),(3507,'CCL','MU'),(3508,'KVL','DE'),(3509,'ILI','MP'),(3510,'PEC','DE'),(3513,'ESP','DE'),(3514,'PRM','MU'),(3517,'PRL','MP'),(3519,'EET','BA'),(3520,'LGB','CH'),(3521,'KCA','CH'),(3522,'KEF','DE'),(3523,'TTJ','CA'),(3525,'KRI','DE'),(3527,'SGL','CH'),(3529,'AAM','MP'),(3530,'DRB','MU'),(3531,'SNP','MU'),(3533,'SVI','GU'),(3535,'PSS','MU'),(3536,'VBT','BA'),(3537,'SRB','MU'),(3539,'VAU','CH'),(3540,'SIH','BA'),(3541,'DMX','CH'),(3542,'JDT','MP'),(3543,'BPU','CH'),(3544,'ETA','CH'),(3546,'MMI','MP'),(3547,'SJM','CA'),(3549,'KMP','DE'),(3552,'ENT','DE');
/*!40000 ALTER TABLE `customermaster` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2011-08-19 15:13:43
