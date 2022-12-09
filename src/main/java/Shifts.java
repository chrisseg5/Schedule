import com.sun.tools.javac.Main;

import java.util.ArrayList;
import java.util.*;

public class Shifts {
    private String shiftname ;
    private int fromHour;
    private int fromMinute;
    private  int endHour;
    private int endMinute;
    private int day;
    private int month;
    private int year ;



    Shifts(String name , int hour , int minute, int EndHour , int EndMinute, int day, int month, int year ){
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

 // public static void main(String[] args) {

 // //  Base_assignable_resource p=new Person();
 // //  Base_assignable_resource g=new Group();

 // }

}
