package com.example.textquest;

public class ISituation {
    String title;
    String description;
    String button_text;
    int balance_delta;
    ISituation() {}

    String getTitle() {
        return (title);
    };
    String  getDescription() {
        return (description);
    }
    void changeBalance() {
        History history = History.getInstance();
        history.balance += balance_delta;
    }
}
