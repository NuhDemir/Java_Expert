package ch006.iinterfaces.interfacesdemo;

public class OutsourceWorker implements IAdvancedWorkable, IWorkable {
    private String name;
    private String position;

    public OutsourceWorker(String name, String position) {
        this.name = name;
        this.position = position;

    }

    @Override
    public void manage() {
        System.out.println(name + " is managing tasks.");
    }

    @Override
    public void report() {
        System.out.println(name + " is preparing reports.");
    }

    @Override
    public void work() {
        System.out.println(name + " is working as a " + position);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
