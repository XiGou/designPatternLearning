

public class MediaAdapter implements MediaPlayer{
    MediaPlayer m;
    public void play(String s){
        if(s=="vlc"){
            m=new vlcPlayer();
            m.play(s);

        }
        else{
            System.out.println("不支持");
        }
    }
}