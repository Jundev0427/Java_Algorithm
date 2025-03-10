package collection.list;

public class BatchProcessorMain {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();
        MyLinkedList<Integer> list2 = new MyLinkedList<>();

        BatchProcessor processor = new BatchProcessor(list);
        processor.logic(10_000_000);


        BatchProcessor processor2 = new BatchProcessor(list2);
        processor2.logic(10_000_000);
    }
}
