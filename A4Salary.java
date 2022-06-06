import java.util.*;

class Employee {
    String name, address, mailid, post;
    int EmpID;
    long mobileno;
    double bp, da, hra, pf, club;
    Scanner sc = new Scanner(System.in);

    public void getdata() {
        System.out.print("Enter Employee ID: ");
        EmpID = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Employee Name:");
        name = sc.nextLine();
        System.out.print("Enter mobile no.: ");
        mobileno = sc.nextLong();
        sc.nextLine();
        System.out.print("Enter E-mail ID of Employee:");
        mailid = sc.nextLine();
        System.out.print("Enter address of the employee: ");
        address = sc.nextLine();
    }

    void display() {
        System.out.println("\n\n______________________________");
        System.out.println("Information of Employee:\nEmployee ID: " + EmpID);
        System.out.println("Employee Name: " + name);
        System.out.println("Mobile no.: " + mobileno);
        System.out.println("E-mail ID: " + mailid);
        System.out.println("Address: " + address);
        System.out.println("______________________________");
    }
}

class Programmer extends Employee {
    double salary, bp, da, hra, pf, club, net, gross;

    void getprog() {
        System.out.println("ENter basic pay : ");
        bp = sc.nextDouble();
    }

    void calprog() {
        da = 0.97 * bp;
        hra = 0.1 * bp;
        pf = 0.12 * bp;
        club = 0.0001 * bp;
        gross = bp + da + hra;
        net = gross - pf - club;
        System.out.println("\n\n____________PAYSLIP____________");
        System.out.println("Basic Pay: " + bp);
        System.out.println("HRA: " + hra);
        System.out.println("PF: " + pf);
        System.out.println("Staff club: " + club);
        System.out.println(" gross pay : " + gross);
        System.out.println("net pay : " + net);
        System.out.println("_______________________________");

    }
}

class Asstprofessor extends Employee {
    double salary, bp, da, hra, pf, club, net, gross;

    void getAsp() {
        System.out.println("ENter basic pay : ");
        bp = sc.nextDouble();
    }

    void calAsp() {
        da = 0.97 * bp;
        hra = 0.1 * bp;
        pf = 0.12 * bp;
        club = 0.0001 * bp;
        gross = bp + da + hra;
        net = gross - pf - club;
        System.out.println("\n\n____________PAYSLIP____________");
        System.out.println("Basic Pay: " + bp);
        System.out.println("HRA: " + hra);
        System.out.println("PF: " + pf);
        System.out.println("Staff club: " + club);
        System.out.println(" gross pay : " + gross);
        System.out.println("net pay : " + net);
        System.out.println("_______________________________");

    }
}

class AssosciateProfessor extends Employee {
    double salary, bp, da, hra, pf, club, net, gross;

    void getAssp() {
        System.out.println("ENter basic pay : ");
        bp = sc.nextDouble();
    }

    void calAssp() {
        da = 0.97 * bp;
        hra = 0.1 * bp;
        pf = 0.12 * bp;
        club = 0.0001 * bp;
        gross = bp + da + hra;
        net = gross - pf - club;
        System.out.println("\n\n____________PAYSLIP____________");
        System.out.println("Basic Pay: " + bp);
        System.out.println("HRA: " + hra);
        System.out.println("PF: " + pf);
        System.out.println("Staff club: " + club);
        System.out.println(" gross pay : " + gross);
        System.out.println("net pay : " + net);
        System.out.println("_______________________________");

    }
}

class Professor extends Employee {
    double salary, bp, da, hra, pf, club, net, gross;

    void getprof() {
        System.out.println("ENter basic pay : ");
        bp = sc.nextDouble();
    }

    void calprof() {
        da = 0.97 * bp;
        hra = 0.1 * bp;
        pf = 0.12 * bp;
        club = 0.0001 * bp;
        gross = bp + da + hra;
        net = gross - pf - club;
        System.out.println("\n\n____________PAYSLIP____________");
        System.out.println("Basic Pay: " + bp);
        System.out.println("HRA: " + hra);
        System.out.println("PF: " + pf);
        System.out.println("Staff club: " + club);
        System.out.println(" gross pay : " + gross);
        System.out.println("net pay : " + net);
        System.out.println("_______________________________");

    }
}

class A4Salary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Select type of Employee: ");

            System.out.println("1.Programmer\n2.Asst.Professor\n3.Assosciate Professor\n4.Professor\n5.Exit");

            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    Programmer p = new Programmer();
                    p.getdata();
                    p.getprog();
                    p.display();
                    p.calprog();
                    break;
                case 2:
                    Asstprofessor q = new Asstprofessor();
                    q.getdata();
                    q.getAsp();
                    q.display();
                    q.calAsp();
                    break;
                case 3:
                    AssosciateProfessor r = new AssosciateProfessor();
                    r.getdata();
                    r.getAssp();
                    r.display();
                    r.calAssp();
                    break;
                case 4:
                    Professor s = new Professor();
                    s.getdata();
                    s.getprof();
                    s.display();
                    s.calprof();
                    break;
                case 5:
                    System.out.println("Thank You!!!");
                    break;
                default:
                    System.out.println("Eneter valid number.");
                    break;
            }
        } while (choice != 5);
    }
}
