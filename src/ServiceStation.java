public class ServiceStation {
    public void check(Servicable servicable) {
        servicable.service();
    }

    public void checkAll(Servicable[] servicables) {
        for (Servicable servicable : servicables) {
             servicable.service();
        }
    }

}
