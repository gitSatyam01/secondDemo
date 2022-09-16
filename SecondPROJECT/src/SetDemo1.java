import java.util.HashSet;

public class SetDemo1 {
public static void main(String[] args) {
	HashSet<Integer> set=new HashSet<Integer>();
	set.add(11);
	set.add(22);
	set.add(11);
	set.add(44);
	System.out.println(set);
}
}
