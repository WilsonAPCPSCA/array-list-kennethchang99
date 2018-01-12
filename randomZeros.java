import java.util.ArrayList;
public class randomZeros {
	public static void main(String[] args){
		ArrayList <Integer> numsRandom = new ArrayList <Integer> ();
		for (int i = 0; i < 10; i++){
			numsRandom.add((int)(Math.random() * 100 + 1));
		}
		System.out.println("Initial Array: " + numsRandom);
		for(int i = 0; i < numsRandom.size(); i++){
			numsRandom.set(i, 0);
		}
		System.out.println("Zero Array: " + numsRandom);
	}
}
