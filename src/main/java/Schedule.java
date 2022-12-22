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
              for(ShiftResource p1 : shifts.get(i).getPersonOrGroupForShift()){
                  for(ShiftResource p2 : shifts.get(j).getPersonOrGroupForShift()){
                      if(p1.getName().equals(p2.getName())){
                          System.out.println("You have set the person "+p1.getName()+" in two or more shifts");
                      }
                  }

              }
          }
      }
  }


        return "";
    }
//  public  void checkForOverlap(){
//      for (int i =0; i<shifts.size();i++){

//          Shift shift1=shifts.get(i);
//          for(int j=i+1 ;j<shifts.size();j++){

//              Shift shift2=shifts.get(j);
//              if(shift1.getStartTime().isAfter(shift2.getStartTime())
//                      && shift1.getStartTime().isBefore(shift2.getEndTime())){
//
//              }
//              if(shift1.getEndTime().isAfter(shift2.getStartTime()) &&
//                      shift1.getEndTime().isBefore(shift2.getEndTime())){
//
//              }
//              if (shift2.getStartTime().isAfter(shift1.getStartTime())
//                      && shift2.getStartTime().isBefore(shift1.getEndTime())){
//
//              if(shift2.getEndTime().isAfter(shift1.getStartTime())
//                      && shift2.getEndTime().isBefore(shift1.getEndTime())){
//
//              }

//          }
//      }
//  }
}
