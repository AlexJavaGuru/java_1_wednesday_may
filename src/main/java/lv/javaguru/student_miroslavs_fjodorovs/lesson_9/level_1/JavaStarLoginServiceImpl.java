package main.java.lv.javaguru.student_miroslavs_fjodorovs.lesson_9.level_1;

import main.java.lv.javaguru.student_miroslavs_fjodorovs.lesson_9.level_1.JavaStarLoginService;

class JavaStarLoginServiceImpl implements JavaStarLoginService {

    @Override
    public boolean canLogin(String login, String password) {
        return (login != null)
                && login.equals("javastar")
                && (password != null)
                && password.equals("pass");
    }
}
