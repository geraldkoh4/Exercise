public class keyExercise3_8 {

    public static void printTotalScore(String[] values){
        // TODO: add your code here
        int Score = 0;
        for (String value : values) {
            int i = Integer.parseInt(value);
            Score += i;
        }
        System.out.println(Score);
}
    public static void main(String[] args) {
        printTotalScore(new String[]{});
        printTotalScore(new String[]{"0", "124", "-15"});
    }
}