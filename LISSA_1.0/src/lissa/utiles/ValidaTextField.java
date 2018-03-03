package lissa.utiles;
import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
* @author Hernán
*/
public class ValidaTextField extends PlainDocument{

  private JTextField miJTextField;
  private int nroMaxCaracteres, tipo;
  public ValidaTextField(JTextField mijtext, int nroMaxCaract, int tipoestr){
      miJTextField=mijtext;
      nroMaxCaracteres=nroMaxCaract;
      tipo=tipoestr;
  }
 public void insertString(int arg0, String arg1, AttributeSet arg2) throws BadLocationException
 {
     arg1=arg1.toUpperCase();
     switch (tipo){
         case 0:   if ((!Character.isLetter(arg1.charAt(arg1.length()-1)) && !Character.isSpaceChar(arg1.charAt(arg1.length()-1)))||(miJTextField.getText().length()+arg1.length())>nroMaxCaracteres)
                        return;
                   break;
         case 1:   if (!Character.isDigit(arg1.charAt(arg1.length()-1))||(miJTextField.getText().length()+arg1.length())>nroMaxCaracteres)
                        return;
                   break;
         case 2:  if ((miJTextField.getText().length()+arg1.length())>nroMaxCaracteres || Character.isSpaceChar(arg1.charAt(arg1.length()-1)))
                        return;                        
                   break;         
         default:  if ((miJTextField.getText().length()+arg1.length())>nroMaxCaracteres )
                        return;                        
                   break;
     }        
     super.insertString(arg0, arg1, arg2);
 }
}
