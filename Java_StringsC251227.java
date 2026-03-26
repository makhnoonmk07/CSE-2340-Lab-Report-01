
package java_strings.c251227;

public class Java_StringsC251227 {

    
      public static void main(String[] args) {
          
         //string
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length());
        
        
        String text = "Hello Programmer";
        System.out.println("Upper Case : " + text.toUpperCase());   
        System.out.println("Lower Case : "+ text.toLowerCase());
        System.out.println(text.charAt(0)); 
        System.out.println(text.charAt(4)); 
        //String Concatenation
        String firstName = "Mahira";
        String lastName = "Kabir";
        System.out.println(firstName + " " + lastName);
       
      //Numbers and Strings
      String x = "10";
      String y = "20";
      String z = x + y;
       System.out.println(z);
       String txt1 = "Hello";
String txt2 = "Hello";
System.out.println(txt1.equals(txt2));


    }
    
}
