public class ProtectedDoor implements Door{

    @Override
    public void lock() {}

    @Override
    public void unlock() {}

    public void register(PasswordProtector protector, int Code){
        DoorPasswordAdapter client = new DoorPasswordAdapter(this);
        protector.register(Code, client);
    }

    public void alarm(){
        System.out.println("Alarm!");
    }
}
