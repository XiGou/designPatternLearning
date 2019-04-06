public class kuziFactory extends abstractFactory{
    public coat getCoat(String s){
        return null;

    }
    public kuzi getKuzi(String s){
       
        if(s == "短裤"){
            return new duanku();
        }
        else if(s == "运动裤"){
            return new yundongku();
        }
        return null;

    }



}