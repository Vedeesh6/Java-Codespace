public class CW_Bouncingballs {
    public static int bouncingBall(double h, double bounce, double window) {
	    if (h <= 0 || bounce <= 0 || bounce >= 1 || window >= h) {
      	return -1;
      }
			return 2 + bouncingBall(h * bounce, bounce, window);
  }
}
