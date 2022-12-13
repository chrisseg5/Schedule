import java.util.List;

public class Shift {
    private String shiftname ;
    private int fromHour;
    private int fromMinute;
    private  int endHour;
    private int endMinute;
    private int day;
    private int month;
    private int year ;




    Shift(String name , int hour , int minute, int EndHour , int EndMinute, int day, int month, int year ){
        this.shiftname=name;
        this.fromHour=hour;
        this.fromMinute=minute;
        this.endHour=EndHour;
        this.endMinute=EndMinute;
        this.day=day;
        this.month=month;
        this.year=year;
        setTime(this.fromHour,this.fromMinute);
    }
    public void setTime(int h , int m  ){
        fromHour=((h>=0 && h<24) ? h:00);
        fromMinute=((m>=0 && m<60) ? fromMinute:00);

    }
    @Override
    public String toString() {
        return "Shift{" +
                "shift name='" + shiftname + '\'' +
                ", from Hour=" + fromHour +
                ", from Minute=" + fromMinute +
                ", end Hour=" + endHour +
                ", end Minute=" + endMinute +
                ", day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
    public void personsForShift(List<String> list) {
             if(list.size()<2){
                GroupInterface person=new Person(list.get(0));
                System.out.println("The Person that you add  is : " + person.getName());

             }else{
                 GroupInterface group=new Group("Group name1");
                 for(int i=0;i< list.size();i++) {
                     ((Group) group).addPersons(new Person(list.get(i)));
                 }
                 System.out.println("The Persons that you add are : "+((Group) group).getPersons());

             }
       }
    }







