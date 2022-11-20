import java.time.LocalDate;
import java.time.Month;

public interface PersonAble {
    void favoriteSport();
    String favoriteLanguage(String favoriteLanguage);
    Month favoriteMonth(int month);
    String getLastName();
    LocalDate getDateOfBirth();
    String getPhoneNumberAndEmail();
    long[] getPeopleOfAllAges(Person[] people);


}
