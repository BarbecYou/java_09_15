package hu.petrik.javaoop.kor;

import hu.petrik.javaoop.pont.Pont;

public class Kor {
    private Pont kozeppont;
    private int r;

    public Kor(Pont kozeppont, int r) {
        this.kozeppont = kozeppont;
        this.r = r;
    }

    public Kor(int r) {
        this.r = r;
        this.kozeppont = new Pont();
    }

    public Kor(int r, int n){
        this.r = r;
        this.kozeppont = new Pont(n);
    }

    //Mehtods

    public double getKorKerulete(){
        return 2 * this.r * Math.PI;
    }

    @Override
    public String toString() {
        return "Középpont: " + this.kozeppont +
                "\nSugár: " + this.r;
    }
}
