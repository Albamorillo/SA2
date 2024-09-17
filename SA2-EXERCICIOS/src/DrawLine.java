/*
 * 4. Crie uma função para desenhar uma linha, usando o caractere '_' (underline). 
 * O tamanho da linha deve ser definido na chamada da função.
 */
public class DrawLine {
    public static void drawLine(int length) {
        for (int i = 0; i < length; i++) {
            System.out.print("_"); }
        System.out.println(); // Add a newline character at the end
        }
    
    public static void main(String[] args) {
        drawLine(20); // Example usage: Draw a line with a length of 20
    }
}
