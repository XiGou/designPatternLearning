public class coatFactory extends abstractFactory{
    public coat getCoat(String s){
        if(s == "西装"){
            return new jack();
        }
        else if(s == "夹克"){
            return new xizhuang();
        }
        return null;

    }
    public kuzi getKuzi(String s){
        return null;

    }



}