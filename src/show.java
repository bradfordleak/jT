
public class show {
    public static void main(String args[]) {
        Musical mymusical = new Musical("Brad", "Amy", 100,450,80);
        System.out.println("Paint Budget:" + mymusical.paintBudget);
        System.out.println("Total Budget:" + mymusical.budget());
        System.out.println("Music Budget:" + mymusical.musicBudget);
        System.out.println("Director:" + mymusical.director);
        System.out.println("Musical Director:" + mymusical.musicalDirector);
        System.out.println("Ops Director:" + mymusical.opsDirector);
        mymusical.addRehearsal();
        mymusical.deleteRehearsal();
    }
}


