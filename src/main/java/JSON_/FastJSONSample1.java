package JSON_;



import com.alibaba.fastjson.JSON;

import java.util.Calendar;

/**
 * @author Chris Yang
 * created 2022-06-19 12:44
 **/
public class FastJSONSample1 {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setEmpno(4488);
        employee.setEname("王晓东");
        employee.setJob("客户经理");
        employee.setSalary(10000f);
        employee.setDname("市场部");
        Calendar calendar = Calendar.getInstance();
        calendar.set(2019, 0, 30, 0, 0, 0);
        employee.setHdate(calendar.getTime());
        // FastJSON中提供了JSON对象
        String json = JSON.toJSONString(employee);
        System.out.println(json);

        // 反序列化
        Employee employee1 = JSON.parseObject(json,Employee.class);
        System.out.println(employee1.getEname());


    }
}
