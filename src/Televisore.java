// Classe Televisore che estende Prodotto
public class Televisore extends Prodotto {
    // Dimensione del televisore in pollici
    private int dimensioni;

    // Flag booleano per sapere se è smart
    private boolean smart;

    // Costruttore che inizializza gli attributi della superclasse e quelli propri
    public Televisore(int codice, String nome, String marca, double prezzo, double iva, int dimensioni, boolean smart) {
        super(codice, nome, marca, prezzo, iva);
        this.dimensioni = dimensioni;
        this.smart = smart;
    }

    // Metodo per ottenere le dimensioni
    public int getDimensioni() {
        return dimensioni;
    }

    // Metodo per verificare se è smart
    public boolean isSmart() {
        return smart;
    }

    // Metodo per ottenere le informazioni dettagliate del televisore
    @Override
    public String getDettagli() {
        return super.getDettagli() + ", Dimensioni: " + dimensioni + "", Smart: " + (smart ? "Sì" : "No");
    }
}

