import java.util.ArrayList;
import java.util.Objects;

public class Group {
    private String name ;
    private int SizeOfGroup;

    Group(String name , int SizeOfGroup){
        this.name=name;
        this.SizeOfGroup=SizeOfGroup;
    }

    public void  setName(String name) {
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void  setSizeOfGroup(int SizeOfGroup) {
        this.SizeOfGroup=SizeOfGroup;
    }
    public int getSizeOfGroup(){
        return this.SizeOfGroup;
    }

}
