import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Panino [] panini=new Panino[6]; //vettore di oggetti
        for(int i=0; i<6; i++){
            panini[i]=new Panino();
        }
        panini[0].descrivere("Big Mac");
        panini[1].descrivere("Cheeseburger");
        panini[2].descrivere("MyselectionBBQ");
        panini[3].descrivere("Myselectionbacon");
        panini[4].descrivere("Crispymcbacon");
        panini[5].descrivere("Chickenburger");

        panini[0].setCosto(1.4F);
        panini[1].setCosto(2.5F);
        panini[2].setCosto(3.2F);
        panini[3].setCosto(4.5F);
        panini[4].setCosto(6.5F);
        panini[5].setCosto(1.5F);


        panini[0].setCodice("234");
        panini[1].setCodice("985");
        panini[2].setCodice("001");
        panini[3].setCodice("548");
        panini[4].setCodice("198");
        panini[5].setCodice("115");


        Scontrino sc=new Scontrino();


        Scanner in = new Scanner(System.in);
        Scanner st= new Scanner(System.in);

        System.out.println("Inserisci la quantità per ogni prodotto");
        for(int i=0; i<6; i++){
            int quantita=in.nextInt();
            panini[i].ricarica(quantita);
        }

        int scelta;

        do {
            System.out.println("Salve, cosa intende fare: Digitare 1 (Inserire la quantita' di ogni panino), 2 (Stampa dei panini), 3 (Acquisto panini), 4 (Stampa dello scontrino)");
            scelta = in.nextInt();
            switch (scelta) {
                case 1:
                    System.out.println("Inserisci la quantità di ogni prodotto");
                    for(int i=0; i<6; i++){
                        panini[i].ricarica(in.nextInt());
                    }
                    break;
                case 2:
                    for(int i=0; i<6; i++) {
                        panini[i].stampa();
                    }
                    break;
                case 3:
                    //Acquisto dei prodotti con eventuali aggiornamenti
                    System.out.println("Inserisci il numero per selezionare l'alimento");
                    String n=st.nextLine();
                    for (int i=0; i<6; i++) {
                        if (n.equals(panini[i].getCodice())) {
                            System.out.println("Inserisci la quantita' che vuoi acquistare");
                            int quantitaselezionata=in.nextInt();
                            panini[i].acquisto(quantitaselezionata);
                            sc.aggiungerepanini(panini[i].getDescrizione(), panini[i].getCosto()*quantitaselezionata);
                        }
                    }

                    break;
                case 4:
                    //Visualizzazione dello scontrino, con simulazione al pagamento e restituzione dell'eventuale resto
                    sc.stampaScontrino();
                    sc.tipoPagamento();
                    sc.azzeraScontrino();
                    break;
            }
        }while (scelta!=0);

    }
}
