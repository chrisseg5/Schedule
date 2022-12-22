import java.time.LocalDateTime;
import java.util.*;

class Shift  {
   private  String shiftname;
  private  LocalDateTime startTime;
    private  LocalDateTime endTime;
   private Map<Person,Role> roles;
   private List<ShiftResource> personOrGroupForShift;
    Shift(String shiftname, LocalDateTime startTime,LocalDateTime endTime) {
        this.shiftname=shiftname;
        this.startTime=startTime;
        this.endTime=endTime;
        this.personOrGroupForShift = new ArrayList<>();
    }


    public String getShiftName() {
         return shiftname;
     }
   public void setShiftname(String shiftname) {
       this.shiftname = shiftname;
   }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public Map<Person, Role> getRoles() {
        return roles;
    }

    public void setPersonOrGroupForShift(List<ShiftResource> personOrGroupForShift) {
        this.personOrGroupForShift = personOrGroupForShift;
    }


   public void addpersonOrGroupForShift(ShiftResource personOrGroupForShift) {
       this.personOrGroupForShift.add(personOrGroupForShift);
   }
   public List<ShiftResource> getPersonOrGroupForShift() {
       return this.personOrGroupForShift;
   }
   public void printpersonOrGroupForShift() {
       for (ShiftResource personOrGroup : this.personOrGroupForShift) {
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
        return "Shift{" +
                "shiftname='" + shiftname + '\'' +
                "Start Time='" + startTime + '\'' +
                "End Time='" + endTime + '\'' +
                ", personOrGroupForShift=" + personOrGroupForShift +
                '}';
    }
    public boolean overlap(Shift other){
    if(this.getStartTime().isAfter(other.getStartTime())
            && this.getStartTime().isBefore(other.getEndTime())){
        return true;
    }
    if(this.getEndTime().isAfter(other.getStartTime()) &&
            this.getEndTime().isBefore(other.getEndTime())){
        return true;
    }
    if (other.getStartTime().isAfter(this.getStartTime())
            && other.getStartTime().isBefore(this.getEndTime())){
        return true;
    }
    if(other.getEndTime().isAfter(this.getStartTime())
            && other.getEndTime().isBefore(this.getEndTime())){
        return true;
    }
      return false;
    }


    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }
}








