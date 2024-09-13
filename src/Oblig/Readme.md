Denne innleveringen i faget Algoritmer og Datastrukturer ble levert 13.09.2024.

Den besto av til sammen syv oppgaver, som hver enkelt vil forklares i dette dokumentet: 

Oppgave_1: Oppgaven tok for seg algoritme for å finne maksverdi ala en boble-algoritme. Den besto av en enkel metode, med det beskrivende navnet max. Denne metoden brukte en enkel if - betingelse. Første del av denne betingelsen tok for seg en NoSuchElementException, som skulle gi beskjed ved tom liste og dernest ingen største verdi. Den andre delen av betingelsen, else - delen begynte med verdi m, skrevet int m i dokumentet, som 0 - for å signalisere startpunktet på listen. Videre ble det skrevet en for - løkke som hele tiden vurderte om [0] var større enn neste verdi, hvor den fortsatte løkken til den var ferdig med listen og returnerte deretter tilbake til [0].
I andre delen av Oppgave_1 ble det brukt en Main metode for å instansiere liste, før listen ble kjørt gjennom en System.out.println med metoden.

Oppgave_2: Denne oppgaven handlet om å finne antall ulike verdier usortert. Denne også handlet om å lage metode. Hvis det ikke var verdier å finne antall av, skulle kastes IllegalStateException for å returnere 0. For - løkken skulle gå gjennom de enkelte verdiene og med hjelp av en if - betingelse matche om start verdien, notert i, matchet neste, notert a[i - 1], hvilken den skulle fortsette å gjøre til siste verdi på listen og deretter returnere dette antallet. 
Også her ble det brukt en enkel Main - metode for å instansiere liste, her ble det også brukt en try - catch metode for å skrive ut antall verdier i try, og for å kunne catche feil med hjelp av tidligere nevnte feilmelding.

Oppgave_3: Imotsetning til forrige oppgave skulle her finnes verdier sortert. 
Her er en beskrivelse av Oppgave_3 skrevet i en lignende stil som den for Oppgave_2:

Oppgave_3: Denne oppgaven handlet om å finne antall unike verdier i en usortert liste. Her ble det laget en metode som teller hvor mange verdier som er unike i listen. Hvis listen var tom, skulle metoden returnere 0, men dette ble ikke eksplisitt håndtert i koden. Metoden benyttet en dobbel for-løkke for å sjekke hvert element mot de tidligere elementene i listen. For hvert element i listen ble det kontrollert om det allerede var funnet tidligere. Hvis ikke, ble telleren antallVerdier økt med 1 for å reflektere det nye unike elementet. Den ytre for-løkken gikk gjennom hver verdi i listen, og den indre for-løkken sjekket om den aktuelle verdien allerede hadde blitt registrert tidligere ved å sammenligne med tidligere elementer i listen. Hvis verdien var unik (ikke funnet tidligere), ble telleren for unike verdier økt. Til slutt returnerte metoden antallet unike verdier i listen.
En enkel main-metode ble brukt for å opprette en liste med verdier, kalle metoden for å telle unike verdier, og skrive ut resultatet.

Oppgave_4: Denne oppgaven handlet om å sortere et array med en spesifikk metode som først deler arrayet i to deler basert på om tallene er partall eller oddetall, og deretter sorterer hver del separat ved hjelp av quicksort. Først tar programmet for seg deling av arrayet: Metoden delSortering starter med å bruke to pekere, left og right, for å skille oddetall og partall i arrayet. left-peker begynner fra venstre og beveger seg til høyre for å finne partall, mens right-peker begynner fra høyre og beveger seg til venstre for å finne oddetall. Når et partall og et oddetall er funnet på feil side, blir de byttet om. Denne prosessen fortsetter til alle partall er til venstre og oddetall er til høyre. Programmet tok deretter for seg sortering, etter at arrayet er delt i to, brukes quicksort-metoden til å sortere begge delene. quicksort er en effektiv sorteringsalgoritme som fungerer ved å velge et pivot-element og dele arrayet i elementer som er mindre enn eller lik pivoten og elementer som er større. Den sorterer deretter de delene rekursivt. Deretter ble det gjort swap-operasjoner: swap-metoden brukes for å bytte to elementer i arrayet. Dette er nødvendig for både å omorganisere elementene under delingsprosessen og under quicksort-operasjonen. I main-metoden opprettes et array med verdier. delSortering-metoden blir kalt med dette arrayet som argument for å sortere det i henhold til den spesifikke metoden som først deler arrayet og deretter sorterer delene. Resultatet skrives ut ved hjelp av Arrays.toString for å vise det sorterte arrayet.
Denne metoden gir en to-trinns sorteringsprosess hvor arrayet først blir delt opp basert på en betingelse og deretter sortert effektivt med quicksort.


