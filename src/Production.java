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

