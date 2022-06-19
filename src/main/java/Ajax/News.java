package Ajax;

/**
 * @author Chris Yang
 * created 2022-06-19 14:46
 **/
public class News {
    private String title;
    private String date;
    private String source;
    private String content;

    public News() {
    }

    public News(String title, String date, String source, String content) {
        this.title = title;
        this.date = date;
        this.source = source;
        this.content = content;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public String getDate() {
        return date;
    }

    public String getSource() {
        return source;
    }

    public String getContent() {
        return content;
    }
}
