package hu.petrik.javaoop;

import hu.petrik.javaoop.pont.Pont;

public class Main {

    public static void main(String[] args) {
	    Pont p1 = new Pont();
        Pont p2 = new Pont(0, 0);
        Pont p3 = new Pont(3, 4);
        Pont p4 = new Pont(100);

        Pont[] pontok = new Pont[100];
        for (int i = 0; i < pontok.length; i++) {
            pontok[i] = new Pont(10);
        }

        for (Pont p: pontok){
            System.out.println(p);
        }

        int legtavolabbiPontIndex = 0;
        for (int i = 1; i < pontok.length; i++) {
            if (pontok[i].getOrigotolMertTavolsag() > pontok[legtavolabbiPontIndex].getOrigotolMertTavolsag()){
                legtavolabbiPontIndex = i;
            }
        }
        System.out.printf("A legtávolabbi pont: %d. , koordiánáti: {%s}, távolsága az origotól: %s"
                , legtavolabbiPontIndex + 1, pontok[legtavolabbiPontIndex],
                pontok[legtavolabbiPontIndex].getOrigotolMertTavolsag());

        Pont p5 = new Pont(5, 10);
        Pont p6 = new Pont(2, 15);
        System.out.printf("Első pont koordinátája: {%s}\n" +
                "Második pont kordinátája: {%s}\n" +
                "A távolságuk: %.2f", p5, p6, Pont.getKetPontTavolsaga(p5, p6));
    }
}
