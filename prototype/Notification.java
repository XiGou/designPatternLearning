class Footer{
    public String text = "footer";
}
public class Notification implements Cloneable{
    private String title;
    private String context;
    private Footer footer =new Footer();
    public Notification clone(){
            Object clone = null;
            try {
                clone = super.clone();
            } catch (CloneNotSupportedException e) {
                //TODO: handle exception
                e.printStackTrace();
            }
            return (Notification)clone;
    }
    public void showMsg(){
        System.out.println("Notification");
    }
}
