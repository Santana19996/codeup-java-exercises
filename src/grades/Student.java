package grades;

import java.util.ArrayList;

public class Student {
    private String name;


   private  ArrayList<Integer> Studentgrades ;


    public Student(String name) {
        this.name = name;
       Studentgrades=new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public double getGradeAverage(){
        double sumOfGrades = 0;
        double amountOfGrades = Studentgrades.size();
        for (int Studentgrades:Studentgrades){
            sumOfGrades +=Studentgrades;
        }
        return sumOfGrades/amountOfGrades;
    }




    public static void main(String[] args) {
Student billyjoe = new Student("BillyJoe");
billyjoe.addGrade(30);
billyjoe.addGrade(40);
billyjoe.addGrade(50);
        System.out.println("im just like billyjoe" + billyjoe.getGradeAverage());
    }
    public void addGrade(int Studentgrade){
        Studentgrades.add(Studentgrade);
    }

}
