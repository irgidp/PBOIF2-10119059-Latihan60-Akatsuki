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
public class Cincin extends Desa{
    private String posCincin;
    private String warnaCincin;
    
    public Cincin(String desa, String nama, String jutsu, String partner, String posCincin, String warnaCincin) {
        super(desa, nama, jutsu, partner);
        this.posCincin = posCincin;
        this.warnaCincin = warnaCincin;
    }
    
    public String getPosCincin() {
        return posCincin;
    }

    public String getWarnaCincin() {
        return warnaCincin;
    }
    
    @Override
    public void tampil() {
        super.tampil(); 
        System.out.println("Posisi Cincin\t : Jari " + posCincin);
        System.out.println("Warna Cincin\t : " + warnaCincin);
        System.out.println("===================================");
    }
    
    
}
