import java.util.Locale;
import java.util.Scanner;
public class contaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite o seu nome:");
        String nome = scanner.next();
        
        System.out.println("Digite seu sobrenome:");
        String sobrenome = scanner.next();

        System.out.println("Digite sua agência:");
        String numeroAgencia = scanner.next();

        System.out.println("Digite o número da sua conta:");
        Integer numeroConta = scanner.nextInt();

        System.out.println("Digite seu saldo:");
        Double saldo = scanner.nextDouble();
    
        

        System.out.println("Olá " + nome + " " + sobrenome+", " + "obrigado por criar uma conta em nosso banco! Sua agência é" + " " +  numeroAgencia + ", sua conta " +" " + numeroConta + " " + "e seu saldo de" + " " + saldo + " " + "já está disponível para saque." );
        
    }
}
