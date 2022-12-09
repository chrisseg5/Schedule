import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class Group implements Base_assignable_resource {
    private UUID id=UUID.randomUUID();
    String name;
    private List<Person> listOfPeople;

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name ;
    }

    public void setListOfPeople(List<Person> listOfPeople) {
        this.listOfPeople = listOfPeople;
    }

    public List<Person> getListOfPeople() {
        return listOfPeople;
    }
}


