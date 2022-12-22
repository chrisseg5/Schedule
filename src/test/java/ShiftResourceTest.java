import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShiftResourceTest {

    @Test
    public void getNameTest() {


    }

    @Test
    public void getNameForShiftTest() {
        LocalDateTime startShift1=LocalDateTime.of(2024,1,1,9,0);
        LocalDateTime endShift1=LocalDateTime.of(2024,1,1,12,30);
        Shift shift1=new Shift("shift1",startShift1,endShift1);
        List<ShiftResource>personOrGroupForShift=new ArrayList<>();
        Person person1=new Person("Chris");
        Role role1=new Role("role1");
        Assignment assignment1=new Assignment(person1,role1);
        Group group1=new Group("Group1");
        group1.addPersonAndRole(assignment1);
        shift1.addpersonOrGroupForShift(group1);
        Assertions.assertFalse(personOrGroupForShift.isEmpty());
    }
}