package inheritance;

import java.util.Scanner;

public class MainBR {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        BangunRuang bangunRuang = new BangunRuang();

        Kubus kubus = new Kubus();
        System.out.print("Masukan Sisi Kubus: ");
        kubus.sisi = input.nextInt();

        Bola bola = new Bola();
        System.out.print("Masukkan Jari Jari Bola: ");
        bola.r = input.nextInt();

        Balok balok = new Balok();
        System.out.print("Masukkan Panjang Balok: ");
        balok.panjang = input.nextInt();
        System.out.print("Masukkan Lebar Balok: ");
        balok.lebar = input.nextInt();
        System.out.print("Masukkan Tinggi Balok: ");
        balok.tinggi = input.nextInt();

        LimasSegitiga segitiga = new LimasSegitiga();
        System.out.print("Masukkan Alas Limas Segitiga: ");
        segitiga.a = input.nextInt();
        System.out.print("Masukkan Tinggi Segitiga: ");
        segitiga.ts = input.nextInt();
        System.out.print("Masukkan Tinggi Limas Segitiga: ");
        segitiga.tl = input.nextInt();
        System.out.print("Masukkan Luas Sisi Tegak Limas Segitiga: ");
        segitiga.lst = input.nextInt();

        bangunRuang.volume();
        bangunRuang.luaspermukaan();

        kubus.volume();
        kubus.luaspermukaan();

        bola.luaspermukaan();
        bola.luaspermukaan();

        balok.luaspermukaan();
        balok.luaspermukaan();

        segitiga.volume();
        segitiga.luaspermukaan();
    }
}
