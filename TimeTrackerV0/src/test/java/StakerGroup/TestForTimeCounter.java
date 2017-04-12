package StakerGroup;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestForTimeCounter {

    private OcupationPeriod day1 = new OcupationPeriod();
    @Test
    public void dayDurationTest(){
        int start=9;
        int end=18;
        day1.beginOcupation(start);
        day1.endOcupation(end);
        assertTrue(day1.occupationSummary()==end-start);
    }
    @Test
    public void standartLunchCountingTest(){
        assertTrue(day1.lunchDuration()==1);

    }
    @Test
    public void customLunchCountingTest(){
        int lunchBegin=12;
        int lunchEnd=13;
        assertTrue(day1.lunchDuration(lunchBegin,lunchEnd)==1);
    }

}
