package semesterPrøve2014.application.model;

public class WrongDateException extends RuntimeException {

    public WrongDateException(String fejltekst){
        super(fejltekst);
    }

}
