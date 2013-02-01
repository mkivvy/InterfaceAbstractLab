package lab1;

import javax.swing.JOptionPane;

/**
 * Good:  
 * Bad:
 * @author Mary King
 * @version 1.00
 */
public class StartProgram {
    public static void main(String[] args) {
    
        CourseDescription[] courses = new CourseDescription[3];
        
        //Valid data entered
        IntroToProgrammingCourse intro = new IntroToProgrammingCourse
                ("Introduction to Programming", "150-0001", 2.0);
        courses[0] = intro;

        IntroJavaCourse java1 = new IntroJavaCourse
                ("Introduction to Java Programming", "150-0011", 2.0);
        String[] prerequisites1 = {"Introduction to Programming"};
        java1.setPrerequisites(prerequisites1);
        courses[1] = java1;

        AdvancedJavaCourse java2 = new AdvancedJavaCourse
                ("Advanced Java Programming", "150-0021", 3.0);
        String[] prerequisites2 = {"Introduction to Programming", 
            "Introduction to Java Programming"};
        java2.setPrerequisites(prerequisites2);
        courses[2] = java2;
        
        //Invalid data entered
//        IntroToProgrammingCourse introX = new IntroToProgrammingCourse
//                (null, "", 0.0);
//        courses[0] = introX;
//        IntroJavaCourse java1X = new IntroJavaCourse
//                ("", null, -2.0);
//        String[] prerequisites3 = {"Introduction to Programming", 
//            "Introduction to Java Programming", "XXXX"};
//        java1X.setPrerequisites(prerequisites3);
//        courses[1] = java1X;
//        AdvancedJavaCourse java2X = new AdvancedJavaCourse
//                (null, null, 5.0);
//        String[] prerequisites4 = {"", ""};
//        java2X.setPrerequisites(prerequisites4);
//        courses[2] = java2X;
        
        //display data
        String prereq = "";
        for (int i = 0; i < courses.length; i++) {
            if (courses[i].isCourseHasPrerequisite()) {
                if (courses[i] instanceof IntroJavaCourse) {
                    IntroJavaCourse course1 = (IntroJavaCourse) courses[i];
                    prereq = "\nPrerequisites: " + course1.getPrerequitesString();
                } else {
                    AdvancedJavaCourse course1 = (AdvancedJavaCourse) courses[i];
                    prereq = "\nPrerequisites: " + course1.getPrerequitesString();
                }
            }

            JOptionPane.showMessageDialog(null, courses[i].toString()
                    + prereq);
            
        }
    }

}
