package de.htwberlin;

import java.util.ArrayList;

public class Hamming {

    public Hamming(){



    }

    public ArrayList<String> distance( String dna , String rna){
        ArrayList<String> dnaList = new ArrayList<>( );
        String[] dNa = dna.split("[ , ]+");
        String[] rNa = rna.split("[ , ]+");
        String gene = null;
        String gene2 = null;
        int abstand = 0;

       // dnaList.clear();
       System.out.println(dna);
        System.out.println(rna);
        for(int i=0;i< dNa.length ; i++){
            gene = dNa[i];
            for (int j=0;j< dNa.length ; j++) {
                gene2 = rNa[j];
                if (!gene.equals(gene2) && dNa[j].equals(dNa[i]) && i==j) {
                    abstand += 1;
                }
            }
        }
        System.out.println(abstand);
dnaList.add(dna);
        return dnaList;
    }

}
