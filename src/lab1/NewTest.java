package lab1;

/**
 *
 * @author Mary
 */
public class NewTest {

    public static void main(String[] args) {
        NewClass[] newt = new NewClass[1];
        NewClass tester = new NewClass();
        String[] prerequisites1 = {"Introduction to Programming", "Another class"};
        tester.setPrerequisites(prerequisites1);
        newt[0] = tester;

        String prereqList = "";
        for (int i = 0; i < newt.length; i++) {
            prereqList = newt[i].getPrerequitesString();
        }
        System.out.println("\nPrerequisites: " + prereqList);

    }
}
