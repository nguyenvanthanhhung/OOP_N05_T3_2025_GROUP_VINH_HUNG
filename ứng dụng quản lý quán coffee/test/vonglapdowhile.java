public class BreakAndContinue {
    public static void main(String[] args) {
        int i = 0;
        do {
            if (i == 74) break;
            if (i % 9 != 0) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        } while (i < 100);
    }
}
