import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Schedule {

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
                if(s1.getYear()!=s2.getYear()){
                    return s1.getYear()-s2.getYear();
                }else if(s1.getMonth()!=s2.getMonth()){
                    return s1.getMonth()-s2.getMonth();
                } else if (s1.getDay()!=s2.getDay()) {
                    return s1.getDay()-s2.getDay();
                }
                return s1.getStartHour()-s2.getStartHour();
            }
        });


        for (Shift shift:shifts){
            System.out.println("\n\nthe shift you have made:\n"+shift+"\n from:");
            shift.printpersonOrGroupForShift();
        }


        for(int i=0; i<shifts.size();i++){
            for(int j=i+1;j<shifts.size();j++){
                if(shifts.get(i).overlap(shifts.get(j))){
                    System.out.println("Overlap detected between  "+shifts.get(i).getShiftName()+" and "+shifts.get(j).getShiftName());
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
}
