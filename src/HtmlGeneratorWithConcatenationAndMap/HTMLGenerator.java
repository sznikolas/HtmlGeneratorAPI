package HtmlGeneratorWithConcatenationAndMap;

import java.util.*;

public class HTMLGenerator {
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
    public void addHtmlBeginning(String name) {
        String htmlBeginning = "<!DOCTYPE html>" +
                "\n\t<html>" +
                "\n\t\t<head>" +
                "\n\t\t\t<title> Hello World, Hello " + name + " </title>" +
                "\n\t\t</head>" +
                "\n\t\t<body>";
        htmlParts.put(htmlBeginning, 0);
    }

    public void addHtmlPElementName(String content) {
        String pElementName = "\n\t\t\t<p>" + "Username" + "</p>" +
                "\n\t\t\t<p>" + content + "</p>";
        htmlParts.put(pElementName, 1);
    }

    public void addHtmlPElementEmail(String content) {
        String pElementEmail = "\n\t\t\t<p>" + "User email " + "</p>" +
                "\n\t\t\t<p>" + content + "</p>";
        htmlParts.put(pElementEmail, 2);
    }

    public void addHtmlH1(String content) {
        String h1 = "\n\t\t\t<h1>" + "Interview test - " + content + "</h1>";
        htmlParts.put(h1, 3);
    }

    public void addHtmlTable(String name, String email) {
        String table = "\n\t\t\t<table style=\"border: 2px solid;\"" +
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

    public void addHtmlHref() {
        String href = "\n\t\t\t<a href=\"https://www.w3schools.com\">Visit W3Schools</a>";
        htmlParts.put(href, 5);
    }

    // HTML ending
    public void addHtmlEnding() {
        String htmlEnding = "\n\t\t</body>\n\t</html>";
        htmlParts.put(htmlEnding, 6);
    }

//    public void removeHtmlElement(Scanner scanner) {
//        Set<Integer> elementsToRemove = new HashSet<>();
//        boolean repeat = true;
//        while (repeat) {
//            System.out.println("Give me the index of the element to remove (1-5) or type '0' to finish");
//            if (!elementsToRemove.contains(1)) System.out.println("1 - delete <p> element with name");
//            if (!elementsToRemove.contains(2)) System.out.println("2 - delete <p> element with email");
//            if (!elementsToRemove.contains(3)) System.out.println("3 - delete <h1> element");
//            if (!elementsToRemove.contains(4)) System.out.println("4 - delete <table> element");
//            if (!elementsToRemove.contains(5)) System.out.println("5 - delete <a> element");
//
//            String input = scanner.nextLine();
//            if (input.equals("0")) {
//                repeat = false;
//            }
//
//            String[] choices = input.split("[,\\s]+");
//            boolean validChoice = true;
//
//            for (String choiceStr : choices) {
//                try {
//                    int choice = Integer.parseInt(choiceStr.trim());
//                    if (choice < 1 || choice > 5 || !htmlParts.containsValue(choice)) {
//                        System.out.println("Invalid choice: " + choice);
//                        validChoice = false;
//                    } else {
//                        elementsToRemove.add(choice);
//                    }
//                } catch (NumberFormatException e) {
//                    System.out.println("Invalid input: " + choiceStr);
//                    validChoice = false;
//                }
//            }
//
//            if (validChoice) {
//                for (int element : elementsToRemove) {
//                    removeHtmlElement(element);
//                }
//                System.out.println("Generated HTML:");
//                generateHTML();
//            }
//        }
//    }


    // Generate HTML
    public void generateHTML() {
        for (String part : htmlParts.keySet()) {
            System.out.println(part);
        }
    }

    // Remove element
    public void removeHtmlElement(int index) {
        String elementToRemove = null;
        for (Map.Entry<String, Integer> entry : htmlParts.entrySet()) {
            if (entry.getValue() == index) {
                elementToRemove = entry.getKey();
            }
        }
        if (elementToRemove != null) {
            htmlParts.remove(elementToRemove);
        }
    }

    public void removeHtmlElementInteractive(Scanner scanner) {
        Set<Integer> elementsToRemove = new HashSet<>();
        boolean repeat = true;

        while (repeat) {
            displayRemovableElements();
            String input = scanner.nextLine();

            if (input.equals("0")) {
                repeat = false;
            }

            parseElements(input, elementsToRemove);

        }
    }

    private void displayRemovableElements() {
        System.out.println("Give me the index of the element to remove (1-5) or type '0' to finish");
        if (htmlParts.containsValue(1)) System.out.println("1 - delete <p> element with name");
        if (htmlParts.containsValue(2)) System.out.println("2 - delete <p> element with email");
        if (htmlParts.containsValue(3)) System.out.println("3 - delete <h1> element");
        if (htmlParts.containsValue(4)) System.out.println("4 - delete <table> element");
        if (htmlParts.containsValue(5)) System.out.println("5 - delete <a> element");
    }

    private void parseElements(String input, Set<Integer> elementsToRemove) {
        String[] choices = input.split("[,\\s]+");
        Set<Integer> tempElementsToRemove = new HashSet<>();
        boolean validChoice = true;

        for (String choiceStr : choices) {
            try {
                int choice = Integer.parseInt(choiceStr.trim());
                if ((choice < 1 || choice > 5) || !htmlParts.containsValue(choice)) {
                    System.out.println("Invalid choice: " + choice);
                    validChoice = false;
                } else {
                    tempElementsToRemove.add(choice);
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: " + choiceStr);
                validChoice = false;
            }
        }

        if (validChoice) {
            elementsToRemove.addAll(tempElementsToRemove);
            removeAndGenerateHtml(elementsToRemove);
        }
    }

    private void removeAndGenerateHtml(Set<Integer> elementsToRemove) {
        if (!(elementsToRemove.isEmpty())) {
            for (int element : elementsToRemove) {
                removeHtmlElement(element);
            }

            System.out.println("Generated HTML:");
            generateHTML();
        }
    }


}
