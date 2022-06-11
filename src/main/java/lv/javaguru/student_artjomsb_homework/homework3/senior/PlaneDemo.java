package main.java.lv.javaguru.student_artjomsb_homework.homework3.senior;

class PlaneDemo {
    public static void main(String[] args) {
        Plane boeing = new Plane("raketa", "Riga", false );
        boeing.planeInfo();
        boeing.travel("Berlin");
        boeing.planeInfo();
        boeing.getLocation();
        boeing.finishTravel();
    }
}
