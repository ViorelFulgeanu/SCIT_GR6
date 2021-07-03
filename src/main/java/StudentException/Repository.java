package StudentException;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Repository {

    List<Student> students;

    public Repository() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) throws Exception {

        Student newStudent = new Student();

        if (student.getDateOfBirth() < 1900 || student.getDateOfBirth() < 0) {

            throw new Exception("wrong age value");
        }

        if (student.getFirstName().isEmpty()) {
            throw new Exception("first name is empty");
        }

        if (student.getLastName().isEmpty()) {
            throw new Exception("last name is empty");
        }

        if (student.getGender().isEmpty()) {
            throw new Exception("gender field is empty");
        }

        if (student.getId().isEmpty()) {
            throw new Exception("id is null!");
        }

        students.add(student);

        System.out.println("Student added");

    }

    public void getStudentsByAge(Integer age) {

        for (Student student : students) {
            if (LocalDate.now().getYear() - student.getDateOfBirth() == age) {
                System.out.println(student.toString());
            }
        }
    }

    public void deleteStudent(String id) throws Exception {

        Student studentToDelete = null;

        if (students != null) {
            for (Student student : students) {
                if (student.getId() == (id)) {
                    studentToDelete = student;
                }
            }
        }

        try {
            if (students.remove(studentToDelete) == false){
                throw  new Exception();
            }
        } catch (Exception e) {
            throw new Exception("student with id " + id + " not found");
        }
    }
}
