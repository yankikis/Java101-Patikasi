package Metotlar.OgrenciBilgiSistemi;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca", "MAT", "123");
        Teacher t2 = new Teacher("Fatma Ayşe", "FZK", "234");
        Teacher t3 = new Teacher("Ali Veli", "BIO", "345");

        Course matematik = new Course("Matematik", "MAT101", "MAT");
        matematik.addTeacher(t1);
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        fizik.addTeacher(t2);
        Course kimya = new Course("Kimya", "KMY101", "KMY");
        kimya.addTeacher(t3);


        Student s1 = new Student("İnek Şaban", "123", "4", matematik, fizik, kimya);
        s1.addBulkExamNote(50,20,40);
        s1.addPerformanceNote(0,0,0);
        s1.isPass();
        Student s2 = new Student("Güdük Necmi", "456", "4", matematik, fizik, kimya);
        s2.addBulkExamNote(100, 50, 40);
        s2.addPerformanceNote(0,0,0);
        s2.isPass();
        Student s3 = new Student("Hayta İsmail", "789", "4", matematik, fizik, kimya);
        s3.addBulkExamNote(50, 20 ,40);
        s3.addPerformanceNote(0,0,0 );
        s3.isPass();
    }
}
