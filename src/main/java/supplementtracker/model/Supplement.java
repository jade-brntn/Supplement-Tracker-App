
public class Supplement {
    private String name;
    private String type;
    private int dosage;

    public Supplement(String name, String type, int dosage) {
        this.name = name;
        this.type = type;
        this.dosage = dosage;
    }

    // Getters and setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public int getDosage() { return dosage; }
    public void setDosage(int dosage) { this.dosage = dosage; }
}
