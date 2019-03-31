
public class NotiSender{
    Notification protoNotification=null;
    public void loadCache(){
        protoNotification = new Notification();
    }
    public Notification getNotibyProto(){
        System.out.println("getNotibyProto");
        return protoNotification.clone();

    }
}