import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;
class TrackList {
    public static void main(String[] args) 
    {
        HashMap<String, String> songMap = new HashMap<>();
        songMap.put("Game Of War", "Cold world, isolating " +
        "Cold soul, what happened to that fire inside? " +
        "Structure, ever fading " +
        "Old bones can't take the weight though I still try"
        );
        songMap.put("The Lie", "The human race, what did we create? " +
        "We left our mark, mere repercussions of choices made. " +
        "This is the end, multiply and spread. " +
        "What did you expect when you rape our lands and dig our graves?");
        songMap.put("Real", "Face down, I fall to the floor " + 
        "Can't say I've never been here before" +
        "So frustrating, debilitating" +
        "This emptiness there must be more");
        songMap.put("Away", "We always fall into the holes we dig " +
        "So ignorant to the depth of them " +
        "A place where we can finally get some rest " +
        "Until the rain starts pouring in");
        String repeatedStar = new String(new char[4]).replace('\0', '*');
        String track1 = songMap.get("Game Of War");
        System.out.println(track1);
        System.out.println("====================================================");
        /* Display content using Iterator*/
        Set set = songMap.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry)iterator.next();
            System.out.print("Track: "+ mentry.getKey() + " & Lyric is: ");
            System.out.println(mentry.getValue());
        }
        System.out.println("====================================================");
    }
}