import java.time.LocalDate;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);
    public static Random random = new Random();
    public static void main(String[] args) {
        Person programmer1 = new Programmer(1,"Abdukhamitov Iskhak",(byte)20,'M',"Abdukhamitov@gmial.com","+996507434242",150000,"Volleyball","Java");
        Person programmer2 = new Programmer(2,"Islambekov Mukhammedali",(byte)19,'M',"Islambekov@gmial.com","+996778765677",100000,"Soccer","Python");

        Person driver1 = new Driver(3,"Driveriova Voditel",(byte)39,'F',"Driveriov@gmial.com","+996507434242",35000,"Volleyball","Mercedes-Benz");
        Person driver2 = new Driver(4,"Taxistov Chelovek",(byte)45,'M',"Taxistov@gmial.com","+996778765677",45000,"Soccer","BMW");

        Person doctor1 = new Doctor(5,"Kamalov Azamat",(byte)19,'M',"Kamalov@gmial.com","+996507434242",80000,"Volleyball","surgeon");
        Person doctor2 = new Doctor(6,"Chelovekona Lichnost",(byte)34,'F',"Chelovekov@gmial.com","+996778765677",120000,"Soccer","traumatologist");

        Person[] people = {programmer1,programmer2,driver1,driver2,doctor1,doctor2};

        while (true) {
            System.out.println("Choice 1(ShowAll), 2(AllAges)");
            int number = input.nextInt();
            int randomNumber;
            switch (number) {
                case 1:
                    for (Person person : people) {
                        randomNumber = random.nextInt(1,12);
                        if (person.getId() == 1) {
                            System.out.println(person);
                            person.favoriteSport();
                            System.out.println(person.favoriteLanguage("Kyrgyz"));
                            System.out.println(person.favoriteMonth(randomNumber));
                            System.out.println(person.getLastName());
                            System.out.println(person.getPhoneNumberAndEmail());
                            System.out.println(person.getDateOfBirth());
                        } else {
                            System.out.println(person);
                            person.favoriteSport();
                            System.out.println(person.favoriteLanguage("Russian"));
                            System.out.println(person.favoriteMonth(randomNumber));
                            System.out.println(person.getLastName());
                            System.out.println(person.getPhoneNumberAndEmail());
                            System.out.println(person.getDateOfBirth());

                        }
                    }
                    break;
                case 2:
                    for (Person person : people) {
                        System.out.println(Arrays.toString(person.getPeopleOfAllAges(people)));
                        break;
                    }
                    break;
            }
        }
    }
}