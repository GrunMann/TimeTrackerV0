package StakerGroup;

public class OcupationPeriod {

    private final int ocupationStartTime;
    private int ocupationEndTime;
    private int lunchStartTime;
    private int lunchEndTime;


    OcupationPeriod(int ocupationStartTime) {
        this.ocupationStartTime = ocupationStartTime;
    }
    public void endOcupation(int ocupationEndTime){
        this.ocupationEndTime = ocupationEndTime;
    }
    public void startLunch(int lunchStart){
        this.lunchStartTime=lunchStart;
    }
    public void endLunch(int lunchFinish){
        this.lunchEndTime=lunchFinish;
    }
    public int occupationSummary(){
        return  ocupationEndTime
               -ocupationStartTime
               -(lunchEndTime-lunchStartTime);
    }

    public int getOcupationStartTime() {
        return ocupationStartTime;
    }

    public int getOcupationEndTime() {
        return ocupationEndTime;
    }

    public int getOcupationTime() {
        return ocupationEndTime-ocupationStartTime;
    }

    public int getLunchStartTime() {
        return lunchStartTime;
    }

    public int getLunchEndTime() {
        return lunchEndTime;
    }

    public int getLunchTime() {
        return lunchEndTime-lunchStartTime;
    }
}
