package hu.szamalk;

import java.util.ArrayList;
import java.util.List;

public class FaIdomok {
    private List<FaIdom> idomok;

    public FaIdomok() {
        idomok = new ArrayList<>();
    }

    public double osszSuly(){
        return 0.0;
    }

    public double osszgombSuly(){
        return 0.0;
    }

    public FaIdom minV(){
        return null;
    }

    public FaIdom maxV(){
        return null;
    }

    public void run(){
        System.out.println("A programban használt idomok:");
        for(FaIdom idom : idomok){
            System.out.println(idom);
        }
        System.out.println("idomok összes sulya: "+osszSuly());
        System.out.println("gömbök összed súlya: "+osszgombSuly());
        System.out.println("minV: "+minV());
        System.out.println("maxV: "+minV());
    }
}
