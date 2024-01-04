public class Auto {

    private String marca;

    private double cillindrata;

    private String modello;

    private String targa;

    private double  prezzo;


    public Auto(String marca, String modello, String targa, double cillindrata, double prezzo) {

        this.marca = marca;
        this.modello = modello;
        this.cillindrata = cillindrata;
        this.targa = targa;
        this.prezzo = prezzo;
    }

    public String getMarca() {

        return marca;
    }

    public double getCillindrata() {

        return cillindrata;
    }

    public String getModello() {

        return modello;
    }

    public String getTarga() {

        return targa;
    }

    public double  getPrezzo() {

        return prezzo;
    }

    public void setMarca(String marca) {

        this.marca = marca;
    }

    public void setModello(String modello) {

        this.modello = modello;
    }

    public void setCillindrata(double cillindrata) {
        this.cillindrata = cillindrata;
    }

    public void setPrezzo (double prezzo) {
        this.prezzo = prezzo;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public double getPrezzoIva (double iva) {

        double  AutoIva = prezzo * (iva/100);

        return prezzo + AutoIva;




}


}