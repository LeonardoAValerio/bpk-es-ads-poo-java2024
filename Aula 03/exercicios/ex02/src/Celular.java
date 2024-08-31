public class Celular {
    private String model;
    private String mark;
    private Integer battery = 100;
    private boolean on = false;

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

    public String getModel() {
        return model;
    }

    public String getMark() {
        return mark;
    }

    public Integer getBattery() {
        return battery;
    }

    public void setModel(String model) {
        if(model == null) return;
        if(model == "") return;
        this.model = model;
    }

    public void setMark(String mark) {
        if(mark == null) return;
        if(mark == "") return;
        this.mark = mark;
    }

    public void setBattery(Integer battery) {
        if(battery < 0 || battery > 100) return;
        this.battery = battery;
    }
}
