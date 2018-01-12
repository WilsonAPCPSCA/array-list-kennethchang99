import java.util.ArrayList;
public class emperorsNewGrove {
	public static void main(String[] args){
		ArrayList <String> emperorCast = new ArrayList <String> ();
		emperorCast.add("Kuzco");
		emperorCast.add("Pacha");
		emperorCast.add("Yzma");
		emperorCast.add("Kronk");
		emperorCast.set(1, "Yzma");
		emperorCast.remove(2);
		emperorCast.remove(2);
		emperorCast.add("Chaca");
		emperorCast.add("Tipo");
		emperorCast.add("Kronk");
		emperorCast.add("Bucky");
		emperorCast.add("Pacha");
		System.out.print(emperorCast);
	}
}
