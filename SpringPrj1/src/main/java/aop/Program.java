package aop;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Calculator cal = new NewlecCalculator();
		
		Calculator proxy = (Calculator)Proxy.newProxyInstance(
				cal.getClass().getClassLoader(), 
				cal.getClass().getInterfaces(), 
				new LogPrintHandler(cal));*/
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		Calculator proxy = (Calculator) ctx.getBean("proxy");
		
		System.out.println(proxy.add(3, 4));
		System.out.println(proxy.sub (3, 4));
		System.out.println(proxy.mult(3, 4));
	}

}
