import java.util.*;

class Shift  {
   private  String shiftname;
   private  int stratHour;
   private  int startMinute;
   private  int endHour;
   private  int endMinute;

   private  int day;
   private  int month;
   private  int year;
   private Map<Person,Role> roles;
   private List<Employees> personOrGroupForShift;

   public String getShiftname() {
         return shiftname;
     }public void setShiftname(String shiftname) {
       this.shiftname = shiftname;
   }
   public int getStratHour() {
       return stratHour;
   }
   public int getStartMinute() {
       return startMinute;
   }
   public int getEndHour() {
       return endHour;
   }
   public int getEndMinute() {
       return endMinute;
   }

    public void setStratHour(int stratHour) {
        this.stratHour = stratHour;
    }

    public void setStartMinute(int startMinute) {
        this.startMinute = startMinute;
    }

    public void setEndHour(int endHour) {
        this.endHour = endHour;
    }

    public void setEndMinute(int endMinute) {
        this.endMinute = endMinute;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Map<Person, Role> getRoles() {
        return roles;
    }

    public void setPersonOrGroupForShift(List<Employees> personOrGroupForShift) {
        this.personOrGroupForShift = personOrGroupForShift;
    }

    Shift(String name, int hour, int minute, int EndHour, int EndMinute, int day, int month, int year) {

       this.shiftname = name;
       this.stratHour = hour;
       this.startMinute = minute;
       this.endHour = EndHour;
       this.endMinute = EndMinute;
       this.day = day;
       this.month = month;
       this.year = year;
       setTime(this.stratHour, this.startMinute);
       this.personOrGroupForShift = new ArrayList<>();
   }
   public void setTime(int h, int m) {
       stratHour = ((h >= 0 && h < 24) ? stratHour : 00);
       startMinute = ((m >= 0 && m < 60) ? startMinute : 00);
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
   @Override
   public String toString() {
       return
               "shift name='" + shiftname + '\'' + ", from Hour=" + stratHour + ", from Minute=" + startMinute + ", end Hour=" + endHour + ", end Minute=" + endMinute + ", day=" + day + ", month=" + month + ", year=" + year;

   }

   public boolean overlap(Shift shifts){
       if(shifts.stratHour >=this.stratHour && shifts.endHour<=this.endHour && shifts.day==this.day && shifts.month==this.month && shifts.year==this.year){
           return true;
       }
       if(this.stratHour >= shifts.stratHour && this.endHour<= shifts.endHour && shifts.day==this.day && shifts.month==this.month && shifts.year==this.year){
           return  true ;
       }
       return false;
   }
   public void setRoles(Map<Person,Role> roles){
       this.roles=roles;
       System.out.println(this.roles+" in shift " + shiftname);
   }



}








