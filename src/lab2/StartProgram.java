package lab2;

import javax.swing.JOptionPane;

/**
 *
 * @author Mary
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
