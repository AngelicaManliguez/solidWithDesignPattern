package SolidWithDesignPattern;

public class NEULibrary implements Library {
    @Override
    public void borrowResource(Resource resource) {
        resource.borrow();
    }
}
