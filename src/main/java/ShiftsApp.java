import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShiftsApp {


    public static void main(String[] args) {

        List<Schedule> schedules=new ArrayList<Schedule>();


        LocalDateTime startShift1=LocalDateTime.of(2022,1,1,2,1);
        LocalDateTime endShift1=LocalDateTime.of(2022,1,1,4,1);
        LocalDateTime startShift2=LocalDateTime.of(2022,1,1,3,0);
        LocalDateTime endShift2=LocalDateTime.of(2022,1,1,5,0);
        LocalDateTime startShift3=LocalDateTime.of(2023,1,1,12,0);
        LocalDateTime endShift3=LocalDateTime.of(2023,1,1,16,0);

        Schedule scheduleA = new Schedule("Schedule1");

        Shift shift1=new Shift("shift1",startShift1,endShift1);
        Shift shift2=new Shift("shift2",startShift2,endShift2);
        Shift shift3=new Shift("shift3",startShift3,startShift3);

        scheduleA.addShift(shift1);
        scheduleA.addShift(shift2);
        scheduleA.addShift(shift3);

        Person person1=new Person("Chris");
        Person person2=new Person("John");
        Person person3=new Person("George");
        Person person4=new Person("Alex");
        Person person5=new Person("Peter");
        Person person6=new Person("Nick");

        Role role1=new Role("role1");
        Role role2=new Role("role2");
        Role role3=new Role("role3");


        Assignment assignment1=new Assignment(person1,role1);
        Assignment assignment2=new Assignment(person2,role2);

        Group group1=new Group("Group1");
        Group group2=new Group("Group2");
        Group group3=new Group("Group3");

        group1.addPersonAndRole(assignment1);
//        group1.addPersonAndRole(assignment2);
//        group2.addPersons(person1);
//        group2.addPersons(person3);
//        group3.addPersons(person4);
//        group3.addPersons(person6);

        shift1.addpersonOrGroupForShift(group1);
        shift2.addpersonOrGroupForShift(person1);
        shift3.addpersonOrGroupForShift(person1);

        scheduleA.toString();



    }
}
