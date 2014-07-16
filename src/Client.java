/**
 * Created by nilajapatankar on 6/12/14.
 */
public class Client {
    public static void main(String[] args) {
        Child child = new Child("A",22);
        Child cousinFirst = new Child("B",14);
        Child cousinSecond = new Child("B",14);
        Parent parent = new Parent("C",46);
        Parent uncle = new Parent("D",40);
        Parent grandParent = new Parent("E",70);

        parent.AddChild(child);
        uncle.AddChild(cousinFirst);
        uncle.AddChild(cousinSecond);
        grandParent.AddChild(parent);
        grandParent.AddChild(uncle);

        grandParent.ShowFamilyInformation();
    }
}
