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
    public String toString(){
        return "You made a shift with name "+shiftname+" form "+fromHour+":"+fromMinute+"to "+endHour+":"+ endMinute+" in "+day+"/"+month+"/"+year ;
    }
    public  void makegroup(){
        Group group =new Group("GROUP NAME1");
        group.addPeople(new Person("Giannis"));
        group.addPeople(new Person("Xristos"));
        group.addPeople(new Person("Alexandros"));

        System.out.println("the people that you choose are : "+group.getPeople());
    }




}
