package HtmlGeneratorWithStringBuilder;

public class HtmlGenerator {

    public String generateHtml(String name, String email) {
        String indent = "    "; // 4 spaces for indentation
        StringBuilder html = new StringBuilder();

        html.append("<html>\n");
        html.append(indent).append("<head>\n");
        html.append(indent.repeat(2)).append("<title>Sample HTML</title>\n");
        html.append(indent).append("</head>\n");
        html.append(indent).append("<body>\n");
        html.append(indent.repeat(2)).append("<h1>Heading 1</h1>\n");
        html.append(indent.repeat(2)).append("<p>This is a paragraph.</p>\n");
        html.append(indent.repeat(2)).append("<table>\n")
                .append(indent.repeat(3)).append("<tr>\n")
                .append(indent.repeat(4)).append("<td>Cell 1</td>\n")
                .append(indent.repeat(4)).append("<td>Cell 2</td>\n")
                .append(indent.repeat(3)).append("</tr>\n")
                .append(indent.repeat(2)).append("</table>\n");

        html.append(indent.repeat(2)).append("<p>Name: ").append(name).append("</p>\n");
        html.append(indent.repeat(2)).append("<p>Email: ").append(email).append("</p>\n");
        html.append(indent).append("</body>\n");
        html.append("</html>");

        return html.toString();
    }
}
