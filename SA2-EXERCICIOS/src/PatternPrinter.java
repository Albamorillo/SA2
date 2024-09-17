/*
 * 7. Altere o código a seguir, para o menor número de linhas possível, mantendo o mesmo resultado 
print(" *") 
print(" * *") 
print(" * *") 
print(" * *") 
print("*** ***") 
print(" * *") 
print(" * *") 
print(" *****")
 */
public class PatternPrinter {
	
    public static void main(String[] args) {
    	
        for (int i = 0; i < 4; i++) {
            System.out.println(" * *");}
        System.out.println("*** ***");
        
        for (int i = 0; i < 2; i++) {
            System.out.println(" * *"); }
        
        System.out.println(" *****");
    }
}