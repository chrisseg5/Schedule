import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Schedule {
    private String name;

    public Schedule(String name) {
        this.name = name;
    }

    private List<Shift> shifts=new ArrayList<Shift>();


    public Schedule addShift(Shift aShift) {
        this.shifts.add(aShift);
        return this;
    }

    @Override
    public String toString() {
        Collections.sort(shifts, new Comparator<Shift>() {
            @Override
            public int compare(Shift s1, Shift s2) {
               return s1.getStartTime().compareTo(s2.getStartTime());
            }
        });


        for (Shift shift:shifts){
            System.out.println("\nthe shift you have made:\n"+shift+"\n from:");
            shift.printpersonOrGroupForShift();
            System.out.println("-----------------------------------------------------------");
        }


  for(int i=0; i<shifts.size();i++){

      for(int j=i+1;j<shifts.size();j++){

          if(shifts.get(i).overlap(shifts.get(j))){

              System.out.println("\n\n\nOverlap detected between  "+shifts.get(i).getShiftName()+" and "+shifts.get(j).getShiftName());

          }
      }
  }



        return "";
    }

}
