package core;

abstract class RBI{
	abstract public void interest();
	abstract public void HL();
	public void call() {
		System.out.println("call");
	}

	public static void repoRate() {
		System.out.println("repo arate : +-4%");
	}
}
class SBI extends RBI{
	@Override
	public void interest() {
		// TODO Auto-generated method stub
		System.out.println("SBI interest : 5%");
	}
	@Override
	public void HL() {
		// TODO Auto-generated method stub
		System.out.println("SBI HL : 7%");
	}
}
class JAVA extends RBI{
	@Override
	public void interest() {
		// TODO Auto-generated method stub
		System.out.println("JAVA interest : 6%");
	}
	@Override
	public void HL() {
		// TODO Auto-generated method stub
		System.out.println("JAVA HL 8%");
	}
	
}
public class P017_Abstraction {
	public static void main(String[] args) {
		SBI s = new SBI();
		s.interest();
		s.HL();
		JAVA j = new JAVA();
		j.interest();
		j.HL();
		SBI.repoRate();
		JAVA.repoRate();
	}
}
