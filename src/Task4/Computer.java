package Task4;

public class Computer {
    private String[] data = new String[5];

    public Computer (String userName, int i){
        this.data[i] = userName;
    }

    public void showCumputer(int i){
        System.out.println(data[i]);
    }
}
