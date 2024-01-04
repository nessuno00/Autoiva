

public class Macchina {

    public static void main(String[] args) {


        Auto auto = new Auto("Fiat", "Grande punto", "DEBX90", 300, 5000);
        Auto auto1 = new Auto("Ferrari", "Sport", "X90012", 1200, 200000);
        Auto auto2 = new Auto("Jeep", "Suv", "YLZ900", 1000, 40000);
        Auto auto3 = new Auto("Tesla", "Sl", "DYZ90", 2000, 40000);


        double prezzoAumentato = auto.getPrezzoIva(15);
        double prezzoAumentato1 = auto1.getPrezzoIva(18);
        double prezzoAumentato2 = auto2.getPrezzoIva(13);


        System.out.println("Il nome della macchina è : " + auto.getMarca());
        System.out.println("Il modello della macchina è : " + auto.getModello());
        System.out.println("La targa della macchina è : " + auto.getTarga());
        System.out.println("La cillindrata della macchina  è : " + auto.getCillindrata());
        System.out.println("Il prezzo della macchina è : " + auto.getPrezzo());
        System.out.println("Il prezzo della macchina con Iva è : " + prezzoAumentato);


        System.out.println("\nIl nome della macchina è : " + auto1.getMarca());
        System.out.println("Il modello della macchina è : " + auto1.getModello());
        System.out.println("La targa della macchina è : " + auto1.getTarga());
        System.out.println("La cillindrata della macchina  è : " + auto1.getCillindrata());
        System.out.println("Il prezzo della macchina è : " + auto1.getPrezzo());
        System.out.println("Il prezzo della macchina con Iva è : " + prezzoAumentato1);


        System.out.println("\nIl nome della macchina è : " + auto2.getMarca());
        System.out.println("Il modello della macchina è : " + auto2.getModello());
        System.out.println("La targa della macchina è : " + auto2.getTarga());
        System.out.println("La cillindrata della macchina  è : " + auto2.getCillindrata());
        System.out.println("\nIl prezzo della macchina è : " + auto2.getPrezzo());

        auto2.setModello("\n Cambio del modello in Fuoristrada");
        auto2.setPrezzo(35000);

        System.out.println(" " + auto2.getModello());
        System.out.println("Il prezzo della macchina è : " + auto2.getPrezzo());
        System.out.println("Il prezzo della macchina con Iva è : " + prezzoAumentato2);


        System.out.println("\nIl nome della macchina è : " + auto3.getMarca());
        System.out.println("Il modello della macchina è : " + auto3.getModello());
        System.out.println("La targa della macchina è : " + auto3.getTarga());
        System.out.println("La cillindrata della macchina  è : " + auto3.getCillindrata());
        System.out.println("\nIl prezzo della macchina è : " + auto3.getPrezzo());


System.out.println("\nCambio del modello, prezzo e cilindrata");
auto3.setModello("Modell X");
auto3.setCillindrata(6000);
auto3.setPrezzo(90000);

System.out.println("\nIl modello della macchina è : " + auto3.getModello());
System.out.println("La cillindrata della macchina  è : " + auto3.getCillindrata());
System.out.println("Il prezzo della macchina è : " + auto3.getPrezzo());


double prezzoAumentato3 = auto3.getPrezzoIva(8);
System.out.println("Il prezzo della macchina con Iva è : " + prezzoAumentato3);



    }
}
