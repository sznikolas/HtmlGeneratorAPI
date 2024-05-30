package HtmlGeneratorWithConcatenationAndArrayList;

import java.util.*;

public class HTMLGenerator {
    private List<String> htmlParts = new ArrayList<>();


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
        htmlParts.add("<!DOCTYPE html>" +
                "\n\t<html>" +
                "\n\t\t<head>" +
                "\n\t\t\t<title> Hello World, Hello " + name + " </title>" +
                "\n\t\t</head>" +
                "\n\t\t<body>");
    }


    public void addHtmlH1(String content) {
        htmlParts.add("\n\t\t\t<h1>" + "Interju teszt - " + content + "</h1>");
    }


    public void addHtmlPElementName(String content) {
        htmlParts.add("\n\t\t\t<p>" + "Felhasznalo neve" + "</p>" +
                "\n\t\t\t<p>" + content + "</p>");
    }


    public void addHtmlPElementEmail(String content) {
        htmlParts.add("\n\t\t\t<p>" + "Felhasznalo emailje" + "</p>" +
                "\n\t\t\t<p>" + content + "</p>");
    }


    public void addHtmlTable(String name, String email) {
        htmlParts.add("\n\t\t\t<table>" +
                "\n\t\t\t\t<tr>" +
                "\n\t\t\t\t\t<td>Name:</td>" +
                "\n\t\t\t\t\t<td>" + name + " </td>" +
                "\n\t\t\t\t</tr>" +
                "\n\t\t\t\t<tr>" +
                "\n\t\t\t\t\t<td>Email:</td>" +
                "\n\t\t\t\t\t<td>" + email + "</td>" +
                "\n\t\t\t\t</tr>" +
                "\n\t\t\t</table>");
    }



    public void addHtmlHref() {
        htmlParts.add("\n\t\t\t<a href=\"https://www.w3schools.com\">Visit W3Schools</a>");
    }



//     HTML ending
    public void addHtmlEnding() {
        htmlParts.add("\n\t\t</body>" +
                "\n\t</html>");
    }



//     Generate HTML
    public void generateHTML() {
        for (String part : htmlParts) {
            System.out.println(part);
        }
    }


//     Remove element
    public void removeHtmlElement(int index) {
        if (index >= 1 && index < htmlParts.size() - 1) {
            htmlParts.remove(index);
        }
    }



}
