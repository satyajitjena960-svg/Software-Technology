public class Student {
    private int id;
    private String name;
    private double cgpa;
    private boolean isFeesPaid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public boolean isFeesPaid() {
        return isFeesPaid;
    }

    public void setFeesPaid(boolean feesPaid) {
        isFeesPaid = feesPaid;
    }
}
