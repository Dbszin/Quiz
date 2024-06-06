import java.util.Scanner;

public class Quiz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;


        String[][] questions = {
                {"O que é POO em java?", "Programação orientada a objetos", "Programação ostensiva a objetos", "Programação orientada a outros"},
                {"O que é Java?", "Uma linguangem de programação", "Um anti virus", "Um site"},
                {"O que é um encapsulamento em java?", " a prática de esconder os detalhes de implementação de uma classe", "um modelo de pacote", "uma função"}
        };


        for (String[] question : questions) {
            System.out.println(question[0]);
            for (int i = 1; i < question.length; i++) {
                System.out.println(i + ") " + question[i]);
            }

            System.out.print("Sua resposta (número): ");
            int answer = scanner.nextInt();


            if (question[answer].equals(question[1])) {
                System.out.println("Correto!");
                score++;
            } else {
                System.out.println("Errado. A resposta correta é: " + question[1]);
            }
            System.out.println();
        }

        System.out.println("Sua pontuação final é: " + score + " de " + questions.length);
        scanner.close();
    }
}