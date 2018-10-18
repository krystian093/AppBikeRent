package exceptions;

public class BikeNotFoundException extends RuntimeException {
    public BikeNotFoundException(Long id) { super("Bike Not Found " + id); }
}
