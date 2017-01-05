# Poruszanie po systemie
Za pomocą konsoli:
utwórz katalog prace_domowe
przejdź do niego
wewnątrz niego utwórz katalog o nazwie w tym formacie imie_nazwisko
przejdź do niego
utworz w nim katalog lekcja2
w nim utworz plik piramida.java, waga.java, piramida2.java
Do sprytnych, którzy chcą sobie wyklikać: w konsoli zapisywana jest historiia wklepywanych poleceń. Łatwo sprawdzić, czy foldery zostały utworzone za pomocą konsoli, czy nie

# Printowanie
Napisz program, który wydrukuje dowolnego stringa 256 razy.

# Piramida
Napisz program, który wydrukuje w konsoli piramidę składającą się z n poziomów.
Twój program powinien przyjmować argument n z konsoli, czyli za pomocą args[].
Ponad to powinien sprawdzać, czy użytkownik podał argument, jeśli nie - wyświetl błąd.
Piramida nie może być wyższa niż 23 piętra, zatem jeśli użytkownik wprowadzi liczbę większą niż 23 wyświetl błąd.
Przykład użycia:
```
 > java piramida 3
 >  #
 > ##
 > ###
```
aby użyć argumentu jako int, musisz dokonać konwersji typów.
Można to zrobić w ten sposób: int liczba_pieter = Integer.parseint(args[0]);

# Piramida2
Lekka modyfikacja piramidy, tyle, że zamiast takiej piramidy:
```
 > java piramida 3
 >  #
 > ##
 > ###
  ```
Należy napisać program, który wydrukuje taką
```
>    # #
>   ## ##
>  ### ###
  ``` 
# Waga w funtach
Użytkownik podaje argument z wiersza poleceń przy uruchomieniu.
Twój program sprawdza, czy użytkownik go podał, jeśli nie, wyświetla informację o błędzie.
Jeśli podał, to wyświetla podaną wagę, ale w funtach.
1 funt = 0.53 kilograma
Tutaj ponwonie należy dokonać konwersji typu, ale zamiast Integer, należy użyć Double.parsedouble[args[0]]


 