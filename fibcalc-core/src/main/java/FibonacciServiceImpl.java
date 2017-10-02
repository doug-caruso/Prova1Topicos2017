public class FibonacciServiceImpl implements FibonacciService {

	@Override
	public Result fibonacci(int num) {
		int fib = FibonacciCalc.fibonacci(num);
		Result result = new Result(num, fib);
		return result;
	}

}
