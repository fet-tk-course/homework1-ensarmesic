# Zadaća br.1 - B

Imate listu objekata tipa `Engineer`, gde svaki inženjer ima specifične karakteristike i ekspertize. Vaš zadatak je da organizujete podatke o inženjerima koristeći napredne funkcije kao što su `fold()`, `reduce()`, i `aggregate()`.

## Potrebno je sljedeće:

1. **Kreirajte interfejs `Person`** koji sadrži osnovne metode za vraćanje imena i titule osobe.

2. **Kreirajte osnovnu klasu `Engineer`** koja implementira interfejs `Person`. Ova klasa treba da sadrži:
   - Ime i prezime inženjera
   - Titulu (npr. Softverski inženjer, Inžinjer elektrotehnike, Mašinski inženjer)
   - Broj godina iskustva
   - Ekspertize (lista tehnologija u kojima je inženjer stručan, npr. Python, C++, CAD, Embedded systems)

3. **Kreirajte specifične klase inženjera** koje nasljeđuju klasu `Engineer`:
   - **`SoftwareEngineer`**: Ova klasa predstavlja softverske inženjere i dodatno sadrži polje `nrProjects` koje označava koliko softverskih projekata je inženjer radio.
   - **`ElectricalEngineer`**: Ova klasa predstavlja inženjere elektrotehnike i dodatno sadrži polje `nrCertificates` koje označava broj certifikata koje je inženjer stekao.

4. **Implementirajte sljedeće funkcije koristeći `fold()`, `reduce()`, i `aggregate()`**:
   - **Prva funkcija** koja koristi `fold()` za kreiranje liste svih inženjera grupisanih po ekspertizama, uzimajući u obzir samo one koji imaju više od 5 godina iskustva.
   - **Druga funkcija** koja koristi `reduce()` za pronalaženje inženjera sa najviše godina iskustva u svakoj grupi (`SoftwareEngineer` ili `ElectricalEngineer`).
   - **Treća funkcija** koja koristi `aggregate()` za izračunavanje ukupnog broja projekata za softverske inženjere i ukupnog broja certifikata za inženjere elektrotehnike, vraćajući zbir obje grupe.

5. **Uporedite prednosti i mane svakog pristupa** (`fold`, `reduce`, `aggregate`) i navedite koje situacije zahtijevaju korištenje jedne funkcije u odnosu na drugu.

6. **Dodatni zadatak**: U funkciji `main`, za svakog inženjera prikažite specifične podatke zavisno od toga da li je `SoftwareEngineer` ili `ElectricalEngineer` (broj projekata ili broj certifikata), i na kraju prikažite zbir broja projekata i certifikata koristeći funkciju `aggregate()`.

---

### Korištenje:

Za kreiranje liste inženjera i pozivanje funkcija koristite sljedeće podatke. Navedeni tekst vam treba poslužiti za kreiranje metoda za ispis `printEngineerData`:

1. **Emina** je softverski inženjer sa 8 godina iskustva, ekspert u Pythonu i Javi, radila je na 15 projekata.
2. **Alen** je inženjer elektrotehnike sa 10 godina iskustva, ekspert u Embedded systems i FPGA, ima 4 certifikata.
3. **Denis** je softverski inženjer sa 5 godina iskustva, ekspert u C++ i Go, radio je na 8 projekata.
4. **Amina** je inženjer elektrotehnike sa 6 godina iskustva, ekspert u CAD softverima i analognoj elektronici, ima 2 certifikata.
5. **Faris** je softverski inženjer sa 12 godina iskustva, ekspert u Kotlinu i C#, radio je na 20 projekata.
