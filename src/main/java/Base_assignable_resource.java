import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public interface Base_assignable_resource {
    String name ="";

    void setName(String name);

    String getName();

    default void PersonsForTheShift() {
        List<Base_assignable_resource> PersonsForTheShift = new ArrayList<>();

      // PersonsForTheShift.add(new Person());
      // PersonsForTheShift.add(new Group());

    }

}
