// Classe Smartphone che estende Prodotto
public class Smartphone extends Prodotto {
    // IMEI del dispositivo (identificativo univoco)
    private String imei;

    // Memoria interna del dispositivo in GB
    private int memoria;

    // Costruttore di Smartphone che richiama il costruttore della superclasse
    public Smartphone(int codice, String nome, String marca, double prezzo, double iva, String imei, int memoria) {
        super(codice, nome, marca, prezzo, iva);
        this.imei = imei;
        this.memoria = memoria;
    }

    // Metodo per ottenere l’IMEI
    public String getImei() {
        return imei;
    }

    // Metodo per ottenere la memoria
    public int getMemoria() {
        return memoria;
    }

    // Metodo per ottenere le informazioni dettagliate dello smartphone
    @Override
    public String getDettagli() {
        return super.getDettagli() + ", IMEI: " + imei + ", Memoria: " + memoria + "GB";
    }
}

