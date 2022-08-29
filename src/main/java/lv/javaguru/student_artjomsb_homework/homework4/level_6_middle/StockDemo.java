package lv.javaguru.student_artjomsb_homework.homework4.level_6_middle;

 class StockDemo {

     public static void main(String[] args) {
         Stock google = new Stock("Google", 10);
         System.out.println(google.getPriceInformation());
         google.setCurrentPrice(53);
         google.setCurrentPrice(12);
         google.setCurrentPrice(143);
         google.setCurrentPrice(3);
         google.setCurrentPrice(97);
         System.out.println(google.getPriceInformation());

         Stock amd = new Stock("AMD", 103);
         System.out.println(amd.getPriceInformation());
         amd.setCurrentPrice(98);
         amd.setCurrentPrice(54);
         amd.setCurrentPrice(109);
         amd.setCurrentPrice(71);
         amd.setCurrentPrice(102);
         System.out.println(amd.getPriceInformation());

     }
 }
