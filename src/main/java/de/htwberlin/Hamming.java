package de.htwberlin;

import java.util.ArrayList;

public class Hamming {


    public Hamming(){



    }

    public String distance( String dna , String rna){
        String gene = null;
        String gene2 = null;
        int abstand = 0;
        String[] dNa = dna.split("[ , ]+");
        String[] rNa = rna.split("[ , ]+");



        if(dNa.length!=rNa.length){ throw new Exception("exceptin "); }




        for(int i=0;i< dNa.length ; i++){
            gene = dNa[i];
            for (int j=0;j< dNa.length ; j++) {
                gene2 = rNa[j];
                if (!gene.equals(gene2) && dNa[j].equals(dNa[i]) && i==j) {
                    abstand += 1;
                }
            }
        }
        System.out.println(dna);
        System.out.println(rna);
        System.out.println(abstand);

        return "StrangA: "+dna+"\n" +
                "StrangB: "+rna+"\n" +
                "Hamming-Abstand:"+abstand;
    }

}
