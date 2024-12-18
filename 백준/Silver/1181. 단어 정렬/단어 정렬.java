import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		String[] arr = new String[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.next();
		}

		Set<String> set = new HashSet<>(Arrays.asList(arr));
		List<String> list = new ArrayList<>(set);

		Collections.sort(list, new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				if (s1.length() != s2.length()) {
					return Integer.compare(s1.length(), s2.length());
				}
				return s1.compareTo(s2);
			}

		});
		for (String s : list) {
			System.out.println(s);
		}
	}
}
