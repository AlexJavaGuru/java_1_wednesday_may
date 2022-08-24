package lv.javaguru.student_artjomsb_homework.lesson_8.homework.level_7_senior.task_31;

class LibraryUserRepository implements LibraryInterface {
    private User[] users;

    private int userId;


    void saveUser(User user) {
        //сохраняем пользователя и присваевыем ему айди
    }

    boolean isNumberUnique() {
        //проверка номера телефона , 1 юзер - 1 телефон
        return true;

    }

    void reminderAboutBook() {
        //"Нампример каждый день в 12:00 метод проверяет у кого через неделю сдача книги и отправляет смс"
    }

    public User[] getUsers() {
        return users;
    }

    @Override
    public void orderBook(String bookInfo) {
        //делает заказ книги у пользователя
    }

    @Override
    public void takeBook(Book book, User user) {
        //пользователь становится "пользоватетелем с книгой" и переписывается в репозитории
    }

    @Override
    public void returnBook(Book book) {
//пользователь возращает книгу и его статут меняется, также по сути нужны методы на проверку вовремя ли сдана, подсчёт штрафа и также обновляем статус книги
    }

    @Override
    public void editData(int dataToChange) {
//меню где можно выбрать опцию для смены данных пользователя
    }

    @Override
    public void findInfoByID(int id) {
//информация по ID
    }
}
