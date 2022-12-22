import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ScheduleTest {
    Schedule schedule=new Schedule("s");
    LocalDateTime startShift1=LocalDateTime.of(2022,1,1,2,1);
    LocalDateTime endShift1=LocalDateTime.of(2022,1,1,4,1);
    Shift shift1=new Shift("shift1",startShift1,endShift1);
    List<Shift> shifts=new ArrayList<Shift>();
    @Test
    void addShift() {
        shifts.add(shift1);
  Assertions.assertFalse(shifts.isEmpty());
    }

}