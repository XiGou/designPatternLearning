public class Demo{

public static void main(String[] args){
    abstractFactory waitaoFac = FactoryProducer.getFactory("外套");
    abstractFactory kuziFac = FactoryProducer.getFactory("裤子");

    coat c = waitaoFac.getCoat("西装");
    c = waitaoFac.getCoat("夹克");

    kuzi d = kuziFac.getKuzi("短裤");
    d = kuziFac.getKuzi("运动裤");
}





}