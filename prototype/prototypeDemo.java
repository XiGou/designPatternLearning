
public class prototypeDemo{
    public static void main(String[] args) {
        NotiSender sender = new NotiSender();
        sender.loadCache();
        Notification noti = sender.getNotibyProto();
        noti.showMsg();
        Notification noti1 = sender.getNotibyProto();
        noti1.showMsg();
        Notification noti2 = sender.getNotibyProto();
        noti2.showMsg();
    }
}