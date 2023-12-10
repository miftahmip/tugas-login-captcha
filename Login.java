import java.util.Scanner;

public class Login {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        String username, password, captcha, captchaInput;
        boolean isCaptchaCorrect = false;

        System.out.print("Masukkan username: ");
        username = input.nextLine();

        System.out.print("Masukkan password: ");
        password = input.nextLine();

        captcha = "N92T3";
        System.out.println("Enter the following CAPTCHA: " + captcha);

        captchaInput = input.nextLine();
        isCaptchaCorrect = captcha.equalsIgnoreCase(captchaInput);

        if (isCaptchaCorrect && username.equals("miftah") && password.equals("sndwich20")){
            System.out.println("Login berhasil!");
        } else {
            System.out.println("Login gagal");
        }
        input.close();
    }
}
