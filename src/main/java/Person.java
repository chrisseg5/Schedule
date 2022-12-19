import java.util.*;

public  class Person implements Employees {
    private UUID id;

    private String name;
    private Role role;
    public Person(String name){
        this.id=UUID.randomUUID();
        this.name=name;
    }


    public  String getName(){
        return this.name;
    }

    public  String getNameForShift(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
