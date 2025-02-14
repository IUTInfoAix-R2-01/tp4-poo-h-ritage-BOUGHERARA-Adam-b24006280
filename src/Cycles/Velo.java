package Cycles;

import java.util.Random;

public class Velo {
    private static double DEFAULT_BRAQUET = 13.0;
	private double braquet;
	private double diamRoue;
    private Random genAlea;
    
    public double getDEFAULT_BRAQUET() {
        return DEFAULT_BRAQUET;
    }

    public void setDEFAULT_BRAQUET(double DEFAULT_BRAQUET) {
        Velo.DEFAULT_BRAQUET = DEFAULT_BRAQUET;
    }

    public Velo(){
        this.braquet = DEFAULT_BRAQUET;
        this.diamRoue = 0.7;
        this.genAlea = new Random();
    }

    public Velo(double braquet){
        this.braquet = braquet;
        this.diamRoue = 0.7;
        this.genAlea = new Random();
    }

    public Velo(double braquet, double diamRoue) {
        this.braquet = braquet;
        this.diamRoue = diamRoue;
        this.genAlea = new Random();
    }

    public Random getGenAlea() {
        return genAlea;
    }

    public void setGenAlea(Random genAlea) {
        this.genAlea = genAlea;
    }

    public double getBraquet() {
    	return this.braquet;
    }
    
    public void setBraquet(double braquet) {
    	this.braquet = braquet;
    }
    
    public double getDiamRoue() {
    	return this.diamRoue;
    }

    public void setDiamRoue(double diamRoue) {
    	this.diamRoue = diamRoue;
    }

    public String toString(){
        return String.format("Velo[braquet=%.2f, diamRoue=%.2f]", this.braquet, this.diamRoue);
    }

    public double getPuissance(double FrequenceCoupsDePedale){
        return FrequenceCoupsDePedale * this.braquet * this.diamRoue * this.genAlea.nextDouble(); 
    }

    public static void main(String[] args) {
        Velo velo1 = new Velo();
        Velo velo2 = new Velo(15.0);
        Velo velo3 = new Velo(15.0, 0.8);

        System.out.println(velo1);
        System.out.println(velo2);
        System.out.println(velo3);

        double frequence = 90.0;
        System.out.println("Puissance velo1: " + velo1.getPuissance(frequence));
        System.out.println("Puissance velo2: " + velo2.getPuissance(frequence));
        System.out.println("Puissance velo3: " + velo3.getPuissance(frequence));
    }
}
