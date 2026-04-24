abstract class Employee {
    String employeeID;
    String name;
    String birthday;

    Employee(String id, String name, String birthday) {
        this.employeeID = id;
        this.name = name;
        this.birthday = birthday;
    }

    abstract double getPay();

    String getPositionInfo() {
        return "";
    }

    int getBasePay() {
        return 0;
    }

    int getIncentive() {
        return 0;
    }

    int getCommission() {
        return 0;
    }

    int getDailyPay() {
        return 0;
    }

    int getDays() {
        return 0;
    }

    String getType() {
        return "";
    }

    double getTax() {
        double pay = getPay();

        if (pay <= 2000000) return pay * 0.066;
        else if (pay <= 4000000) return pay * 0.073;
        else return pay * 0.085;
    }

    double getRealPay() {
        return getPay() - getTax();
    }
}