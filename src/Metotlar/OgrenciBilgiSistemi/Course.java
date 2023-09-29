package Metotlar.OgrenciBilgiSistemi;

public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int note;
    int performanceNote;

    Course(String name, String code, String prefix){
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int note;
        int performanceNote;
    }

    void addTeacher(Teacher teacher){
        if (this.prefix.equals(teacher.branch)){
            this.teacher = teacher;
        }
        else{
            System.out.println("Öğretmen ve ders bölümü uyuşmuyor !");
        }
    }

    void printTeacherInfo(){
        if (teacher != null){
            System.out.println(this.name + " dersin öğretmeni: "+ this.teacher);
        }
        else {
            System.out.println(this.name + " dersin öğretmeni atanmamış.");
        }
    }
}
