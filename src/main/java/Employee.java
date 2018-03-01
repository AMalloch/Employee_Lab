public abstract class  Employee {
    private String name;
    private String ninumber;
    private Double salary;

    public Employee (String name, String ninumber, Double salary){
        this.name = name;
        this.ninumber = ninumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNInumber() {
        return ninumber;
    }

    public double getSalary() {
        return salary;
    }

    public double raiseSalary(double rise){
        return salary += rise;
    }

    public double payBonus(){
        return salary/100;
    }

}
