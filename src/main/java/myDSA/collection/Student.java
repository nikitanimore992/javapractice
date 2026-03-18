/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myDSA.collection;

/**
 *
 * @author pramo
 */
public class Student implements Comparable<Student>{ // ye comparable he iske andar ek unimplemented method hota he 
    // apke pass kabhi ise stuation aa sakti he ki like apko esa set banana ho jo primitive type ka na ho 
    // ek custom class ka apko set bana he 
    // wo natually ap nahi bana sakte 
    
    String name;
    int Rollno;
    
    public Student(String name, int Rollno){
        this.name=name;
        this.Rollno=Rollno;
    }
    // iwant to create object of this class 

    @Override // ye string method override ho raha he and ye object class se aa raha he
    public String toString() {
        return "Student{" + "name=" + name + ", Rollno=" + Rollno + '}';
    }
    // iske out put me ap dekhenge ki abhi hashset diffrenciate nahi nahi kar pa raha he same name or roll no ke student honge unhe bhi ye add kar de raha he 
    // ham chahte he ki agar same  roll no ke student honege to unhe hashset add  na  kare 
    // iske liye hame hashcode and equal method implement method implement karna padega 
    // object class me hi hamare hashcode and equal method hote he jo sari class and method implement kar sakte he 

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + this.Rollno;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        return this.Rollno == other.Rollno;
    }

    @Override
    public int compareTo(Student that) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//         return 0;
        return this.Rollno - that.Rollno; /// yaha ham ise roll wise sort kar rahe he 
    }
    
    
 
    
}
