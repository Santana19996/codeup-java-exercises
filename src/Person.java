public class Person {
    private String name;
    private int age;

    public String getName() {
        ////TODO: return the person's name
        return name;
    }



    public void setName(String name) {
        ////TODO: change the name property to the passed value
        this.name = name;
    }

public Person(){

}

public Person ( String name, int age){
        this.name = name;
        this.age= age;
}
public int getAge(){
            return age;
}


public void  setAge(int age){
        this.age= age;
}
    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.println("Hello friend " +name + " I am " +age+ " years old");
    }

    public static void main(String[] args) {
        Person personOne = new Person();
        personOne.setName("Billy");
        personOne.setAge(23);
        System.out.println(personOne.getName());
        personOne.sayHello();
       Person persontwo = new Person("Eli",38);
       persontwo.sayHello();



    }
}
