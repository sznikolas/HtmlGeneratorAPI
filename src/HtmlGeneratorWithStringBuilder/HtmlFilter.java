package HtmlGeneratorWithStringBuilder;

public class HtmlFilter {
    public String filterHtml(String html, String... tagsToFilter) {
        for (String tag : tagsToFilter) {
            // Remove entire tag block including content
            html = html.replaceAll("(?s)<" + tag + "\\b[^>]*>.*?</" + tag + ">", "");
            // Remove self-closing tags
            html = html.replaceAll("(?i)<" + tag + "\\b[^>]*/>", "");

        }
        return html;
    }
}
