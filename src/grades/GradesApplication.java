
package grades;
import java.util.HashMap;
public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        Student tim = new Student("Bobby Lashley");
        tim.addGrade(49);
        tim.addGrade(60);
        tim.addGrade(70);

        Student kyle = new Student("kyle");
        kyle.addGrade(49);
        kyle.addGrade(60);
        kyle.addGrade(70);

        Student kenny = new Student("kenny");
        kenny.addGrade(49);
        kenny.addGrade(60);
        kenny.addGrade(70);


        Student cartman = new Student("cartman");
        cartman.addGrade(49);
        cartman.addGrade(60);
        cartman.addGrade(70);

        students.put("Wonderland",tim);
        students.putIfAbsent("whatisthis",kyle);
        students.putIfAbsent("Hello",kenny);
        students.putIfAbsent("ey",cartman);
    }
    public static void CLI (HashMap<String,Student> students){
        System.out.println("Here are the Usernames");
        for (String key:students.keySet()){
            System.out.println(key);
        }

    }
}
