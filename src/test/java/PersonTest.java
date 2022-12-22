import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    Person person=new Person("person");
    @Test
    public void getName() {

        Assertions.assertEquals("person",person.getName());
    }

    @Test
    public  void getNameForShift() {
        Assertions.assertEquals("person",person.getName());
    }

    @Test
    public void setName() {
        person.setName("personTest");
        Assertions.assertEquals("personTest",person.getName());
    }
}