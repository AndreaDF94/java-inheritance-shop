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
