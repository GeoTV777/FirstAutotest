package exeption;

public class BrowserNotSapportedExeption extends RuntimeException {
    public BrowserNotSapportedExeption(String browserName) {
        super(String.format("Browser %s not supported", browserName));
    }
}
