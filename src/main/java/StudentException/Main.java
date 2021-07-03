package StudentException;


public class Main {

    public static void main(String[] args) throws Exception {

        Repository repository = new Repository();

        Student student1 = new Student();
        student1.setFirstName("Viorel");
        student1.setLastName("Fulgeanu");
        student1.setGender("M");
        student1.setDateOfBirth(1990);
        student1.setId("17263818366");

        Student student2 = new Student();
        student2.setFirstName("Gabriel");
        student2.setLastName("Fulgeanu");
        student2.setGender("M");
        student2.setDateOfBirth(1993);
        student2.setId("172638182");

        Student student3 = new Student();
        student3.setFirstName("Maria");
        student3.setLastName("Fulgeanu");
        student3.setGender("M");
        student3.setDateOfBirth(2000);
        student3.setId("172638181");


        repository.addStudent(student1);
        repository.addStudent(student2);
        repository.addStudent(student3);

        repository.deleteStudent("17263818366");

        repository.getStudentsByAge(31);
        repository.getStudentsByAge(21);


    }
}
