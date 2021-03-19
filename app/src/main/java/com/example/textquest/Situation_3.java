package com.example.textquest;

public class Situation_3 extends ISituation {
    String title = "Акции Tesla в огне!";
    String description = "Инвесторы со всего мира вкладывают в Tesla и делают предзаказы нового автомобиля. Сделка удалась!";
    String button_text = "Илон Маск только что анонсировал Cybertrack. Время вкладывать в Tesla? На раздумья 5 секунд";
    int balance_delta = +200;
    Situation_3() {
        super.title = title;
        super.description = description;
        super.balance_delta = balance_delta;
        super.button_text = button_text;
    }
}