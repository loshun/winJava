package com.tts;

import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        String[] fruitArray = {"orange", "apple", "dragonfruit"};
        int[] intArray;
        boolean[] boolArray;

        System.out.println("==== Arrays ====");

        System.out.println("Element at index 1: " + fruitArray[1]);
        System.out.println("Length of fruitArray: " + fruitArray.length);

        System.out.println("==== Collections ====");

        List <String> stringList= new ArrayList <>();
        List <String> stringLinkedList= new LinkedList<>();
        List <String> stringVector = new Vector<>();
        List <String> stringStack= new Stack<>();

        //Adding elements to an array
        stringList.add("dog");
        stringList.add("house");
        stringList.add("cell phone");
        stringList.add(1, "cat");

        System.out.println("The element at index 0: " + stringList.get(0));

        //Deleting an element from an array
        stringList.remove(0);
        System.out.println("This is the size of my list: " + stringList.size());

        //this is will remove all elements from list
//        stringList.clear();

        Collections.reverse(stringList);
        System.out.println("Here is my list reversed: " + stringList);

        System.out.println("==== String Conversion ====");

        // first set up a string
        String myString = "I really love icecream!";
        //then take string and split it at every whitespace
        //and turn it into a regular array
        String[] strArr = myString.split(" ");
        // setting up arrayList and making the value
        // that of teh strArr
        List <String> splitList = new ArrayList<>();
        splitList = Arrays.asList(strArr);
        // Can also be written as List <String> splitList = Arrays.asList(strArr);
        System.out.println(splitList);

        //Array List to Array String
        List <String> carList = Arrays.asList("BMW", "Honda", "Audi");
        Object[] carArr = carList.toArray();
        String carString = Arrays.toString(carArr);

        System.out.println(carString.replace("[","")
                .replace("]","")
                .replace(",", " "));

        System.out.println("==== Hash Maps ====");
        //Creates a HashMap with a String as key and Integer as the value it points to
        HashMap<String, Integer> personMap = new HashMap<>();
        personMap.put("Mary", 37);
        personMap.put("Bob", 21);
        personMap.put("Susan", 63);

        System.out.println(personMap);
        System.out.println("This is the value associated with Mary: " + personMap.get("Mary"));
        System.out.println(personMap.keySet());

        for (String i : personMap.keySet()) {
            System.out.println("key: " + i + "\tvalue: " + personMap.get(i));
        }

        personMap.remove("Bob");
        System.out.println("Is Bob in my map? " + personMap.containsKey("Bob"));

        System.out.println("==== Iterating ====");
        List <String> fruitList = Arrays.asList("plum", "grape", "fiji apple");

        // this is referred to as an enhanced for loop
        //enhanced for loop are strictly used for collections
        //String fruit represents any given element in our fruitList collection
        for (String fruit : fruitList){
            System.out.println("Here is one of my fruits: " + fruit);
        }

        //The two lines above can be written either of these two ways
        fruitList.forEach((fruit) -> System.out.println(fruit));
        fruitList.forEach(System.out::println);

        System.out.println("==== LinkedList ====");
        LinkedList<String> animalList = new LinkedList<String>();
        animalList.add("frog");
        animalList.add("giraffe");
        animalList.add("buffalo");
        animalList.add("mongoose");
        System.out.println(animalList);

        animalList.addFirst("shark");
        System.out.println(animalList);

        animalList.set(1, "emu");
        System.out.println(animalList);

        System.out.println("==== Queues ====");
        //First In, First Out
        Queue<Integer> myQueue = new LinkedList<>();
        for (int i=5; i<10; i++) {
            myQueue.add(i);
        }

        System.out.println("Elements of the queue: " + myQueue);

        int removedHead = myQueue.remove();
        System.out.println("Removed element of myQueue: " + removedHead);

        System.out.println(myQueue);

        ///To view the head of queue
        int head = myQueue.peek();
        System.out.println("head of queue-" + head);

        int size = myQueue.size();
        System.out.println("Size of queue-" + size);

        System.out.println("==== Stacks ====");
        //Last In, First Out
        Stack<Integer> myStack = new Stack<Integer>();

        //Add item to stack
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);

        System.out.println(myStack);

        //remove item from stack
        myStack.pop();
        System.out.println(myStack);

        //To look at the top of the stack without removing it
        int peek =  myStack.peek();
        System.out.println(peek);

        //We may want to know if a stack is empty before we manipulate it:
        boolean empty = myStack.empty();
        System.out.println(empty);



    }

    }

