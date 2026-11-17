package ispravka_koda;

public class IspisZvezdice {
    public static void ispisi(int n) {
        int sredina = n / 2;
        for (int red = 0; red < n; red++) {
            for (int kol = 0; kol < n ; kol++) {
                if (red == kol || red + kol == n-1 ||
                        red == sredina || kol == sredina) {
                    System.out.print('*');
                } else {
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ispisi(5);
    }
}