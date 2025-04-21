public class Developer extends Employee{
    private String language;

    public Developer(String name, int salary, String language) {
        super(name, salary);
        this.language = language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String getDetails() {
        return "Developer " + getName() + " earns " + getSalary() + " Languages are " + language;
    }
}
