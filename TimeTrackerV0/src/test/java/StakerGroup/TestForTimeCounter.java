package StakerGroup;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestForTimeCounter {


    @Test
    public void dayDurationTest(){
        int start=9;
        int end=18;
        OcupationPeriod day1 = new OcupationPeriod(9);
        day1.endOcupation(end);
        day1.startLunch(12);
        day1.endLunch(13);
        assertTrue(day1.occupationSummary()==end-start-(1));
    }
   /* @Test
    public void customLunchCountingTest(){
        int lunchBegin=12;
        int lunchEnd=13;
        assertTrue(day1.lunchTime(lunchBegin,lunchEnd)==1);
    }
*/
}
