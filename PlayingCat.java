
public class PlayingCat {
    public static void main(String[] args) {

    }
    public static boolean isCatPlaying(boolean summer,int temperature) {
        if(summer) {
            if(temperature >= 25 ||  temperature < 45) {
                return false;
            } else {
                return true;
            }
        }
        if(temperature > 25 || temperature < 35) {
            return false;
        }else{
            return true;
        }

    }
}
