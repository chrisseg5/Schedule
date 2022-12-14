import java.util.ArrayList;
import java.util.List;

public class Shift {
    private String shiftname;
    private int fromHour;
    private int fromMinute;
    private int endHour;
    private int endMinute;
    private int day;
    private int month;
    private int year;
    private List<Employees> personOrGroupForShift;


    Shift(String name, int hour, int minute, int EndHour, int EndMinute, int day, int month, int year) {
        this.shiftname = name;
        this.fromHour = hour;
        this.fromMinute = minute;
        this.endHour = EndHour;
        this.endMinute = EndMinute;
        this.day = day;
        this.month = month;
        this.year = year;
        setTime(this.fromHour, this.fromMinute);
        this.personOrGroupForShift = new ArrayList<>();

    }

    public void addpersonOrGroupForShift(Employees personOrGroupForShift) {
        this.personOrGroupForShift.add(personOrGroupForShift);
    }

    public List<Employees> getPersonOrGroupForShift() {
        return this.personOrGroupForShift;
    }

    public void printpersonOrGroupForShift() {
        for (Employees personOrGroup : this.personOrGroupForShift) {

            if(getPersonOrGroupForShift().equals(personOrGroup.getName())){
                System.out.println(personOrGroup.getNameForShift());
            }else{
                System.out.println("Group name :"+personOrGroup.getName());
                System.out.println(personOrGroup.getNameForShift());
            }
        }

    }

    public void setTime(int h, int m) {
        fromHour = ((h >= 0 && h < 24) ? h : 00);
        fromMinute = ((m >= 0 && m < 60) ? fromMinute : 00);

    }

    @Override
    public String toString() {
        return
                "shift name='" + shiftname + '\'' +
                ", from Hour=" + fromHour +
                ", from Minute=" + fromMinute +
                ", end Hour=" + endHour +
                ", end Minute=" + endMinute +
                ", day=" + day +
                ", month=" + month +
                ", year=" + year
 ;
    }
}








