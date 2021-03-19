package com.example.textquest;

public class Situation_5 extends ISituation {
    String title = "Таможня душит";
    String description = "Россия ужесточила ввоз товаров из Казахстана. Бизнесу крышка";
    String button_text = "Твой бизнес-партнер предложил возить китайские товары через Казахстан, чтобы избегать пошлин, и говорит о 'налаженной схеме'. Рискнешь?";
    int balance_delta = -200;
    Situation_5() {
        super.title = title;
        super.description = description;
        super.balance_delta = balance_delta;
        super.button_text = button_text;
    }

}
