public class Main{
    public static void main(String[] argus) {

        int[] arrays = new int[10000];
        Main main = new Main();
        for (int i = 1; i < 10000; i++) {
            if (arrays[i] == 0) {
                int comp = i;
                while (true) {
                    comp += main.recall(comp);
                    if (comp < 10000) {
                        arrays[comp] = 1;
                    } else break;
                }
            }
        }
        for (int i = 1; i < 10000; i++) {
            if (arrays[i] == 0) {
                System.out.println(i);
            }
        }

    }

    // 그냥 각 자리수만 더하는 메소드
    private int recall(int input) {
        int sum = 0;
        while (input > 0) {
            sum += input % 10;
            input /= 10;
        }
        return sum;
    }
}
