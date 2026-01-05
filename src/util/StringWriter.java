package util;

public class StringWriter {

	private int delay;
	
	public StringWriter (int delay) {
		this.delay = delay;
	}

	public int getDelay() {
		return delay;
	}

	public void setDelay(int delay) {
		this.delay = delay;
	}
	
	public void write(String txt) {
		try {
			for (int i = 0; i<txt.length(); i++) {
				System.out.print(txt.charAt(i));
				Thread.sleep(delay);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void write(String txt, boolean nextLine) {
		try {
			for (int i = 0; i<txt.length(); i++) {
				System.out.print(txt.charAt(i));
				Thread.sleep(delay);
			}
			if (nextLine) {System.out.println();}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
