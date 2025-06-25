public class BreakAndContinue {
    public static void main(string[] args){
        for(int i = 0; i<100;i++){
            if (i == 74) break;
            if (i % 9 != 0) continue;
            system.out.println(i);
        }
    }
}