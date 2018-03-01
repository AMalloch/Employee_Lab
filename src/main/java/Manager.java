public class Manager extends Employee {
    private String deptName;

    public Manager(String name, String ninumber, Double salary, String deptName) {
        super(name, ninumber, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }
}
