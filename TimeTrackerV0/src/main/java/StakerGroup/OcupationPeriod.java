package StakerGroup;

public class OcupationPeriod {

    private int ocupationStartTime;
    private int ocupationEndTime;

    OcupationPeriod() {
    }
    public void beginOcupation(int ocupationStartTime){
        this.ocupationStartTime = ocupationStartTime;
    }
    public void endOcupation(int ocupationEndTime){
        this.ocupationEndTime = ocupationEndTime;
    }

    /**
     * Default lunch time
     */
    public int lunchDuration(){
        return endLunch()-beginLunch();
    }

    private int beginLunch(){ return 13; }
    private int endLunch(){
        return 14;
    }

    /**
     * Custom lunch time
     * @param begin
     * @param end
     */
    public int lunchDuration(int begin, int end){
        return endLunch(end)-beginLunch(begin);
    }
    private int beginLunch(int lunchBegining){
        return lunchBegining;
    }
    private int endLunch(int lunchEnding){
        return lunchEnding;
    }
    public int occupationSummary(){
        return ocupationEndTime-ocupationStartTime-lunchDuration();
    }
}
