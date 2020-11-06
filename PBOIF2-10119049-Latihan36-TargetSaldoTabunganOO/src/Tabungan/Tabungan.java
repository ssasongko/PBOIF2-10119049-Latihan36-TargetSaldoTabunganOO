/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tabungan;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;


/**
 *
 * @author Nur Sasongko
 */
public class Tabungan {
    public double saldoAwal;
    public double bunga;
    public double targetSaldo;
    
    public void setData(){
        saldoAwal = 3500000;
        bunga = 8;
        targetSaldo = 6000000;
    }
    
    public double tampilSaldo(){
        setData(); // call set data to 
        
        double saldoSemt = saldoAwal; //set saldoSemt to calculate total saldo
        
        DecimalFormat kursID = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        
        formatRp.setCurrencySymbol(" Rp. ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        kursID.setDecimalFormatSymbols(formatRp);
        
        int i = 1;
        while(saldoSemt < targetSaldo){
                saldoSemt =  saldoSemt + (saldoSemt *bunga/100);
                System.out.printf("Saldo di bulan ke-%d %s\n", i, kursID.format(saldoSemt));
            i++;
        }
        
        return 0;
    }
}
