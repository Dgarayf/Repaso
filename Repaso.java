package repaso;


public class Repaso {

    
    public static void main(String[] args) {
        selectivas();
        
    }
    
    
    public static void selectivas() {
        int a = 0;
        String b = "siga";
        
        if (a==0&b.equalsIgnoreCase("siga")) {
            System.out.println("Verdadero");
        } else {
            System.out.println("False");
        }
            
        
    }
    
    public static void repetitivas(){
        for (int i = 0; i < 10; i++) {
            System.out.println("hola");
        }
    }
}