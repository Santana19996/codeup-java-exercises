import java.util.Arrays;

class ArraysExercises {



    public static void main(String[] args) {


        Person [] people = new Person[3];
        people[0]= new Person("BobbyHill");
        people[1]= new Person("Hank");
        people[2]= new Person("HeisinBerg");

        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i].getName());

        }
        people = addPerson(people, new Person ("New grades.Student"));
        System.out.println();
        for (Person person: people) {
            System.out.println(person.getName());
        }

    }

    public static Person [] addPerson(Person [] people, Person personToAdd){
        Person[] newPeopleArray = Arrays.copyOf(people, people.length + 1);

        newPeopleArray[newPeopleArray.length -1]= personToAdd;
        return newPeopleArray;

    }
}