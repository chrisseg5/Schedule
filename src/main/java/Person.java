
import java.util.ArrayList;

import java.util.List;
import java.util.UUID;

public class Person implements Base_assignable_resource {
    String name;

    private UUID id;

    private List<Group> PersonGroup;

    public void setName(String name){
        this.name=name;
        id=UUID.randomUUID();
    }
    public String getName(){
        return name;
    }

    public void setPersonGroup(List<Group> personGroup) {
        PersonGroup = personGroup;
    }

    public List<Group> getPersonGroup() {
        return PersonGroup;
    }



}
