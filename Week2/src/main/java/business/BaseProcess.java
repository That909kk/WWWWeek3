package business;

import models.Student;

import java.util.ArrayList;
import java.util.List;

public class BaseProcess {
        public  final List<Student> students = new ArrayList<>();

        public List<Student> getStudents() {
            students.add(new Student(1, "John Doe", "1223", "12323"));
            students.add(new Student(2, "John Doe", "1223", "12323"));
            students.add(new Student(3, "John Doe", "1223", "12323"));
            students.add(new Student(4, "John Doe", "1223", "12323"));
            return students;
        }
}
