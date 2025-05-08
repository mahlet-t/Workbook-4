import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void testPunchInPunchOut() {
        Employee employee=new Employee("201","Mahlet"," ",45,0.0,0.0);
        double punchInTime=9.0;
        double punchOutTime=17.0;
        double expectedHoursWorked=8.0;
        employee.punchIn(punchInTime);
        employee.punchOut(punchOutTime);
        assertEquals(expectedHoursWorked,employee.getHoursWorked());
    }


    }
