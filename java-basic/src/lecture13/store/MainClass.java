package lecture13.store;
//하위 클래스의 객체를 상위 클래스의 객체로 명시할 수 있음
//전체 클래스의 상위인 Object -> HeadQuaterStore -> StoreNum
//자식 클래스는 부모 타입의 클래스를 따라 갈수 있음 (반대는 안됨)
public class MainClass {
public static void main(String[] args) {
	HeadQuarterStore store1 = new StoreNum1();
	store1.orderBiBimbap();
	store1.orderBonggibap();
	store1.orderBuDaejiige();
	store1.orderKimChijjige();
	store1.orderSunDaeguk();
	System.out.println();
	
	HeadQuarterStore store2 = new StoreNum2();
	store2.orderBiBimbap();
	store2.orderBonggibap();
	store2.orderBuDaejiige();
	store2.orderKimChijjige();
	store2.orderSunDaeguk();
	System.out.println();
	
	HeadQuarterStore store3 = new StoreNum3();
	store3.orderBiBimbap();
	store3.orderBonggibap();
	store3.orderBuDaejiige();
	store3.orderKimChijjige();
	store3.orderSunDaeguk();
	System.out.println();
}
	
	
}
