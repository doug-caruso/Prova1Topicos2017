
public class Result {
	private int num;
	private int result;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public Result withNum(int num) {
		this.num = num;
		return this;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	public Result withResult(int result) {
		this.result = result;
		return this;
	}
}
