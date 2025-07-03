package lib;

public class PasswordValidatorTest{
    
    public static void run() {
        System.out.println("--- Running Password Validator Tests ---");
        
        // Test Case 1: รหัสผ่านสั้นกว่า 8 ตัว INVALID
        PasswordStrength result1 = PasswordValidator.validate("123");
        if (result1 == PasswordStrength.INVALID) {
            System.out.println("Test Case 1 Passed: Short password is INVALID.");
        } else {
            System.out.println("Test Case 1 FAILED: Expected INVALID but got " + result1);
        }
        
        // Test Case 2: รหัสผ่านมีแต่ตัวอักษรตัวเล็ก
        PasswordStrength result2 = PasswordValidator.validate("abcdefgh");
        if (result2 == PasswordStrength.WEAK) {
            System.out.println("Test Case 2 Passed: WEAK password.");
        } else {
            System.out.println("Test Case 2 FAILED: Expected WEAK but got " + result2);
        }
        
        // Test Case 3: รหัสผ่านมีตัวเลขและตัวพิมพ์ใหญ่
        PasswordStrength result3 = PasswordValidator.validate("abdX1234");
        if (result3 == PasswordStrength.MEDIUM) {
            System.out.println("Test Case 3 Passed: MEDIUM password.");
        } else {
            System.out.println("Test Case 3 FAILED: Expected MEDIUM but got " + result3);
        }
        
        // Test Case 4: รหัสผ่านมีตัวเลขและตัวพิมพ์ใหญ่และมีตัวอักษรพิเศษ
        PasswordStrength result4 = PasswordValidator.validate("@abcD596");
        if (result4 == PasswordStrength.STRONG) {
            System.out.println("Test Case 4 Passed: STRONG password.");
        } else {
            System.out.println("Test Case 4 FAILED: Expected STRONG but got " + result4);
        }

        System.out.println("--------------------------------");
    }
}
