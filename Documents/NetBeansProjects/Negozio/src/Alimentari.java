
public class Alimentari extends Prodotti {
    Data datascadenza;

    public Alimentari(String codiceBarre, String descrizione, double prezzo,int giorno,int mese,int anno) {
        super(codiceBarre, descrizione, prezzo);
        datascadenza= new Data(giorno,mese,anno);
        
        
    }
    public void ApplicaSconto(Data oggi){
        
        if (oggi.getDifference(datascadenza)<10) {
          double sconto= prezzo*20/100;
          prezzo=prezzo-sconto;  
        }
    }
            
}
