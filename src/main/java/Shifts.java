import java.util.ArrayList;

/**
 *
 */
public class Shifts {


    public static void main(String[] args) {
        ArrayList<CreateShift> HistoryOfShifts = new ArrayList();
        CreateShift shift =new CreateShift("NewShift",12,00,15,30,17,8,1999);
        HistoryOfShifts.add(shift);


        System.out.println(shift.toString());


        Group group=new Group("NameGroup",4);



        ArrayList<Person> GroupOfPersons = new ArrayList();
        Person p1 = new Person("person1");
        Person p2 = new Person("person2");
        Person p3 = new Person("person3");
        Person p4 = new Person("person4");
        Person p5 = new Person("person5");
        Person p6 = new Person("person6");
        Person p7 = new Person("person7");
        Person p8 = new Person("person8");
        GroupOfPersons.add(p1);
        GroupOfPersons.add(p2);
        GroupOfPersons.add(p3);
        GroupOfPersons.add(p4);
        GroupOfPersons.add(p5);
        GroupOfPersons.add(p6);
        GroupOfPersons.add(p7);
        GroupOfPersons.add(p8);

        System.out.println("Group name :" +group.getName() + "\n The group is included by  :");
        for (int i = 0 ; i<group.getSizeOfGroup(); i++){
            System.out.println(GroupOfPersons.get(i).toString());
        }















    }
}
