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

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int koordinataGeneralas(int n) {
        return (int)(Math.random() * ((2 * n) + 1) - n);
    }

    public double getOrigotolMertTavolsag(){
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    public static double getKetPontTavolsaga(Pont p1, Pont p2){
        return Math.sqrt(Math.pow((p2.x - p1.x),2) + Math.pow((p2.y - p1.y), 2));
    }

    public int getMelyikSikNegyed(){
        int result = 0;
        if (this.x > 0 && this.y > 0){
            result = 4;
        } else if (this.x > 0 && this.y < 0){
            result = 3;
        } else if (this.x < 0 && this.y > 0){
            result = 1;
        } else if (this.x < 0 && this.y < 0){
            result = 2;
        } else {
            result = -1;
        }
        return result;
    }

    @Override
    public String toString() {
        return String.format("{%d, %d}", this.x, this.y);
    }
}
