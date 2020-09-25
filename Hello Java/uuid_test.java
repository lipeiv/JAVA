import java.util.UUID;

public class uuid_test{
public static void main(String[] args) {

	for(int i=1; i < 5; i++){
	String uuid = UUID.randomUUID().toString();

	System.out.println(uuid);
	}
}

}
