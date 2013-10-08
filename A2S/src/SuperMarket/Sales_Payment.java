/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SuperMarket;

import javax.swing.JOptionPane;

/**
 *
 * @author Vino
 */
public class Sales_Payment {
    
     SalesUI saleui;
     
    public boolean layaltyCardValidation(String id){
        boolean result=true;
        
        if(id.length()!=7){
              JOptionPane.showMessageDialog(null,"Invalid loyalty card id.","Error",JOptionPane.ERROR_MESSAGE);
              result=false;
        }
        else{
            try{
                int lid=Integer.parseInt(id);
            }
            catch(NegativeArraySizeException e){
                JOptionPane.showMessageDialog(null,"Invalid loyalty card id.","Error",JOptionPane.ERROR_MESSAGE);
                result=false;
            }
        }
        return result;
    }
    
    public boolean amountValidation(String amnt){
        boolean result =true;
        boolean convert=true;
        double amount=0;
        double total=saleui.getTotal();
        try{
             amount=Double.parseDouble(amnt);
            
        }
        catch(NumberFormatException e){
            convert=false;
    }
        if(!convert){
             JOptionPane.showMessageDialog(null,"Invalid amount.","Error",JOptionPane.ERROR_MESSAGE);
             result = false;
        }
        else if(total>=amount){
            JOptionPane.showMessageDialog(null,"Not enough amount.","Error",JOptionPane.ERROR_MESSAGE);
             result = false;
            
        }
        return result;
    }
}
