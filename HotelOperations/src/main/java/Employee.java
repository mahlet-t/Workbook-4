import java.time.LocalDateTime;

public class Employee {
    private String employeeId;
    private String name;
    private String department;
    private int payRate;
    private double hoursWorked;
    private double punchInTime;


    public Employee(String employeeId, String name, String department, int payRate, double hoursWorked,double punchInTime) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
        this.punchInTime=punchInTime;

    }

    public double getTotalPay() {

        return payRate*getRegularHours()+(getOverTimeHours()*payRate*1.5);
    }

    public double getRegularHours() {
        return hoursWorked-getOverTimeHours();
        }


    public double getOverTimeHours() {
        if (hoursWorked>40) {
            return hoursWorked - 40;
        }else {
            return 0;
        }
    }


    public int getPayRate() {
        return payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }
     public void punchIn(double time){
        punchInTime=time;
         System.out.println("punched in at:"+time);
     }
     public void punchOut(double time){
        double worked=time-punchInTime;
        hoursWorked+=worked;
         System.out.println("Punched out at:"+time);
         System.out.println("You worked:"+ worked+" hours.");
     }

    public void punchTimeCard(double punchInTime,double punchOutTime){
            double worked=punchOutTime-punchInTime;
            hoursWorked+=worked;
            System.out.println("Punched in at:"+punchInTime);
            System.out.println("punched out at:"+punchOutTime);
            System.out.println("you worked hours"+worked);
        }
        public void punchIn(){
            LocalDateTime now=LocalDateTime.now();
            int hour=now.getHour();
            int minute=now.getMinute();
            double time=hour+(minute/60.0);
            punchInTime=time;
            System.out.println("punched in at:"+time);
        }
        public void punchOut(){
            LocalDateTime now=LocalDateTime.now();
            int hour=now.getHour();
            int minute=now.getMinute();
            double time=hour+(minute/60.0);
            double worked=time-punchInTime;
            hoursWorked+=worked;
            System.out.println("Punched out at:"+time);
            System.out.println("You worked:"+ worked+" hours.");
        }


    }


