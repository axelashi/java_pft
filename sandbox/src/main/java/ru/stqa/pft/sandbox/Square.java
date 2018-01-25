package ru.stqa.pft.sandbox;

public class Square {
  public double l;

  public Square(double l) {
    this.l = l; //здесь написать просто l нельзя т.к.будет исп-ся переменная из арг-та ф-и а не атрибут класса
    //что присвоить переданное значение в атрибут объекта надо сослаться на этот объект
  }

  public double area() {
    return this.l * this.l;
  }

}
