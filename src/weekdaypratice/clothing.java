package weekdaypratice;

public class clothing {

    private String branName;
    private String color;
    private char size;
    private boolean isItLongSleeve;

    public clothing(String branName, String color, char size, boolean isItLongSleeve) {
        this.branName = branName;
        this.color = color;
        this.size = size;
        this.isItLongSleeve = isItLongSleeve;
    }

    public String getBranName() {
        return branName;
    }

    public void setBranName(String branName) {
        this.branName = branName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }

    public boolean isItLongSleeve() {
        return isItLongSleeve;
    }

    public void setItLongSleeve(boolean itLongSleeve) {
        isItLongSleeve = itLongSleeve;
    }
}
