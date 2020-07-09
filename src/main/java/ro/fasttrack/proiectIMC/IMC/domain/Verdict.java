package ro.fasttrack.proiectIMC.IMC.domain;

public class Verdict {
    private String intervalGreutate;
    private String verdictGreutate;

    public Verdict(){

    }

    public Verdict(String intervalGreutate, String verdictGreutate) {
        this.intervalGreutate = intervalGreutate;
        this.verdictGreutate = verdictGreutate;
    }

    public String getIntervalGreutate() {
        return intervalGreutate;
    }

    public void setIntervalGreutate(String intervalGreutate) {
        this.intervalGreutate = intervalGreutate;
    }

    public String getVerdictGreutate() {
        return verdictGreutate;
    }

    public void setVerdictGreutate(String verdictGreutate) {
        this.verdictGreutate = verdictGreutate;
    }


}


