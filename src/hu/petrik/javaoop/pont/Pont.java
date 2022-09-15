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
        this.y = koordinataGeneralas(-n);

    }

    private int koordinataGeneralas(int n) {
        return (int)(Math.random() * ((2 * n) + 1) - n);
    }

    @Override
    public String toString() {
        return String.format("{%d, %d}", this.x, this.y);
    }
}
