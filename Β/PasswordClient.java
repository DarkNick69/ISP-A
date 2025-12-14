package Β;

public interface PasswordClient {
    public void alarm();
    public void setProtector(PasswordProtector protector);
    public PasswordProtector getProtector();
}