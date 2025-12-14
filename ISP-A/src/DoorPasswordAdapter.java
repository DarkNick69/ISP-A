public class DoorPasswordAdapter implements PasswordClient {

    private ProtectedDoor door;

    public DoorPasswordAdapter(ProtectedDoor protectedDoor) {
        this.door = protectedDoor;
    }

    @Override
    public void alarm() {
        door.alarm();
    }
}
