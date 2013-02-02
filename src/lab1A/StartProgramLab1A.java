package lab1A;

import javax.swing.JOptionPane;

/**
 * Good:  This is a much better way to handle this assignment!  The classes that
 * were really just data incognito are gone, but the data is still used here to
 * create classes of a new type: CourseCatalog which derives from Courses.  With
 * my redesign, I found I only needed 2 levels of hierarchy instead of 3 and it
 * feels more sensible and streamlined this way.
 * Other things I liked: 
 * + Keeping the common fields courseName, courseNumber, and courseCredits 
 * together in the base class with getters and setters there.
 * + Requiring the derived class(es) to create their own validation routines
 * for the data to populate these private fields
 * + Loved the fact that I could call the concrete validation methods in the
 * derived class from the setters in the parent!
 * + Having global constants to set the minimum & maximum number of credits.  I
 * know there could be danger in that the child is not required to use them, but
 * there are available across all children and would only need to be changed
 * in one place if the range of values expands.
 * 
 * Bad: I am sorry that I didn't see the bigger picture from the beginning,
 * that the given classes really should not be classes, even though the lab
 * was structured that way.  Life lesson learned (I hope) that you can't ASSUME!
 * Other things I did not like:
 * - I am still not comfortable being locked into using JOptionPane as the
 * method for communicating error messages.
 * 
 * Liskov Substitution principle:
 * I think this principle is more useful when there is more than one child class
 * for a given parent, like I had done in lab1.  I like being able to define an 
 * array of the parent class, populate it with any mixture of its child types
 * and then being able to loop through it to display output.  Of course, 
 * checking the type with the instanceof operator and casting can be a bit
 * cumbersome, but I still think it's cool to be able to look at the data
 * through the chosen filter.  
 * In this design, defining the array of the parent type, Course, only prevented 
 * me from being able to set & get the catalogSemester attribute directly.  In 
 * this case, I probably would have been better off defining the array as the
 * child type, CourseCatalog.
 *
 * @author Mary King
 * @version 1.00
 */
public class StartProgramLab1A {
    public static void main(String[] args) {
        Course[] myCourses = new Course[3];
        
        CourseCatalog catalog1 = new CourseCatalog("Introduction to Programming", 
                "150-0001", 2.0, false);
//        myCourses[0] = new CourseCatalog("Introduction to Programming", 
//               "150-0001", 2.0, false);
//       myCourses[0].
        catalog1.setCatalogSemester("Fall");
        myCourses[0] = catalog1;
        myCourses[0].setCourseNumber("160-0002");
        
        CourseCatalog catalog2 = new CourseCatalog
                ("Introduction to Java Programming", "150-0011", 2.0, true);
        String[] prerequisites2 = {"Introduction to Programming"};
        catalog2.setPrerequisites(prerequisites2);
        catalog2.setCatalogSemester("Fall");
        myCourses[1] = catalog2;
        myCourses[1].setCourseName("Intro to Cool Java Programming");
        
        CourseCatalog catalog3 = new CourseCatalog
                ("Advanced Java Programming", "150-0021", 3.0, true);
        String[] prerequisites3 = {"Introduction to Programming", 
            "Introduction to Java Programming", 
            "LOTS and LOTS of time for homework! "};
        catalog3.setPrerequisites(prerequisites3);
        catalog3.setCatalogSemester("Spring");
        myCourses[2] = catalog3;
        myCourses[2].setCourseCredits(4.0);
        
        //display data
        String prereq = "", semester;
        for (int i = 0; i < myCourses.length; i++) {
            if (myCourses[i].isCourseHasPrerequisite()) {
                prereq = "\nPrerequisites: " + myCourses[i].getPrerequitesString();
            }
            CourseCatalog cc = (CourseCatalog) myCourses[i];
            semester = cc.getCatalogSemester();
            JOptionPane.showMessageDialog(null, "Semester: " + semester + "\n"
                    + myCourses[i].toString()
                    + prereq);
            
        }
    }
}
