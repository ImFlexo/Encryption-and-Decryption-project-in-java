
package encryption;


public class Encryption {

    
    public static void main(String[] args) {
        
        int key = 6;
        System.out.println("Encrypting...\n--------------------");
        String normal_text = "how u doin?";
         System.out.println(normal_text);
        
        char[] chars = normal_text.toCharArray();
      
        
        for ( char c : chars){
          c +=key;

           System.out.print(c);
          
        }
        
        System.out.println("\n\n");
        
        System.out.println("Decrypting... \n--------------------");
     String encrypted_text = "nu}&{&juotE";
        System.out.println(encrypted_text);
        
        char[] chars2 = encrypted_text.toCharArray();
        
      
        
        for (char c : chars2){
          c -=key;

           System.out.print(c);
          
        }
        System.out.println("");
        
       
        
    }
    
}
