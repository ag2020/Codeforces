import java.util.Scanner;
public class ProblemThree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double R = sc.nextInt();
		double flatx = sc.nextInt();
		double flaty = sc.nextInt();
		double fafax = sc.nextInt();
		double fafay = sc.nextInt();
		if (((fafax - flatx) * (fafax - flatx)) + ((fafay - flaty) * (fafay - flaty)) >= R * R) {
			System.out.println(flatx + " " + flaty + " " + R);
		} else {
			double px = 0, py = 0;
			if (flatx == fafax) {
				px = flatx;
				if (fafay < flaty) {
					py = flaty + R;
				} else {
					py = flaty - R;
				}
			} else {
				double ang = Math.atan((flaty - fafay) / (flatx - fafax));
				
				if (fafax < flatx && fafay < flaty) {
					px = flatx + (R * Math.cos(ang));
					py = flaty + (R * Math.sin(ang));
				} else if (fafax > flatx && fafay < flaty) {
					px = flatx - (R * Math.cos(ang));
					py = flaty - (R * Math.sin(ang));
				} else if (fafax < flatx && fafay >= flaty) {
					px = flatx + (R * Math.cos(ang));
					py = flaty + (R * Math.sin(ang));
				} else {
					px = flatx - (R * Math.cos(ang));
					py = flaty - (R * Math.sin(ang));
				}
			}
			System.out.print(((fafax + px) / 2) + " " + ((fafay + py) / 2) + " ");
			System.out.println(Math.sqrt(((px - fafax) * (px - fafax)) + ((py - fafay) * (py - fafay))) / 2);
		}
	}
}
