package aop;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StopWatch;

public class NewlecCalculator implements Calculator{

	@Override
	public int add(int x, int y) {
		/*Log log = LogFactory.getLog(this.getClass());
		
		StopWatch sw = new StopWatch();
		sw.start();
		log.info("타이머 시작");*/
		if(x > 100)
			throw new IllegalArgumentException("100보다 큰 인자를 전달한 예외");
			
		int sum = x+y;
		
		/*sw.stop();
		log.info("타이머 정지");
		log.info("[TIMERLOG]Method : add");
		log.info("[TIMERLOG]Process Time : " + sw.getTotalTimeMillis());*/
		
		return sum;
	}

	@Override
	public int sub(int x, int y) {
		// TODO Auto-generated method stub
		return x-y;
	}

	@Override
	public int mult(int x, int y) {
		// TODO Auto-generated method stub
		return x*y;
	}

	@Override
	public int div(int x, int y) {
		// TODO Auto-generated method stub
		return x/y;
	}

}
