class RuntimeDemo{
	public static void main(String[] args) {
		Runtime r = Runtime.getRuntime();
		r.exec("vim");
	}
}