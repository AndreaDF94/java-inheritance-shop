// Classe principale Main per testare i prodotti dello shop
public class Main {
    public static void main(String[] args) {
        // Crea un oggetto Smartphone
        Smartphone s = new Smartphone(101, "Galaxy S22", "Samsung", 899.99, 22, "123456789012345", 128);

        // Crea un oggetto Televisore
        Televisore t = new Televisore(202, "Bravia X90", "Sony", 1499.99, 22, 55, true);

        // Crea un oggetto Cuffie
        Cuffie c = new Cuffie(303, "WH-1000XM4", "Sony", 299.99, 22, "Nero", true);

        // Stampa i dettagli di ogni prodotto
        System.out.println(s.getDettagli());
        System.out.println(t.getDettagli());
        System.out.println(c.getDettagli());
    }
}

