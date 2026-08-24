package app;
import java.util.Scanner;

import account.Account;
import account.AccountmemDAO;

public class changgeunConsolebank01 {

	public static String[]startMenu = {"0.종료", "1.계좌등록","2.계좌조회","3.입금", "4.출금"};
	static Scanner sc = new Scanner(System.in);
	static AccountmemDAO accountDao = new AccountmemDAO();
	
	public static void main(String[] args) {
		welcomeMessage();
		startBankMenu();
		sayGoodbye();	
	}
	
		

	private static void startBankMenu() {
		
		while (true) {
			int menu = getMenu(startMenu);
			switch (menu) {
			case 1: // 계좌등록
				menuAccountRegist();
				break;
			case 2: // 계좌조회
				menuAccountList();
				break;
			case 3: // 입금
				menuDeposit();
				break;
			case 4: // 인출
				menuWithdraw();
				break;
			case 0: //종료
				return;
			default:  // 없는 메뉴
				System.out.println("없는 메뉴입니다.");
			}
		}
	}



	private static void menuAccountRegist() {
		System.out.print("[계좌 등록]");
		System.out.print("계좌 주 :");
		String owner = sc.nextLine();
		System.out.print("비밀번호 : ");
		String password = sc.nextLine();
		System.out.print("초기입금액 : ");
		int amount = Integer.parseInt(sc.nextLine());
		}
	
	private static void menuAccountList() {
		System.out.print("계좌조회");
		showAccountList();
		
	}
	
	private static void showAccountList() {
		Account[] accountList = accountDao.selectAll();
		for (int i = 0; i < accountList.length; i++) {
			System.out.println(accountList[i]);
		}
		
	}

	private static void menuDeposit() {
		System.out.print("입금");
		showAccountList();
		System.out.print("계좌번호 : ");
		int accountNo = sc.nextInt();
		System.out.print("입금액 : ");
		int amount = sc.nextInt();
		sc.nextLine();
		
		// Dao에게 입금요청
		if (accountDao.deposit(accountNo, amount)) {
			System.out.println("입금하였습니다.");
		} else {
			System.out.println("입금할 수 없습니다.");
		}
		
	}
	
	private static void menuWithdraw() {
		// TODO Auto-generated method stub
		
	}
	private static int getMenu(String[] menuList) {
		// 메뉴출력
		System.out.println("=============================");
		for (int i = 1; i<menuList.length; i++) {
			System.out.println(menuList[i]);
		}
		System.out.println(menuList[0]); 
		System.out.println("=============================");
		// 메뉴 선택
		System.out.print(">> 메뉴 선택 :");
		int menu = sc.nextInt();
		sc.nextLine(); //남아있는 \n 삭제하기 위해 사용
		return menu;
	}
	private static void welcomeMessage() {
		System.out.println("Chang geun Console Bank에 오신것을 환영합니다.");
	}
	private static void sayGoodbye() {
		System.out.println("Chang geun Console Bank를 이용해 주셔서 감사합니다.");
		
	}
	
}
	

		
	


