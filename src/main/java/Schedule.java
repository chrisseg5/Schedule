import java.util.ArrayList;
import java.util.List;

public class Schedule {


    public static void main(String[] args) {

         List<Shift> shifts=new ArrayList<Shift>();


         Shift shift1=new Shift("shift1",13,00,15,00,12,2,2033);
         Shift shift2=new Shift("shift2",12,00,15,00,12,2,2033);Shift shift3=new Shift("shift3",14,00,15,00,12,2,2033);
         shifts.add(shift1);
         shifts.add(shift2);

          Person person1=new Person("Chris");
          Person person2=new Person("John");
          Person person3=new Person("George");

          Group group1=new Group("Group1");
          group1.addPersons(person2);
          group1.addPersons(person3);

          shift1.addpersonOrGroupForShift(person1);
          shift2.addpersonOrGroupForShift(group1);



          for (Shift shift:shifts){
              System.out.println("the shift you have made:\n"+shift+"\n from:");
              shift.printpersonOrGroupForShift();
          }
    }
}
