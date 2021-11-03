package hu.petrik;

public class Matrix {

    protected int sorokSzama;
    protected int oszlopokSzama;
    protected int[][] matrix;

    public Matrix(int sorokSzama, int oszlopokSzama) {
        this.sorokSzama = sorokSzama;
        this.oszlopokSzama = oszlopokSzama;
        this.matrix = new int[sorokSzama][oszlopokSzama];
    }

    public Matrix() {
        this.sorokSzama = (int)(Math.random()*11)+5;
        this.oszlopokSzama = (int)(Math.random()*11)+5;
        this.matrix = new int[this.sorokSzama][this.oszlopokSzama];
    }

    protected void feltolt(){
        for (int i = 0; i < this.sorokSzama; i++) {
            for (int j = 0; j < this.oszlopokSzama; j++) {
                this.matrix[i][j] = (int)(Math.random()*90)+10;
            }
        }
    }

    public int getSorokSzama() {
        return sorokSzama;
    }

    public int getOszlopokSzama() {
        return oszlopokSzama;
    }


    public boolean isNegyzetes(){
        return this.sorokSzama == this.oszlopokSzama;
    }

    public long matrixOsszeg() {
        long osszeg = 0;

        for (int i = 0; i < this.sorokSzama; i++) {
            for (int j = 0; j < this.oszlopokSzama; j++) {
                osszeg += matrix[i][j];
            }
        }
        return osszeg;
    }

    public int pozitivDarabSzam(){
        int pozitivDarabSzam = 0;
        for (int i = 0; i < this.sorokSzama; i++) {
            for (int j = 0; j < this.oszlopokSzama; j++) {
                if (matrix[i][j] >= 0){
                    pozitivDarabSzam++;
                }
            }
        }
        return pozitivDarabSzam;
    }

    public int matrixMax(){
        int max = matrix[0][0];
        for (int i = 0; i < this.sorokSzama; i++) {
            for (int j = 0; j < this.oszlopokSzama; j++) {
                if (max < matrix[i][j]){
                    max = matrix[i][j];
                }
            }
        }
        return max;
    }

    @Override
    public String toString() {
        String s = "";

        for (int i = 0; i < this.sorokSzama; i++) {
            for (int j = 0; j < this.oszlopokSzama; j++) {
                s += matrix[i][j] + " ";
            }
            s += "\n";
        }
        return s;
    }
}
