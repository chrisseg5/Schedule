
import java.util.*;
public class Group implements GroupInterface {
    private  UUID id;
    private String name ;
    private List<Person> people;
    public  Group(String name) {
        this.id=UUID.randomUUID();
        this.name=name;
        this.people=new ArrayList<>();
    }
    public void addPersons(Person person){
        this.people.add(person);
    }
    public List<Person> getPersons(){

        return this.people;
    }
    public void setName(String name) {
        this.name = name;
    }
    public  String getName(){
        return name;
    }



}
