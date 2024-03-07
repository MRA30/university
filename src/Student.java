import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

public class Student extends Person{

    private String nim;

    private LocalDate entryDate;

    private List<StudentSubject> studentSubjectList;


    public List<StudentSubject> getStudentSubjectList() {
        return studentSubjectList;
    }

    public void setStudentSubjectList(List<StudentSubject> studentSubjectList) {
        this.studentSubjectList = studentSubjectList;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public LocalDate getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(LocalDate entryDate) {
        this.entryDate = entryDate;
    }

    public Student(String nim, LocalDate entryDate, String firstName, String lastName, LocalDate birthDate, String birthCity, String gender, String identityNumber, String religion, String bloodType) {
        super (firstName, lastName, birthDate, birthCity, gender, identityNumber, religion, bloodType);
        this.nim = nim;
        this.entryDate = entryDate;
    }

    public void printallStudentData(){
        System.out.printf("NIM: %s, Name: %s %s\n", this.nim, super.getFirstName(),
                super.getLastName());
    }

    public void printStudentInformation(){
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd MMMM yyyy");

        System.out.printf("First Name: %s\n", super.getFirstName());
        System.out.printf("Last Name: %s\n", super.getLastName());
        System.out.printf("Gender: %s\n", super.getGender());
        System.out.printf("Birth Information: %s, %s (%s tahun)\n",
                super.getBirthCity(), super.getBirthDate().format(format), super.getUmur());
        System.out.printf("Religion: %s\n", super.getReligion());
        System.out.printf("Blood Type: %s\n", super.getBloodType());
        System.out.printf("ID Card: %s\n", super.getIdentityNumber());
        System.out.printf("Entry Date (Duration): %s (%s)\n",
                this.entryDate.format(format), getLamaMasaKuliah());
        System.out.println(" ");
        System.out.println("Enrollment Information:");
        for (StudentSubject studentSubject : this.getStudentSubjectList()){
            studentSubject.printEnrollmentInformation();
        }
    }

    public String getLamaMasaKuliah(){
        LocalDate hariIni = LocalDate.now();
        Period lamaMasaKuliah = Period.between(this.entryDate, hariIni);

        int tahun = lamaMasaKuliah.getYears();
        int bulan = lamaMasaKuliah.getMonths();
        int hari = lamaMasaKuliah.getDays();

        return tahun + " tahun," + bulan + " bulan," + hari + " hari";
    }

}
