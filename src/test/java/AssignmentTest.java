import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AssignmentTest {
Person person=new Person("name");
Role role=new Role("role");
Assignment assignment=new Assignment(person,role);
    @Test
    void getPerson() {
        List<Person> p=new ArrayList<>();
        p.add(assignment.getPerson());
        Assertions.assertFalse(p.isEmpty());

    }

    @Test
    void getRole() {
        List<Role> r=new ArrayList<>();
        r.add(assignment.getRole());
        Assertions.assertFalse(r.isEmpty());
    }
}