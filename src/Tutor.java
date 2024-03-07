import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Tutor extends Person {

    private String nik;

    private Double salary;

    private LocalDate workingStartDate;

    private List<TutorSubject> tutorSubjectList;

    public List<TutorSubject> getTutorSubjectList() {
        return tutorSubjectList;
    }

    public void setTutorSubjectList(List<TutorSubject> tutorSubjectList) {
        this.tutorSubjectList = tutorSubjectList;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public LocalDate getWorkingStartDate() {
        return workingStartDate;
    }

    public void setWorkingStartDate(LocalDate workingStartDate) {
        this.workingStartDate = workingStartDate;
    }

    public Tutor(String nik, Double salary, LocalDate workingStartDate, String firstName, String lastName, LocalDate birthDate, String birthCity, String gender, String identityNumber, String religion, String bloodType) {
        super (firstName, lastName, birthDate, birthCity, gender, identityNumber, religion, bloodType);
        this.nik = nik;
        this.salary = salary;
        this.workingStartDate = workingStartDate;
    }

    public void printAllDosenData(){
        System.out.printf("NIK: %s, Name: %s %s\n", this.nik, super.getFirstName(),
                super.getLastName());
    }

    public void printTutorInformation(){
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd MMMM yyyy");

        System.out.printf("First Name: %s\n", super.getFirstName());
        System.out.printf("Last Name: %s\n", super.getLastName());
        System.out.printf("Gender: %s\n", super.getGender());
        System.out.printf("Birth Information: %s, %s (%s tahun)\n",
                super.getBirthCity(), super.getBirthDate().format(format), super.getUmur());
        System.out.printf("Religion: %s\n", super.getReligion());
        System.out.printf("Blood Type: %s\n", super.getBloodType());
        System.out.printf("ID Card: %s\n", super.getIdentityNumber());
        System.out.printf("Hire Date (Duration): %s (%s)\n",
                this.workingStartDate.format(format), getLamaBekerja());
        System.out.println(" ");
        System.out.println("Competency Information:");
        for (TutorSubject tutorSubject : this.tutorSubjectList){
            tutorSubject.printEnrollmentInformation();
        }
    }

    public String getLamaBekerja(){
        LocalDate hariIni = LocalDate.now();
        Period lamaMasaKuliah = Period.between(this.workingStartDate, hariIni);

        int tahun = lamaMasaKuliah.getYears();
        int bulan = lamaMasaKuliah.getMonths();
        int hari = lamaMasaKuliah.getDays();

        return tahun + " tahun," + bulan + " bulan," + hari + " hari";
    }
}
