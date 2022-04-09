public class PC {
    private Motherboard motherboard;
    private Case theCase;
    private Monitor monitor;

    public PC(Motherboard motherboard, Case theCase, Monitor monitor) {
        this.motherboard = motherboard;
        this.theCase = theCase;
        this.monitor = monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public Case getTheCase() {
        return theCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }
}
