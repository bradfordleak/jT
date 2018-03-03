public class Production implements Theatre {
    public float scenicBudget;
    public float paintBudget;
    private float budget;
    public String director;

    public String addRehearsal() {
        System.out.println("Rehearsal Added");
        return "Rehearsal Added";

    }

    public void deleteRehearsal() {
        System.out.println("Rehearsal Deleted");
    }

    public Production (String director, float scenicBudget, float paintBudget) {
        this.director = director;
        this.scenicBudget = scenicBudget;
        this.paintBudget = paintBudget;
        this.budget = this.scenicBudget + this.paintBudget;
    }

    public float budget() {
        return budget;
    }


}
class Musical extends Production {
    public float musicBudget;
    public String musicalDirector;

    public String addRehearsal() {
        System.out.println("Adding rehearsal to calendar");
        return "Adding rehearsal to calendar";
    }

    public Musical (String director, String musicalDirector, float musicBudget, float scenicBudget, float paintBudget) {
        super(director, scenicBudget,paintBudget);
        this.musicBudget = musicBudget;
        this.musicalDirector = musicalDirector;
    }
}

