package com.example.textquest;

public class Situation_2 extends ISituation {
    String title = "Алькоины выстрелили";
    String description = "Альткоины полетели вверх вслед за Биткоином. Некоторые из них оказались на 300% процентов выше чем неделю назад, в том числе Scam";
    String button_text = "Ваш знакомый отыскал никому неизвестный альткоин Scam. Купите пару сотен, быть может, вырастут в цене";
    int balance_delta = +250;
    Situation_2() {
        super.title = title;
        super.description = description;
        super.balance_delta = balance_delta;
        super.button_text = button_text;
    }

}
