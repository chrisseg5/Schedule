import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Schedule {


    public static void main(String[] args) {

         List<Shift> shifts=new ArrayList<Shift>();
         Role role1=new Role("Leader");


         Shift shift1=new Shift("shift1",19,00,10,00,12,2,2022);
         Shift shift2=new Shift("shift2",12,00,20,00,12,2,2022);
         Shift shift3=new Shift("shift3",15,00,16,00,12,2,2022);
         shifts.add(shift1);
         shifts.add(shift2);
         shifts.add(shift3);

          Person person1=new Person("Chris");
          Person person2=new Person("John");
          Person person3=new Person("George");
          Person person4=new Person("Alex");
          Person person5=new Person("Peter");
          Person person6=new Person("Nick");

          Group group1=new Group("Group1");
          Group group2=new Group("Group2");
          Group group3=new Group("Group3");
          group1.addPersons(person2);
          group1.addPersons(person3);
          group2.addPersons(person1);
          group2.addPersons(person3);
          group3.addPersons(person4);
          group3.addPersons(person6);

          shift1.addpersonOrGroupForShift(group1);
          shift2.addpersonOrGroupForShift(person1);
          shift3.addpersonOrGroupForShift(person1);


          Map<Person,Role> roles=new HashMap<>();
          roles.put(person2,role1);
          shift1.setRoles(roles);
          Collections.sort(shifts, new Comparator<Shift>() {
              @Override
              public int compare(Shift s1, Shift s2) {
                  if(s1.getYear()!=s2.getYear()){
                      return s1.getYear()-s2.getYear();
                  }else if(s1.getMonth()!=s2.getMonth()){
                      return s1.getMonth()-s2.getMonth();
                  } else if (s1.getDay()!=s2.getDay()) {
                      return s1.getDay()-s2.getDay();
                  }
                  return s1.getStratHour()-s2.getStratHour();


              }
          });


          for (Shift shift:shifts){
              System.out.println("\n\nthe shift you have made:\n"+shift+"\n from:");
              shift.printpersonOrGroupForShift();
          }


        for(int i=0; i<shifts.size();i++){
            for(int j=i+1;j<shifts.size();j++){
                if(shifts.get(i).overlap(shifts.get(j))){
                    System.out.println("Overlap detected between  "+shifts.get(i).getShiftname()+" and "+shifts.get(j).getShiftname());
                    for(Employees p1 : shifts.get(i).getPersonOrGroupForShift()){
                        for(Employees p2 : shifts.get(j).getPersonOrGroupForShift()){
                            if(p1.getName().equals(p2.getName())){
                                System.out.println("You have set the person "+p1.getName()+" in two or more shifts");
                            }
                        }

                    }
                }
            }
        }
    }
}
