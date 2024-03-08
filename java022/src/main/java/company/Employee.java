package company;

public class Employee {
    // 시스템에서 사용하는 직원 기본 id
    private int id;
    // 사번
    private String idc;
    private String name;
    private Long sal; // class 타입이지만 primitive 타입의 역할도 한다.


    public Employee(int id, String idc, String name, long sal) {
        this.id = id;
        this.idc = idc;
        this.name = name;
        this.sal = sal;
    }

    public int getId() {
        return id;
    }

    public String getIdc() {
        return idc;
    }

    public String getName() {
        return name;
    }

    public Long getSal() {
        return sal;
    }

    // Method, Operator
    public long getAnnSalary() {
        return sal*12;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("id=").append(id);
        sb.append(", idc='").append(idc).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", sal=").append(sal);
        sb.append('}');
        return sb.toString();
    }
}