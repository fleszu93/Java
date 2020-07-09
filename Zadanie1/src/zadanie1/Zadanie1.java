package zadanie1;

public class Zadanie1 {
    public static void main(String[] args) {
        Rectangle area = new Rectangle(new Point(0, 0), 600, 500);
        Rectangle camera = new Rectangle(new Point(0, 0), 40, 40);
        
        int direction = 1, count = 0;
        
        while(camera.position.y < area.height)
        {
            while(camera.position.x >= 0 && camera.position.x < area.width)
            {
                System.out.println("(" + camera.position.GetX() + ", " + camera.position.GetY() + ")");
                ++count; // take a photo
                camera.MoveX(camera.width * direction);
            }
            
            direction *= -1;
            camera.MoveX(camera.width * direction);
            camera.MoveY(camera.height);
        }
        
        System.out.println("count " + count);
    }
}

class Point{
    public int x;
    public int y;
    
    public int GetX(){
        return x;
    }
    public int GetY(){
        return y;
    }

    public void SetX(int X)
    {
        this.x = X;
    }
    public void SetY(int Y)
    {
        this.y = Y;
    }

    public Point(){

    }

    public Point(int X, int Y){
        SetX(X);
        SetY(Y);
    }
}

class Rectangle{
    public Point position;
    public int width;
    public int height;

    public Rectangle(Point Position, int Width, int Height)
    {
        this.position = Position;
        this.width = Width;
        this.height = Height;
    }

    public void MoveX(int X)
    {
        position.SetX(position.GetX() + X);
    }

    public void MoveY(int Y)
    {
        position.SetY(position.GetY() + Y);
    }
}