import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Person {

    private String firstName;

    private String lastName;

    private LocalDate birthDate;

    private String birthCity;

    private String gender;

    private String identityNumber;

    private String religion;

    private String bloodType;

    public Person() {
    }

    public Person(String firstName, String lastName, LocalDate birthDate, String birthCity, String gender, String identityNumber, String religion, String bloodType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.birthCity = birthCity;
        this.gender = gender;
        this.identityNumber = identityNumber;
        this.religion = religion;
        this.bloodType = bloodType;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getBirthCity() {
        return birthCity;
    }

    public void setBirthCity(String birthCity) {
        this.birthCity = birthCity;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public Long getUmur(){
        LocalDate hariIni = LocalDate.now();
        Long umur = ChronoUnit.YEARS.between(this.birthDate, hariIni);
        return umur;
    }
}
