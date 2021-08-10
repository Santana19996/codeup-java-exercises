public class Person {

    //-----------Object Basics------------
    private String name;

    public Person(String givenName) {
        setName(givenName);
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Hello," + name);
    }

    public static void main(String [] args){


        Person person1 = new Person("John");
        Person person2 = new Person("Bob");
        System.out.println(person1.getName().equals(person2.getName())); //true
        System.out.println(person1 == person2); //false

    }
}