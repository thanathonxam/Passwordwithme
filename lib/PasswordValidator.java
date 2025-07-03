
package lib;

public class PasswordValidator {
   
    /**
     * คุณจะต้องเขียน Javadoc ที่สมบูรณ์ที่นี่ในอนาคต
     * เพื่ออธิบายกฎการทำงานของเมธอด
     * @param password ที่ต้องการตรวจสอบ
     * @return ค่าความแข็งแรงของ password 
     */

    public static PasswordStrength validate(String password) {

        int minLength = 8 ; 

        if (password == null || password.length() < minLength) {
            return PasswordStrength.INVALID ;
        }
        
        boolean Digit = false ;
        boolean Upper = false ;
        boolean Special = false ;

        for(int i = 0 ; i < password.length() ; i++) {
            char c = password.charAt(i);
            if (Character.isDigit(c)) {
                Digit = true ;
            }
            else if (Character.isUpperCase(c)) {
                Upper = true ;
            }
            else if (!Character.isLetterOrDigit(c)) {
                Special = true ;
            }
        }


        if (Upper && Digit && Special) {
            return PasswordStrength.STRONG ;
        } else if (Digit && Upper) {
            return PasswordStrength.MEDIUM ;
        } else  {
            return PasswordStrength.WEAK ;
        }
        
    }
}