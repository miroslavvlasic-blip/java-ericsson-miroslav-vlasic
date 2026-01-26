public class ArmstrongoviBrojevi {
    public static void main(String[] args) {
        System.out.println("Armstrongovi brojevi u rasponu od 1 do 9999 su:");
        for (int broj = 1; broj <= 9999; broj++) {
            if (Armstrongov(broj)) {
                System.out.println(broj);
            }
        }
    }
    public static boolean Armstrongov(int n) {
        int originalniBroj = n;
        int sumaKubova = 0;
        int temp = n;
        while (temp > 0) {
            int znamenka = temp % 10;
            sumaKubova += (znamenka * znamenka * znamenka);
            temp /= 10;
        }
        return sumaKubova == originalniBroj;
    }
}


