public class FactoryProducer{
    public static abstractFactory  getFactory(String s){
        if(s == "外套"){
            return new coatFactory();
        }
        else if(s == "裤子"){
            return new kuziFactory();
        }
        return null;

    }

}