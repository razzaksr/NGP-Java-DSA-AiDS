package oops;

public class ExecuteSealed {
    public static void main(String[] args) {
        Internship intern = new Internship();
        intern.showSkills();
        intern.displayInternshipDetails(); 
        System.out.println(intern.getClass().getName());
    }
}
// Departmenet ment to by inherite by only Internship
sealed class Department permits Internship{
    String[] mySkillsets = {"Java", "Python", "C++", "JavaScript", "SQL", "HTML/CSS"};
    void showSkills() {
        System.out.println("Skillsets: ");
        for (String skill : mySkillsets) {
            System.out.println(skill);
        }
    }
}
// eventhough Internship is permitted derived class it is declared as final
final class Internship extends Department {
    void displayInternshipDetails() {
        System.out.println("Internship at XYZ Company.");
        for (int index=0;index<mySkillsets.length;index++) {
            if(mySkillsets[index].equals("Java") || mySkillsets[index].equals("Python")) {
                System.out.println(index+" selected for internship based on skill");
            }
        }
    }
}
// since Training is not permitted by the Department
// final class Training extends Department {
//     void displayTrainingDetails() {
//         System.out.println("Training Program at ABC Institute.");
//     }
// }