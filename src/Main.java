import esercizio1.*;

public class Main {


    public static void main(String[] args) {

//        Dipendente primoDipendente = new Dipendente(Dipartimento.VENDITE);
//        Dipendente secondoDipendente = new Dipendente(Dipartimento.PRODUZIONE);
//        Dipendente terzoDipendente = new Dipendente(Dipartimento.AMMINISTRAZIONE);
//        Dipendente arrayDipendenti[] = {primoDipendente, secondoDipendente, terzoDipendente};
//        for (int i = 0; i < arrayDipendenti.length; i++) {
//            arrayDipendenti[i].stampaMatricola();
//        }
        Dipendentefulltime dipendente1 = new Dipendentefulltime(Dipartimento.AMMINISTRAZIONE, 1500.0, 7.30);
        Dipendentepartime dipendente2 = new Dipendentepartime(Dipartimento.AMMINISTRAZIONE, 1100.0, 10.30);
        Dirigente dipendente3 = new Dirigente(Dipartimento.AMMINISTRAZIONE, 2500.0, 9.0);
        Dipendente[] arrayDipendenti = {dipendente1, dipendente2, dipendente3};
        int sum = 0;
        for (int i = 0; i < arrayDipendenti.length; i++) {
            // System.out.println(arrayDipendenti[i].calcolaStipendio());
            sum += arrayDipendenti[i].calcolaStipendio();
        }
        System.out.println(sum);
        Volontario volontario1 = new Volontario(20, "Andrea", "Ciao ", 8);
        //volontario1.checkin();
        Dipendente[] secondoArrayDipendenti = {dipendente1, dipendente2, dipendente3, volontario1};
        for (int i = 0; i < arrayDipendenti.length; i++) {

            arrayDipendenti[i].checkin();
        }

    }


}