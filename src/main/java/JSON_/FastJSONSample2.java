package JSON_;


import com.alibaba.fastjson2.JSON;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Chris Yang
 * created 2022-06-19 13:01
 **/
public class FastJSONSample2 {
    public static void main(String[] args) {
        List emplist = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Employee employee = new Employee();
            employee.setEmpno(4488 + i);
            employee.setEname("员工" + i);
            emplist.add(employee);
        }

        // 数组的序列化
        String json = JSON.toJSONString(emplist);
        System.out.println(json);

        List<Employee> emps = JSON.parseArray(json, Employee.class);
        for (Employee e : emps) {
            System.out.println(e.getEmpno()+":"+e.getEname());
        }
    }
}
