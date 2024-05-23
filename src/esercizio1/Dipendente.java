package esercizio1;


import java.util.Random;

public class Dipendente {
    //attributi
    private int matricola;
    private double stipendio;
    private Dipartimento dipartimento;


    //costruttore
    public Dipendente(Dipartimento dipartimento) {
        Random rndm = new Random();
        this.matricola = rndm.nextInt(1, 10000);
        this.dipartimento = dipartimento;
        this.stipendio = rndm.nextDouble(800, 2000);


    }

    //metodo
    public void stampaMatricola() {
        System.out.println("Questa è la matricola di ogni dipendente" + this.matricola);
    }

    public int getMatricola() {
        return matricola;
    }


    public double getStipendio() {
        return stipendio;
    }

   
    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }
}