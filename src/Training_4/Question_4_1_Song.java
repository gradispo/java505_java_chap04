package Training_4;

/* 문제 1) */

public class Question_4_1_Song {
    private String title;

    public Question_4_1_Song(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public static void main(String[] args) {
        Question_4_1_Song mySong = new Question_4_1_Song("Nessun Dorma");
        Question_4_1_Song yourSong = new Question_4_1_Song("공주는 잠 못 이루고");
        System.out.println("내 노래는 " + mySong.getTitle());
        System.out.println("너 노래는 " + yourSong.getTitle());
    }
}
