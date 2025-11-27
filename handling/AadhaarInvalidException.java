package handling;

public class AadhaarInvalidException extends RuntimeException{
    public AadhaarInvalidException(){
        super("Invalid Aadhaar number");
    }
    public AadhaarInvalidException(String message){
        super(message);
    }
}
