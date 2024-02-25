package org.example.model;

public class Answer {
    private int cowCounter;
    private int bullCounter;
    private Integer tryCount;

    public Answer(int cowCounter, int bullCounter, Integer tryCount) {
        this.cowCounter = cowCounter;
        this.bullCounter = bullCounter;
        this.tryCount = tryCount;
    }

    public String toString() {
        return this.cowCounter + " cows " + this.bullCounter + " bulls , " + this.tryCount + " tries left";
    }
}