Oppgave_5: Denne oppgaven handlet om å rotere et array med tegn (char) slik at det siste elementet flyttes til begynnelsen av arrayet, og de øvrige elementene flyttes ett skritt til høyre. Programmet begynte med rotasjon. Det sjekket for null: Metoden begynner med å sjekke om arrayet er null. Hvis det er tilfelle, returneres metoden umiddelbart uten å gjøre noe, for å unngå en NullPointerException. Deretter Lagret programmet det siste elementet: Det siste elementet i arrayet (a[a.length - 1]) lagres i variabelen last. Ved hjelp av en for-løkke flyttes hvert element ett skritt til høyre. Dette skjer ved at elementet på posisjon i - 1 blir kopiert til posisjon i. Løkken starter fra slutten av arrayet og går mot starten.Etter at alle elementene er flyttet, plasseres det lagrede siste elementet (last) på den første posisjonen i arrayet (a[0]).
I main så opprettet et array: Et array med tegn char er opprettet og fylt med bokstaver fra 'A' til 'J'.
Kalle rotasjonsmetoden: Metoden rotasjon blir kalt med dette arrayet som argument, som roterer arrayet ved å flytte det siste elementet til begynnelsen.
Etter rotasjonen skrives det resulterende arrayet ut ved hjelp av en for-utvidet løkke, som skriver ut hvert tegn med et mellomrom mellom.
Denne metoden roterer arrayet ved å flytte det siste elementet til starten og forskyve de øvrige elementene til høyre, og bruker en enkel løkke for å oppnå dette. Hovedmetoden demonstrerer bruken av rotasjon-metoden og viser deretter resultatet.

Oppgave_7_1: Denne oppgaven handlet om å sammenflette to strenger ved å vekselvis ta tegn fra hver streng. Metoden plait tar to strenger, s og t, og sammenfletter dem ved å alternere tegn fra hver streng. Hvis en streng er lengre enn den andre, legges de gjenværende tegnene fra den lengre strengen til på slutten av resultatet. En tom streng result blir deretter brukt til å bygge opp det sammenflettede resultatet. To indekser, i og j, blir brukt for å holde styr på posisjonene i strengene s og t henholdsvis. While-løkken kjører så lenge det finnes tegn igjen i minst en av strengene (i < s.length() eller j < t.length()). Innenfor løkken blir det først lagt til et tegn fra s i result (hvis det er flere tegn igjen i s), og deretter et tegn fra t (hvis det er flere tegn igjen i t). Indeksene i og j oppdateres etter hvert tegn som legges til. Når løkka er ferdig, returneres den sammenflettede strengen result
plait("ABC", "DEF") sammenfletter strenger ved å alternere tegn fra "ABC" og "DEF" for å gi "ADBECF".
plait("IJKLMN", "OPQ") sammenfletter strenger ved å alternere tegn fra "IJKLMN" og "OPQ" for å gi "IOPJQLKMNN".
plait("", "AB") håndterer tilfeller der en av strengene er tom, og gir resultatet "AB" ved å returnere den andre strengen.
Dette er en måte å sammenflette to strenger ved å alternere tegn fra hver, og håndterer også tilfeller der strengene har ulik lengde. Hovedmetoden demonstrerer hvordan plait-metoden fungerer med ulike inngangsstrenger.

Oppgave_7_2: Denne oppgaven handler om å sammenflette flere strenger på en litt mer kompleks måte enn i Oppgave_7_1. Her sammenfletter vi et vilkårlig antall strenger ved å ta det første tilgjengelige tegnet fra hver streng i en roterende rekkefølge. Metoden plaid tar et variabelt antall strenger som argumenter (via String... s), og sammenfletter dem ved å ta tegn fra hver streng i rekkefølge basert på deres posisjon. Hvis en streng har færre tegn enn de andre, blir den bare brukt så lenge det er tegn tilgjengelig i den. En tom streng result brukes til å bygge opp det sammenflettede resultatet. 
sign er en boolsk variabel som brukes for å indikere om det er flere tegn å legge til fra noen av strengene.
index er indeks som holder styr på hvilken posisjon i strengene vi skal hente tegn fra.
while (sign)-løkka fortsetter så lenge det er tegn tilgjengelig i minst én av strengene.
sign settes til false i starten av hver iterasjon, og oppdateres til true hvis et tegn blir lagt til i result.
En for-løkke går gjennom hver streng i s og sjekker om den har et tegn på den aktuelle index-posisjonen. Hvis så, legges det tegnet til i result, og sign settes til true.
Indeksen index økes etter hver iterasjon for å gå til neste posisjon i strengene.
Når det ikke er flere tegn igjen i noen av strengene, avsluttes løkka, og den sammenflettede strengen result returneres.
Metoden plaid kalles med flere strenger som argumenter. Den skriver ut den sammenflettede strengen som er resultatet av å ta det første tilgjengelige tegnet fra hver streng i en roterende rekkefølge, og deretter flytte til neste posisjon.


// chatGPT er brukt i situasjoner jeg har manglet enkelte ord, og for å forklare konsepter.


Svar på teoretiske spørsmål knyttet til oppgave_1:

a.) Programmet går gjennom alle elementer i tabellen for sammenlikning.
b.) Dette skjer når programmet går gjennom listen synkende.
c.) Flest ombyttinger skjer når tabellen er sortert i omvendt rekkefølge, dvs. den største verdien er på starten av tabellen og den minste verdien er på slutten.
d.) For å beregne det gjennomsnittlige antallet ombyttinger, må vi vurdere alle mulige permutasjoner av arrayet og finne et mønster. For en tilfeldig permutasjon av tallene fra 1 til 𝑛 n, kan det gjennomsnittlige antallet ombyttinger være representert ved 𝑛 −1. n−1 ombyttinger per bytte. 
