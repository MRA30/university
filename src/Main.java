import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        mainMenu();
    }

    public static void mainMenu() throws Exception {
        Scanner scanner = new Scanner(System.in);
        Integer pilihanMenu = null;
        while (pilihanMenu == null) {
            System.out.println("Pilih nomor menu untuk masuk ke menunya:");
            System.out.println("\t1. All Student Data");
            System.out.println("\t2. All Tutor Data");
            System.out.println("\t3. About this University");
            System.out.println("\t4. Exit Application");

            try {
                pilihanMenu = scanner.nextInt();
            } catch (Exception exception) {
                throw new Exception("Pilihan Salah, silahkan pilih angka 1 - 4");
            }

            switch (pilihanMenu) {
                case 1:
                    getAllStudentData();
                    break;
                case 2:
                    getAllTutorData();
                    break;
                case 3:
                    universityInfo();
                    break;
                case 4:
                    System.out.println("Good Bye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan Salah, silahkan pilih angka 1 - 4");
                    break;

            }
        }
    }

    public static void getAllStudentData() throws Exception {

        Subject subjectOop = new Subject("Object Oriented Programming", "Programming", 20);
        Subject subjectDataStructure = new Subject("Data Structure", "Programming", 30);
        Subject subjectNetworkingFundamental = new Subject("Networking Fundamental", "Networking", 20);
        Subject subjectDatabaseFundamental = new Subject("Database Fundamental", "Programming", 30);
        Subject subjectProjectManagement = new Subject("Project Management Professional", "Management and Analysis", 40);
        Subject subjectUml = new Subject("Unified Modelling Language", "Management and Analysis", 20);
        Subject subjectJavaFundamental = new Subject("Java Fundamental", "Programming", 30);
        Subject subjectInfrastructureDesign = new Subject("Infrastructure Design", "Networking", 30);
        Subject subjectNetworkAndSecurity = new Subject("Network and Security", "Networking", 20);

        List<Student> students = new ArrayList<>();
        Student alexWinataStudent = new Student("A021",
                LocalDate.of(2018, 4, 12),
                "Alex", "Wirianata",
                LocalDate.of(1990, 11, 23),
                "Jakarta", "Laki-laki",
                "312008923111990002", "Kristen", "A");
        List<StudentSubject> alexWinatastudentSubjectList = new ArrayList<>();
        StudentSubject alexWinataStudentSubjectOop = new StudentSubject(subjectOop, alexWinataStudent,
                LocalDate.of(2018, 4, 12),
                LocalDate.of(2018, 9, 12));
        StudentSubject alexWinataStudentSubjectDs = new StudentSubject(subjectDataStructure, alexWinataStudent,
                LocalDate.of(2018, 8, 18),
                null);
        alexWinatastudentSubjectList.add(alexWinataStudentSubjectOop);
        alexWinatastudentSubjectList.add(alexWinataStudentSubjectDs);
        alexWinataStudent.setStudentSubjectList(alexWinatastudentSubjectList);

        Student desyOktavianiStudent = new Student("A022",
                LocalDate.of(2018, 4, 1),
                "Desy", "Oktaviani",
                LocalDate.of(1995, 5, 11),
                "Bandung", "Perempuan",
                "312008911051995002", "Islam", "O");
        List<StudentSubject> desyOktavianistudentSubjectList = new ArrayList<>();
        StudentSubject desyOktavianiStudentSubjectNf = new StudentSubject(subjectNetworkingFundamental, desyOktavianiStudent,
                LocalDate.of(2018, 4, 1),
                null);
        StudentSubject desyOktavianiStudentSubjectDs = new StudentSubject(subjectDataStructure, desyOktavianiStudent,
                LocalDate.of(2018, 8, 18),
                null);
        desyOktavianistudentSubjectList.add(desyOktavianiStudentSubjectNf);
        desyOktavianistudentSubjectList.add(desyOktavianiStudentSubjectDs);
        desyOktavianiStudent.setStudentSubjectList(desyOktavianistudentSubjectList);

        Student jokoDavidsonStudent = new Student("A023",
                LocalDate.of(2018, 4, 14),
                "Joko", "Davidson",
                LocalDate.of(1990, 6, 7),
                "Jakarta", "Laki-laki",
                "3120089277889990002", "Islam", "A");
        List<StudentSubject> jokoDavidsonstudentSubjectList = new ArrayList<>();
        StudentSubject jokoDavidsonStudentSubjectUml = new StudentSubject(subjectUml, jokoDavidsonStudent,
                LocalDate.of(2018, 5, 3),
                LocalDate.of(2018, 11, 1));
        jokoDavidsonstudentSubjectList.add(jokoDavidsonStudentSubjectUml);
        jokoDavidsonStudent.setStudentSubjectList(jokoDavidsonstudentSubjectList);
        students.add(alexWinataStudent);
        students.add(desyOktavianiStudent);
        students.add(jokoDavidsonStudent);
        for (Student student : students) {
            student.printallStudentData();
        }
        Scanner scanner = new Scanner(System.in);
        Integer pilihanMenu = null;
        while (pilihanMenu == null) {
            System.out.println("Pilih nomor menu untuk masuk ke menunya:");
            System.out.println("\t1. Student Information");
            System.out.println("\t2. Back to Main Menu");
            System.out.println("\t3. Exit Application");
            System.out.println("Pilihan (1/2/3):");

            try {
                pilihanMenu = scanner.nextInt();
            } catch (Exception exception) {
                throw new Exception("Pilihan Salah, silahkan pilih angka 1 - 3");
            }

            switch (pilihanMenu) {
                case 1:
                    System.out.print("Masukkan nomor NIM Mahasiswa yang ingin Anda lihat informasinya: ");
                    String inputNIMMahasiswa = scanner.next();

                    boolean found = false;
                    for (Student student : students) {
                        if (student.getNim().equals(inputNIMMahasiswa)) {
                            student.printStudentInformation();
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Tutor dengan NIK " + inputNIMMahasiswa + " tidak ditemukan.");
                    }else {
                        pilihanMenu = null;
                    }
                    break;
                case 2:
                    mainMenu();
                    break;
                case 3:
                    System.out.println("Good Bye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan Salah, silahkan pilih angka 1 - 3");
                    break;
            }

        }
    }

    public static void getAllTutorData() throws Exception {
        Subject subjectOop = new Subject("Object Oriented Programming", "Programming", 20);
        Subject subjectDataStructure = new Subject("Data Structure", "Programming", 30);
        Subject subjectNetworkingFundamental = new Subject("Networking Fundamental", "Networking", 20);
        Subject subjectDatabaseFundamental = new Subject("Database Fundamental", "Programming", 30);
        Subject subjectProjectManagement = new Subject("Project Management Professional", "Management and Analysis", 40);
        Subject subjectUml = new Subject("Unified Modelling Language", "Management and Analysis", 20);
        Subject subjectJavaFundamental = new Subject("Java Fundamental", "Programming", 30);
        Subject subjectInfrastructureDesign = new Subject("Infrastructure Design", "Networking", 30);
        Subject subjectNetworkAndSecurity = new Subject("Network and Security", "Networking", 20);

        List<Tutor> tutors = new ArrayList<>();
        Tutor antikHayaTutor = new Tutor("T701", 6_500_000.0,
                LocalDate.of(2016, 3, 8),
                "Antik", "Haya",
                LocalDate.of(1988, 11, 12),
                "Jakarta", "Perempuan",
                "312008912111988002", "Islam", "A");
        List<TutorSubject> antikHayaTutorSubjectList = new ArrayList<>();
        TutorSubject antikHayaTutorSubjectId = new TutorSubject(subjectInfrastructureDesign, antikHayaTutor);
        TutorSubject antikHayaTutorSubjectNs = new TutorSubject(subjectNetworkAndSecurity, antikHayaTutor);
        antikHayaTutorSubjectList.add(antikHayaTutorSubjectNs);
        antikHayaTutorSubjectList.add(antikHayaTutorSubjectId);
        antikHayaTutor.setTutorSubjectList(antikHayaTutorSubjectList);

        Tutor cahyaSubrotoTutor = new Tutor("T808", 8_800_000.0,
                LocalDate.of(2016, 4, 4),
                "Cahya", "Subroto",
                LocalDate.of(1989, 1, 7),
                "Surabaya", "Laki-Laki",
                "312008912111988002", "Islam", "B");
        List<TutorSubject> cahyaSubrotoTutorSubjectList = new ArrayList<>();
        TutorSubject cahyaSubrotoTutorSubjectOop = new TutorSubject(subjectOop, cahyaSubrotoTutor);
        TutorSubject cahyaSubrotoTutorSubjectJf = new TutorSubject(subjectJavaFundamental, antikHayaTutor);
        TutorSubject cahyaSubrotoTutorSubjectDf = new TutorSubject(subjectDatabaseFundamental, antikHayaTutor);
        cahyaSubrotoTutorSubjectList.add(cahyaSubrotoTutorSubjectDf);
        cahyaSubrotoTutorSubjectList.add(cahyaSubrotoTutorSubjectJf);
        cahyaSubrotoTutorSubjectList.add(cahyaSubrotoTutorSubjectOop);
        cahyaSubrotoTutor.setTutorSubjectList(cahyaSubrotoTutorSubjectList);

        tutors.add(antikHayaTutor);
        tutors.add(cahyaSubrotoTutor);

        for (Tutor tutor : tutors) {
            tutor.printAllDosenData();
        }
        Scanner scanner = new Scanner(System.in);
        Integer pilihanMenu = null;
        while (pilihanMenu == null) {
            System.out.println("Pilih nomor menu untuk masuk ke menunya:");
            System.out.println("1. Tutor Information");
            System.out.println("2. Back to Main Menu");
            System.out.println("3. Exit Application");
            System.out.println("Pilihan (1/2/3):");
            try {
                pilihanMenu = scanner.nextInt();
            } catch (Exception exception) {
                throw new Exception("Pilihan Salah, silahkan pilih angka 1 - 3");
            }
            switch (pilihanMenu) {
                case 1:
                    String nik = null;
                    while (nik == null) {
                        System.out.print("Masukkan nomor NIK tutor yang ingin Anda lihat informasinya: ");
                        String inputNIKTutor = scanner.next();
                        try {
                            nik = scanner.nextLine();
                        }catch (Exception e) {
                            throw new Exception("inputan salah");
                        }
                        boolean found = false;
                        for (Tutor dataDosen : tutors) {
                            if (dataDosen.getNik().equals(inputNIKTutor)) {
                                dataDosen.printTutorInformation();
                                found = true;
                                break;
                            }
                        }
                        if (!found) {
                            throw new Exception("Tutor dengan NIK " + inputNIKTutor + " tidak ditemukan.");
                        }else {
                            pilihanMenu = null;
                        }
                    }
                    break;
                case 2:
                    mainMenu();
                    break;
                case 3:
                    System.out.println("Good Bye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan Salah, silahkan pilih angka 1 - 3");
                    break;
            }
        }
    }

    public static void universityInfo() {
        System.out.println("About this University");
        System.out.println("Nama Universitas: Unicorn (University of Cornelius)");
        System.out.println("Didirikan sejak: 12 December 1978");
        System.out.println("Lokasi: Amerika Serikat, Southern State, Texas");
    }
}