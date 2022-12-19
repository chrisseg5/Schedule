
import java.util.*;
public class Group implements Employees {
    private  UUID id;
    private String name ;
    private List<Assignment> assignments = new ArrayList<>();

    public  Group(String name) {
        this.id=UUID.randomUUID();
        this.name=name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    public void assignPerson(Person person, Role role) {
        this.assignments.add(new Assignment(person, role));
    }

    public List<Assignment> getAssignments() {
        return assignments;
    }

    @Override
    public String getNameForShift() {
        return this.getName();
    }


}
