package HtmlGeneratorWithConcatenationAndMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class HTMLGenerator {



//    private List<String> htmlParts = new LinkedList<>();
private Map<String, Integer> htmlParts = new LinkedHashMap<>();

    public HTMLGenerator(String name, String email) {
        addHtmlBeginning(name);
        addHtmlPElementName(name);
        addHtmlPElementEmail(email);
        addHtmlH1(name);
        addHtmlTable(name, email);
        addHtmlHref();
        addHtmlEnding();

    }

    // HTML beginning
//    public void addHtmlBeginning(String name) {
//        htmlParts.add("<!DOCTYPE html>" +
//                "\n\t<html>" +
//                "\n\t\t<head>" +
//                "\n\t\t\t<title> Hello World, Hello " + name + " </title>" +
//                "\n\t\t</head>" +
//                "\n\t\t<body>");
//    }
    public void addHtmlBeginning(String name) {
        String htmlBeginning = "<!DOCTYPE html>" +
                "\n\t<html>" +
                "\n\t\t<head>" +
                "\n\t\t\t<title> Hello World, Hello " + name + " </title>" +
                "\n\t\t</head>" +
                "\n\t\t<body>";
        htmlParts.put(htmlBeginning, 0);
    }

//    public void addHtmlH1(String content) {
//        htmlParts.add("\n\t\t\t<h1>" + "Interju teszt - " + content + "</h1>");
//    }
    public void addHtmlH1(String content) {
        String h1 = "\n\t\t\t<h1>" + "Interview test - " + content + "</h1>";
        htmlParts.put(h1, 1);
    }

//    public void addHtmlPElementName(String content) {
//        htmlParts.add("\n\t\t\t<p>" + "Felhasznalo neve" + "</p>" +
//                "\n\t\t\t<p>" + content + "</p>");
//    }
    public void addHtmlPElementName(String content) {
        String pElementName = "\n\t\t\t<p>" + "Username" + "</p>" +
                "\n\t\t\t<p>" + content + "</p>";
        htmlParts.put(pElementName, 2);
    }

//    public void addHtmlPElementEmail(String content) {
//        htmlParts.add("\n\t\t\t<p>" + "Felhasznalo emailje" + "</p>" +
//                "\n\t\t\t<p>" + content + "</p>");
//    }
    public void addHtmlPElementEmail(String content) {
        String pElementEmail = "\n\t\t\t<p>" + "User email " + "</p>" +
                "\n\t\t\t<p>" + content + "</p>";
        htmlParts.put(pElementEmail, 3);
    }

//    public void addHtmlTable(String name, String email) {
//        htmlParts.add("\n\t\t\t<table>" +
//                "\n\t\t\t\t<tr>" +
//                "\n\t\t\t\t\t<td>Name:</td>" +
//                "\n\t\t\t\t\t<td>" + name + " </td>" +
//                "\n\t\t\t\t</tr>" +
//                "\n\t\t\t\t<tr>" +
//                "\n\t\t\t\t\t<td>Email:</td>" +
//                "\n\t\t\t\t\t<td>" + email + "</td>" +
//                "\n\t\t\t\t</tr>" +
//                "\n\t\t\t</table>");
//    }

    public void addHtmlTable(String name, String email) {
        String table = "\n\t\t\t<table>" +
                "\n\t\t\t\t<tr>" +
                "\n\t\t\t\t\t<td>Name:</td>" +
                "\n\t\t\t\t\t<td>" + name + " </td>" +
                "\n\t\t\t\t</tr>" +
                "\n\t\t\t\t<tr>" +
                "\n\t\t\t\t\t<td>Email:</td>" +
                "\n\t\t\t\t\t<td>" + email + "</td>" +
                "\n\t\t\t\t</tr>" +
                "\n\t\t\t</table>";
        htmlParts.put(table, 4);
    }

//    public void addHtmlHref() {
//        htmlParts.add("\n\t\t\t<a href=\"https://www.w3schools.com\">Visit W3Schools</a>");
//    }

    public void addHtmlHref() {
        String href = "\n\t\t\t<a href=\"https://www.w3schools.com\">Visit W3Schools</a>";
        htmlParts.put(href, 5);
    }

    // HTML ending
//    public void addHtmlEnding() {
//        htmlParts.add("\n\t\t</body>" +
//                "\n\t</html>");
//    }

    public void addHtmlEnding() {
        String htmlEnding = "\n\t\t</body>\n\t</html>";
        htmlParts.put(htmlEnding, 6);
    }

    // Generate HTML
//    public void generateHTML() {
//        for (String part : htmlParts) {
//            System.out.println(part);
//        }
//    }
    public void generateHTML() {
        for (String part : htmlParts.keySet()) {
            System.out.println(part);
        }
    }

    // Remove element
//    public void removeHtmlElement(int index) {
//        if (index >= 1 && index < htmlParts.size() - 1) {
//            htmlParts.remove(index);
//        }
//    }

    public void removeHtmlElement(int index) {
        String elementToRemove = null;
        for (Map.Entry<String, Integer> entry : htmlParts.entrySet()) {
            if (entry.getValue() == index) {
                elementToRemove = entry.getKey();
                break;
            }
        }
        if (elementToRemove != null) {
            htmlParts.remove(elementToRemove);
//            htmlBuilder = new StringBuilder(htmlBuilder.toString().replace(elementToRemove, ""));
        }
    }

    public void removeHtmlElement2(Scanner scanner) {
        boolean repeat = true;
        while (repeat) {
//            System.out.println("Give me the index of the element to remove (1-5)");
            System.out.println("Give me the index of the element to remove (1-5) or type '0' to finish");
            System.out.println("1 - delete <p> element with name");
            System.out.println("2 - delete <p> element with email");
            System.out.println("3 - delete <h1> element");
            System.out.println("4 - delete <table> element");
            System.out.println("5 - delete <a> element");
            System.out.println("0 - Exit");


            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    removeHtmlElement(1); // <p> element with name
                    break;
                case 2:
                    removeHtmlElement(2); // <p> element with email
                    break;
                case 3:
                    removeHtmlElement(3); // <h1> element
                    break;
                case 4:
                    removeHtmlElement(4); // <table> element
                    break;
                case 5:
                    removeHtmlElement(5); // <a> element
                    break;
                case 0:
                    repeat = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
            // Minden egyes választás után megjelenítjük a generált HTML-t
            System.out.println("Generált HTML:");
            generateHTML();
        }
    }




}
