public class Main {
    public static void main(String[] args) {

        int j = 1;
        boolean isReady = false;

        do {

            if (j > 5) {
                break;
            }
            System.out.println(j);
            j++;
            isReady = (j > 0);
        } while (isReady);

        // another program
        int number = 0;
        while (number < 50) {
            number += 5;
            if (number % 25 == 0) {
                continue;
            }
            System.out.println(number + " ");
        }
    }
}
