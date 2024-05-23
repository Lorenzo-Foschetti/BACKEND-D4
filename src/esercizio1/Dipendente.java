package esercizio1;


import java.util.Random;

public abstract class Dipendente implements Checkin {
    //attributi
    private int matricola;
    private double stipendio;
    private Dipartimento dipartimento;
    private int età;
    private String cv;
    private String nome;
    private double orarioInizio;


    //costruttore
    public Dipendente(Dipartimento dipartimento) {
        Random rndm = new Random();
        this.matricola = rndm.nextInt(1, 10000);
        this.dipartimento = dipartimento;
        this.stipendio = rndm.nextDouble(1000, 2000);

    }

    public Dipendente(Dipartimento dipartimento, double stipendio, double orarioInizio) {
        Random rndm = new Random();
        this.matricola = rndm.nextInt(1, 10000);
        this.dipartimento = dipartimento;
        this.stipendio = stipendio;
        this.orarioInizio = orarioInizio;


    }

    public Dipendente(int età, String nome, String cv, double orarioInizio) {
        this.nome = nome;
        this.età = età;
        this.cv = cv;
        this.orarioInizio = orarioInizio;

    }


    //metodo
    public void stampaMatricola() {
        System.out.println("Questa è la matricola di ogni dipendente" + this.matricola);
    }

    public double calcolaStipendio() {
        return
                this.stipendio;
    }

    @Override
    public void checkin() {
        System.out.println("Inizio lavoro alle " + this.orarioInizio
        );
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