public class EquipementOffensif {
    private int attackLevel;
    private String name;
    private String type;

    public EquipementOffensif(String type) {
        switch (type) {
            case "warrior":
                this.name = "excalibur";
                this.type = "weapon";
                break;
            case "magician":
                this.name = "fireball";
                this.type = "spell";
                break;
            default:
                this.name = "hand";
                this.type = "natural";
        }
    }
}