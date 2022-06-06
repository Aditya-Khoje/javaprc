import java.util.Scanner;

class Employee {
    String name;
    int experience;
    int fees;
    long mobono;

    Employee() {
        Scanner sc = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter the name of doctor               : ");
        name = sc.nextLine();
        System.out.print("Enter the experience of doctor (years) : ");
        experience = s.nextInt();
        System.out.print("Enter the fees of doctor               : ");
        fees = s.nextInt();
        System.out.print("Enter the mobile no. of doctor         : ");

        mobono = s.nextLong();
    }
}

class Doctor extends Employee {
    int docid;
    String post = "Doctor";
    String Specialization;

    public void setSpecialization(String specialization) {
        Specialization = specialization;
    }

    Doctor() {
        super();
        Scanner sc = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the ID of Doctor in serially ascending order : ");
        docid = s.nextInt();
        System.out.print("Enter the specialization of Doctor     : ");
        Specialization = sc.nextLine();
    }

}

class Patient {
    int pid;
    String name;
    int age;
    int bed_no;
    String disease;

    Patient() {
        Scanner sc = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter ID of patient          : ");
        pid = s.nextInt();
        System.out.print("Enter the name of patient    : ");
        name = sc.nextLine();
        System.out.print("Enter the age of patient     : ");
        age = s.nextInt();
        System.out.print("Enter the bed no of patient  : ");
        bed_no = s.nextInt();
        System.out.print("Enter the disease of patient : ");
        disease = sc.nextLine();
    }
}

class Account {
    String name;
    String username;
    String password;

    public void setName(String name) {
        this.name = name;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    boolean login(String username, String password) {
        if (this.username == null && this.password == null) {
            System.out.println("\n!!!   It seem that you do not have account, create account first   !!!");
            return false;
        } else if (this.username.equals(username) && this.password.equals(password)) {
            return true;
        } else {
            return false;
        }
    }

}

class Main {

