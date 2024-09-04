public class employee {
    private String id;
    private String name;

    public employee() {
    }

    public employee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void work(){
        System.out.println("员工在工作");
    }
}
