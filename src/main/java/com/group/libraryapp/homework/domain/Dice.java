package com.group.libraryapp.homework.domain;

public class Dice {

    private int limit; // 숫자 범위
    private int playNumber; // 주사위 던지는 횟수

    public Dice(int limit, int playNumber) {
        this.limit = limit;
        this.playNumber = playNumber;
    }

    public void play() {
        int[] numbers = new int[limit+1];

        for(int i = 0; i < playNumber; i++) {
            numbers[(int) (Math.random() * limit)]++;
        }

        resultPrint(numbers);
    }

    private void resultPrint(int[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            System.out.printf("%d은 %d번 나왔습니다\n", i, numbers[i]);
        }
    }
}
