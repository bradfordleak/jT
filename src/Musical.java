public class Musical extends Production {
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

