package Enumerations;

enum Color {
    //Enums are used to save constant data (data that never changes) e.g. days of the week
    RED("red"), GREEN("green"), BLUE("blue");

    private String value;

    Color(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
