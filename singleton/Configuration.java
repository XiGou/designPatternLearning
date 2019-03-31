public class Configuration{
    private static Configuration C;
    
    // make the constructor private
    private  Configuration(){};

    // get the only instance 
    public static Configuration getConfiguration(){
        
        if(C == null){
            createInstance();
            System.out.println("obj created");
        }
        return C;
    }

    private static void createInstance(){
        C = new Configuration();
    }
    public void showMsg(){
        System.out.println("ARE YOU OK");
    }

}