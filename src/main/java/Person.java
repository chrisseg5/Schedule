import java.util.*;

public  class Person implements ShiftResource {
    private UUID id;

    private String name;

    public Person(String name) {
        this.id = UUID.randomUUID();
        this.name = name;
    }


    public String getName() {
        return this.name;
    }


    public String getNameForShift() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
