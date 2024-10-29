
# Zadaća br. 1 - A

Organizujete meetup za programere i imate listu objekata tipa `Developer`, gde svaki objekat sadrži informacije o programerima koji dolaze na događaj.

## Potrebno je sljedeće:

1. **Kreirajte interfejs `Person`** koji sadrži osnovne metode gde vraća starost osobe i vraća zemlju iz koje osoba dolazi.
2. **Kreirajte osnovnu klasu `Developer`** koja nasljeđuje interfejs `Person`. Ova klasa treba da sadrži:
   - a) Ime i prezime programera
   - b) Godine
   - c) Zemlju 
   - d) Programske jezike koje programer koristi
3. **Kreirajte specifične klase programera** koje nasljeđuju klasu `Developer`:
   - a) `BackendDeveloper`: Ova klasa treba da nasljeđuje klasu `Developer` i dodatno ima polje `backendFramework` koje označava framework koji koristi za backend razvoj (npr. Spring Boot)
   - b) `FrontendDeveloper`: Ova klasa treba da nasljeđuje klasu `Developer` i dodatno ima polje `frontendFramework` koje označava framework koji koristi za frontend razvoj (npr. React, Vue.js).
4. **Implementirajte dvije funkcije**:
   - a) Prvu koja vraća mapu gde je ključ programski jezik, a vrijednost je broj programera koji koriste taj jezik.
   - b) Drugu koja vraća mapu gde je ključ programski jezik, a vrijednost je prosječna starost programera koji koriste taj jezik.
5. **Implementirajte funkcije za brojanje jezika i prosječnu starost koristeći `groupingBy` funkciju.**
6. **Implementirajte iste funkcije bez korištenja `groupingBy`.**
7. **Uporedite oba pristupa** i navedite koje prednosti i mane vidite u svakom pristupu.
8. **Dodatni zadatak**: U funkciji `main`, za svakog programera prikažite koji framework koriste, zavisno od toga da li su `BackendDeveloper` ili `FrontendDeveloper`.

---

### Za kreiranje liste programera i pozivanje funkcija koristite sljedeće podatke:

Ispis dole vam treba poslužiti za kreiranje metoda `printDeveloperData`. Metoda `printDeveloperData` treba da ispiše sljedeće informacije za svakog programera:

1. Ime i prezime programera.
2. Da li je backend ili frontend programer.
3. Koje programske jezike koristi.
4. Koji framework koristi za razvoj, zavisno od toga da li je backend ili frontend programer.

### Lista programera:

- **Amila** je backend programer koji koristi **Kotlin** i **Spring Boot**.
- **Ibrahim** je backend programer koji koristi **Java** i **Spring**.
- **Emina** je frontend programer koji koristi **Kotlin** i **React**.
- **Mujo** je frontend programer koji koristi **JavaScript** i **Vue.js**.
- **Edin** je backend programer koji koristi **Kotlin** i **Ktor**.
