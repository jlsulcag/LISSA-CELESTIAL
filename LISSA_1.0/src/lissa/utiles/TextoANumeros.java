/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lissa.utiles;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import lissa.gui.JIF_EmitirComprobante;

/**
 *
 * @author RMOISESL
 */
public class TextoANumeros {

    public BigDecimal DeCaracteresABigDecimal(String pSNumero) {

        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setGroupingSeparator(',');
        symbols.setDecimalSeparator('.');
        String pattern = "#,##0.0#";
        DecimalFormat decimalFormat = new DecimalFormat(pattern, symbols);
        decimalFormat.setParseBigDecimal(true);
        BigDecimal monto = null;

        try {
            monto = (BigDecimal) decimalFormat.parse(pSNumero);
        } catch (ParseException ex) {
            monto = BigDecimal.ZERO;
        }
        
        return monto;
    }

}
