/* 
* @author
 * NAMA        : Irgi Dwiputra
 * KELAS       : IF-2
 * NIM         : 10119059
 * Deskripsi   : Program ini berisi menampilkan akatsuki
 */
package pboif2.pkg10119059.latihan60.akatsuki;
/**
 *
 * @author Corazon
 */
public class Akatsuki {
    protected String nama;
    protected String jutsu;
    protected String partner;
    
    public Akatsuki(String nama, String jutsu, String partner){
        this.nama = nama;
        this.jutsu = jutsu;
        this.partner = partner;
    }
    
    public void tampil(){
        System.out.println("Nama\t\t : " +nama);
        System.out.println("Nama\t\t : " +jutsu);
        System.out.println("Partner\t\t : " +partner);
    }
}