    static void createAccount() {
        Scanner sc = new Scanner(System.in);
        String str;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        Scanner ps = new Scanner(System.in);
        Scanner pis = new Scanner(System.in);

        int choice;
        String str, UNstr, PWstr;
        boolean isLogin = false;
        int di = 0;
        int pi = 0;

        Account a1 = new Account();
        Doctor d[] = new Doctor[100];
        Patient p[] = new Patient[100];

        String pName;
        int page;
        String pgender;
        String pBloodg;
        String pdisease;
        String padmitdate;
        int proomno;
        int pdid;
        String pdischargeDate;
        int pnod;
        int ptotal = 0;

        System.out.println("\n----------------  Welcome to Hospital Management System  ----------------");
        do {
            System.out.println("\n\nFollowing are options available : ");
            System.out.println("1) Create Account");
            System.out.println("2) Login");
            System.out.println("3) Add Doctor information");
            System.out.println("4) Display all Doctor's information");
            System.out.println("5) Add patient information");
            System.out.println("6) Display all patient's information");
            System.out.println("7) Generate bill");
            System.out.print("Your response : ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:

                    System.out.print("\nEnter the name     : ");
                    str = s.nextLine();
                    a1.setName(str);

                    System.out.print("Enter the username : ");
                    str = s.nextLine();
                    a1.setUsername(str);

                    System.out.print("Enter the password : ");
                    str = s.nextLine();
                    a1.setPassword(str);
                    System.out.print("\n !! Account created successfully !!\n");
                    break;

                case 2:
                    System.out.print("\nEnter your username : ");
                    UNstr = s.nextLine();
                    System.out.print("Enter your password : ");
                    PWstr = s.nextLine();
                    if (a1.login(UNstr, PWstr)) {
                        isLogin = true;
                        System.out.println("\n  *** !!! You have logged in successfully !!! ***\n");
                    } else {
                        isLogin = false;
                        System.out.println("\n   !!!!   You have not logged in, Please try again   !!!!   \n");
                    }
                    break;

                case 3:
                    if (isLogin) {

                        System.out.println("\nAdd Doctor information :-");
                        d[di] = new Doctor();
                        di++;
                    } else {
                        System.out.println("\nPlease, log in first   !!!\n");
                    }
                    break;

                case 4:
                    if (isLogin) {
                        System.out.println("\nDisplay all doctors information");
                        System.out.printf("| %11s | %15s | %10s | %10s | %13s | %20s |\n", "DOCTORID", "NAME",
                                "EXPERIENCE", "FEES",
                                "MOBILENO", "SPECIALIZATION");
                        for (int i = 0; i < di; i++) {
                            System.out.printf("| %11s | %15s | %10s | %10s | %13s | %20s |\n", d[i].docid, d[i].name,
                                    d[i].experience,
                                    d[i].fees, d[i].mobono, d[i].Specialization);
                        }
                    } else {
                        System.out.println("\nPlease, log in first   !!!\n");
                    }
                    break;

                case 5:
                    if (isLogin) {
                        System.out.println("\nAdd patient information :-");
                        p[pi] = new Patient();
                        pi++;
                    } else {
                        System.out.println("\nPlease, log in first   !!!\n");
                    }
                    break;

                case 6:
                    if (isLogin) {
                        System.out.println("\nDisplay of all patients information :-");
                        System.out.printf("| %15s | %15s | %6s | %6s | %15s |\n", "PATIENTID", "NAME", "AGE", "BEDNO",
                                "DISEASE");
                        for (int i = 0; i < pi; i++) {
                            System.out.printf("| %15s | %15s | %6s | %6s | %15s |\n", p[i].pid, p[i].name, p[i].age,
                                    p[i].bed_no,
                                    p[i].disease);
                        }
                    } else {
                        System.out.println("\nPlease, log in first   !!!\n");
                    }
                    break;

                case 7:

                    if (isLogin) {
                        System.out.println("\nTo generate bill please fill the following information :-");
                        System.out.print("Enter name of patient             : ");
                        pName = ps.nextLine();
                        System.out.print("Enter age of patient              : ");
                        page = pis.nextInt();
                        System.out.print("Enter gender of patient ( M / F ) : ");
                        pgender = ps.nextLine();
                        System.out.print("Enter blood group of patient      : ");
                        pBloodg = ps.nextLine();
                        System.out.print("Enter disease of patient          : ");
                        pdisease = ps.nextLine();
                        System.out.print("Enter admit date [DD/MM/YY]       : ");
                        padmitdate = ps.nextLine();
                        System.out.print("Enter discharge date [DD/MM/YY]   : ");
                        pdischargeDate = ps.nextLine();
                        System.out.print("Enter no. of days hospitalised    : ");
                        pnod = pis.nextInt();
                        System.out.print("Enter patient's doctor ID         : ");
                        pdid = pis.nextInt();

                        System.out.println("\n   *****   PATIENT BILL   *****   \n");
                        System.out.println("   ----   PATIENT'S INFO   ----   ");
                        System.out.println("NAME           : " + pName);
                        System.out.println("AGE            : " + page);
                        System.out.println("GENDER         : " + pgender);
                        System.out.println("BOOD GROUP     : " + pBloodg);
                        System.out.println("DISEASE        : " + pdisease);
                        System.out.println("ADMIT DATE     : " + padmitdate);
                        System.out.println("DISCHARGE DATE : " + pdischargeDate);
                        System.out.println("DOCTOR NAME    : " + d[pdid - 1].name);
                        System.out.println("   ----   PAYMENT INFO   ----   ");
                        System.out.println("Room charges             : 750rs / day");
                        System.out.println(
                                "No. of days hospitalised : " + pnod + " :  750 * " + pnod + " = " + 750 * pnod + "rs");
                        System.out.println("Doctor's fees            : " + d[pdid - 1].fees + "rs");
                        System.out.println("Service charge           : 1230rs");
                        ptotal = (750 * pnod) + d[pdid - 1].fees + 1230;
                        System.out.println("Total Amount : " + ptotal);

                    } else {
                        System.out.println("\nPlease, log in first   !!!\n");
                    }
                    break;
            }
        } while (choice != 8);
    }
}