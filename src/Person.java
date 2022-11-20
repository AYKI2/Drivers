public abstract class Person implements PersonAble{
    private int id;
    private String fullname;
    private byte age;
    private char gender;
    private String email;
    private String phoneNumber;
    private double governmentsSalary;
    private String favoriteSport;

    public Person() {
    }

    public Person(int id, String fullname, byte age, char gender, String email, String phoneNumber, double governmentsSalary, String favoriteSport) {
        this.id = id;
        if(fullname.equals("")) {
            System.out.println("Field name cannot be empty!");
        }else {
            this.fullname = fullname;
        }
        if(age > 0) {
            this.age = age;
        }else {
            System.out.println("Age cannot be less than 0!");
        }
        if(gender == 'M' || gender == 'F' || gender == 'm' || gender == 'f') {
            this.gender = gender;
        }else {
            System.out.println("Gender can only be M or F!");
        }
        if (email.contains("@")) {
            this.email = email;
        }else {
            System.out.println("Email must contain @!");
        }
        if(phoneNumber.length() > 0 && phoneNumber.length() < 14) {
            this.phoneNumber = phoneNumber;
        }else {
            System.out.println("Number must be greater than 0 and less than 14!");
        }
        if(governmentsSalary > 0) {
            this.governmentsSalary = governmentsSalary;
        }else {
            System.out.println("Salary cannot be less than 0!");
        }
        if(favoriteSport.equals("")) {
            System.out.println("Field sport cannot be empty!");
        }else {
            this.favoriteSport = favoriteSport;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getGovernmentsSalary() {
        return governmentsSalary;
    }

    public void setGovernmentsSalary(double governmentsSalary) {
        this.governmentsSalary = governmentsSalary;
    }

    public String getFavoriteSport() {
        return favoriteSport;
    }

    public void setFavoriteSport(String favoriteSport) {
        this.favoriteSport = favoriteSport;
    }

    @Override
    public String toString() {
        return "id = " + id +
                ", fullname = " + fullname +
                ", age = " + age +
                ", gender = " + gender +
                ", email = " + email +
                ", phoneNumber = " + phoneNumber +
                ", \ngovernmentsSalary = " + governmentsSalary +
                ", favoriteSport = " + favoriteSport;
    }
}
