package lecture8.exec;

import lecture8.service.AddrService01;

public class AddrEx_01 {
	
	public static void main(String[] args) {
		
		AddrService01 addrService = new AddrService01();
		addrService.makeAddr(); // 주소록 생성
		addrService.addList(); // 주소록 출력
		
	}

}