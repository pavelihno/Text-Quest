package com.example.textquest;

public class Situation_4 extends ISituation {
    String title = "Реддит vs ВоллСтрит";
    String description = "Победа! Несколько крупных игроков на понижение разорилось, акционеры считают прибыль";
    String button_text = "Ребята на Реддите решили обрушить парочку хэдж-фондов. Для этог они скупают акции умирающей Gamestop. Ты в деле?";
    int balance_delta = +150;
    Situation_4() {
        super.title = title;
        super.description = description;
        super.balance_delta = balance_delta;
        super.button_text = button_text;
    }

}
