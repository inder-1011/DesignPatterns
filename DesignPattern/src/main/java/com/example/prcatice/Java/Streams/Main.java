package com.example.prcatice.Java.Streams;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student(1, "Rohit", "Mall", 30, "Male", "Mechanical Engineering", 2015, "Mumbai", 122),
                new Student(2, "Pulkit", "Singh", 56, "Male", "Computer Engineering", 2018, "Delhi", 67),
                new Student(3, "Ankit", "Patil", 25, "Female", "Mechanical Engineering", 2019, "Kerala", 164),
                new Student(4, "Satish Ray", "Malaghan", 30, "Male", "Mechanical Engineering", 2014, "Kerala", 26),
                new Student(5, "Roshan", "Mukd", 23, "Male", "Biotech Engineering", 2022, "Mumbai", 12),
                new Student(6, "Chetan", "Star", 24, "Male", "Mechanical Engineering", 2023, "Karnataka", 90),
                new Student(7, "Arun", "Vittal", 26, "Male", "Electronics Engineering", 2014, "Karnataka", 324),
                new Student(8, "Nam", "Dev", 31, "Male", "Computer Engineering", 2014, "Karnataka", 433),
                new Student(9, "Sonu", "Shankar", 27, "Female", "Computer Engineering", 2018, "Karnataka", 7),
                new Student(10, "Shubham", "Pandey", 26, "Male", "Instrumentation Engineering", 2017, "Mumbai", 98));

        /*
         * Find list of students whose first name starts with alphabet A
         * */


        List<Student> studentList= list.stream().filter(n->n.getFirstName().startsWith("A")).collect(Collectors.toList());
        System.out.print("List of students whose name starts with letter A : "+studentList);

        /*
         * Group The Student By Department Names
         * */
        Map<String,List<Student>> studentMap=list.stream().collect(Collectors.groupingBy(Student::getDepartmantName));
        /*
        Find the total count of student using stream
        * */
        long count = list.stream().count();

        /*
        * Find the max age of student
        * */
        OptionalInt opInt =list.stream().mapToInt(Student::getAge).max();

        /*
        * Find all departments names
        * */

        List<String> names=list.stream().map(n->n.getDepartmantName()).distinct().collect(Collectors.toList());

        /*
        * Find the count of student in each department
        * */

        Map<String,Long> map= list.stream().collect(Collectors.groupingBy(Student::getDepartmantName,Collectors.counting()));

        /*
        * Find the list of students whose rank is in between 50 and 100
        * */
        List<Student> students= list.stream().filter(n->n.getRank()>50 && n.getRank()<100).collect(Collectors.toList());

        /*
        * Find the average age of male and female students
        * */

        Map<String,Double> averageAge = list.stream().collect(Collectors.groupingBy(Student::getGender,Collectors.averagingInt(Student::getAge)));

        /*
        * Find the department who is having maximum number of students
        * */
        Map.Entry<String, Long> entry=list.stream().collect(Collectors.groupingBy(Student::getDepartmantName,Collectors.counting())).entrySet().stream().max(Map.Entry.comparingByValue()).get();


        /*
        * Find the Students who stays in Delhi and sort them by their names
        * */

        List<Student> studentNames= list.stream().filter(n->n.getCity().contains("Delhi")).sorted(Comparator.comparing(Student::getFirstName)).collect(Collectors.toList());


        /*
        * Find the average rank in all departments
        * */

        Map<String,Double> mapResult = list.stream().collect(Collectors.groupingBy(Student::getDepartmantName,Collectors.averagingInt(Student::getRank)));

        /*
        * Find the highest rank in each department
        * */

        list.stream().collect(Collectors.groupingBy(Student::getDepartmantName,Collectors.minBy(Comparator.comparing(Student::getRank))));

        /*
        * Find the list of students and sort them by their rank
        * */
        List<Student> orderdered=list.stream().sorted(Comparator.comparing(Student::getRank)).collect(Collectors.toList());




    }




}
