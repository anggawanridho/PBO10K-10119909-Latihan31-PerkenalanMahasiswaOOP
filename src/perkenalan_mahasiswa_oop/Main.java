package perkenalan_mahasiswa_oop;

public class Main {

    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        Mahasiswa mhs2 = new Mahasiswa();
        Mahasiswa mhs3 = new Mahasiswa();
        Mahasiswa mhs4 = new Mahasiswa();
        mhs1.nim = "10110269";
        mhs1.nama = "Rizki Adam Kurniawan";
        mhs1.pekenalkanDiri();
        mhs2.nim = "10112270";
        mhs2.nama = "Indra Tiola";
        mhs2.pekenalkanDiri();
        mhs3.nim = "10110271";
        mhs3.nama = "Robi Tansil Ganefi";
        mhs3.pekenalkanDiri();
        mhs4.nim = "10110269";
        mhs4.nama = "Muhammad Nur Awaludin";
        mhs4.pekenalkanDiri();
    }
}
