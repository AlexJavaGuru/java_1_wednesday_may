package main.java.lv.javaguru.student_rodions_pismennijs.lesson_9.level_1;

class JavaStarLoginServiceImpl implements JavaStarLoginService{

    @Override
    public boolean canLogin(String login, String password) {
        return (login != null)
                && login.equals("javastar")
                && (password != null)
                && password.equals("pass");
    }
}
