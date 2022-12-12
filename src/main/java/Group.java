
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
    public void addPeople(Person person){
        this.people.add(person);
    }
    public List<Person> getPeople(){
        return this.people;
    }
    public  String getName(){
        return name;
    }

}
