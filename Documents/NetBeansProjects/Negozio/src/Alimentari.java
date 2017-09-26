
public class Alimentari extends Prodotti {
    Data datascadenza;
    Data oggi;

    public Alimentari(String codiceBarre, String descrizione, double prezzo,int giorno,int mese,int anno, Data oggi) {
        super(codiceBarre, descrizione, prezzo);
        datascadenza= new Data(giorno,mese,anno);
        this.oggi=oggi;
    }
    
    public void ApplicaSconto(){ //(Data oggi)
        
        if (oggi.getDifference(datascadenza)<10) {
          double sconto= prezzo*20/100;
          prezzo=prezzo-sconto;  
        }
    }
            
}
