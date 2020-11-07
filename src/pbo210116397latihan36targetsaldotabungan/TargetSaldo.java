/*
NAMA   : MUHAMMAD AZRAQI SAPUTRA
KELAS  : PBO2
NIM    : 10116397
Deskripsi Program : Target Saldo Tabungan
 */
package pbo210116397latihan36targetsaldotabungan;

/**
 *
 * @author Zetro
 */
class TargetSaldo {

         public void hitungTargetSaldo(int saldoTab, double bungaBul, double saldoBul){
      int i;
      for(i = 1; saldoTab <=6000000; i++) {
           saldoBul = bungaBul * saldoTab;
            saldoTab = (int) (saldoTab + saldoBul);
            System.out.println("Saldo di bulan ke-" + i + " Rp. "
                    + saldoTab);
      }
    }
    }
    

