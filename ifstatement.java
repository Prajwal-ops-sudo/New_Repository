public class ifstatement {
    public static void main(String[] args) {
        int high_score=calculateScore(true,10000,8,200);
        System.out.println("The high_score is:"+high_score);



        int yo=calculateScore(true,800,8,2000);
        System.out.println(yo);
    }

    public static int calculateScore(boolean gameover, int score, int levelcompleted, int bonus){
        int finalscore=score;
        if(gameover){
            finalscore+=(levelcompleted*bonus);
        }
        return finalscore;
    }
}
