public class PreludeString {
    public static void main(String[] args) {
        String pbo1 = "Pemograman Berorientasi Objek";
        String pbo2 = new String ("Pemograman Berorientasi Objek");

        pbo1.length();
        pbo1.charAt(12);
        pbo1.substring(24);
        pbo1.substring(12,24);

        String kode = "IF402 - ";
        String out = kode.concat(pbo1);

    }
}
