public class BreakAndContinue {
    public static void main(String[] args) {
        int i = 0;
        while (i < 100) {
            if (i == 74) break;
            if (i % 9 != 0) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
