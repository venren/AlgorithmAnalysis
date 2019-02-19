package Coderpad;

import java.util.*;
import java.util.stream.Collectors;

class Student{
    private String name;
    private Float averageMark = 0.0f;
    private int numberOfSubjects = 0;

    public Student(String name){
        this.name = name;
    }

    public void addMark(Float mark ){
        averageMark += mark;
        numberOfSubjects += 1;
        averageMark = averageMark/numberOfSubjects;
    }

    public Float getAverageMark(){
        return averageMark;
    }

    public String getName(){
        return name;
    }

    public Student(Float mark, String n){
        name = n;
        averageMark = mark;
        numberOfSubjects += 1;
    }

}

public class MaxScore {
    public static String s[][] = {{"jerry","80"},
            {"bob","90"},{"bob","85"},{"Eric","83"},{"Eric","75"}};


    public static void main(String args[]){
        Map<String,Student> studentMap = new HashMap<String,Student>();
        for(int i=0; i<s.length; i++){
            String nameOfStudent = s[i][0];
            float mark = Float.valueOf(s[i][1]);

            if(studentMap.containsKey(nameOfStudent)){
                studentMap.get(nameOfStudent).addMark(mark);
            }else{
                studentMap.put(nameOfStudent,new Student(mark,nameOfStudent));
            }
        }

        List<Student> studentList = studentMap.values().stream().collect(Collectors.toList());
        Collections.sort(studentList, Comparator.comparing(Student::getAverageMark).reversed());

        System.out.println(studentList.get(0).getName());


    }

}
