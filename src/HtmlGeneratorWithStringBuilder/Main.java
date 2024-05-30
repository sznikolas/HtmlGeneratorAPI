package HtmlGeneratorWithStringBuilder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Kérjük be a felhasználó nevét és email címét
        System.out.print("Adja meg a nevét: ");
        String name = scanner.nextLine();

        System.out.print("Adja meg az email címét: ");
        String email = scanner.nextLine();

        HtmlGenerator generator = new HtmlGenerator();
        String html = generator.generateHtml(name, email);

        System.out.print("Adja meg melyik részt szeretné törölni (p, h1, table): ");
        String remove = scanner.nextLine();
        System.out.println("MIT?: " + remove);

        HtmlFilter filter = new HtmlFilter();
        // Példa: a "<p>", "<h1>", és "<table>" elemek eltávolítása
        String filteredHtml = filter.filterHtml(html, remove);

        // Kinyomtatjuk a szűrt HTML-t
        System.out.println(filteredHtml);
        }
    }
