# BufferedReader

## ReaderBufferedReader

L'obiettivo di questo esercizio è l'utilizzo della classe **BufferedReader**.

Creare la classe `ReaderBufferedReader` con all'interno il metodo `main()` dove istanzieremo la classe e lanceremo il metodo `run()` con le operazioni di lettura da effettuare.
Questo esercizio non richiede test JUnit.

> **Nota:** Il file `words.txt` contiene una parola per ogni riga.

```java
class ReaderBufferedReader {

    public static void main(String[] args) {}

    private void run() {}
}
```

### Output

Definire il **BufferedReader br** utilizzando il costruttore `BufferedReader(new FileReader(new File(String fileName)))`.
Con il metodo `br.read()` leggere e stampare tutto il file carattere per carattere.

### Consigli

Per verificare la fine del file, utilizzare:
`static final int EOF = -1;`

Per bypassare i caratteri di fine linea _**Carriage Return**_ e _**Line Feed**_:
`static final char CR = '\r'; // x'0D'`
`static final char LF = '\n'; // x'0A'`

## Files

**words.txt**

```txt
INSALATA
SALSICCIA
TORTELLINI
PIZZA
COCA COLA
LASAGNE
BISCOTTI
TIRAMISU
INSALATA RUSSA
```
