import java.util.ArrayList;
import java.util.Scanner; 

public class ListaSpesa {
    ArrayList<Prodotti> prodotti = new ArrayList<Prodotti>();
    
    public ListaSpesa(Data oggi){
         Alimentari carne=new Alimentari("2883447339","Carne",20,1,10,2017, oggi);
          Alimentari pesce=new Alimentari("2883339","pesce",15,23,10,2017, oggi);
           NonAlimentari pentole=new NonAlimentari("28357339","Pentole",30,"acciao");
           NonAlimentari detersivo=new NonAlimentari("28357379","detersivo",8,"detersivo");
           Alimentari pasta=new Alimentari("49417","pasta",5,30,11,2017, oggi);
           prodotti.add(carne);
           prodotti.add(pesce);
           prodotti.add(pentole);
           prodotti.add(detersivo);
           prodotti.add(pasta);
           
    }
    public void stampaProdotti()
    {
        
        for (int i=0;i<prodotti.size();i++) {
            System.out.println(i+". "+prodotti.get(i));
            
        }
        System.out.println(prodotti.size()+". fine");   // 6 1 .fine
        
    
    }
    public void spesa()
    {   
        ArrayList<Prodotti> spesa = new ArrayList<Prodotti>();
         // 1. carne
            // 2. pesce
            // 3. pentole
            // ...
            // 7. Fine
        
       Scanner input = new Scanner(System.in);
       int prod=0;
        do {            
            System.out.println("Cosa vuoi comprare?");
            prod=input.nextInt();
            if(prod<prodotti.size()){ //5
            Prodotti prod1 =prodotti.get(prod); // get(5) XXX
            spesa.add(prod1);
            }
        } while (prod!=prodotti.size());
        for(Prodotti prod2 : spesa){
            System.out.println(prod2);
        }
        //stampa totale spesa
        
        //stampa la scadenza dei prodotti, posso fare solo quelli alimentari, quindi devo distinguerli
        // if (prod istanceof Alimentari )
        
    }
            
    
}
