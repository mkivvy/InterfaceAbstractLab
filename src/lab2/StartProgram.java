package lab2;

import javax.swing.JOptionPane;

/**
 * I did not revert back to using the original classes assigned after all the 
 * trouble I had getting them to make sense in lab1.
 * Bad:
 * - Maybe it's because I strayed from the original assignment, but I am really
 * not getting any advantage of using an interface.  All it seems to do is
 * require more work.  I must be missing something that would make it sensible.
 * - This time I tried keeping my superclass simple, including only the 
 * validation methods and the string prereq method that need to be implemented 
 * in the child classes, hoping with my documentation that these classes would
 * include a field for each validation routine.  I like that it keeps the 
 * class straightforward and simple, but I don't know if I like the lack of 
 * control there.
 * - I do not like being unable to force the validation methods to be called 
 * from the setters.  Even if I included abstract methods for the setters, I
 * still would not be able to do this as I had in lab1A.
 * - I hated having to do duplicate coding in each of the child programs.
 * - I attempted to separate out the prereqs into a new class inheriting from 
 * the base course class.  This seems reasonable as only classes that require
 * prereqs would need to use the additional fields here.  However, I couldn't
 * find a use for the base class without the prereqs, so it seemed pointless.  
 * I expect that it's just me, though, and there is something I am missing.
 * - I am still not comfortable being locked into using JOptionPane as the
 * method for communicating error messages.
 * 
  * Good:  
 * + Having global constants to set the minimum & maximum number of credits.  I
 * know there could be danger in that the child is not required to use them, but
 * there are available across all children and would only need to be changed
 * in one place if the range of values expands.
 * + Can't think of anything else I liked in using the interface superclass for
 * this particular example.
 * 
 * Liskov Substitution principle:
 * In this case, I was able to make use of this principle.  I define an array
 * of the base type Course and populate it with instantiated objects of the
 * types CourseCatalog and LabCourse.  It is nice to be able to use the base
 * class for an array to allow looping through to process each array element, 
 * as I do in the output. The limitation, however, is that I have to check
 * the object type using the instanceof operator and cast each element to 
 * access the toString methods.
 *
 * @author Mary King
 * @version 1.00
 */
public class StartProgram {

    public static void main(String[] args) {
        Course[] myCourses = new Course[5];

        CourseCatalog catalog1 = new CourseCatalog("Introduction to Programming",
                "150-0001", 2.0, 0);
        catalog1.setCatalogSemester("Fall");
        myCourses[0] = catalog1;

        CourseCatalog catalog2 = new CourseCatalog("Introduction to Java Programming", 
                "150-0011", 2.0, 1);
        String[] prerequisites2 = {"Introduction to Programming"};
        catalog2.setPrerequisites(prerequisites2);
        catalog2.setCatalogSemester("Fall");
        myCourses[1] = catalog2;

        CourseCatalog catalog3 = new CourseCatalog("Advanced Java Programming", 
                "150-0021", 3.0, 3);
        String[] prerequisites3 = {"Introduction to Programming",
            "Introduction to Java Programming",
            "LOTS and LOTS of time for homework! "};
        catalog3.setPrerequisites(prerequisites3);
        catalog3.setCatalogSemester("Spring");
        myCourses[2] = catalog3;

        LabCourse lab1 = new LabCourse("Advanced Chemistry", 
                "301-0021", 4.0, 3);
        String[] prerequisites4 = {"Basic Science",
            "Introduction to Chemistry",
            "Algebra I"};
        lab1.setPrerequisites(prerequisites4);
        lab1.setLabHrs(2.0);
        lab1.setLabType("Chemistry");
        myCourses[3] = lab1;

        LabCourse lab2 = new LabCourse("Woodworking I", 
                "400-0101", 2.0, 0);
        lab2.setLabHrs(4.0);
        lab2.setLabType("Wood Shop");
        myCourses[4] = lab2;

        //display data
        String prereq = "";
        for (int i = 0; i < myCourses.length; i++) {
            if (myCourses[i] instanceof CourseCatalog) {
                CourseCatalog cc = (CourseCatalog) myCourses[i];
                if (cc.getNumPrereqs() > 0) {
                    prereq = "\nPrerequisites: " + cc.getPrerequitesString();
                } else {
                    prereq = "";
                }
                JOptionPane.showMessageDialog(null, cc.toString() + prereq);
            }
            if (myCourses[i] instanceof LabCourse) {
                LabCourse lc = (LabCourse) myCourses[i];
                if (lc.getNumPrereqs() > 0) {
                    prereq = "\nPrerequisites: " + lc.getPrerequitesString();
                } else {
                    prereq = "";
                }
                JOptionPane.showMessageDialog(null, lc.toString() + prereq);
            }
        }
    }
}
