package hu.petrik;

public class Main {

    public static void main(String[] args) {
	Matrix m = new Matrix();
        System.out.println("Négyzetes mátrix-e? " + (m.isNegyzetes()?"igen":"nem"));
        System.out.println(m);

        System.out.println("Mátrix mérete: " + m.getSorokSzama() + "db sor, " + m.getOszlopokSzama() + "db oszlop.");
        System.out.println("A mátrix összege: " + m.matrixOsszeg());
        System.out.println("A mátrix pozitív számainak darabszáma: " + m.pozitivDarabSzam());
    }
}
