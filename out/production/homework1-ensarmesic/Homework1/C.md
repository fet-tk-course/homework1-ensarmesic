# Zadaća br. 1 - C

U vrtiću, djeca uče o uzgoju biljaka. Učiteljica je odlučila da svako dijete dobije priliku da posadi svoju omiljenu biljku u male čaše na prozoru. Svako dijete je moglo birati između četiri dostupne vrste biljaka: **grah**, **visibaba**, **rotkvica** i **cikorija**.

## Potrebno je da na osnovu dijagrama, odredite koje biljke je svako dijete posadilo i za koje su odgovorni.

### U vrtiću je 12 djece:
- Alen
- Amina
- Amila
- Denis
- Edin
- Elnur
- Ensar
- Faris
- Ibrahim
- Mujo
- Nedim
- Tarik

### Svaka vrsta biljke ima svoje šifriranje u dijagramu:
- **Grah**: `G`
- **Visibaba**: `V`
- **Rotkvica**: `R`
- **Cikorija**: `C`

### Svako dijete dobije četiri čaše, po dvije u svakom redu:

[prozor][prozor][prozor]<br>
....................... # svaka tačka predstavlja čašu <br>
.......................<br>


Učiteljica dodjeljuje čaše djeci abecednim redom po imenima, što znači da **Alen** dolazi prvi, a **Tarik** posljednji.

### Primjer dijagrama koji predstavlja Alenove biljke:

[prozor][prozor][prozor]<br>
VR......................<br>
RG......................<br>


U prvom redu, najbližem prozoru, **Alen** ima **visibabu** i **rotkvicu**. U drugom redu ima **rotkvicu** i **grah**.

### Zadatak:

Kao ulaz, program će dobiti dijagram koji prikazuje biljke zasađene od lijeva ka desno, počevši od reda najbližeg prozoru. Na osnovu toga trebate odrediti koje biljke pripadaju svakom djetetu.

## Zahtjevi:

### 1. **Interfejs `Biljka`**:
Kreiraj interfejs `Biljka` sa metodom `nazivBiljke()` koja vraća naziv biljke na osnovu šifre (`G`, `C`, `R`, `V`).

### 2. **Implementacija klasa za biljke**:
Kreiraj klase `Grah`, `Visibaba`, `Rotkvica`, i `Cikorija` koje implementiraju interfejs `Biljka`. Svaka od ovih klasa treba da sadrži metodu koja vraća puni naziv biljke.

### 3. **Klasa `Dijete`**:
Kreiraj klasu `Dijete` koja sadrži ime djeteta i listu biljaka za koje je dijete odgovorno. Implementiraj metodu koja omogućava dodavanje biljaka djetetu.

### 4. **Klasa `Basta`**:
Kreiraj klasu `Basta` koja prima dijagram kao ulaz i inicijalizuje djecu i biljke. Ova klasa treba da ima metodu koja vraća biljke za određeno dijete na osnovu njihovog imena.

### Dodatni zadatak:
Implementiraj metodu koja učitava dijagram biljaka iz tekstualne datoteke i inicijalizuje klasu `Basta` na osnovu tih podataka, te vraća ispis biljaka za svako dijete.

---

## Primjer ulaza:

[prozor][prozor][prozor]<br>
VRCGVVRVCGGCCGVRGCVCGCGV<br>
VRCCCGCRRGVCGCRVVCVGCGCV<br>

Ako upitate za **Alenove** biljke, program treba da vrati:

Visibabe, rotkvice, visibabe, rotkvice


Ako upitate za **Aminine** biljke:

Cikorija, grah, cikorija, cikorija