
public class singletonDemo{
    public static void main(String[] args) {
        // Configuration obj = new Configuration();
        Configuration obj = Configuration.getConfiguration();
        obj.showMsg();
        Configuration obj2 = Configuration.getConfiguration();
        obj2.showMsg();
    }
}