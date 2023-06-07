import java.util.HashMap;

public class Hashmatique {

    public static void main(String[] args){
        HashMap<String, String> userMap = new HashMap<String, String>();

        userMap.put("Bones", "My patience is waning is this entertaining? Our patience is waning is this entertaining?");
        userMap.put("True Faith", "I used to think that the day would never come. I'd see delight in the shade of the morning sun. My morning sun is the drug that brings me near...");
        userMap.put("Hysteria", "It's bugging me grating me and twisting me around yeah, I'm endlessly caving in and turning inside out");
        userMap.put("Virginia Moon", "Dearest constellation, heaven surroundin' you stay there, soft and blue Virginia moon, I'll wait for you tonight sweetest invitation, breaking the day in two feelin' like I do");
        System.out.println(userMap.get("Bones"));

        for(String key : userMap.keySet()) {
            System.out.println("Track: " + key);
            System.out.println("Lyrics: " + userMap.get(key));
        }
    }
}
