public class APLine
{
  /* your code here */
  private int a, b, c;
  public APLine(int a, int b, int c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }
  public double getSlope() {
    return ( - ( a / (double) b ));
  }
  public boolean isOnline(int x, int y) {
    if ((this.a * x) + (this.b * y) + this.c == 0)
      return true;
    else return false;
  }
}
