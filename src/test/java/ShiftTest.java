import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class ShiftTest {
    @BeforeEach
    void setUp() {

    }

    LocalDateTime startShift1 = LocalDateTime.of(2022, 1, 1, 2, 1);
    LocalDateTime endShift1 = LocalDateTime.of(2022, 1, 1, 3, 1);
    LocalDateTime startShift2 = LocalDateTime.of(2022, 1, 1, 1, 1);
    LocalDateTime endShift2 = LocalDateTime.of(2022, 1, 1, 3, 1);
    Shift shift1 = new Shift("shift1", startShift1, endShift1);
    Shift shift2 = new Shift("shift1", startShift2, endShift2);

    @Test
    void getShiftName() {

        assertFalse(shift1.getShiftName().isEmpty());
        assertEquals("shift1", shift1.getShiftName());
    }

    @Test
    public void overlapOnlyOnBeginningTest() {
        assertTrue(shift1.overlap(shift2));
    }

    @Test
    void setShiftname() {
        shift1.setShiftname("testsetShiftname");
        assertEquals("testsetShiftname", shift1.getShiftName());

    }

    @Test
    void getStartTime() {
        assertFalse(shift1.getStartTime().toString().isEmpty());

    }

    @Test
    void addpersonOrGroupForShift() {
        Person person1 = new Person("Chris");

        Role role1 = new Role("role1");

        Assignment assignment1 = new Assignment(person1, role1);

        Group group1 = new Group("Group1");

        group1.addPersonAndRole(assignment1);

        shift1.addpersonOrGroupForShift(group1);

        assertFalse(shift1.getPersonOrGroupForShift().toString().isEmpty());
    }
}



//   @Test
//   void printpersonOrGroupForShift() {
//       String expected = "";
//       Assert.assertEquals(expected,shift1.printpersonOrGroupForShift());

//   }

