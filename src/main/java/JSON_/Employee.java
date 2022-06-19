package JSON_;

import com.alibaba.fastjson.annotation.JSONField;

import java.util.Date;

/**
 * @author Chris Yang
 * created 2022-06-19 12:43
 **/
public class Employee {
    private Integer empno;
    private String ename;
    private String job;
    @JSONField(format = "yyyy-MM-DD")
    private Date hdate;
    private Float salary;
    private String dname;

    public void setEmpno(Integer empno) {
        this.empno = empno;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setHdate(Date hdate) {
        this.hdate = hdate;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public Integer getEmpno() {
        return empno;
    }

    public String getEname() {
        return ename;
    }

    public String getJob() {
        return job;
    }

    public Date getHdate() {
        return hdate;
    }

    public Float getSalary() {
        return salary;
    }

    public String getDname() {
        return dname;
    }
}
