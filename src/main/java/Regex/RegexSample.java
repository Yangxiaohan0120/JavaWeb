package Regex;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Chris Yang
 * created 2022-06-19 17:22
 **/
public class RegexSample {
    public static void main(String[] args) {
        StringBuilder content = new StringBuilder();

        try {
            FileInputStream  fis = new FileInputStream("/Users/yxh/IntelliJProjects/JavaWeb/web/sample.html");
            InputStreamReader isr = new InputStreamReader(fis,"UTF-8");
            BufferedReader bufferedReader = new BufferedReader(isr);
            String lineText = "";
            while((lineText = bufferedReader.readLine()) != null){
                System.out.println(lineText);
                content.append(lineText);
            }
            bufferedReader.close();
            System.out.println(content);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // 创建正则表达式对象
        Pattern p = Pattern.compile("<li>([\\u4e00-\\u9fa5]{2,10})([a-zA-Z]+)</li>");

        // 匹配正则表达式
        Matcher m = p.matcher(content);

        // 查找匹配的结果
        while(m.find()){
            System.out.println(m.group(0));
            String chs = m.group(1);
            String eng = m.group(2);
            System.out.println(chs + "-" + eng);
        }

    }
}
