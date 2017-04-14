package StakerGroup;

import org.junit.Test;

import java.time.Duration;

import static org.junit.Assert.assertTrue;

public class TestForTimeCounter {


    @Test
    public void dayDurationTest(){
        int startHour=9, startMin=30;
        int endHour=19, endMin=20;

        OccupationPeriod day1 = new OccupationPeriod(startHour, startMin);
        day1.endOccupation(endHour,endMin);
        day1.startLunch(12, 0);
        day1.endLunch(13,0);
        Duration testDuration = day1.getOccupationTime().minus(day1.getLunchTime());
        assertTrue(day1.occupationSummary().equals(testDuration));
    }
}
