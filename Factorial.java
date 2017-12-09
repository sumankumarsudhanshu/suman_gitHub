package arrays;

public class Factorial {

    private void factorial() {
        int i = 1;
        for (int j = 2; j <= 4; j++) {
            i = j * i;
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Factorial f = new Factorial();
        f.factorial();
    }
}
