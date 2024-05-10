package SolidWithDesignPattern;

public class Student implements BorrowResource {
    private String name;
    private Library library;

    public Student(String name, Library library) {
        this.name = name;
        this.library = library;
    }

    public String getName() {
        return name;
    }

    @Override
    public void borrowResource(Resource resource) {
        library.borrowResource(resource);
    }

}
