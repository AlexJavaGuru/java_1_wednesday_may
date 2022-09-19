package lv.javaguru.student_artjomsb_homework.lesson_9_interfaces.homework.level_4_junior;

@FunctionalInterface
interface TemperatureConverter {

    double convert(double celsiusTemperature);

    default double getCelsius(double celsiusTemperature) {
        return celsiusTemperature;
    }

}
//я как увидел сразу подумал, что это должен быть функ.интерфейс. То что я убрал класс с цельсиями и добавил сюда этот метод, такое можно делать или не очень?