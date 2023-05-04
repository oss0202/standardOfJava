import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import lombok.extern.slf4j.Slf4j;

/**
 * @author : 221213
 * @date : 2023. 03. 14
 */
public class ThreadTest {
	public static void main(String[] args) {
		ScheduledExecutorService service = Executors.newScheduledThreadPool(1);

		System.out.println("첫 번째 작업이 실행됩니다.");
		service.schedule(() -> System.out.println("두 번째 작업이 실행됩니다."), 5, TimeUnit.SECONDS);
		System.out.println("세 번째 작업이 실행됩니다.");

		service.shutdown();
		//		ExecutorService service = null;
		//		try {
		//			service = Executors.newSingleThreadExecutor();
		//			System.out.println("begin");
		//			service.execute(() -> System.out.println("Generic Task 1"));
		//			service.execute(() -> {
		//				for (int i = 0; i < 3; i++) {
		//					System.out.println("Printing Task: " + i);
		//				}
		//			});
		//
		//			service.execute(() -> System.out.println("Generic Task 2"));
		//			System.out.println("end");
		//		} finally {
		//			if (service != null) {
		//				service.shutdown();
		//			}
		//		}
	}
}
