package com.example.javadesignpatterns.example.p16_mediator.a1;

public interface Mediator {
    // Colleague를 생성한다 
    public abstract void createColleagues();

    // Colleage의 상태가 변화했을 때 호출된다
    public abstract void colleagueChanged();
}
