
public class Panino {
    private String codice;
    private String descrizione;
    private int quantitadisponibile;

    private float prezzounitario;

    public Panino(){
        codice="";
        descrizione="";
        quantitadisponibile=0;
        prezzounitario=0.0F;
    }

    public void stampa(){
            System.out.println(codice+" "+descrizione);
            System.out.println("Il prezzo di questo tipo di panino è "+prezzounitario);
            System.out.println(quantitadisponibile);
    }

    public void ricarica(int quantita){
        quantitadisponibile=quantita;
    }

    public void acquisto(int quantitaselezionata){
        if(quantitaselezionata>quantitadisponibile){
            System.out.println("Errore: selezionare quantita' in base a quella dei panini");
        }else {
            quantitadisponibile = quantitadisponibile - quantitaselezionata;
        }
        if (quantitadisponibile == 0) {
            System.out.println("Il panino è finito");
        }
    }

    public void setCosto(float x){
        prezzounitario=x;
    }

    public void descrivere(String s){
        descrizione=s;
    }

    public void setCodice(String c){
        codice=c;
    }

    public String getCodice(){
        return codice;
    }

    public String getDescrizione(){
        return descrizione;
    }

    public float getCosto(){
        return prezzounitario;
    }



 }





