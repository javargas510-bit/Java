import java.util.Set;
import java.util.HashMap;
public class HashMapFun {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Can’t take my eyes off of you", "I love you baby and if it’s quite alright I need you baby");
        trackList.put("Tennessee Whiskey", "You're as smooth as Tennessee whiskey");
        trackList.put("A little bit Alexis", "I'm a Lamborghini, I'm a Hollywood star");
        // get the keys by using the keySet method
        Set<String> Lyrics = trackList.keySet();
        for(String Track : Lyrics) {
            System.out.println(Track);
            System.out.println(trackList.get(Track));    
        }
    }
}
