
#Dokumentation Lernapp #peat

Erlerntes spielend wiederholen und nie wieder vergessen!


![peat](https://github.com/andreasmosig/peat/blob/master/res/drawable-hdpi/splash.png)



###Version: v1.0.1-0000

###Ausgabe: 1

###Autoren/Entwickler:
###Steven Pawelleck, Thomas Ricklinkat, Andreas Mosig

###Kontakt: mailtopeat@gmail.com

###Stand: 03.07.2016


###Beuth Hochschule f�r Technik Berlin, Wirtschaftsinformatik, 4. ###Semester, Sommersemester 2016



#Gliederung

#1. Einleitung

##1.1. Problemstellung und Zielsetzung der Arbeit (fertig | Andi)

##1.2. Projekt-Stammdaten (fertig | Andi)

##1.3. Projektidee, -ziel und -plan (fertig | Thomas)

#2. Vorbetrachtungen (IST-Analyse)

##2.1. Theoretische Aspekte einer Lernsoftware (fertig | Thomas)

##2.2. Vision und Gesch�ftsmodell (fertig | Thomas)

##2.3. Marktanalyse (fertig | Thomas)

#3. Produktdefinition und Systementwurf (SOLL-Konzept)

##3.1. Vorgehensweise (fertig | Thomas)

##3.2. Requirements (fertig | Thomas, Andi)

##3.3. Design und Architektur (fertig | Andi)

##3.4. Konzept der Qualit�tssicherung (fast fertig | Thomas, Andi, Steven)

#4. Umsetzung

##4.1. Plattform (Thomas, Andi, Steven)

##4.2. GUI (Thomas, Andi)

###4.2.1. Screenshots je Activity

###4.2.2. Methoden

##4.3. Logik (Thomas, Andi, Steven)

##4.4. Persistenz (Steven, Andi)

##4.5. Versionierung (fertig | Andi)

#5. Schlussbetrachtung

##5.1. Zusammenfassung (Thomas, Andi, Steven)

##5.2. Erkenntnisse (fertig | Andi)

##5.3. Ausblick (fertig | Andi)

#6. Weiterf�hrende Links

#7. Glossar


Legende zur Formatierung:

# = 1. Ebene

## = 2. Ebene

### = 3. Ebene

--- = Trennlinie

* = Aufz�hlung

![Name](bild.png) = Bild einbinden

**wort** = Formatierung bold

#1. Einleitung

##1.1. Problemstellung und Zielsetzung der Arbeit (fertig | Andi)

Das **Lerngebiet** des Softwareentwicklungsprojektes erstreckt sich �ber viele Aspekte der Softwaretechnik, d.h. u.a. in der praktischen Anwendung von Modellierungsprachen (wie z.B. [UML](https://de.wikipedia.org/wiki/Unified_Modeling_Language) sowie von Vorgehensmodellen der Softwareentwicklung (z.B. [SCRUM](https://de.wikipedia.org/wiki/Scrum).


Das �bergeordnete **Lernziel** ist, aus den in der Theorie erworbenen Inhalten, die individuellen sowie gruppenspezifischen Kompetenzen herauszubilden resp. zu verst�rken. Diese sind u.a. die F�higkeit zur selbst�ndigen Bearbeitung einer Aufgabenstellung, die Anforderungsanalyse sowie die Modellierung prozessorientierter Systeme. Dar�ber hinaus lassen sich weitere Ziele nennen, wie ganz trivial die Realisierung in einer Gruppe, die daraus resultierende Forderung und F�rderung der Teamf�higkeit und schlie�lich das Ein�ben systematischer Vorgehensweisen und Arbeitstechniken auf wissenschaftlicher Basis. Selbstverst�ndlich sollen auch die Arbeitsergebnisse in Form einer lauff�higen Anwendung sowie der hier vorliegenden Dokumentation pr�sentiert werden.


Das konkrete **Projektziel** ist das Entwickeln einer Implementierungsidee f�r ein (virtuelles) Start-UP, hin zu einem lauff�higen Prototypen. Dieser soll dem Auftraggeber, welcher sich als [Business Angel](https://de.wikipedia.org/wiki/Business_Angel) (BA) versteht, pr�sentiert werden, um seine finanzielle Beteiligung an dem Projekt in H�he von 300.000 EUR zu erwirken. W�hrend des Entwicklungsprozesses sollte des Weiteren eine ausf�hrliche Dokumentation erstellt werden, die Ihnen hiermit vorliegt. Neben der Projektdokumentation lag der Fokus auf dem Kodieren (Applikation, Interfaces) und einer gesunden Gruppendynamik.


Das **Team #peat** bestand zu Beginn, d.h. in der Findungsphase einer Vision, noch aus zwei Mitgliedern. Schnell wurde klar, dass die gestellten Anforderungen an das Projekt noch eine weitere Kraft erfordern w�rden. Im Zuge der finalen Festlegung der Idee sowie der Gruppe, galt es die n�chsten Ziele und Meilensteine zu definieren. Ein [Expos�](https://github.com/andreasmosig/peat/blob/master/doc/EXPOSE.md) sollte die ersten Weichen stellen. Hierin wurden Anforderungen, theoretische Grundlagen, technische Aspekte, wie z.B. Architektur und Entwicklungsumgebung sowie Meilensteine abgesteckt.


Die **Statusberichte** wurden alle ein bis zwei Wochen per E-Mail an den BA samt der Verlinkungen zu den in der Folge dieser Arbeit vorgestellten Projektmanagement- sowie Versionenverwaltungs-Anwendungen geschickt (s. [6.](#6. Weiterf�hrende Links)).

##1.2. Projekt-Stammdaten (fertig | Andi)

###a) Gruppenmitglieder

* Thomas Ricklinkat (s58372@beuth-hochschule.de, Matr.-Nr. 821644)

* Andreas Mosig (s58395@beuth-hochschule.de, Matr.-Nr. 817272)

* Steven Pawellek (s45848@beuth-hochschule.de, Matr.-Nr. 776340)


###b) Projektdauer

* Der Projektzeitraum erstreckte sich vom 7. April (Kick-Off) bis zum 8. Juli 2016, dem Tag der Pr�sentation der Arbeitsergebnisse.


###c) Projektmanagement-Werkzeuge

* F�r den allgemeinen Austauch und f�r die Projekt- sowie interne Kommunikation mit dem BA und allen Kommilitonen, wurde eine allgemein zug�ngliche [Slack-Gruppe](http://beuthswtprojekt.slack.com) vom BA eingerichtet. Dar�ber hinaus verf�gte jede Projektgruppe �ber  ihren eigenen, projektinternen Slack-Kanal. F�r das vorliegende Projekt war es der Kanal **peat**.


* Das Projektmanagement fand via [asana.com](https://app.asana.com/0/105766113985042/105766113985043) statt, welches synchron mit dem Projekt-Slack-Kanal verbunden war. Jegliche asana-Kommunikation war und ist im Slack-Kanal nachvollziehbar (s. [5.2.](##5.2. Erkenntnisse)).


* F�r die [agile Software-Entwicklung](https://de.wikipedia.org/wiki/Agile_Softwareentwicklung) mit Scrum war urspr�nglich das Arbeiten mit dem Tool easyBacklog vorgesehen (s. [5.2.](##5.2. Erkenntnisse)).


* Das Versionsmanagement erfolgte via GitHub ([Master-Branch](https://github.com/andreasmosig/peat)). Analog zu asana liefen alle Aktivit�ten im privaten Slack-Kanal zusammen und waren f�r den BA einsehbar.


###d) Entwicklungswerkzeuge

* F�r die verschiedenen Komponenten und Schnittstellen sind unterschiedliche Technologien und Werkzeuge notwendig gewesen. Zum Entwickeln der Android-App in Java wurde Eclipse sowie daf�r notwendige Plugins (SDK/AVD, JUnit, etc.) verwendet.


* F�r die Erstellung des konzeptuellen und logischen Datenbankschemas wurde der DBDesignerFork verwendet und daraus das entsprechende MySQL-DDL-Skript erzeugt und als Klasse in Eclipse eingebunden, da in der Entwicklungsumgebung bereits Bibliotheken zum Ansteuern der SQLite-DB vorhanden gewesen sind.


* Sonstige Tools waren Modellierungsprogramme, wie ArgoUML und UMLet, welche der theoretischen Konzeption der UML-Diagramme dienten (u.a. Use Cases, Paket-, Klassen-, Deployment- und Komponentendiagramm). Die Versionierung erfolgte �ber git, wie z.B. GitHub.

##1.3. Projektidee, -ziel und -plan (fertig | Thomas)

Die **Implementierungsidee** f�r das (virtuelle) Start-Up #peat entstand aus einem studentischen Grundbed�rfnis (Lernen) sowie der Erfahrung heraus, gefestigtes Wissen l�nger zu behalten, als ungefestigtes Wissen. Daher lag es nahe, eine Anwendungssoftware zu entwickeln, die Lerninteressierte dabei unterst�tzt, erlerntes Wissen durch Wiederholung in **Frageform** zu festigen und damit den Lernerfolg langfristig zu maximieren.


Bei der Namensfindung f�r die Lernapplikation (Lernapp) spielten folgende �berlegungen eine Rolle:


* �peat� stammt aus dem englischen Verb �repeat� (engl. wiederholen)

* ein menschlich klingender Name soll ganz allgemein die Einstellung zum Lernen sowie die Kommunikation bzgl. der Applikation positiv st�rken: #peat als dein Freund

* Hashtag # zur Optimierung des Namens aus Online-Marketingsicht


F�r den sp�teren wirtschaftlichen Erfolg der Lernapp im Allgemeinen sowie f�r eine erfolgreiche Unternehmenskommunikation im Speziellen, z.B. in einem App-Store, ist es u.a. wichtig, einen einpr�gsamen **Claim** bzw. **Slogan** zu haben. F�r #peat ist das


*Erlerntes spielend wiederholen und nie wieder vergessen!*


Eine **Kurzbeschreibung** zur knappen und marktgerechten Erl�uterung der Anwendungsfunktionalit�ten, z.B. f�r einen Appstore oder einen [SEO](https://de.wikipedia.org/wiki/Suchmaschinenoptimierung)-relevanten Text auf der Website, k�nnte wie folgt aussehen:


> #peat hilft dir, dein erworbenes Wissen durch intelligente Wiederholung zu verfestigen und damit ins Langzeitged�chtnis zu �berf�hren. Und das funktioniert so: hinterlege in deinem Account offene oder geschlossene Fragen zu verschiedenen Themenbereichen sowie deren Antwortm�glichkeiten und sage #peat, wann bzw. wie h�ufig dich #peat abfragen soll. Fertig. #peat fragt dich ab sofort bequem per Push-Notification oder per Lernquizz auf deinem Smartphone ab und du kannst die Frage direkt beantworten oder ignorieren. Am Ende des Tages kannst du dir deinen Lernerfolg darstellen lassen. Re #peat!


Wie in Punkt 1.1 bereits erw�hnt, war das vorrangige **Projektziel** das Entwickeln einer Implementierungsidee hin zu einem lauff�higen, pr�sentierbaren Prototypen innerhalb von knapp 3 Monaten. Vor diesem Hintergrund war es daher zun�chst erforderlich, das Gesamtziel in Teilziele zu zerlegen und dabei jeweils zu unterscheiden, was davon realistisch gesehen in dieser Zeit umgesetzt werden kann bzw. was davon in den Ausblick genommen werden muss. Der folgende Milestone-Plan zeigt das Ergebnis dieser �berlegungen, wobei die einzelnen Meilensteine in Anlehnung an die Scrum-Methode als �Sprints� bezeichnet werden:


* Sprint 0) Semesterstart (29.03.2016)

* Sprint 1) Projekt-KickOff E-Mail durch den BA (07.04.2016)

* Sprint 2) UML-Diagramme, Architekturbild, GUI-Entwurf (18.04.2016)

* Sprint 3) Abgabe Expos� (18.04.2016)

* Sprint 4) Freigabe des Expos�s/Projekts durch den BA (23.04.2016)

* Sprint 5) Product Backlog in easyBacklog anlegen (01.05.2016)

* Sprint 6) Einrichten der Entwicklungsumgebung (04.05.2016)

* Sprint 7) Erstellung des Datenbankschemas (08.05.2016)

* Sprint 8) erster, versionierter, explorativer Prototyp ohne Persistenz (23./24.04.2016)

* Sprint 9) Implementierung der Datenbank im Android-Projekt (13.05.2016)

* Sprint 10) Demonstration eines ersten Prototypen und Versionierung (25.05.2016)

* Sprint 11) Lesen aus Datenbank: Wiederholungslogik in Form eines Quizz-Spiels (Datum)

