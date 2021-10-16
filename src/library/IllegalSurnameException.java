package library;

public class IllegalSurnameException extends IllegalArgumentException {

    public IllegalSurnameException() {
    }

    public IllegalSurnameException(String s) {
        super("Niepoprawna wartość w nazwisku: " + s);
    }


    //nobooksexception - wyjatek typu checked rzucany przy pytaniu o istnienie jakiś ksiazek
}
