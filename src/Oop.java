import java.util.Scanner;
public class Oop {
public static void main(String[] args) {  
        // دروستکردنی  Scanner بۆ وەرگرتنی داتاکان لە بەکارهێنەر 
Scanner ob = new Scanner(System.in);
        
        // داخڵکردنی ژمارەی یەکەم
        System.out.println("تکایە ژمارەی یەکەم بنووسە:");
        double num1 = ob.nextDouble();
        
        // داخڵکردنی ژمارەی دووەم
        System.out.println("تکایە ژمارەی دووەم بنووسە:");
        double num2 = ob.nextDouble();
        
        // داخڵکردنی نیشانی (+, -, *, /)
        System.out.println("تکایە نیشانی بنووسە (+, -, *, /):");
        char op = ob.next().charAt(0);
        
        double result = 0;  // گۆڕینی ئەنجامی 
        
        // هەڵبژاردنی نیشاکەکان 
        if (op == '+') {
            result = num1 + num2;  // زیادکردن
        } else if (op == '-') {
            result = num1 - num2;  // کەمکردنەوە
        } else if (op == '*') {
            result = num1 * num2;  // لێکدان 
        } else if (op == '/') {

// دابەشکردنی دوو زمارە بەمەرجیک دابەش نەبت بەسەر سفر دا
            if (num2 != 0) {
                result = num1 / num2;  // دابەش
            } else {
                System.out.println("هەڵە: ناتوانرێ بە صفر بەشکرابێت.");
                ob.close();  // داخستنی Scanner
                return;  
            }
        } else {
            // ئەگەر ئۆپەرەیتی نووسراو هەڵە بێت
            System.out.println("هەڵە:.");
            ob.close();  // داخستنی Scanner
        }
        
        // نیشاندانی ئەنجام
        System.out.println("ئەنجامی: " + result);
    }
}
