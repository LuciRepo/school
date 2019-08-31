package com.fastrackit;

public class App {
    public static void main(String[] args) {
        Person.retireAge = 65;
        Student student= new Student();
        student.setStudentName("jOHN");
        Teacher teacher=new Teacher(TeacherType.RETIRED);
        System.out.println(teacher.type);
       // System.out.println(student.getName());
        //student.setName();
        Person person=new Person("Joe");

        Person person1=new Person("Person1");
        Person secondPerson=new Person("Person2",45);
        System.out.println("First person age :"+ person.getAge());
        System.out.println("Second person age: "+ secondPerson.getAge());
        /*System.out.println(Person.retireAge);
        //Person.EARTH_GRAVITY=0.07;
        System.out.println(Person.getEarthGravity());
        Person person = new Person();
        person.setName("John");
        System.out.println(person.getName());
        Person secondPerson = new Person();
        secondPerson.setName("Mike");
        System.out.println(secondPerson.getName());*/
      //  Person person3 = new Person;
    }
}
