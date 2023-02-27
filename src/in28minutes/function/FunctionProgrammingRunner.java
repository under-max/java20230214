package in28minutes.function;

import java.util.List;

public class FunctionProgrammingRunner {
	public static void main(String[] args) {
		List<String> list = List.of("Apple", "Banana", "Cat", "Dog", "Dat");

		List<Integer> list1 = List.of(1, 4, 7, 9);
		List<Integer> list2 = List.of(4, 6, 8, 13, 3, 15);
		
		System.out.println("---------------------------------------");
		list2.stream().forEach(element->System.out.println(element));
		
		System.out.println("---------------------------------------");
		printWithFP(list);
		checkEven(list1);
		checkOdd(list1);
	}

	private static void printBasic(List<String> list) {
		for (String string : list) {
			System.out.println(string);
		}
	}

	private static void printWithFP(List<String> list) {
		list.stream()
				.filter(
						element -> element.endsWith("at"))
				.forEach(
						element -> System.out.println(element));
	}

	private static void checkEven(List<Integer> list1) {
		list1.stream()
				.filter(
						element -> element % 2 == 0)
				.forEach(
						element -> System.out.println("짝수는 = " + element));
	}

	private static void checkOdd(List<Integer> list1) {
		list1.stream()
				.filter(
						element -> element % 2 != 0)
				.forEach(
						element -> System.out.println("홀수는 = " + element));
	}
}
