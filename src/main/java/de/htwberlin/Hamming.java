package de.htwberlin;

import java.util.ArrayList;

public class Hamming {


    public Hamming(){



    }

    public String distance( String dna , String rna){
        ArrayList<String> dnaList = new ArrayList<>();
        ArrayList<String> rnaList = new ArrayList<>();
        String gene = null;
        String gene2 = null;
        int abstand = 0;
        String[] dNa = dna.split("[ ,]+");
        String[] rNa = rna.split("[ ,]+");
        rnaList.add(dna);
        dnaList.add(rna);

        if(dNa.length!=rNa.length){ throw new Exception("exceptin"); }





        for(int i=0;i< dNa.length ; i++){
            gene = dNa[i];


            for (int j=0;j< dNa.length ; j++) {
                gene2 = rNa[j];


                if (!gene.equals(gene2) &&  i==j) {
                    abstand += 1;
                }
            }

        }
        System.out.println(dnaList);
        System.out.println(rna);
        System.out.println(abstand);


        return "StrangA: "+dnaList+"\n" +
                "StrangB: "+rnaList+"\n" +
                "Hamming-Abstand:"+abstand;
    }

}
