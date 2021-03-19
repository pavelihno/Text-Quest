package com.example.textquest;

public class Start extends ISituation{
    String title = "Начало";
    String description = "Добро пожаловать на рынок ценных бумаг. На ваш баланс положена начальная сумма средств. Постарайтесь увеличить баланс или потеряйте его";

    Start() {
        super.title = title;
        super.description = description;
    }
}
