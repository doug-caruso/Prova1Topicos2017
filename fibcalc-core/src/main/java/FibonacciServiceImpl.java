public class FibonacciServiceImpl implements FibonacciService {

	@Override
	public Result fibonacci(int num) {
		int result = FibonacciCalc.fibonacci(num);
		return new Result().withNum(num).withResult(result);
	}

}
