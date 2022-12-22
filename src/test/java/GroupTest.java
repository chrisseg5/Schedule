
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.security.PublicKey;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class GroupTest {
    Group group=new Group("group");
    @Test
    public void  assignPersonTest(){
        Person person= new Person("Alex");
        Role role=new Role("Role1");
        Group group1=new Group("g");
        Assignment assignment=new Assignment(person,role);
        group1.addPersonAndRole(assignment);
        Assertions.assertFalse(group1.getAssignments().isEmpty());
    }
    @Test
    public void setNameTest(){
        group.setName("groupTest");
        Assertions.assertEquals("groupTest",group.getName());
    }
    @Test
    public  void  getNameTest(){
        Assertions.assertEquals("group",group.getName());
    }


}