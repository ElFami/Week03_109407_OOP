import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        String inputNama;
        int inputMenu;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Nama Anda: ");
        inputNama = scanner.nextLine();
        System.out.println("String anda : " + inputNama);

        System.out.println("1. charAt        2. length");
        System.out.println("3. substring(n)  4. substring(m,n)");
        System.out.println("5. contains      6. concat");
        System.out.println("7. replace       8. split");
        System.out.println("9. toLowerCase   10. toUpperCase");

        System.out.print("Pilih Menu : ");
        inputMenu = scanner.nextInt();

        switch (inputMenu) {
            case 1:
                System.out.println("------CharAt------");
                System.out.println("Nama : " + inputNama);
                System.out.print("Input: ");
                int inputIndex = scanner.nextInt();
                if (inputIndex >= 0 && inputIndex < inputNama.length()) {
                    System.out.println("Hasil charAt: " + inputNama.charAt(inputIndex));
                } else {
                    System.out.println("Index di luar jangkauan!");
                }
                break;

            case 2:
                System.out.println("------Length------");
                System.out.println("Nama : " + inputNama);
                System.out.println("Input: " + inputNama.length());
                break;
            case 3:
                System.out.println("------Substring(n)------");
                System.out.println("Nama : " + inputNama);
                System.out.print("Input: ");
                int n = scanner.nextInt();
                if (n >= 0 && n < inputNama.length()) {
                    System.out.println("Hasil substring: " + inputNama.substring(n));
                } else {
                    System.out.println("Index di luar jangkauan!");
                }
                break;
            case 4: // substring(m, n)
                System.out.println("------Substring(m,n)------");
                System.out.println("Nama : " + inputNama);
                System.out.print("Input Mulai: ");
                int m = scanner.nextInt();
                System.out.print("Input Akhir: ");
                int n2 = scanner.nextInt();
                if (m >= 0 && n2 <= inputNama.length() && m < n2) {
                    System.out.println("Hasil: " + inputNama.substring(m, n2));
                } else {
                    System.out.println("Index tidak valid!");
                }
                break;
            case 5: // contains
                System.out.println("------contains------");
                System.out.println("Nama : " + inputNama);
                System.out.print("Input : ");scanner.nextLine();
                String kata = scanner.nextLine();

                if (inputNama.contains(kata)) {
                    System.out.println("True");
                } else {
                    System.out.println("False");
                }
                break;
            case 6: // concat
                System.out.println("------concat------");
                System.out.println("Nama : " + inputNama);
                System.out.print("Input : ");scanner.nextLine();
                String tambahan = scanner.nextLine();
                System.out.println("Hasil: " + inputNama.concat(tambahan));
                break;
            case 7: // replace
                System.out.println("------replace------");
                System.out.println("Nama : " + inputNama);
                System.out.print("Input : ");scanner.nextLine();
                System.out.print("Masukkan karakter/kata yang ingin diganti: ");
                String target = scanner.nextLine();
                System.out.print("Masukkan pengganti: ");
                String ganti = scanner.nextLine();
                System.out.println("Hasil replace: " + inputNama.replace(target, ganti));
                break;
            case 8: // split
                System.out.println("------contains------");
                System.out.println("Nama : " + inputNama);
                System.out.print("Input : ");scanner.nextLine();
                String delimiter = scanner.nextLine();
                String[] hasilSplit = inputNama.split(delimiter);
                System.out.println("Hasil :");
                for (String s : hasilSplit) {
                    System.out.println(s);
                }
                break;
            case 9: // toLowerCase
                System.out.println("------toLowerCase------");
                System.out.println("Nama : " + inputNama);
                System.out.println("Hasil : " + inputNama.toLowerCase());
                break;

            case 10: // toUpperCase
                System.out.println("------toUpperCase------");
                System.out.println("Nama : " + inputNama);
                System.out.println("Hasil : " + inputNama.toUpperCase());
                break;
            default:
                System.out.println("Invalid Menu Option.");
        }

        scanner.close();
    }
}
