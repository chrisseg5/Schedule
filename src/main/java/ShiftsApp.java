import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShiftsApp {


    public static void main(String[] args) {

        //List<Shift> shifts=new ArrayList<Shift>();
        Role role1=new Role("Leader");

        Schedule scheduleA = new Schedule();
        Shift shift1=new Shift("shift1",19,00,10,00,12,2,2022);
        Shift shift2=new Shift("shift2",12,00,20,00,12,2,2022);
        Shift shift3=new Shift("shift3",15,00,16,00,12,2,2022);
        scheduleA.addShift(shift1);
        scheduleA.addShift(shift2);
        scheduleA.addShift(shift3);

        Person person1=new Person("Chris");
        Person person2=new Person("John");
        Person person3=new Person("George");
        Person person4=new Person("Alex");
        Person person5=new Person("Peter");
        Person person6=new Person("Nick");

        Group group1=new Group("Group1");
        Group group2=new Group("Group2");
        Group group3=new Group("Group3");
//        group1.addPersons(person2);
//        group1.addPersons(person3);
//        group2.addPersons(person1);
//        group2.addPersons(person3);
//        group3.addPersons(person4);
//        group3.addPersons(person6);

        shift1.addpersonOrGroupForShift(group1);
        shift2.addpersonOrGroupForShift(person1);
        shift3.addpersonOrGroupForShift(person1);


        Map<Person,Role> roles=new HashMap<>();
        roles.put(person2,role1);
        shift1.setRoles(roles);

    }
}
