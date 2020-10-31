package perkenalan_mahasiswa_oop;

/**
 * @author
 * NAMA     : Muhammad Anggawan Ridho Islami
 * KELAS    : IF 10K
 * NIM      : 10119909
 */
class Mahasiswa {
    public String nim, nama;

    public void pekenalkanDiri() {
        System.out.println("Hello Everyone");
        System.out.println("My NIM is "+nim);
        System.out.printf("My Name is %s%n%n",nama);
    }
}
