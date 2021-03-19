package com.example.textquest;

public class Situation_6 extends ISituation {
    String title = "Застройщик обманул";
    String description = "Ваш знакомый собрал средства для постройки первых домов и исчез в неизвестном направлении. Строительство окончено";
    String button_text = "Знакомый застройщик предложил вложиться в строительство элитного поселка на Новорижском шоссе. Условия приемлемые. Вложишься?";
    int balance_delta = -900;
    Situation_6() {
        super.title = title;
        super.description = description;
        super.balance_delta = balance_delta;
        super.button_text = button_text;
    }

}
