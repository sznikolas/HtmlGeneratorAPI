package HtmlGeneratorWithConcatenationAndArrayList;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Name input
        System.out.print("Please give me your name: ");
        String name = scanner.nextLine();

        // Email input
        System.out.print("Please give me your email: ");
        String email = scanner.nextLine();

        HTMLGenerator generator = new HTMLGenerator(name, email);

        // Show generated HTML
        System.out.println("Generated HTML:");
        generator.generateHTML();

        // Remove HTML element
        System.out.println("Give me the index of the element to remove (1-5)");
        int index = scanner.nextInt();
        generator.removeHtmlElement(index);

        // Modified HTML
        System.out.println("Modified HTML:");
        generator.generateHTML();

        scanner.close();

    }

}
