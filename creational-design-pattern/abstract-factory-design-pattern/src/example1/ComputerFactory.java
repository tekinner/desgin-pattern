package example1;

public class ComputerFactory {

    public static Computer getComputer(ComputerAbstractFactory computerAbstractFactory) {
        return computerAbstractFactory.createComputer();
    }

    private ComputerFactory() {}
}
