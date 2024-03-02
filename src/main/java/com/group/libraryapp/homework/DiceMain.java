package com.group.libraryapp.homework;

import com.group.libraryapp.homework.domain.Dice;

import java.util.Scanner;

public class DiceMain {

    public static void main(String[] args) {

        int playNumber = getPlayNumber();

        Dice dice = new Dice(12, playNumber);

        dice.play();
    }

    public static int getPlayNumber() {
        System.out.print("숫자를 입력하세요 : ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

}
