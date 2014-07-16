import java.util.*;

/**
 * Created by nilajapatankar on 6/12/14.
 */
public class Parent implements IPerson {
    List<IPerson> children;
    int _age;
    String _name;

    @Override
    public void ShowFamilyInformation() {
        System.out.println("Name: "+_name+"\tAge: "+_age);
        for (IPerson child : children) {
            child.ShowFamilyInformation();
        }
    }

    public void AddChild(IPerson child){
        children.add(child);
    }

    public Parent(String name, int age) {
        _name = name;
        _age = age;
        children = new ArrayList<IPerson>();
    }
}
