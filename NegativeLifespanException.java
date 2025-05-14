public class NegativeLifespanException extends Exception{
    public NegativeLifespanException(String fname, String lname) {
        super(String.format("Person %s %s has invalid birth/death date (age cannot be negative)",fname, lname));
    }
}