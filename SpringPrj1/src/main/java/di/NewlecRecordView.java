package di;

import java.util.Scanner;

public class NewlecRecordView implements RecordView{
	
	private NewlecRecord record;
	
	@Override
	public void setRecord(Record record) {
		// TODO Auto-generated method stub
		this.record = (NewlecRecord)record;
	}
	
	
	@Override
	public void input() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("kor:");
		record.setKor(scan.nextInt());
		System.out.print("eng:");
		record.setEng(scan.nextInt());
		System.out.print("math:");
		record.setMath(scan.nextInt());
	}
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.printf("kor:%d\n", record.getKor());
		System.out.printf("eng:%d\n", record.getEng());
		System.out.printf("math:%d\n", record.getMath());
		System.out.printf("total:%d\n", record.total());
		System.out.printf("avg:%f\n", record.avg());
		
	}


	@Override
	public Record getrRecord() {
		// TODO Auto-generated method stub
		return record;
	}

	
}
