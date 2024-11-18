package hu.szamalk;

import java.util.ArrayList;
import java.util.List;

public class FaIdomok {
    private List<FaIdom> idomok;


    public FaIdomok() {
        idomok = new ArrayList<>();
        idomok.add(new Gomb(1));
        idomok.add(new Hasab(1,1,1));
    }

    public double osszSuly() {
        double ossz=0;
        for(FaIdom idom :idomok){
            ossz+=idom.suly();
        }
        return ossz;
    }

    public double osszgombSuly() {
        return 0.0;
    }

    public FaIdom minV() {
        int m =0;
        for (int i = 0; i <idomok.size(); i++) {
            FaIdom aktIdom= idomok.get(i);
            FaIdom mIdom=idomok.get(m);
            if (aktIdom.terfogat() < mIdom.terfogat()) {
                m=i;
            }
        }
        return idomok.get(m);
    }

    public FaIdom maxV() {
        return new FaIdom() { // Hiányzó return hozzáadva
            public double terfogat() {
                return 0;
            }
        };
    }

    public void run() {
        System.out.println("A programban használt idomok:");
        for (FaIdom idom : idomok) {
            System.out.println(idom);
        }
        System.out.println("idomok összes sulya: " + osszSuly());
        System.out.println("gömbök összed súlya: " + osszgombSuly());
        System.out.println("minV: " + minV().terfogat());
        System.out.println("\t" + minV());
        System.out.println("maxV: " + minV().terfogat());
        System.out.println("\t" + maxV());
    }


}
