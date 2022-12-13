import java.util.ArrayList;
import java.util.List;

public class Schedule {


    public static void main(String[] args) {


        List<Shift> shifts=new ArrayList<Shift>();


        Shift shift1=new Shift("shift1",13,00,15,00,12,2,2033);
        Shift shift2=new Shift("shift2",12,00,15,00,12,2,2033);
        Shift shift3=new Shift("shift3",14,00,15,00,12,2,2033);

        shifts.add(shift1);
        shifts.add(shift2);
        shifts.add(shift3);



        for (Shift shift:shifts){

            System.out.println(shift.toString());

            List<String> namesForThatShift =new ArrayList<>();

            namesForThatShift.add("chris");
            namesForThatShift.add("john");


            shift.personsForShift(namesForThatShift);

        }





    }
}
