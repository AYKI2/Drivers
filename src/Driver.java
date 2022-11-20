import java.time.LocalDate;
import java.time.Month;

public class Driver extends Person{
    private String car;
    public Driver() {
    }

    public Driver(int id, String fullname, byte age, char gender, String email, String phoneNumber, double governmentsSalary, String favoriteSport,String car) {
        super(id, fullname, age, gender, email, phoneNumber, governmentsSalary, favoriteSport);
        this.car = car;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }
    @Override
    public void favoriteSport() {
        System.out.println(getFullname()+" favorite sport is "+getFavoriteSport());
    }

    @Override
    public String favoriteLanguage(String favoriteLanguage) {
        favoriteLanguage = getFullname()+" favorite language is "+favoriteLanguage;
        return favoriteLanguage;
    }

    @Override
    public Month favoriteMonth(int month) {
        System.out.print(getFullname() + " favorite month is ");
        return Month.of(month);
    }

    @Override
    public String getLastName() {
        if(getFullname().contains(" ")) {
            int a = getFullname().indexOf(" ");
            return getFullname().substring(0,a);
        }
        return getFullname();
    }

    @Override
    public LocalDate getDateOfBirth() {
        LocalDate date = LocalDate.now().minusYears(getAge());
        return date;
    }

    @Override
    public String getPhoneNumberAndEmail() {
        return "Number: "+getPhoneNumber() +", Email: "+getEmail();
    }

    @Override
    public long[] getPeopleOfAllAges(Person[] people) {
        long[] peopleOfAllAges = new long[people.length];
        for (int i = 0; i < people.length; i++) {
            peopleOfAllAges[i] = people[i].getAge();
        }
        return peopleOfAllAges;
    }

    @Override
    public String toString() {
        return "\nDriver:" + super.toString() + " "+
                ", car = " + car;
    }
}
