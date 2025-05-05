public class Employee {
    private String employeeId;
    private String name;
    private String department;
    private int payRate;
    private int hoursWorked;

    public Employee(String employeeId, String name, String department, int payRate, int hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;

    }

    public double getTotalPay() {
        return payRate*getRegularHours()+(getOverTimeHours()*payRate*1.5);
    }

    public int getRegularHours() {
        return hoursWorked-getOverTimeHours();
        }


    public int getOverTimeHours() {
        if (hoursWorked>40) {
            return hoursWorked - 40;
        }else {
            return 0;
        }
    }


    public int getPayRate() {
        return payRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }
}
