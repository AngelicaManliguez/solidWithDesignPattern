package SolidWithDesignPattern;

public class TestProgram {
    public static void main(String[] args)
    {
        Library library = new NEULibrary();
        Student student = new Student("Angelica Mae Manliguez");
        BorrowProcessor borrowProcessor = new BorrowProcessor(library, student);


        System.out.println("                  NEU Library");
        System.out.println("--------------------RECEIPT--------------------");
        System.out.println("Student Name: " + borrowProcessor.getName());

        borrowProcessor.borrowResource(new Book("Fundamentals of Programming"));

        borrowProcessor.borrowResource(new Journal("Object-Oriented Programming"));
    }
}
