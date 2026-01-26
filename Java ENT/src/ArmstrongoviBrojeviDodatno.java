public class ArmstrongoviBrojeviDodatno {
    public static void main(String[] args) {
        int limit = 20000;
        if (limit < 1) {
            System.out.println("Limit mora biti veći od nule.");
            return;
        }

        System.out.println("Armstrongovi brojevi između 1 i " + limit + " su:");

        for (int i = 1; i <= limit; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isArmstrong(int number) {

        int original = number;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += digit * digit * digit; // cube of each digit
            number /= 10;
        }

        return sum == original;
    }
}