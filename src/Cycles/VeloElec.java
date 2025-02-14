package Cycles;

public class VeloElec extends Velo {
    private static double DEFAULT_FACTEUR_PUISSANCE_MOTEUR = 15.0;
    private static double DEFAULT_COUPLE_MOTEUR = 15.0;
    private double puissanceMoteur;

    public VeloElec() {
        super();
        this.puissanceMoteur = VeloElec.DEFAULT_FACTEUR_PUISSANCE_MOTEUR;
        ;
    }

    public VeloElec(double diamRoue) {
        super(diamRoue);
        this.puissanceMoteur = VeloElec.DEFAULT_FACTEUR_PUISSANCE_MOTEUR;
    }

    public VeloElec(double diamRoue, double coupleMoteur) {
        super(diamRoue);
        this.puissanceMoteur = VeloElec.DEFAULT_FACTEUR_PUISSANCE_MOTEUR;
    }

    public void setPUBLIC_COUPLE_MOTEUR(double DEFAULT_COUPLE_MOTEUR) {
        VeloElec.DEFAULT_COUPLE_MOTEUR = DEFAULT_COUPLE_MOTEUR;
    }

    public double getPUBLIC_COUPLE_MOTEUR() {
        return VeloElec.DEFAULT_COUPLE_MOTEUR;
    }

    public void setFacteurPuissanceMoteur(double puissanceMoteur) {
        this.puissanceMoteur = puissanceMoteur;
    }

    public double getFacteurPuissanceMoteur() {
        return this.puissanceMoteur;
    }

    public String toString(){
        return String.format("VeloElect[facteurPuissanceMoteur=%f]", this.puissanceMoteur);
    }

    public double getPuissance(double FrequenceCoupsDePedale) {
        return super.getPuissance(FrequenceCoupsDePedale) * VeloElec.DEFAULT_FACTEUR_PUISSANCE_MOTEUR;
    }

    public static void main(String[] args) {
        VeloElec velo1 = new VeloElec();
        VeloElec velo2 = new VeloElec(26.0);
        VeloElec velo3 = new VeloElec(26.0, 20.0);

        System.out.println(velo1);
        System.out.println(velo2);
        System.out.println(velo3);

        velo1.setFacteurPuissanceMoteur(20.0);
        System.out.println("Puissance moteur mise à jour pour velo1: " + velo1.getFacteurPuissanceMoteur());

        velo2.setPUBLIC_COUPLE_MOTEUR(25.0);
        System.out.println("Couple moteur par défaut mis à jour: " + velo2.getPUBLIC_COUPLE_MOTEUR());

        double puissance = velo3.getPuissance(90.0);
        System.out.println("Puissance pour velo3 avec 90.0 : " + puissance);
    }
}
