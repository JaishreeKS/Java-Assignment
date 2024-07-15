import java.util.Scanner;
public class VolumeOfSphere{
	static void sphereVolume(int radius){
		double volume = ((4.0/3.0) * 3.14 * radius * radius * radius);
		System.out.println("Volume of sphere is: " + volume);
		}

public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	int radius = scanner.nextInt();
	
	sphereVolume(radius);
	}
} 