package com.example.textquest;

public class Situation_1 extends ISituation {
    String title = "Госдеп достал";
    String description = "О нет. Сделка по газопроводу сорвалась из-за санкций США. Кто говорил, что Трамп наш?";
    String button_text = "Вложитесь в бумаги Газпрома. Надвигающаяся сделка по новому газопроводу в Европу сулит кратковременное увеличение акций";
    int balance_delta = -200;
    Situation_1() {
        super.title = title;
        super.description = description;
        super.balance_delta = balance_delta;
        super.button_text = button_text;
    }

}
