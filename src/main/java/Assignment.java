

public class Assignment {

    private final Person person;
    private final Role role;


    public Assignment(Person person, Role role) {
        this.person = person;
        this.role = role;
    }

    public Person getPerson() {
        return person;
    }

    public Role getRole() {
        return role;
    }
}