* Sprint 12) Eingabe f�r neue Ja-Nein-Frage speichern (19.06.2016)

* Sprint 13) gespeicherte Frage Lesen und im Quizz darstellen (Datum)

* Sprint 14) Quizz vor und zur�ck gehen ohne Fehler (Datum)

* Sprint 15) Erzeugung des Abgabe-Prototypen inkl. Tests (Datum)

* Sprint 16) Fertigstellung der Enddokumentation (03.07.2016)

* Sprint 17) Vorbereitung Pr�sentation (08.07.2016)

* Sprint 18) Abgabe und Pr�sentation (08.07.2016)


Neben den inhaltlichen Aufgaben geh�rte die **Projektkommunikation** mit dem BA als projektbezogene Aufgabe mit zu den Anforderungen: W�hrend der gesamten Laufzeit des Projektes sollte es mit dem BA einen regelm��igen (mind. 1-2 Wochen) Austausch in Form eines [Protokolls](https://github.com/andreasmosig/peat/blob/master/doc/PROTOKOLLE.md) sowie eines [Statusberichtes](https://github.com/andreasmosig/peat/blob/master/doc/STATUSBERICHTE.md) geben.

#2. Vorbetrachtungen (IST-Analyse)

##2.1. Theoretische Aspekte einer Lernsoftware (fertig | Thomas)

F�r den Entwurf des Datenbankschemas sowie die Modellierung der Wiederholungslogik war es zun�chst wichtig, sich in einem angemessenen Umfang mit dem Sachgebiet vertraut zu machen und die folgenden zentralen Fragen zu beantworten:


* Welche Fragekategorien gibt es, welchen Einfluss haben diese auf die Lernapplikation und welche sind tats�chlich relevant?

* Welchen Einfluss haben Wiederholungsrate und -reihenfolge auf den Lernerfolg?


Die Implementierungsidee zu #peat st�tzt sich im Allgemeinen auf die [Wiederholung als Lernmethode](https://de.wikipedia.org/wiki/Wiederholung_%28Lernmethode%29), die sich der [Fragetechnik](https://de.m.wikipedia.org/wiki/Fragetechnik) bedient. Die Kernfunktionalit�t von #peat umfasst daher alle relevanten **Fragekategorien** und die dazugeh�rigen Antwortformate. In formaler Hinsicht werden die folgenden Fragekategorien unterschieden:[^fu�note1]

[fu�note1]: Vgl. https://de.wikipedia.org/wiki/Fragetechnik#Fragekategorien und https://de.wikipedia.org/wiki/Multiple_Choice#Unterschiedliche_Formate_und_Begrifflichkeiten


* Offene Fragen (freies Antwortformat)

* Geschlossene Fragen:

  * Bin�r-/Entscheidungs-/Ja/Nein-Fragen (eine von zwei dichotomen Antworten trifft zu: wahr/falsch, ja/nein �)

  * Single Choice (eine von n Antworten trifft zu)

  * Multiple Choice: Select (eine bekannte Anzahl von n Antworten trifft zu)

  * Multiple Choice: Check (eine unbekannte Anzahl von n Antworten trifft zu)


F�r #peat sind alle genannten Fragekategorien theoretisch wichtig und relevant, realistischerweise jedoch im Rahmen dieses Projektes nicht abschlie�end umsetzbar. F�r das Prototyping musste diese Menge daher eingeschr�nkt werden und die Wahl fiel ganz im agilen Sinne auf die Fragekategorie mit der geringsten Komplexit�t, den Ja/Nein-Fragen. Der offene Fragetyp war nicht die erste Wahl, da die softwareseitige Eigenbewertung der Antwort f�r einen ersten Prototypen zu komplex und nebens�chlich ist.


Hinsichtlich des optimalen **Wiederholungsintervalls** gibt die [Vergessenskurve](https://de.wikipedia.org/wiki/Vergessenskurve) erste wichtige Anhaltspunkte f�r die sp�tere Modellierung des Wiederholungsalgorithmus, denn sie veranschaulicht den Grad des Vergessens im Zeitverlauf. Aus ihr l�sst sich aufgrund zahlreicher wissenschaftlicher Studien ableiten, dass durch Wiederholung des Lernstoffes, der Grad des Vergessens verringert werden kann, wobei der Abstand der Zeitpunkte der Wiederholung einen relevanten Einfluss hat. Der sogenannte Spacingeffekt besagt, dass Wissen besser erinnert wird, wenn zwischen der Erstaufnahme und der ersten bzw. den folgenden Wiederholung(en) ein gr��erer Zeitraum liegt.[^fu�note2] In der Literatur zu Lernmethoden finden sich diesbez�glich u.a. konkrete Empfehlungen: �Weitere Repetitionen sollen nach 24 Stunden, einer Woche, einem Monat, einem halben Jahr erfolgen.�[^fu�note3]


[fu�note2]: Vgl. http://lexikon.stangl.eu/9382/spacing-effect-intervall-effekt/

[fu�note3]: Vgl. https://www.uni-due.de/edit/selbstmanagement/content/content_k6_2.html)


Diese Empfehlungen sind f�r ein erstes Prototyping bzw. f�r den Anfang sehr praktisch und lassen sich direkt in einen Wiederholungsalgorithmus �bertragen. Eine Vielzahl an Forschungsergebnissen auf diesem Gebiet legt jedoch eine differenziertere Betrachtung nahe; nicht zuletzt mit Blick auf die sp�teren USP der Anwendung.[^fu�note4] Daneben finden sich auch Informationen zu konkreten, frei verf�gbaren Algorithmen[^fu�note5], die jedoch den zeitlichen Rahmen dieses Projektes sprengen w�rden und damit in den Ausblick geh�ren.


[fu�note4]: Vgl. https://en.wikipedia.org/wiki/SuperMemo#Algorithms

[fu�note5]: Vgl. https://www.supermemo.com/english/algsm11.htm, https://www.supermemo.com/english/algsm8.htm, https://www.supermemo.com/english/ol/sm6.htm, http://www.lac.ane.pl/pdf/5409.pdf

##2.2. Vision und Gesch�ftsmodell (fertig | Thomas)

Die **Vision** zu #peat ist, das geliebte Lerntool schlechthin f�r Wissbegierige zu sein.


#peat soll nicht nur eine Plattform sein, auf der die User ihre pers�nlichen Wissensgebiete vertiefen, sondern auch mit anderen Usern teilen oder von professionellen Wissenstr�gern erwerben k�nnen. Thematisch soll #peat universal angelegt sein und bis auf wenige Ausnahmen (z.B. Gewalt) kein Fachgebiet auslassen.


Der Schl�ssel, die Vision zur Realit�t werden zu lassen, liegt dabei in deutlich wahrnehmbaren und f�r den Markt relevanten bzw. treffenden **USP**. Diese k�nnten sein:


* #peat ist einfach: #peat ist auf die wichtigsten Funktionen reduziert, getreu dem Motto �Keep learning simple�.

* #peat ist individuell: frag dich selbst mit deinen eigenen Worten. Der Wiederholungsalgorithmus lernt mit und passt sich deinen Lernbed�rfnissen an.

* #peat ist riesig und vielf�ltig:

  * alle Wissensgebiete sind zug�nglich. Karteikarten sind obsolet.

  * Community: jeder Teilnehmer kann seine eigenen Themen mit allen anderen teilen

* #peat ist effektiv und effizient: der Wiederholungsalgorithmus basiert auf wissenschaftlichen Untersuchungen und optimiert den Lernprozess

* #peat ist �berall: als mobile App und f�r Desktop ist #peat immer dabei


Die f�r den Erfolg notwendigen Investitionen bed�rfen eines tragf�higen **Gesch�ftsmodells**, um die Existenz auch langfristig zu sichern. Die zentrale Frage dabei ist �Wie soll mal Geld verdient werden?�. Wie ein Blick auf die Startup-Szene zeigt, sind Gesch�ftsmodelle durchaus keine starren Gebilde [(Beispiel)](http://www.gruenderszene.de/allgemein/book-a-tiger-festangestellte-reinigungskraefte), sondern k�nnen abgewandelt, erweitert oder angepasst werden. Folgende Ideensammlung kommt f�r eine sp�tere Auswahl in Frage:


* Free: werbefinanzierte Einnahmen

* Freemium:

 * eine funktionsarme (z.B. nicht alle Frageformate stehen zur Verf�gung) Gratis-Version f�r alle sowie eine Vollversion gegen Bezahlung

  * denkbar ist auch eine modulare Erweiterung (z.B. neue Frage-Wiederholungs-Logik), die je Update kostet

* Bezahl-App: jeder Download kostet (beginnend ab einer bestimmten Zahl an Usern)

* Marktplatzmodell (In-App-Kauf): Wissenstr�ger k�nnen Inhalte in Form von Paketen oder Abonnements bereitstellen, z.B. Wissensgebiet �UML�. Diese Pakete bzw. Abonnements kosten je Download. Davon geht ein Teil an #peat, der Rest an den Verfasser.

 ##2.3. Marktanalyse (fertig | Thomas)

Da der Projektfokus auf dem Programmieren lag, geht es bei der Marktanalyse eher um eine grobe Einordnung der Implementierungsidee in den Markt der Anwendungssoftware.


Thematisch bewegt sich #peat auf dem Markt der Bildungsanwendungen, der mit knapp 10% Anteil an allen verf�gbaren Apps im Appstore, das [drittst�rkste Segment](http://de.statista.com/statistik/daten/studie/166976/umfrage/beliebteste-kategorien-im-app-store/) darstellt. Da das Segment Bildung noch zu allgemein gefasst ist, muss weiter eingegrenzt werden. Nach Auffassung der Autoren ist #peat den elektronischen Karteikarten / Lernkarten zuzuordnen, die auch das Segment der elektronischen Vokabeltrainer mit einschlie�en.


In diesem Bereich gab es in den Appstores von Apple und Google zum Zeitpunkt des Projektes bereits zahlreiche Anwendungen: eine Suche am 25.06.2016 nach �Karteikarten� ergab im iTunes App Store ca. 17 Apps f�r Karteikarten und im Google Play Store mehr als 20 Apps (Vokabeltrainer wurden nichtber�cksichtigt). F�r eine echte Software-Entwicklung w�re eine genauere Analyse der einzelnen Anwendungen und deren Funktionalit�ten erforderlich. An dieser Stelle sollen jedoch die ersten [Hinweise](http://www.studis-online.de/Studieren/studi-apps.php) der Google-Suche bzw. von digitalen [Ratgebern](https://allmaxx.de/magazin-uniglobale/studieren/unsere-10-besten-apps-zum-lernen) ausreichen, nach der folgende Anwendungen am bekanntesten / beliebtesten sind:


* [Flashcards Deluxe](http://orangeorapple.com/)

* [BRAINYOO](http://www.brainyoo.de/)

* [AnkiDroid Karteikarten](https://ankidroid.org)


Die H�rden f�r einen erfolgreichen Einstieg in diesen Markt liegen durch die hohe Zahl der Anbieter bereits etwas h�her. Jedoch scheinen sich die aktuellen Angebote auf den ersten Blick an Endverbraucher zu richten (B2C). Ggf. ist die Entwicklung eines B2B-Modells eine aussichtsreiche �berlegung.

#3. Produktdefinition und Systementwurf (SOLL-Konzept)

##3.1. Vorgehensweise (fertig | Thomas)

Die Systementwicklung fand entsprechend der Projektgr��e agil statt und sollte nach Vorgabe durch den Auftraggeber (BA) der SCRUM-Methode folgen. Die in der Theorie eindeutig verteilten Rollen des Product Owners, des Scrum Masters, des Teams und ggf. weiterer externer Rollen war im Rahmen dieses Projektes nicht immer eindeutig bestimmt. Es kam vor, dass alle Teilnehmer sporadisch in die Rolle des Product Owners geschl�pft sind oder jedes Teammitglied spontan in die Rolle des Scrum Masters gewechselt ist. Zu allen Zeitpunkten gab es jedoch immer den Product Owner und das Team.


Der Entwicklungsprozess zu #peat richtete sich nach dem Scrum-Prozess:


* Vision: die Vision stimmt mit der Implementierungsidee �berein und markierte den Beginn der Lernapp #peat

* Product Backlog: als Product Backlog verstehen sich Teile des Expos�s, insbesondere die in UML modellierten Anwendungsf�lle

* Sprint Planning: die 1-2 w�chentlichen Online-Meetings dienten u.a. der Planung, Sch�tzung und Bewertung der einzelnen Backlogs. Auf dieser Basis wurden dann die notwendigen Schritte im Hinblick auf das Projektziel er�rtert. Die Ziele dieser Teilschritte sind mit den Sprintzielen identisch. Das Sprint Planning l�sst sich anhand des [Protokolls](https://github.com/andreasmosig/peat/blob/master/doc/PROTOKOLLE.md) nachvollziehen.

* Selected Product Backlog & Sprint Backlog: die im Sprint Planning definierten Teilschritte enthielten jeweils die notwendig umzusetzenden Aufgaben (Backlogs)

* Sprint: die Sprints an sich hatten einen 1-2 w�chentlichen Rhythmus

* New Functionality: jeder Sprint enthielt jeweils eine in sich geschlossene Funktionalit�t, die dann zum n�chsten Treffen pr�sentierbar sein sollte (usable Software)

* Retrospective: insbesondere die Zusammenk�nfte zu den Pr�senzen dienten der taktischen/strategischen R�ckschau. Kleinere R�ckschauen gab es zu den 1-2 w�chentlichen Online-Meetings.


In der urspr�nglichen Planung sollte der SCRUM-Prozess durch das Tool easyBacklog unterst�tzt werden. Das wurde zu Beginn des Projektes auch versucht, stellte sich jedoch schnell f�r das Projekt als zu umst�ndlich heraus. Die weitreichenden Funktionen von easyBacklog eignen sich besser f�r gr��ere Projekte und ein mit easyBacklog immer aktuell gepflegtes Backlog h�tte in diesem Projekt eher ein ressourcenbindenden Dokumentationscharakter gehabt. Daher wurde f�r den weiteren Verlauf auf dieses Tool verzichtet.


![Auszug aus dem easyBacklog](https://github.com/andreasmosig/peat/blob/master/doc/DOKU/auszug-easyBacklog.png)

##3.2. Requirements (fertig | Thomas, Andi)

Im Rahmen des **Requirements Engineering** geht es im Allgemeinen um die Frage, welche Anforderungen an das zu erstellende Softwaresystem existieren. Da diese Anforderungserhebung immer im Zusammenhang mit bestimmten Personengruppen steht, ist es erforderlich sich mit den (Ziel-)Gruppen bzw. Stakeholdern auseinanderzusetzen, an die #peat sich richtet bzw. die von #peat in irgendeiner Form betroffen sind.


Auf Basis dieser �berlegungen haben sich diverse technische Fragen ergeben, die es im Zuge der Entwicklung zu beantworten galt.


F�r #peat stehen vor allem folgende Stakeholder bzw. Anspruchsgruppen im Fokus:


* Benutzer,

* Investoren,

* Gesch�ftspartner (Kollegen, Lieferanten),

* �ffentlichkeit und

* Staat,


wobei im Rahmen des Projektes ausschlie�lich die sp�teren Benutzer betrachtet wurden.


Das Volere Requirements Specification Template empfiehlt an dieser Stelle eine ausf�hrliche Beschreibung der einzelnen Stakeholder inklusive fiktiver Persona-Profile und Gewichtungen, was jedoch den Rahmen dieser Arbeit �berschritten h�tte.


Um dem elementaren Charakter der Anforderungen gerecht zu werden, war geplant, die Anforderungen wie folgt zu managen:


* Dokumentation von Anwendungsf�llen in Form eines Use-Case-Diagramms

* anschlie�ende Konkretisierung der Requirements mit Hilfe des Tools easyBacklog im Rahmen der Product-Backlog-Erstellung


Wie bereits im Punkt 3.1 erw�hnt, wurde die Arbeit mit easyBacklog aufgegeben, so dass nur das Expos�-Use-Case-Diagramm existiert und damit dieser Punkt etwas zu kurz kam.


![vision�res Use-Case-Diagramm zu #peat](https://github.com/andreasmosig/peat/blob/master/doc/UML/peat-use-case.png)



Mit Blick auf das Projektziel (ausf�hrbarer Prototyp) war es notwendig, diese sehr weit gefassten Anwendungsf�lle auf ein realistisches Ma� zu reduzieren. Die nachfolgenden, ausschlie�lich funktionalen Anforderungen stellen das Ergebnis dieser Eingrenzung dar und bilden die Basis f�r die vom Prototypen zu erf�llenden Funktionalit�ten. Die Schl�sselw�rter "MUSS", "SOLL" und "KANN" sind dabei entsprechend der Definition im RFC 2119 zu interpretieren; Muss (Pflicht), Soll (Wunsch), Wird (Absicht) und Kann (Vorschlag).


###Prototyp:

* Muss I: Frage und Antwort speichern f�r Choice (Ja/Nein) - GUI und Datenbank

* Muss II: Antwort (true, false) aus DB lesen und per Weiter-Button ausgeben - GUI und Datenbank

* Muss III: Je Antwort-Wert (Boolean) aus DB wird entsprechend der gespeicherten Antwort ein Sound wiedergegeben - Sound und Datenbank

* Muss IV: getLastQuestion (back-Button soll die vorherige Frage anzeigen) - GUI und Datenbank


###Ausblick:

* Soll I: getLastQuestion (back-Button zeigt die nicht/falsch-beantwortete Frage erneut)

* Soll II: Vorgehen am Ende des Fragelaufs (Score oder Start von Beginn an)

* Soll III: Wiederholungslogik (nach letzter gespeicherter Frage falsch beantworteten Fragen wiederholen)


* Wird I: Webbasierte Desktop-Version

* Wird II: Alle Fragetyp-Varianten in allen Activities ber�cksichtigen (generischer Code)


* Kann I: Userverwaltung, Standarduser BENUTZER#1, andere Benutzer eingeben

* Kann II: Abspeichern Fragethema, anderes Thema durch Benutzer ausw�hlen

* Kann III: Eigenst�ndige Verwaltung der Wiederholungslogik durch den Benutzer (settings)


Nichtfunktionale Kriterien wurden im Rahmen dieses Projektes nicht ber�cksichtigt und werden im Ausblick kurz angerissen.

##3.3. Design und Architektur (fertig | Andi)

In der Analysephase galt es zun�chst herauszufinden, aus welchen Komponenten das System bestehen w�rde und welche (nicht-) funktionalen Anforderungen die Komponenten erf�llen sollen. Wie in dem vorangegangenen Kapitel zu lesen ist, hat man sich auf bestimmte Grade der Verbindlichkeit hins. der zu erf�llenden Kriterien der Lernapp konzentriert. In einem derart agilen Projekt ist es wichtig, einen Schwerpunkt zu setzen.


In den initialen �berlegungen, welche sich in diversen Entw�rfen wiederspiegeln ([Web-GUI](https://github.com/andreasmosig/peat/tree/master/doc/MOCKUPS/WEB)), ist zun�chst der Weg erkennbar gewesen, dass es zwei Benutzeroberfl�chen geben w�rde (Web, App), die auf eine gemeinsame, auf einem Webserver installierte Datenbank (z.B. LAMP) zugreifen sollten. Dabei sollte die Web-GUI zum Erfassen und Lesen von Daten dienen (Schreib-, Lesezugriff per Benutzerkonto), die App-GUI hingegen das Lesen der Daten sowie das Konfigurieren der Wiederholungslogik zulassen.


Der Ergebnisfokus f�r diese Projektarbeit lag jedoch auf der Entwicklung der App und demnach m�ndeten die Analyse und das daraus resultierende theoretische Konzept im Laufe eines iterativen Prozesses in dem Design respektive in der Entwicklung der App-UI. Mit der Version **v1.0.1** wurde schlie�lich die App-Benutzeroberfl�che fertiggestellt. 


###Design

Unter (Software-)Design versteht man grob den Prozess zwischen Anforderungsanalyse und der Implementierung.


Aufbauend auf den mehr oder weniger konkreten Vorstellungen hinsichtlich der zu entwickelnden App, wurde im Anschluss an das RE die grundlegende Architektur definiert, zun�chst nur wenige Komponenten (i.e. Android-Activities) spezifiziert und die wichtigsten Interaktionen transparent gemacht. Das Design ist auch in dem vorliegenden Projekt die Grundlage f�r den Beginn der konkreten Implementierung der theoretischen und praktischen Aspekte der Lernapp gewesen.


Die Designphase schloss sich (wie in der Theorie empfohlen) an die Analysephase an, weshalb ein Kern an Anwendungsf�llen bezogen auf den Funktionsumfang der App bereits definiert wurde. In easyBacklog wurden, wie bereits eingangs beschrieben, zun�chst die wichtigsten Use Cases mit Rollen, Ereignissen und Ergebnissen dokumentiert und schlie�lich in aus der Entwicklungsarbeit resultierenden Protokollen und fortlaufend aktualisierten Task-Aufstellungen aktualisiert. Man sollte zum Start einen m�glichst guten �berblick haben, d.h. funktionale Anforderungen sollten bekannt sein (z.B. das Speichern und Lesen von Fragen und Antworten in die/aus der Datenbank) als auch nicht-funktionale Anforderungen (z.B. Usability der UI). Es fiel fr�h auf, dass man nicht alles vorher festlegen kann und ebenso, dass zu viele verschiedene Werkzeuge das Hauptaugenmerk, n�mlich die Entwicklung/Programmierung, verwischen. Die Ersten Entw�rfe, die mittels [Lumzy](www.lumzy.com) angefertigt worden sind, zeigten schon fr�h die Anforderungen an die zu entwickelnde Lernapp #peat:


####a) App (f�r Version **v1.0.1**):

![Push] (https://github.com/andreasmosig/peat/blob/master/doc/MOCKUPS/APP/pushnotification.png)

![FrageJaNein] (https://github.com/andreasmosig/peat/blob/master/doc/MOCKUPS/APP/janeinfrage.png)

![Multiple] (https://github.com/andreasmosig/peat/blob/master/doc/MOCKUPS/APP/multiplechoice.png)

![Antwort] (https://github.com/andreasmosig/peat/blob/master/doc/MOCKUPS/APP/antwort.png)

![Einstellungen] (https://github.com/andreasmosig/peat/blob/master/doc/MOCKUPS/APP/einstellungen.png)

####b) Web (f�r Version **v2.0.1**):

![Landing] (https://github.com/andreasmosig/peat/blob/master/doc/MOCKUPS/WEB/landing.png)

![Konfiguration] (https://github.com/andreasmosig/peat/blob/master/doc/MOCKUPS/WEB/konfiguration.png)


Es stellte sich fr�h heraus, dass bei agilen Methoden der Softwareentwicklung die Herangehensweise an das Design bzw. die Architektur eine grundlegend andere ist, als bei den klassischen Vorgehensweisen, wie dem Wasserfallmodell, bei denen auf eine lange Analyse- eine ebenfalls lange Designphase folgt. Aufgrund der zeitlichen Einschr�nkung und des geplanten Vorhabens, wurde auch bei dem Softwareprojekt #peat direkt mit einem Prototyp begonnen, der die grundlegende Architektur enthielt. Dies war m�glich, da die installierten Eclipse-Plugins bereits das nachfolgend etwas n�her beschriebene Model View ModelView- Architekturmuster mitlieferten (AVD/-SDK-Manager, XML- und Java-spezifische Bibliotheken, SQLite, etc.). Es wurden zu Beginn nur wenige Komponenten spezifiziert, wie bspw. die splash-Seite (inkl. Musik), die MainActivity mit dem Quiz sowie grundlengende Einstellungen und die [CI](https://de.wikipedia.org/wiki/Corporate_Identity) der App. D.h. der erste [Spike](https://de.wikipedia.org/wiki/Prototyping_(Softwareentwicklung)#Vertikales_Prototyping_.28Durchstich.29) repr�sentierte bereits einen kleinen Ausschnitt aus dem Design der finalen App. Daraus konnte geschlossen werden, wo die Reise hingehen wird und welche Anforderungen initial nicht ber�cksichtigt wurden. In der Folge konnten Schw�chen relativ fr�h aufgedeckt werden, unterst�tzt durch eine stetige Qualit�tssicherung (Debuggen, Tests, ExceptionHandler, s. [3.4.](##3.4. Konzept der Qualit�tssicherung)). Der jeweils n�chste Meilenstein konnte den Designbereich stetig iterativ erweitern und optimieren.


In dieser Phase wurden nach und nach die Komponenten (i.e. Activities, XML-Sheets und Java-Klassen/-Methoden, Android-Manifest) definiert und gestaltet. Daraus entwickelte sich die finale Struktur und Architektur. Hinzu kam die Logik und Persistenz der Datenbank.


###Architektur

Bei dem vorliegenden System #peat handelt es sich um eine Client-Server-Architektur, mit Thin Client (Webbrowser, Version **v2.0.1**) und einem Rich Client (Android App, **v1.0.1**). Um die Systemarchitektur abzubilden, wurden zu Beginn sowohl ein Komponenten- als auch ein Deploymentdiagramm erstellt:

* Deployment-Diagramm:

![deployment](https://github.com/andreasmosig/peat/blob/master/doc/UML/peat-deployment.png)

* Paket-Diagramm:

![package](https://github.com/andreasmosig/peat/blob/master/doc/UML/peat-package.png)

* Komponenten-Diagramm:

![component](https://github.com/andreasmosig/peat/blob/master/doc/UML/peat-component.png)

Daraus ergab sich eine typische Mehrschichtenarchitektur (N-Tier) mit User Interface (UI), Logiken und Persistenz/Datenbank.


Die Verwendung einer Android-Plattform als Basis der App-Entwicklung gab quasi die [Architektur](https://de.wikipedia.org/wiki/Model_View_ViewModel) bereits vor ![MVVM-Konzept](https://github.com/andreasmosig/peat/blob/master/doc/MIS/MVVM-Konzept.png)

Abbildung: Die Datenbindung (Data Binding) erm�glicht eine Trennung von der View (z. B. XAML-Markup oder HTML) und dem Model f�r die Darstellung.


Das Model View ViewModel (MVVM) ist ein Entwurfsmuster. Es dient zur Trennung von Darstellung und Logik der Benutzerschnittstelle (UI). Gegen�ber dem MVC-Muster (Model-View-Controller) kann die Testbarkeit verbessert und der Implementierungsaufwand reduziert werden, da keine separaten Controller-Instanzen erforderlich sind.


Die drei Komponenten sind:

* Model: Datenzugriffsschicht f�r die Inhalte, enth�lt die gesamte Gesch�ftslogik

* View: durch grafische Benutzeroberfl�che (GUI) angezeigte Elemente, austauschbar

* ViewModel: UI-Logik (Model der View), Bindeglied, ruft Methoden oder Dienste auf



Dieses Muster erlaubte eine gewisse Trennung der Rollen im Projektteam. Es gab UI-Designer (A. Mosig, T. Ricklinkat) und Entwickler (T. Ricklinkat, S. Pawelleck). Die Designer (v.a. A. Mosig) konnten ihren Fokus auf die sogenannte [User Experience](https://de.wikipedia.org/wiki/User_Experience) setzen und die Entwickler die UI- (v.a. T. Ricklinkat) sowie Datenbank-Logik (v.a. S. Pawelleck) schreiben. Daraus formte sich in effizienter Arbeitsteilung die lauff�hige Anwendung #peat.

##3.4. Konzept der Qualit�tssicherung (fast fertig | Thomas, Andi, Steven)

Da der Projektfokus auf dem Programmieren lag, geht es in diesem Punkt weniger um die Prozessqualit�t als vielmehr um die Qualit�t der Software an sich. Das Hauptinstrument zur Sicherstellung und Erh�hung der Softwarequalit�t sind Softwaretests, also automatische oder manuelle Verfahren zur Verifikation und Validierung von Software.


F�r #peat kamen in Anbetracht der Zeit insbesondere folgende Tests in Frage:


* Funktionale Tests bzw. Akzeptanztests: r�ckblickend waren manuelle Funktionstests die h�ufigsten Tests

* Unit-Tests: Assertions w�ren gut geeignet

* Grenzwert-Tests:  um das Funktionieren der Datenbank sicherzustellen, sollten Extremwerte genutzt werden

* Installationstests: h�chste Androidversion um m�glichst viele Ger�te abzudecken?


Im Allgemeinen sollte die Programmierung folgenden Mindeststandards gen�gen:


* Kommentare: jede sinnhaft zusammenh�ngende Codeeinheit soll kommentiert werden

* Logdatei: wichtige Schritte bzw. Teilschritte eines Algorithmus sollen geloggt werden. Beispiel Logeintrag: 

�Log.d(LOG_TAG, "Eine Referenz auf die Datenbank wird jetzt angefragt.");�

* Exception Handling: zur Erh�hung der Robustheit der Anwendung sollen alle kritischen Codestellen aufgefangen werden; frei nach Murphys Gesetz: was schief gehen kann, muss aufgefangen werden.


Ein wichtiger Punkt beim Exception Handling ist das Auffangen nicht behandelter Ausnahmen im Code. In diesem Projekt wurde dies mit folgendem Methodenaufruf realisiert:


�Thread.setDefaultUncaughtExceptionHandler(new ExceptionHandler(this));�


Eingesetzt in jede Activity, liefert dieser Aufruf den relevanten Auszug aus dem LogCat der Android-Entwicklungsumgebung. Hieraus lie� sich unmittelbar auf die Stelle im Code verweisen, die es zu debuggen galt.


**Perspektivisch** sollte bei hinreichend hoher Anzahl der Testf�lle eine Testsuite angelegt werden, also die Testf�lle in ein eigenes Package ausgelagert werden.  

F�r Android-Apps stehen dar�berhinaus auch Testtools zur Verf�gung wie z.B. Testdroid, einem Cloud-Service, f�r Installations- und JUnit-Tests. F�r Last- und Performance-Tests gibt es ebenfalls Dienstleister, z.B. [NeoLoad](http://www.neotys.de/solutions/mobile-load-testing).

#4. Umsetzung

Vieles wurde bereits hinsichtlich der Abweichungen zur Ist- und Soll-Analyse/-Konzeption und der eigentlichen Vorgehensweise gesagt. Aufbauend auf den Vorgaben des BA und den anf�nglich verwendeten Software-Tools, stand zun�chst auch ein klarer Ablauf fest. In praxi wurde jedoch entschieden, sich auf relevante Belange zu fokussieren, i.e. der Programmierung und Implementierung der Muss-Kriterien. Parallel wurden Protokolle gef�hrt, Aufgaben koordiniert und Statusberichte erstellt und diese wiederum an den BA alle zwei Wochen kommuniziert. Die aus der stetigen Kommunikation resultierende Transparenz erm�glichte auch ohne die eingangs genannten Projektmanagement-Werkzeuge eine strukturierte Umsetzung der an das Projektteam sowie an das System gestellten Anforderungen.


Der tats�chliche Ablauf war wie folgt:

* Zun�chst wurden in einem Kick-Off-Meeting mit dem BA und den k�nftigen Projektmitgliedern erste Informationen ausgetauscht sowie Restriktionen und Termine festgelegt. Das Team begann anschlie�end erste Ideen auszutauschen, sich zu einigen und Grundlagen zur Implementierung zu schaffen. Es wurden erste grobe Entw�rfe gestaltet, welche wenige aber relevante Bestandteile der zu entwickelnden App enthalten sollten, aber auch bereits die Entwicklungsumgebung aufgesetzt. Entwickelt wurde mit Eclipse und den f�r die Entwicklung einer Android-App entsprechend notwendigen Plugins, wie z.B. den AVD- sowie den SDK-Manager.


* Bevor man aber �berhaupt beginnen konnte, musste ein das eigene Projekt einleitende und beschreibende Expos� inkl. eines Milestone-Plans erstellt und vom BA abgenommen werden.


* Wie bereits eingangs geschildert, war die Vorgabe des BA, das Projekt iterativ und agil anzugehen. Daher wurde im Anschluss an die kurze aber intensive Analysephase, welche u.a. das Erzeugen von Use Cases in easyBacklog sowie weiteren Modellen und Diagrammen zur Modellierung des Aufbaus und der Anforderungen an das zu entwickelnde System beinhaltete, direkt die Designphase inkl. Prototyping angesiedelt. Es wurden erste Funktionen (splash-Seite inkl. Sound, Titel sowie zwei erste Quiz-Buttons (quiz, score) integriert, welche aber zun�chst nur zur Orientierung dienten.


* Das Prototyping enthielt regelm��ige Releases/Versionen (in GitHub auch Tagging genannt) mit entsprechender Beschreibung der enthaltenen Erweiterungen. Der stets aktuellste und lauff�hige Stand wurde als apk-Datei in einen f�r den BA sowie alle Projektmitglieder frei zug�nglichen Dropbox-Ordner geladen. Mittels der bereits erw�hnten AVD- und SDK-Manager, welche einen Emulator bereitstellten, aber auch in Verwendung der geladenen apk-Datei, konnten unmittelbar und umfassende Tests des jeweiligen Entwicklungsstandes der Lernapp erfolgen.


* Eine weitreichende Erweiterung - und ebenfalls Muss-Kriterium der App - sollte die Erstellung und Implementierung des Datenbank-Schemas in das Android-Projekt und die Eclipse-Umgebung bedeuten (relevante Klassen: PeatDataSource, PeatDBHelper und Question).


* Darauf aufbauend erfolgten weiterhin regelm��ige Tests und Erweiterungen, um die anfangs an das Projekt gestellten Anforderungen sowie Muss- und Soll-Kriterien in Form der modellierten Use Cases zu erf�llen.


* Schlie�lich konnte ein lauff�higer Abgabe-Prototyp final getestet und erzeugt sowie die Enddkumentation des Projektes #peat abgeschlossen werden.


* Die Abgabe der Arbeitsergebnisse erfolgte am 3. Juli.


* Die Pr�sentation vor dem BA fand am 8. Juli an der Beuth Hochschule f�r Technik statt.

##4.1. Plattform (Thomas, Andi, Steven)

Android, SDK und AVD, Java, XML, SQLite

##4.2. GUI (Thomas, Andi)

Das bereits beschriebene Architektur-Muster der Android-Entwicklungsumgebung erm�glicht es, dass zu jeder Komponente der App, in dem Fall zu jeder Activity, jeweils eine eigene Struktur gebaut werden kann. Die objektorientierte Programmierung wiederum stellt den globalen Zugriff und die Wiederverwendung von Objekten sicher. In der Android-Manifest-Datei wird die Hierarchie der Komponenten definiert. Nachstehend folgt ein �berblick �ber die wichtigsten Komponenten, aufbauend auf den Entw�rfen der Designphase:


[Jeder sein Programmier-Anteil hins. XML]

###4.2.1. Screenshots je Activity

###4.2.2. Methoden

##4.3. Logik (Thomas, Andi, Steven)

[Einleitung]


Jeder sein Programmier-Anteil.

##4.4. Persistenz (Steven, Andi)

Zu Beginn, d.h. f�r den ersten lauff�higen Prototyp in der Designphase, lag der Fokus darauf, die ersten Komponenten abzustecken und eine Idee zu entwickeln, wie die Version **v1.0.1** zum Abgabetermin im Juli aussehen k�nnte. Demnach wurden die ersten Fragen in ein starres Array geschrieben, welches wiederum mittels eines if-Statements ausgelesen wurde. Nachstehende Abbildungen zeigen beispielhaft erl�utertes Szenario:


![setNextQuestion-Array](https://github.com/andreasmosig/peat/blob/master/doc/MIS/setNextQuestionArray.png)


![setNextQuestion-ifStatement](https://github.com/andreasmosig/peat/blob/master/doc/MIS/setNextQuestionifStatement.png)


Doch Persistenz bedeutet in der Informatik die F�higkeit, Datenstrukturen in nicht-fl�chtigen Speichermedien, wie Dateisystemen oder Datenbanken zu speichern. F�r das Erstellen des hierf�r notwendigen Datenbank-Schemas (Entity-Relationship-Modell) wurde die Anwendung DBDesigner-Fork verwendet. Dieses Schema bildete die Grundlage f�r die #peat-Datenbank und deren Java-Klassen (PeatDataSource, PeatDBHelper, Question):

![DBDesign] (https://github.com/andreasmosig/peat/blob/master/doc/DB/DBDesign.png)


Hierbei machte es sich das Projektteam zu Nutze, dass z.B. keine JDBC-Verbindung ben�tigt wurde, sondern es bereits Bibliotheken zum Ansteuern der SQLite-Datenbank in der Android-/Eclipse-Entwicklungsumgebung gab.


Zun�chst wurde eine leere Datenbank angelegt. Anschlie�end wurde ein entsprechendes SQL-Skript zur Erstellung der Tabellen geschrieben. Daran ankn�pfend wurden entsprechende Methoden zum Ein- und Auslesen der Daten (Fragen, Antworten) codiert.

##4.5. Versionierung (fertig | Andi)

Das Versions- und Release-Management sind zentraler Bestandteil des Projektmanagements. Dabei geht es darum, dass das gesamte Projekt in seinem Wachstum begleitet wird. Korrekte Auslieferungen und Codezust�nde m�ssen jederzeit sichergestellt und Entwicklungslinien stets nachvollzogen werden k�nnen.


F�r das vorliegende Projekt wurde zur verteilten Versionskontrolle Git verwendet. Git ist eine freie Software zur Unterst�tzung der verteilten Versionsverwaltung von Quellcode. Da es sich hierbei um eine verteilte Versionskontrolle handelt, besa� jedes Projektmitglied sein eigenes lokales Repository, in das er �nderungen einpflegen konnte. Die einzelnen individuellen Repositories konnten �ber bestimmte Operationen (z.B. push, pull) Informationen austauschen. Die lokalen Repositories erm�glichten daher weitgehend unabh�ngiges Arbeiten.


Die Versionskontrolle sollte im Optimalfall Teil eines Gesamtzyklus (Continious Integration) sein, bestehend aus einem CVS, einem automatisierten Buildprozess (z.B. mit Ant), Tests zur Sicherstellung der Codequalit�t (z.B. mit JUnit) und der Fehlerbeseitiung/-verwaltung (z.B. mit Bugzilla). Aufgrund des relativ �berschaubaren Projektes, wurde w�hrend dieses Projektes auf automatisierte Buildprozesse, Testsuiten o.�. verzichtet.


Das Projekt hatte nichtsdestotrotz dank der iterativen und agilen Vorgehensweise und der das gesamte Projekt umfassenden Verwendung von GitHub zur Verwaltung aller Projektinhalte (Quellcode, Releases, Expos�, Protokolle, Dokumentation sowie aller sonstigen Einstellungen, Dateien und Zust�nde, die f�r das Funktionieren des Systems relevant sind) zeitnah und jederzeit einen lauff�higen Code resp. Prototyp ([Durchstich](https://de.wikipedia.org/wiki/Prototyping_(Softwareentwicklung)#Vertikales_Prototyping_.28Durchstich.29)) zur Folge. Zusammengefasst nennt man die Summe der beschriebenen Systeme (Verions-, Release- und Konfigurationsmanagement) **Change Management**.


In GitHub konnten st�ndig Snapshots auf Versionsst�nde ([Releases](https://github.com/andreasmosig/peat/releases)) vorgenommen werden. Dies geschah mittels des sogenannten [Tagging](https://git-scm.com/book/en/v2/Git-Basics-Tagging) �ber die Git-Shell. Hier�ber wurden auch Konflikte beim Mergen vom Code der einzelnen Repositories transparent gemacht und gel�st. Fehlerfreier Sourcecode wurde freigegeben und in das zentrale [Repository](https://github.com/andreasmosig/peat) �bertragen. Zu Dokumentationszwecken konnte anhand der commits stets nachvollzogen werden, wer welche �nderung vorgenommen hat und welche Features integriert worden sind. Zum Download lag jederzeit die letzte auf ihre Lauff�higkeit hin getestete Version von #peat in einer Dropbox bereit: [Hol� dir #peat](https://www.dropbox.com/sh/8djn2di76w9jqga/AABS1uvujSAhcy7iVWHPvo9oa?dl=0)!

#5. Schlussbetrachtung

##5.1. Zusammenfassung (Thomas, Andi, Steven)

Was zu Beginn nur ein Spiel gewesen ist, k�nnte nun das Lernen vieler Sch�ler und Studenten, Auszubildenden und anderen Lerninteressierten erleichtern und vielleicht sogar Freude bereiten.


Der erste Prototyp von #peat ist tats�chlich zu einer lauff�higen Android-App entwickelt worden. Der Fokus lag auf wenigen, aber relevanten Komponenten, deren Umsetzung bereits jetzt vielversprechend ist und den praktischen Einsatz der mobilen Applikation zul�sst.


#peat erm�glicht das Abspeichern eigener Fragen und Antworten und deren Wiedergabe innerhalb des Quiz sowie eine Themen- und Benutzerverwaltung.

Mit etwas Gl�ck und dem richtigen Marketing wird #peat nicht nur die Nummer 1 auf dem Markt der Lernapps sein. Auch die sich in Planung befindliche Website wird zur neuen Startseite unseres peers.

##5.2. Erkenntnisse (fertig | Andi)

Im Zuge der Projektarbeit stellte sich heraus, nachdem anf�nglich noch easyBlock f�r die Anlage der Use Cases resp. asana f�r die Projektorganisation verwendet worden waren, dass die Arbeit mit Slack und moodle (Projektkommunikation und -organisation) und GitHub (Versionierung, Dokumentation) sowie das iterative Entwickeln und Testen in der Eclipse/Android-Umgebung v�llig ausreichend, zufriedenstellend und insbesondere iterativ und agil waren. Es lie� sich viel effizienter arbeiten, da nebenher nicht viel dokumentiert und modelliert wurde. Im Nachhinein konnte festgestellt werden, dass die Teilprojekte und Subtasks gleicherma�en erf�llt werden konnten, allein mit den zuletzt genannten Werkzeugen: Slack, moodle und GitHub.


Eine weitere Erkenntnis ergab sich aus dem Arbeiten mit GitHub. Eine theoretische Grundlage besa� jedes Mitglied des Teams. Allerdings wurde noch nie praktisch mit der Versionsverwaltung gearbeitet. Daraus resultierten beim Zusammenf�hren besagter Codefragmente diverse Konflikte, die es �ber die Git-Shell zu l�sen galt.


Doch es muss r�ckblickend durchaus auch kritisch beurteilt werden, was hinsichtlich der initialen Anforderungsanalyse und insbesondere die Einigung darauf, was tats�chlich umgesetzt werden sollte, gewisserma�en schief lief. Die Vorstellung dar�ber, was das System k�nnen sollte, war allen Teammitgliedern bewusst. Was das System allerdings tats�chlich k�nnen wird, offenbarte diverse Disparit�ten. Denn die Erwartungen an die App waren recht gro�, schlussendlich wohl �bermotiviert und unrealistisch. Eine konkrete Aussage und Entscheidung, welche der Anforderungen f�r die Abgabe an den BA gen�gen werden m�ssten, wurden erst sp�t getroffen. Dies zeigte auch, dass es keine konkrete F�hrungsperson innerhalb der Projektgruppe gab. Je n�her die Abgabe r�ckte, desto klarer wurde aber, dass es Entscheidungen bedurfte.


In diesem Zusammenhang ist ebenfalls hervorzuheben, dass die Grundlagen und Kenntnisse in der Programmierung nicht derart ausgepr�gt waren und sind, sodass man diesbez�glich h�ufig an seine eigenen Grenzen stie�. Die Rollenverteilung (UI-Designer und Entwickler) wurde dahingehend noch eindeutiger definiert. Man konnte allerdings feststellen, dass die Gruppe aus unterschiedlichen Charakteren bestand. Ganz im Sinne der [Teamrollen](https://de.wikipedia.org/wiki/Teamrolle) nach Belbin gab es in dem Team #peat die unterschiedlichsten Vertreter (Umsetzer, Macher, Koordinator, Spezialist). Die richtige Kombination von verschiedenen Teamrollen machte dieses Team - bis auf die angesprochene Entscheidungsfindung f�r das lauff�hige Arbeitsergebnis - effizient.

##5.3. Ausblick (fertig | Andi)

Aus den vorangegangen Ausf�hrungen ist zu entnehmen, dass diese Lernapp noch viel Erweiterungspotential birgt. In der angeraumten Zeit hat man sich aber auf die relevanten Bereichen und Komponenten und Activities fokussiert.


M�gliche Erweiterungen der Nachfolgeversionen, beginnend bei **v2.0.1**, sind nachstehend stichpunktartig umrissen:


###a) Funktionale Anforderungen an die App:

* Angebot: Die GUI wurde vorbereitet auf das geplante Angebot mehrerer Fragekategorien, welches in **v2.0.1** realisiert werden SOLL (s. [2.1.](##2.1. Theoretische Aspekte einer Lernsoftware)).

* Settings: Eine Erweiterung der Funktionalit�ten der Einstellungen-Activity SOLL erfolgen (intelligenter, selbstlernender Wiederholungsalgorithmus (s. [2.1.](##2.1. Theoretische Aspekte einer Lernsoftware)), Abbruch-/Fehlermeldung, Update-Steuerung, u.v.m.).

* Persistenz: Statt der Verwendung einer lokalen Datenbank (hier: SQLite), SOLL eine Anbindung an einen �[Backend-as-a-Service](http://t3n.de/news/backend-as-a-service-parse-504596/)�-Anbieter wie Parse realisiert werden (alternativ eine Remote-DB auf einem Server).

* Push-Notification: WIRD mit externen Diensten m�glich gemacht:

  * [Parse-Tutorial](]https://parse.com/tutorials/android-push-notifications)

  * [Parse-QuickStart](https://parse.com/apps/quickstart#parse_data/mobile/android/native/new)

* Qualit�t: Bewertung von Fragen (G�te, Schwierigkeitsgrad) sowie eine gewisse Selbstreinigung ist hins. des Designs und der Anforderung definiert und umgesetzt. Die Logik geht allerdings mit einer Themen- und Nutzerverwaltung einher. Deren vollst�ndige Ausarbeitung WIRD f�r die Version **v2.0.1** vorgesehen.

* Externer Webservice: KANN z.B. sein 

  * https://de.wikipedia.org/wiki/Wikipedia:Technik/Datenbank/API

  * https://www.mediawiki.org/wiki/API:Main_page/de


###b) Funktionale Anforderungen an die Website:

* Webpage-Prototyp: SOLL u.a. dem Download der App sowie dem Speichern von Fragen/Antworten dienen:

![PeatLanding] (https://github.com/andreasmosig/peat/blob/master/doc/MOCKUPS/WEB/1_peatlanding.png)

![PeatSave] (https://github.com/andreasmosig/peat/blob/master/doc/MOCKUPS/WEB/2_f�llepeat.png)

![PeatFeedback] (https://github.com/andreasmosig/peat/blob/master/doc/MOCKUPS/WEB/3_feedbackpeat.png)

* Webserver: SOLLTE z.B. sein: SAAS, oder lokaler Webserver (z.B. LAMP/XAMPP, Zugriff per DynDNS).

* Webframework: K�NNTE z.B. sein: Bootstrap, ein auf CSS/LESS und JavaScript basierendes UI-Framework; f�r diverse Funktionaltit�ten, wie Bentnutzerkontensteuerung und Authentifizierung sind gegebenfalls andere Frameworks und zus�tlich ein Content Management System notwendig (z.B. Ruby on Rails, Silverstripe).


###c) Nicht-Funktionale Anforderungen an die App und an die Website:

* Look and feel: Die App und die Website SOLLEN f�r Jugendliche ab 13 Jahren verst�ndlich und bedienbar sein.

* Compliance: Die Verwendung der App und der Website SOLL an die Akzeptanz eines Verhaltenskodex gekn�pft sein.

* Performance: Die Anwendung SOLL in der Lage sein, im ersten Jahr bis 500.000 User zu verwalten und in den darauf folgenden 3 Jahren bis zu 5 Millionen.

* Community: Aus der Themen- und Nutzerverwaltung sowie der Bewertung von Fragen KANN, unterst�tzt durch eine webbasierte L�sung, der Gedanke von Contributors und Followern verfolgt werden.

#6. Weiterf�hrende Links

* R�ckblick

* Aktueller Stand

* Ausblick

* GitHub

* Projektmanagement (asana)

* Slack-Kanal

#7. Glossar

BA    Business Angel

bspw.    beispielsweise

bzgl.    Bez�glich

bzw.    beziehungsweise

CI    Corporate Identity

d.h.     das hei�t

ggf.    gegebenenfalls

i.e.    id est

peer    Interessengruppe

RE    Requirements Engineering

resp.    respektive

SEO    Search Engine Optimization

u.a.    unter anderem

USP    Unique Selling Proposition

