package aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.StopWatch;

public class LogPrintAroundAdvice implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation method) throws Throwable {
		// TODO Auto-generated method stub
		
		Log log = LogFactory.getLog(this.getClass());
		
		StopWatch sw = new StopWatch();
		sw.start();
		log.info("타이머 시작");
		
		Object result = method.proceed();
		
		sw.stop();
		log.info("타이머 정지");
		log.info("[TIMERLOG]Method : add");
		log.info("[TIMERLOG]Process Time : " + sw.getTotalTimeMillis());
		
		return result;
	}

}
