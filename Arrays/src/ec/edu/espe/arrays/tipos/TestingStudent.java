/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arrays.tipos;

import ec.edu.espe.arrays.modelo.Student;

/**
 *
 * @author BJ
 */
public class TestingStudent {
    public static void main(String[] args) {
        Student[] students;
        students=new Student[10];
        for (int i=0;i<students.length;i++){
            students[i]=new Student();
            students[i].setId(i+1);
            students[i].setCollege("ESPE");
            if (i%2==0){
                students[i].setGender("Men");
            }else{
                students[i].setGender("Women");
            }
        }
        for (Student student : students) {
            System.out.print("Student: " + student.getId() + " College: " + student.getCollege() + " Gender: " + student.getGender() + " ");
            System.out.println();
        }
    }
    
}
