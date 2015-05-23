package aop;

import java.lang.reflect.Method;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.util.StopWatch;

public class LogPrintBeforeAdvice implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] arg, Object target)
			throws Throwable {
		// TODO Auto-generated method stub
		Log log = LogFactory.getLog(this.getClass());
		
		log.info("[Method Before]:보조업무 시작");
	}

}
