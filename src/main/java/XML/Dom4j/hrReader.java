package XML.Dom4j;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.List;

/**
 * @author Chris Yang
 * created 2022-06-17 00:37
 **/
public class hrReader {
    public void readXML(){
        String file = "/Users/yxh/IntelliJProjects/JavaWeb/src/main/java/XML/hr.xml";
        SAXReader reader = new SAXReader();
        try {
            Document document = reader.read(file);
            // 获取根节点
            Element root = document.getRootElement();
            //获取employee
            List<Element> employees = root.elements("employee");
            for (Element employee:employees) {
                Element name = employee.element("name");
                String empName = name.getText();
                System.out.println(empName);
                System.out.println(employee.elementText("age"));
                employee.element("department");
                Attribute attribute = employee.attribute("no");
                System.out.println(attribute.getText());
            }
        } catch (DocumentException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        hrReader reader = new hrReader();
        reader.readXML();

    }
}
