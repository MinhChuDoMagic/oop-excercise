package bai13.view;

public enum MenuValue {
    ADD(1),
    UPDATE(2),
    DELETE(3),
    DISPLAY_ALL(4),
    DISPLAY_TYPE(5),
    EXIT(0)
    ;
    private int value;

    MenuValue(int value) {
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}
