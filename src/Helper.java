import java.util.ArrayList;
import java.util.List;

public class Helper {
	
	public List<Account> init() {
		List<Account> list = new ArrayList<>();
		list.add(new Account("Taarun","TAA","1234",1000));
		list.add(new Account("Arun","ARUN","5678",2000));
		list.add(new Account("Justin","JTR","0987",100000));
		list.add(new Account("Sowbagya","SOW","1234",900000));
		return list;
	}

}
