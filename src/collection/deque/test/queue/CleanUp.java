package collection.deque.test.queue;

public class CleanUp implements Task {
    @Override
    public void execute() {
        System.out.println("사용하지 않는 데이터...");
    }
}
