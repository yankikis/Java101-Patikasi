package Metotlar.OgrenciBilgiSistemi;

public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double average;
    boolean isPass;

    Student( String name, String stuNo, String classes, Course c1, Course c2, Course c3){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        calcAverage();
        this.isPass = false;

    }

    void addBulkExamNote(int note1, int note2, int note3){
        if (note1 >= 0 && note1 <= 100 ){
            this.c1.note = note1;
        }
        if (note2 >= 0 && note2 <= 100 ){
            this.c2.note = note2;
        }
        if (note3 >= 0 && note3 <= 100 ){
            this.c3.note = note3;
        }

    }
    void addPerformanceNote(int perfNote1, int perfNote2, int perfNote3){
        if (perfNote1 >= 0 && perfNote1 <= 100 ){
            this.c1.performanceNote = perfNote1;
        }
        if (perfNote2 >= 0 && perfNote2 <= 100 ){
            this.c2.performanceNote = perfNote2;
        }
        if (perfNote3 >= 0 && perfNote3 <= 100 ){
            this.c3.performanceNote = perfNote3;
        }
    }
    void calcAverage(){
        double c1grade = (this.c1.note * 0.8) + (this.c1.performanceNote * 0.2);
        double c2grade = (this.c2.note * 0.8) + (this.c2.performanceNote * 0.2);
        double c3grade = (this.c3.note * 0.8) + (this.c3.performanceNote * 0.2);
        this.average = (c1grade + c2grade + c3grade) / 3.0;
    }
    void isPass(){
        this.isPass = isCheckPass();
        printNote();
        System.out.println("Ortalama: "+ this.average);
        if (this.isPass){
            System.out.println("Sınıfı geçti !");
        }
        else {
            System.out.println("Sınıfta kaldı !");
        }
    }
    boolean isCheckPass(){
        calcAverage();
        return this.average > 55;
    }

    void printNote(){
        System.out.println("=====================");
        System.out.println("Öğrenci: "+ this.name);
        System.out.println(this.c1.name + " Notu: " + this.c1.note);
        System.out.println(this.c2.name + " Notu: " + this.c2.note);
        System.out.println(this.c3.name + " Notu: " + this.c3.note);
    }

}
