// Classe base Prodotto che rappresenta un prodotto generico dello shop
public class Prodotto {
    // Codice del prodotto (solo accessibile in lettura)
    private final int codice;

    // Nome del prodotto (accessibile in lettura e scrittura)
    private String nome;

    // Marca del prodotto (accessibile in lettura e scrittura)
    private String marca;

    // Prezzo del prodotto (accessibile in lettura e scrittura)
    private double prezzo;

    // IVA applicata al prodotto (accessibile in lettura e scrittura)
    private double iva;

    // Costruttore della classe Prodotto che inizializza tutti i campi
    public Prodotto(int codice, String nome, String marca, double prezzo, double iva) {
        this.codice = codice;
        this.nome = nome;
        this.marca = marca;
        this.prezzo = prezzo;
        this.iva = iva;
    }

        // Metodo getter per ottenere il codice (solo lettura)
    public int getCodice() {
        return codice;
    }

    // Getter per il nome
    public String getNome() {
        return nome;
    }

    // Setter per il nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter per la marca
    public String getMarca() {
        return marca;
    }

    // Setter per la marca
    public void setMarca(String marca) {
        this.marca = marca;
    }

    // Getter per il prezzo
    public double getPrezzo() {
        return prezzo;
    }

    // Setter per il prezzo
    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    // Getter per l’IVA
    public double getIva() {
        return iva;
    }

    // Setter per l’IVA
    public void setIva(double iva) {
        this.iva = iva;
    }

    // Metodo per calcolare il prezzo con IVA
    public double getPrezzoConIva() {
        return prezzo + (prezzo * iva / 100);
    }

    // Metodo per restituire le informazioni del prodotto
    public String getDettagli() {
        return "Codice: " + codice + ", Nome: " + nome + ", Marca: " + marca +
                ", Prezzo base: " + prezzo + "€, Prezzo con IVA: " + getPrezzoConIva() + "€";
    }
}

