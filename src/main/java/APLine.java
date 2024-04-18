public class APLine
{
  /* your code here */
  private int a, b, c;
  public APLine(int a, int b, int c) {
    a = a;
    b = b;
    c = c;
  }
  public double getSlope() {
    return - a / b;
  }
  public boolean isOnline(int x, int y) {
    return a * x + b * y + c == 0;
  }
}
