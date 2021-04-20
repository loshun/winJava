package com.tts;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();
        integerList.add(3);

        HashMap<String, String> stringHashMap = new HashMap<>();
        stringHashMap.put("honda", "civic");

        Integer num = new Integer(5);
//        Integer num = 5;
        // wrapper classes and String can be utilized like primitives
        // you do not need to invoke the constructor

        //        String myString = new String("this is my String");
        String myString = "this is my string";

        System.out.println("num is of type: " + num.getClass());

        //Person is the class we created (the type)
        //firstPerson is the name of the variable (the reference)
        // new Person() initializes an instance of Person
        Person firstPerson = new Person();
        Person secondPerson = new Person("John");
        Person thirdPerson = new Person("Jane", 45, "London");
        Person fourthPerson = new Person("John");

        secondPerson.sayHello();
        thirdPerson.sayHello();
        // keep in mind that the print out from below will say John as well
        // this is still a unique value with respect to the second instance of Person
        fourthPerson.sayHello();

        System.out.println("Jane will be " + thirdPerson.birthday() + " years old next year!");

        System.out.println(thirdPerson.birthYear(2021));

        //we cannot directly access the field name because it is private
        // so thirdPerson.name would not work
        System.out.println(thirdPerson.getName());
        thirdPerson.setName("Mary");
        System.out.println(thirdPerson.getName());


        Book myBook = new Book("Michael Crichton",
                "Jurassic Park",
                1993,
                "publisher",
                "sci-fi/thriller");

        System.out.println(myBook);

        Dog myDog = new Dog("Chihuahua mix", "Lionel", "Alpo");
        myDog.doFetch(myDog);

        System.out.println(myDog.getCry());

        // this dog is polymorphic
        // the child class has access to the parent class (Animal)
        // all dogs are animals, but not all animals are dogs
        // in java you can instantiate a variable as the given value's parent
        // this helps restrict access to certain features of the Dog class
        Animal myPolymorphicDog = new Dog("Rat Terrier", "Mark", "Bongo");

        //can also be written like this but won't have access to everything in Animal or Dog
        // will only have access to everything available to the class Object
        // this is an example of extreme polymorphism
        // not very useful  but demonstrates the capabilities of polymorphism
        // should never do this (unless trying to trick the compiler)
        Object otherDog = new Dog("Rat Terrier", "Mark", "Bongo");

        // the dog can't access the function in the child class (Dog)
//        myPolymorphicDog.doFetch();

        Student myStudent = new Student("Michael", 20, "NC", 2021);
        System.out.println(myStudent);
        myStudent.enrolledStudent();
        System.out.println(myStudent);

        List<Student> studentList = new ArrayList<>();
        studentList.add(myStudent);
        studentList.add(new Student("Janice", 32, "NC", 2021));

        System.out.println("Here are the elements in my student list: ");
//        for (Student student : studentList) {
//            System.out.println(student);
//        }

        // this is recommended over a traditional for loop
        studentList.forEach((student) -> System.out.println(student));

        studentList.add(Student.addStudents("name", 45, 2021, false));

        Fish myFish = new Fish("catfish", "bloop");
        System.out.println(myFish);
    }

}

