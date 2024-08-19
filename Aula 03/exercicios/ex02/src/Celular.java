public class Celular {
    public String model;
    public String mark;
    public int battery = 100;
    public boolean on = false;

    public Celular(String model, String mark){
        this.model = model;
        this.mark = mark;
    }

    public void switchOn() {
        on = !on;
    }

    public void action() {
        if (!on) return;
        if (battery <= 0) return;
        battery--;
        System.out.println("Ação feita!\nBateria: " + battery);
    }

}
