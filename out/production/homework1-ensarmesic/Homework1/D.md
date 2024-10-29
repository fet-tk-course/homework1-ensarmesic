# Zadaća br. 1 - D

Nalazite se u zgradi, gdje da biste ušli u kupatilo morate unijeti kod. Na recepciji vam nisu dali kod, već samo instrukcije na osnovu kojih ćete doći do koda. Tastatura gdje trebate unijeti kod izgleda ovako:

1 2 3
4 5 6
7 8 9


## Pravila dekodiranja instrukcija:
- Počinjete na broju **5**.
- Svaka linija instrukcija vam govori kako se kretati:
  - **^** (gore)
  - **v** (dole)
  - **<** (lijevo)
  - **>** (desno)
- Svaka linija instrukcija počinje na dugmetu na kojem ste stali na kraju prethodne linije.
- Ukoliko pokušate da se pomjerite izvan tastature, ostajete na istom dugmetu.
- Nakon što završite sa praćenjem instrukcija na jednoj liniji, zapamtite dugme na kojem ste završili, i taj broj je jedna od cifara sigurnosnog koda.

## Kreirajte sljedeću strukturu:

### 1. **Interfejs `Instrukcija`**:
Definišite metodu `pomjeri()` koja prima trenutnu poziciju i vraća novu poziciju na tastaturi.

### 2. **Kreirajte implementacije za svaku instrukciju** (`Gore`, `Dole`, `Lijevo`, `Desno`):
Svaka klasa treba da implementira interfejs `Instrukcija`.

### 3. **Klasa `Tastatura`**:
- Ova klasa treba da sadrži matricu koja predstavlja raspored dugmadi na tastaturi.
- Metoda `pomjeri()` prima trenutnu poziciju i instrukciju, a zatim vraća novu poziciju na osnovu primljene instrukcije.
- Implementirajte validaciju u okviru metode `pomjeri()` da spriječite pomjeranje izvan tastature.

### 4. **Klasa `Dekoder`**:
- Ova klasa prima listu instrukcija i tastaturu.
- Sadrži metodu `dekodiraj()` koja obrađuje svaku liniju instrukcija i vraća sigurnosni kod.

---

## Dodatni zadatak:
Implementirajte funkciju koja učitava instrukcije iz tekstualne datoteke (`.txt`), koristi klasu `Dekoder`, i vraća sigurnosni kod. Omogućite korisniku da unese putanju do datoteke.

---

## Primjer instrukcija:

\^<<<br>
\>\>vvv<br>
\<\^\>v\<<br>
\^\^\^^v<br>


### Primjer dekodiranja:

1. **Počinjete na broju 5**.
2. Pratite instrukciju `^<<`: pomjerite se gore do 2, lijevo do 1, pokušate opet lijevo (ali ostajete na 1 jer ne možete izaći sa tastature). Prvi broj koda je **1**.
3. Sljedeća instrukcija je `>>vvv`: desno do 3, zatim tri puta dole, ali se zaustavite na 9 jer je to donja granica tastature. Drugi broj koda je **9**.
4. Instrukcija `<^>v<`: vodi vas lijevo do 8, gore do 5, desno do 6, dole do 9, lijevo do 8. Treći broj koda je **8**.
5. Instrukcija `^^^^v`: pomjerite se četiri puta gore do 2, zatim jedanput dole do 5. Četvrti broj koda je **5**.

### Na osnovu ovog primjera, sigurnosni kod je **1985**.

---

Koristite klase `Instrukcija`, `Tastatura`, i `Dekoder` kako biste implementirali rješenje.
