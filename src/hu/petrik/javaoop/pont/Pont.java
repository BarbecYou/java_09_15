package hu.petrik.javaoop.pont;

import java.util.Random;

public class Pont {
    private int x;
    private int y;

    public Pont() {
        x = 0;
        y = 0;
    }

    public Pont(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Pont(int n){
        this.x = koordinataGeneralas(n);
        this.y = koordinataGeneralas(n);

    }

    private int koordinataGeneralas(int n) {
        return (int)(Math.random() * ((2 * n) + 1) - n);
    }

    public double getOrigotolMertTavolsag(){
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    public static double getKetPontTavolsaga(Pont p1, Pont p2){
        return Math.sqrt(Math.pow((p2.x - p1.x),2) + Math.pow((p2.y - p1.y), 2));
    }

    @Override
    public String toString() {
        return String.format("{%d, %d}", this.x, this.y);
    }
}
