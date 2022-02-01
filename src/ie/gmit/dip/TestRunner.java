package ie.gmit.dip;

public class TestRunner {
	private StudentManager sm = new StudentManager();

	public void test() {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			sm.add(new Student("G00" + i));
		}
		System.out.println("[INFO] " + sm.size() + " Students on file");
		System.out.println("[INFO] Time (ms):" + (System.currentTimeMillis() - start));
	}

	public static void main(String[] args) {
		new TestRunner().test();
	}

}
