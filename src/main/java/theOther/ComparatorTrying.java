package theOther;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Comparator.*;

public class ComparatorTrying {
	public static void main(String[] args) {
		List <String> a = Arrays.asList("C2C", "B3B", "A1A", null);

//出力
	//		System.out.print(a.toString());
	//		a.stream().forEach(System.out::println);
	
		
	//null対象外
		List<String> b = new ArrayList<>();
		a.stream()
			.filter(x -> x != null)
			.forEach(x -> b.add(x));

	//2つ目の要素を用いてソート
		b.sort(comparing(x -> x.substring(1,2)));
		b.forEach(System.out::println);
		
	//3つ目の要素を用いてソート
		b.sort(comparing(x -> x.substring(0,1)));
		b.forEach(System.out::println);
	}
}
