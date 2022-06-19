package Ajax;

/**
 * @author Chris Yang
 * created 2022-06-19 16:38
 **/
public class Channel {
    private String code;
    private String name;

    public Channel() {
    }

    public Channel(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}
