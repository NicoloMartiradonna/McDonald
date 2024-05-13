import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Scontrino {
    float totscontrino; //quello che devo pagare

    //quando uso arraylist devo usare Float, Integer ecc..
    ArrayList cibi=new ArrayList();
    public Scontrino(){
        totscontrino=0.0F;
    }



    public void aggiungerepanini(String p, float c){
        cibi.add(p);
        cibi.add(c);
        totscontrino=totscontrino+c;
    }

    public void stampaScontrino(){
        System.out.println("Ecco a lei il suo scontrino");
        for(int i=0; i<cibi.size(); i++){
            System.out.println(cibi.get(i));
        }
        System.out.println("Totale " +totscontrino);
    }

    public void tipoPagamento(){
        Scanner in=new Scanner(System.in);
        Scanner st=new Scanner(System.in);
        float pagamento=0.0F;
        System.out.println("Vorresti pagare con carta(0) o in contanti(1): ");
        int scelta=in.nextInt();
        if(scelta==0){
            System.out.println("Inserire carta");
            System.out.println("Esecuzione in corso");
        }
        else if(scelta==1){
            do {
                System.out.println("Inserisci i contanti: ");
                pagamento=pagamento+in.nextFloat(); //io posso vedere se pagamento è minore o meno di totscontrino
            }while (pagamento<totscontrino);
            if(pagamento>totscontrino){
                System.out.println("Il resto è: " +(pagamento-totscontrino));
            }
        }
        System.out.println("Grazie e arrivederci");
    }


    public void azzeraScontrino(){
        totscontrino=0.0F;
        cibi.clear();
    }
}
