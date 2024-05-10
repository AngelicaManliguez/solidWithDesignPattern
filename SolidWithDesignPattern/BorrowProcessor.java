package SolidWithDesignPattern;

public class BorrowProcessor {
    private Library library;
    private Student student;

    public BorrowProcessor(Library library, Student student) {
        this.library = library;
        this.student = student;
    }

    public void borrowResource(Resource resource) {
        library.borrowResource(resource);
    }

    public String getName(){
        return student.getName();
    }
}
