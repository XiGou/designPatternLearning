

public class AudioPlayer implements MediaPlayer{
    MediaPlayer m;
    public void play(String s){
        if(s=="mp3"){
            System.out.println("mp3 is playing ");
        }
        else{
            m=new MediaAdapter();
            m.play(s);
        }
    }

}