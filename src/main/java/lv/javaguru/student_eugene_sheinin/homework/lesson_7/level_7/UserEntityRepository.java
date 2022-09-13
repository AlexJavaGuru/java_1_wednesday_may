package lv.javaguru.student_eugene_sheinin.homework.lesson_7.level_7;

class UserEntityRepository {
    UserEntity[] users;

    public void addUser(UserEntity user) {
        if (this.users != null
                && !this.isPersonalCodeExists(user.getPersonalCode())
                && !user.getPersonalCode().isEmpty()
        ) {
            UserEntity[] oldUsersList = this.users;
            this.users = getNewUsersList();
            fillNewUsersList(oldUsersList);
            user.setId(oldUsersList[oldUsersList.length - 1].getId() + 1);
        } else {
            this.users = new UserEntity[1];
            user.setId(1);
        }

        this.users[this.users.length - 1] = user;
    }

    private void fillNewUsersList(UserEntity[] oldUsersList) {
        for (int i = 0; i < oldUsersList.length; i++) {
            this.users[i] = oldUsersList[i];
        }
    }

    private UserEntity[] getNewUsersList() {

        return new UserEntity[this.users.length + 1];
    }

    public UserEntity getUserById(int id) {
        for (int i = 0; i < this.users.length; i++) {
            //System.out.println(this.users[i]);
            if (this.users[i].getId() == id) {
                return this.users[i];
            }
        }

        return null;
    }

    public UserEntity getUserByName(String name) {
        for (int i = 0; i < this.users.length; i++) {
            if (this.users[i].getName().equals(name)) {
                return this.users[i];
            }
        }

        return null;
    }

    public void updateUser(UserEntity user) {
        for (int i = 0; i < this.users.length; i++) {
            if (user.getId() > 0 && this.users[i].getId() == user.getId()) {
                this.users[i].setName(user.getName());
                this.users[i].setSurname(user.getSurname());

                if (
                        !this.isPersonalCodeExists(user.getPersonalCode()) &&
                                !user.getPersonalCode().isEmpty()
                ) {
                    this.users[i].setPersonalCode(user.getPersonalCode());
                }
            }
        }
    }

    private boolean isPersonalCodeExists(String personalCode) {
        for (int i = 0; i < this.users.length; i++) {
            if (this.users[i].getPersonalCode().equals(personalCode)) {
                System.out.println(personalCode);
                return true;
            }
        }

        return false;
    }
}
