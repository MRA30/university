import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class StudentSubject {

    private Subject subject;

    private Student student;

    private LocalDate setDate;

    private LocalDate completeDate;

    public StudentSubject(Subject subject, Student student, LocalDate setDate, LocalDate completeDate) {
        this.subject = subject;
        this.student = student;
        this.setDate = setDate;
        this.completeDate = completeDate;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public LocalDate getSetDate() {
        return setDate;
    }

    public void setSetDate(LocalDate setDate) {
        this.setDate = setDate;
    }

    public LocalDate getCompleteDate() {
        return completeDate;
    }

    public void setCompleteDate(LocalDate completeDate) {
        this.completeDate = completeDate;
    }

    public void printEnrollmentInformation(){
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String selesaiMatakuliahTidakNull;
        if (this.completeDate != null){
            selesaiMatakuliahTidakNull = this.completeDate.format(format);
        }else {
            selesaiMatakuliahTidakNull = "N/A";
        }

        System.out.printf("%s in %s, (%s – %s), (%s), +%s poin\n",
                this.subject.getName(), this.subject.getMajor(),
                this.setDate.format(format),
                selesaiMatakuliahTidakNull,
                getPretiod(), this.getSubject().getPoints());
    }

    public String getPretiod(){
        Period lamaMasaKuliah = Period.between(this.setDate,
                this.completeDate != null ? this.completeDate : LocalDate.now());

        int tahun = lamaMasaKuliah.getYears();
        int bulan = lamaMasaKuliah.getMonths();
        int hari = lamaMasaKuliah.getDays();

        return tahun + " tahun," + bulan + " bulan," + hari + " hari";
    }
}
