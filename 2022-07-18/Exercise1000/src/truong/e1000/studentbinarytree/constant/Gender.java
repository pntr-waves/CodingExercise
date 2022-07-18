package truong.e1000.studentbinarytree.constant;

public enum Gender {
    MALE("male", 1), FEMALE("female", 2), MIX("mix", 0);

    private String title;
    private int value;

    
    Gender (String title, int value) {
        this.setTitle(title);
        this.setValue(value);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
