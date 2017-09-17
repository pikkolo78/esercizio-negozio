
public class Main {

   
    public static void main(String[] args) {
        Prodotti prod1= new Prodotti("0017890", "bla", 12);
        NonAlimentari prod2 = new NonAlimentari("0017890", "carne", 100, "plastica");
        
        Data oggi = new Data(17,9,2017);
        Alimentari alimentari=new Alimentari("28837339","Carne",100,25,9,2017);
        
        System.out.println(alimentari);
        alimentari.ApplicaSconto(oggi);
        System.out.println(alimentari);
       
    }

}
