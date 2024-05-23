import esercizio1.Dipartimento;
import esercizio1.Dipendente;

public class Main {


    public static void main(String[] args) {

        Dipendente primoDipendente = new Dipendente(Dipartimento.VENDITE);
        Dipendente secondoDipendente = new Dipendente(Dipartimento.PRODUZIONE);
        Dipendente terzoDipendente = new Dipendente(Dipartimento.AMMINISTRAZIONE);
        Dipendente arrayDipendenti[] = {primoDipendente, secondoDipendente, terzoDipendente};
        for (int i = 0; i < arrayDipendenti.length; i++) {
            arrayDipendenti[i].stampaMatricola();
        }
    }


}