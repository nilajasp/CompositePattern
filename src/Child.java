/**
 * Created by nilajapatankar on 6/12/14.
 */
public class Child implements IPerson {

    int _age;
    String _name;

    public Child(String name, int age) {
        _name = name;
        _age = age;
    }

    @Override
    public void ShowFamilyInformation() {
        System.out.println("Name: "+_name+"\tAge: "+_age);
    }
}
