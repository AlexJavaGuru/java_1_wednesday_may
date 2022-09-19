package lv.javaguru.student_daniels_demishins.lesson_3.lvl_7;

public class Bottle {
    String label;
    String material;
    double size;

    Bottle(String label, String material, double size) {
        this.label = label;
        this.material = material;
        this.size = size;
    }
    void open(){
            System.out.println("Opened....");
    }
    String getLabel(){

        return this.label;
    }
    String getMaterial(){
        return this.material;
    }
    double getSize(){
        return this.size;
    }
    void close(){
        System.out.println("Closing...");
    }

}
