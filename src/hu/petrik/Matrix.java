package hu.petrik;

public class Matrix {

    private int sorokSzama;
    private int oszlopokSzama;
    private int[][] matrix;

    public Matrix(int sorokSzama, int oszlopokSzama, int[][] matrix) {
        this.sorokSzama = sorokSzama;
        this.oszlopokSzama = oszlopokSzama;
        this.matrix = matrix;
    }

    public Matrix() {
        this.sorokSzama = (int)(Math.random()*11)+5;
        this.oszlopokSzama = (int)(Math.random()*11)+5;
    }
}
