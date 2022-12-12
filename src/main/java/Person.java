import java.util.*;

public  class Person implements GroupInterface {
    private UUID id;
    private String name;
    public Person(String name){
        this.id=UUID.randomUUID();
        this.name=name;
    }


    @Override
    public void addPeople(Person person) {

    }

    @Override
    public List<Person> getPeople() {
        return null;
    }

    public  String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
