 public  class CreateShift {
    private String Shiftname ;
    private int hour;
    private int minute;
    private  int EndHour;
    private int EndMinute;
    private int d;
    private int m;
    private int y ;
    private String day;
    final String[] DAYS= {
            "Monday", "Tuesday"," Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
    };

    CreateShift(String name , int hour , int minute, int EndHour , int EndMinute, int d, int m, int y ) {
        this.Shiftname=name;
        this.hour=hour;
        this.minute=minute;
        this.EndHour=EndHour;
        this.EndMinute=EndMinute;
        this.d=d;
        this.m=m;
        this.y=y;
        setTime(this.hour,this.minute);


    }
    public void setTime(int h , int m  ){
        hour=((h>=0 && h<24) ? h:00);
        minute=((m>=0 && m<60) ? minute:00);

    }

    public  String toString() {
         if(m <3){
             m+= 12;
             y-=1;

         }
         int k=y%100;
         int j=y/100;
         int day =((d+ (((m+1)*26)/10+k+(k/4)+(j/4))+(5*j))%7);

         return ("You made a Shift with the name  "+this.Shiftname+"   from "+this.hour+":"+this.minute+"   to "+this.EndHour+":"+this.minute+"   in " +this.d+"/"+this.m+"/"+this.y+" on "+DAYS[day]);
    }
}
