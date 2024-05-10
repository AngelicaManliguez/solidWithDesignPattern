package SolidWithDesignPattern;

public class NEULibrary implements Library {
    @Override
    public void borrowResource(Resources resources) {
        resources.borrow();
    }
}
