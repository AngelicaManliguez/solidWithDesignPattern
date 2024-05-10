package SolidWithDesignPattern;

public class TestProgram {
    public static void main(String[] args)
    {
        Library library = new NEULibrary();
        Student student = new Student("Angelica Mae Manliguez", library);

        System.out.println("                  NEU Library");
        System.out.println("--------------------RECEIPT--------------------");
        System.out.println("Student Name: " + student.getName());

        student.borrowResource(new Book("Fundamentals of Programming"));

        student.borrowResource(new Journal("Object-Oriented Programming"));
    }
}
