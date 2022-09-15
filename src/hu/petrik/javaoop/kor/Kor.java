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

    public Kor(int n, int m){
        this.r = sugarGeneralas(m);
        this.kozeppont = new Pont(n);
    }

    private int sugarGeneralas(int m) {
        return (int)((Math.random() * (m + 1)) + 1);
    }

    //Getters and Setters

    public Pont getKozeppont() {
        return kozeppont;
    }

    public void setKozeppont(Pont kozeppont) {
        this.kozeppont = kozeppont;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }


    //Mehtods

    public double getKorKerulete(){
        return 2 * this.r * Math.PI;
    }

    public double getKorTerulete(){
        return Math.pow(this.r, 2) * Math.PI;
    }

    public void korNagyitasa(double arany){
        this.r *= arany;
    }

    @Override
    public String toString() {
        return "Középpont: " + this.kozeppont +
                "\nSugár: " + this.r;
    }
}
