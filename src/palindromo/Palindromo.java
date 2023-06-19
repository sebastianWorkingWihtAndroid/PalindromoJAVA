
package palindromo;


public class Palindromo {

  
    public static void main(String[] args) {
        
        String palabra = "moom";
    int longitud = palabra.length();
    boolean esPalindromo = true;

    for (int i = 0; i < longitud / 2; i++) {
        if (palabra.charAt(i) != palabra.charAt(longitud - 1 - i)) {
            esPalindromo = false;
            break;
        }
    }

    if (esPalindromo) {
        System.out.println("Es un palíndromo");
    } else {
        System.out.println("No es un palíndromo");
    }
    }
    
}
