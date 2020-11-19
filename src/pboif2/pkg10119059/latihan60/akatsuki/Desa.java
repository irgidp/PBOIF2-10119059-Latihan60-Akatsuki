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
public class Desa extends Akatsuki{
    private String desa;
    
    public Desa(String desa, String nama, String jutsu, String partner) {
        super(nama, jutsu, partner);
        this.desa = desa;
    }
    
    public String getDesa(){
        return desa;
    }
    
    @Override
    public void tampil(){
        super.tampil();
        System.out.println("Asal Desa \t : " +desa);
    }
    
    
    
}
