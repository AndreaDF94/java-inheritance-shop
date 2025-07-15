// Classe Cuffie che estende Prodotto
public class Cuffie extends Prodotto {
    // Colore delle cuffie
    private String colore;

    // Flag booleano per indicare se sono wireless
    private boolean wireless;

    // Costruttore che inizializza attributi ereditati e nuovi
    public Cuffie(int codice, String nome, String marca, double prezzo, double iva, String colore, boolean wireless) {
        super(codice, nome, marca, prezzo, iva);
        this.colore = colore;
        this.wireless = wireless;
    }

    // Metodo per ottenere il colore
    public String getColore() {
        return colore;
    }

    // Metodo per sapere se sono wireless
    public boolean isWireless() {
        return wireless;
    }

    // Metodo per ottenere le informazioni dettagliate delle cuffie
    @Override
    public String getDettagli() {
        return super.getDettagli() + ", Colore: " + colore + ", Wireless: " + (wireless ? "Sì" : "No");
    }
}
