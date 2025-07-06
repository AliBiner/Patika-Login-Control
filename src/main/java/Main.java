import java.util.Scanner;

public class Main {
    private String password = "123456";
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Main main = new Main();
        main.start();
    }

    public void start(){
        System.out.print("Şifrenizi giriniz: ");
        String inputPassword = scanner.next();

        if (inputPassword.equals(password))
            System.out.println("Giriş yapıldı.");
        else{
            System.out.print("Şifrenizi sıfırlamak istiyorsanız 1'e basınız: ");
            int select = scanner.nextInt();
            switch (select){
                case 1:
                    changePassword();
                    break;
                default:
                    break;
            }
        }
    }

    public void changePassword(){
        System.out.print("Yeni şifrenizi giriniz: ");
        String newPassword = scanner.next();
        while (newPassword.equals(password)){
            System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
            newPassword = scanner.next();
        }
        password = newPassword;
        System.out.println("Şifre oluşturuldu");
    }
}
