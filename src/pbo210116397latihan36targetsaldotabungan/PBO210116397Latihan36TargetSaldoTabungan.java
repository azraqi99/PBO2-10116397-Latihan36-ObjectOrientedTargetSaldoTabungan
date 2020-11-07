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
public class PBO210116397Latihan36TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int saldoTab = 3500000;
        double bungaBul = 0.08;
        double saldoBul = 6000000;

        TargetSaldo tar = new TargetSaldo();
        tar.hitungTargetSaldo(saldoTab, bungaBul, saldoBul);
    }
    }
    

