import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoleTest {
    Role role=new Role("name");
    @Test
    void getName() {
        Assertions.assertEquals("name",role.getName());
    }

    @Test
    void setName() {
        role.setName("test");
        Assertions.assertEquals("test",role.getName());
    }
}