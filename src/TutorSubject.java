import java.time.format.DateTimeFormatter;

public class TutorSubject {

    private Subject subject;

    private Tutor tutor;

    public TutorSubject(Subject subject, Tutor tutor) {
        this.subject = subject;
        this.tutor = tutor;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Tutor getTutor() {
        return tutor;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }

    public void printEnrollmentInformation() {
        System.out.printf("%s in %s\n",
        this.subject.getName(), this.subject.getMajor());
    }

}
