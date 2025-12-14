package Β;

public class ProtectedDoor implements Door, PasswordClient{

    private boolean locked;
    private PasswordProtector protector;

    @Override
    public void lock() {
        locked = true;
    }

    @Override
    public void unlock() {}

    @Override
    public void alarm() {
        System.out.println("ALARM: Someone is trying to enter without code!!");
    }

    @Override
    public void setProtector(PasswordProtector protector) {
        this.protector = protector;
    }

    @Override
    public PasswordProtector getProtector() {
        return protector;
    }

}