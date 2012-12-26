package mmain;

public class Mmain {
    public static void main(String[] args) {

float a = 2.0f;
float b = 3.0f;

float Xn = 0.11f;
float Xk = 1.36f;
float dX = 0.05f;
float y;
 for(double x=0.11;x<=1.36;x=(x+0.05)){             
 y=(float) (Math.pow(Math.asin(x),a)+Math.pow(Math.acos(x),b));
            System.out.println("x=" + x + "y=" + y);	
        }	
    }
}

