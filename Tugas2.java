import java.util.*; //ini scannner atau input atau library

    //class PersegiPanjang
    class PersegiPanjang {
    private int panjang;
    private int lebar;

    //cetak nama, kelas, serta nim
    public void cetakNama() {
        System.out.println("Nama  : Nurul Najwa Sabilla");
        System.out.println("Kelas : TI.21.A.3");
        System.out.println("Nim   : 312110451\n");
    }
    //method Setter
    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }
    public void setLebar(int lebar) {
        this.lebar = lebar;
    }  

    //method Getter
    public int getLuas() {
        return this.panjang * this.lebar;
    }
    public int getPanjang(){
        return this.panjang;
    }
    public int  getLebar(){
        return this.lebar;
    }
}
    class Tugas2{
    public static void main(String[] args) {
        //Digunakan untuk mendapatkan input pengguna
        try (Scanner input = new Scanner(System.in)) {
        PersegiPanjang persegi = new PersegiPanjang();//objek
        persegi.cetakNama();
        System.out.print("Masukkan Nilai Panjang : ");
        int x = input.nextInt();
        System.out.print("Masukkan Nilai Lebar   : ");
        int y = input.nextInt();
        persegi.setPanjang(x);
        persegi.setLebar(y);
        System.out.println("Panjang : "+persegi.getPanjang());
        System.out.println("Lebar   : "+persegi.getLebar());
        System.out.printf("Nilai luas sebesar : %d", persegi.getLuas());
        } catch (Exception z) {
        System.out.println(z);
        }
    }
}
