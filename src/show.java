
class Production {
    public float scenicBudget;
    public float paintBudget;
    private float budget;
    public String director;

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

    public Musical (String director, String musicalDirector, float musicBudget, float scenicBudget, float paintBudget) {
        super(director, scenicBudget,paintBudget);
        this.musicBudget = musicBudget;
        this.musicalDirector = musicalDirector;
    }
}



public class show {
    public static void main(String args[]) {
        Musical mymusical = new Musical("Brad", "Amy", 100,450,80);
        System.out.println("Paint Budget:" + mymusical.paintBudget);
        System.out.println("Total Budget:" + mymusical.budget());
        System.out.println("Music Budget:" + mymusical.musicBudget);
        System.out.println("Director:" + mymusical.director);
        System.out.println("Musical Director:" + mymusical.musicalDirector);
    }
}


