package main;

import institution.University;
import person.Student;
import person.consciousness.Knowledge;

public class Application {
    public static void main(String[] args) {
        University university = new University("CH.U.I.");
        university.setStudent(new Student("Andrew Kostenko", new Knowledge(40)));
        university.setStudent(new Student("Julia Veselkina", new Knowledge(60)));
        university.setStudent(new Student("Maria Perechrest", new Knowledge(80)));
        university.setStudent(new Student("Maria Perechrest", new Knowledge(90)));
        university.setStudent(new Student("Maria Perechrest", new Knowledge(4)));

        Student olehMaslo = new Student("Oleh Maslo", new Knowledge(90));
        university.setStudent(olehMaslo);


        boolean omWasAdded = university.addStudentToInternship(olehMaslo);
        System.out.println("Was Oleh added? " + omWasAdded);

        System.out.println("Students on internship:");
        System.out.println(university.getInternship().getStudents());

//        System.out.println(university);
//        System.out.println("University average is :" + university.getStudentAverageScore());

//        Internship internship = new Internship("Interlink");
//        System.out.println("List of internship's students:");
//        System.out.println(internship.getStudents());
    }
}
