package StakerGroup;

import java.time.Duration;
import java.time.LocalTime;

public class OccupationPeriod {

    private final LocalTime occupationStartTime;
    private LocalTime occupationEndTime;
    private LocalTime lunchStartTime;
    private LocalTime lunchEndTime;


    OccupationPeriod(int occupationStartTimeH, int occupationStartTimeM) {
        this.occupationStartTime = LocalTime.of(occupationStartTimeH, occupationStartTimeM);
    }
    public void endOccupation(int occupationEndTimeH, int occupationEndTimeM){
        this.occupationEndTime = LocalTime.of(occupationEndTimeH,occupationEndTimeM);
    }
    public void startLunch(int lunchStartH,int lunchStartM){
        this.lunchStartTime=LocalTime.of(lunchStartH,lunchStartM);
    }
    public void endLunch(int lunchFinishH,int lunchFinishM){
        this.lunchEndTime= LocalTime.of(lunchFinishH,lunchFinishM);
    }
    public Duration occupationSummary(){
        return  Duration
                .between(getOccupationStartTime(),getOccupationEndTime())
                .minus(Duration.between(getLunchStartTime(),getLunchEndTime())
                );
    }

    public LocalTime getOccupationStartTime() {
        return occupationStartTime;
    }

    public LocalTime getOccupationEndTime() {
        return occupationEndTime;
    }

    public Duration getOccupationTime() {
        return Duration.between(getOccupationStartTime(), getOccupationEndTime());
    }

    public LocalTime getLunchStartTime() {
        return lunchStartTime;
    }

    public LocalTime getLunchEndTime() {
        return lunchEndTime;
    }

    public Duration getLunchTime() {
        return Duration.between(getLunchStartTime(), getLunchEndTime());
    }
}
