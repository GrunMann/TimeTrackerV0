package StakerGroup;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

/**
 * Created by gm on 11.05.17.
 */
public class TestForSchedule {
    private Schedule schedule = new Schedule();
    @Test
    public void testForPropertiesExistance(){
        assertTrue(schedule.propertyesNotEmpty);
    }

    @Test
    public void testForFullProperties(){
        assertTrue((schedule.monDayEnd-schedule.monDayStart-(schedule.monLunchEnd-schedule.monLunchStart)).toMinutes()==(8*60+15));
        assertTrue((schedule.tewDayEnd-schedule.tewDayStart-(schedule.tewLunchEnd-schedule.tewLunchStart)).toMinutes()==(8*60+15));
        assertTrue((schedule.wenDayEnd-schedule.wenDayStart-(schedule.wenLunchEnd-schedule.wenLunchStart)).toMinutes()==(8*60+15));
        assertTrue((schedule.thuDayEnd-schedule.thuDayStart-(schedule.thuLunchEnd-schedule.thuLunchStart)).toMinutes()==(8*60+15));
        assertTrue((schedule.friDayEnd-schedule.friDayStart-(schedule.friLunchEnd-schedule.friLunchStart)).toMinutes()==(7*60));
        assertTrue((schedule.satDayEnd-schedule.satDayStart-(schedule.satLunchEnd-schedule.satLunchStart)).toMinutes()==(0));
        assertTrue((schedule.sunDayEnd-schedule.sunDayStart-(schedule.sunLunchEnd-schedule.sunLunchStart)).toMinutes()==(0));
    }



}
