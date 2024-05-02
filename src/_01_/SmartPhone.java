package _01_;

public class SmartPhone{
    public String userName;
    public String color;
    public int price;

    public boolean turnDisplay(boolean currentDisplay){
       return !currentDisplay;
    }

    public int volumUp(int volum){
        return volum++;
    }

    public void phoneInfo(){
        System.out.println("User Name: " + userName);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
    }

}
