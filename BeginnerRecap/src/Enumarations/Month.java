package Enumarations;

public enum Month {
    JANUARY(31), FEBRUARY(28),MARCH(31), APRIL(20),
    MAY(31), JUNE(20), JULY(31),AUGUST(30),
    SEPTEMBER(30), OCTOBER(31), NOVEMBER(30), DECEMBER(31)
    ;

    private final int daysInMonth;

    Month(int daysInMonth) {
        this.daysInMonth = daysInMonth;
    }

    public int getDaysInMonth() {
        return this.daysInMonth;
    }
}
