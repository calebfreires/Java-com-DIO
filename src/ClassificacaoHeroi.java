import java.util.Scanner;

public class ClassificacaoHeroi {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // System.out.print("Digite o XP do seu herói: ");
    // int xp = scanner.nextInt();
    // String nivel = "";

    for (int i = 0; i < 3; i++) {
      // código que será repetido
      System.out.print("Digite o XP do seu herói: ");
      int xp = scanner.nextInt();
      String nivel = "";
      if (xp <= 0) {
        System.out.println("Seu XP deve ser maior ou igual a 1. Não é aceito valores negativos e nem 0");
      } else if (xp <= 1000) {
        nivel = "Ferro";
      } else if (xp <= 2000) {
        nivel = "Bronze";
      } else if (xp <= 5000) {
        nivel = "Prata";
      } else if (xp <= 7000) {
        nivel = "Ouro";
      } else if (xp <= 8000) {
        nivel = "Platina";
      } else if (xp <= 9000) {
        nivel = "Ascendente";
      } else if (xp <= 10000) {
        nivel = "Imortal";
      } else {
        nivel = "Radiante";
      }

      if (xp > 0) {
        System.out.println("Seu nível é: " + nivel);
      }
    }

    scanner.close();
  }
}
