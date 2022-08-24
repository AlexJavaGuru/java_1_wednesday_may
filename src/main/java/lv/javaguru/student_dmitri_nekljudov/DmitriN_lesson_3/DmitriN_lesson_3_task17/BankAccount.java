package lv.javaguru.student_dmitri_nekljudov.DmitriN_lesson_3.DmitriN_lesson_3_task17;

class BankAccount {



        String ownerFirstName;
        String ownerLastName;
        int moneyAmount;


        BankAccount(String ownerFirstName, String ownerLastName , int moneyAmount) {

            this.ownerFirstName = ownerFirstName;
            this.ownerLastName = ownerLastName;
            this.moneyAmount = moneyAmount;
        }

        String getOwnerFirstName() {
            return this.ownerFirstName;
        }

        String getOwnerLastName() {
            return this.ownerLastName;
        }

        public int getMoneyAmount() {
            return this.moneyAmount;
        }

}

