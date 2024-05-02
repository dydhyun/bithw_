package _01_;

public class Rect {
    public int width;
    public int height;

    public Rect(){
        this.width = 0;
        this.height = 0;
    }

    public Rect(int width, int height){
        this.width = width;
        this.height = height;
    }

    public int round(int width, int height){
        return 2 * width + 2 * height;
    }

    public int area(){
        return width * height;
    }

}
