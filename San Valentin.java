import java.util.Scanner;

public class SanValentin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Hola, ¿quieres ser mi San Valentín? (Responde con 'sí' o 'no')");
        String respuesta = scanner.nextLine().toLowerCase();
        
        if (respuesta.equals("sí")) {
            System.out.println("¡Qué emoción! ❤️ Estoy muy feliz de que seas mi San Valentín.");
        } else if (respuesta.equals("no")) {
            System.out.println("Está bien, lo entiendo. Espero que tengas un día maravilloso. 🌹");
        } else {
            System.out.println("Parece que no entendí tu respuesta. Pero igual, ¡feliz día de San Valentín! 🌟");
        }
        
        scanner.close();
    }
}