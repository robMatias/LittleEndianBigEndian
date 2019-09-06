/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author smatiaso
 */
public class littleEndianBigEndian {
    private byte[] shortToByteArray(short valor, boolean bigEndian)
    {
        byte[] resultado;
        byte b1 = (byte) ( (valor >> 24) & 0xFF );
        byte b0 = (byte) (valor & 0xFF);
        if (bigEndian) {
            resultado = new byte[] {b1 , b0};
        }else
        {
            resultado = new byte[] {b0, b1 };
        }
        
        return resultado;
    }
    
    private byte[] intToByteArray(int valor, boolean bigEndian)
    {
        byte[] resultado;
        byte b3 = (byte) ((valor >> 24) & 0xFF);
        byte b2 = (byte) ((valor >> 16) & 0xFF);
        byte b1 = (byte) ((valor >> 8) & 0xFF);
        byte b0 = (byte) (valor & 0xFF);
        
        if (bigEndian) {
            resultado = new byte[] {b3, b2,b1,b0};
        } else
        {
            resultado = new byte[] {b0, b1, b2, b3};
        }
        return resultado;s
        
    }
    
}
