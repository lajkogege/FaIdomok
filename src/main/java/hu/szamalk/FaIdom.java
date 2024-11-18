package hu.szamalk;

import java.util.ArrayList;

public abstract  class  FaIdom  {
    private static double fajsuly=.8;

    public FaIdom(double fajsuly) {
        this.fajsuly = fajsuly;
    }

    protected FaIdom() {
    }

    public abstract double terfogat();

    public double suly(){
        return 0.0;
    }

    @Override
    public String toString() {
        return "FaIdom{" +
                "fajsuly=" + fajsuly +
                '}';
    }
}