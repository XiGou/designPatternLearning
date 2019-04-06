public class docOutputerBuilder{
    
    

    public static void main(String[] args){
        docOutputer dd =new docOutputer();
        dd.docList[0] = new docXml();
        dd.docList[1] = new docJson();
        for (int i = 0; i < 2; i++) {
            dd.docList[i].name("a");
            dd.docList[i].age(8);
        }
    }

}