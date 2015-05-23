package di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Program {

	public static void main(String[] args) {
		/*Record record = new NewlecRecord();
		RecordView view = new NewlecRecordView();
		
		view.setRecord(record);*/
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		/*RecordView view = (RecordView) ctx.getBean("view");*/
		Record r = (Record)ctx.getBean("r3");
		//NewlecRecord r = (NewlecRecord) ctx.getBean("r3");
		
		RecordView v = (RecordView) ctx.getBean("view");
		v.setRecord(r);
		v.print();
	}
}
