public class PasswordProtector {

    private int safeNumber;

    public void register(int code, PasswordClient client){
        this.safeNumber = code;
    }

    public void check(PasswordClient client){
        client.alarm();
    }

}
