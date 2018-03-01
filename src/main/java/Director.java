public class Director extends Manager {
    private Double budget;
    public Director(String name, String ninumber, Double salary, String deptName, Double budget) {
        super(name, ninumber, salary, deptName);
        this.budget = budget;

    }

    public Double getBudget() {
        return budget;
    }
}
