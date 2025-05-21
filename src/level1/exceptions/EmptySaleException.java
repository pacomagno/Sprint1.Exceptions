package level1.exceptions;

public class EmptySaleException extends Exception {

    public EmptySaleException() {

        super("EMPTY SALE EXCEPTION!!!, add product to the list first.");
    }
}
