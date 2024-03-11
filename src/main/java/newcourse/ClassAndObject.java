package newcourse;

public class ClassAndObject {

    public void listeningMusic() {
        System.out.println("Listening music...");
    }

    public String getPlayingMusic(int musicName) {

        if (musicName <= 5) {
            return "Listening Tere name";
        } else {
            return "Listening Other song";
        }
    }

    public static void main(String[] args) {

        ClassAndObject obj = new ClassAndObject();
        obj.listeningMusic();
        String str = obj.getPlayingMusic(5);
        System.out.println(str);
    }
}
