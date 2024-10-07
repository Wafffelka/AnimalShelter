package AnimalShelter.Counter;

public class Counter implements AutoCloseable {
    private int count;
    private boolean closed;

    public Counter() {
        this.count = 0;
        this.closed = false;
    }

    public void add() {
        if (closed) {
            throw new IllegalStateException("Счет закрыт. Добавление невозможно.");
        }
        count++;
        //System.out.println("Счет увеличен. Текущее значение: " + count);
    }

    public int getCount() {
        return count;
    }

    @Override
    public void close() {
        if (closed) {
            throw new IllegalStateException("Счет уже был окончен.");
        }
        closed = true;
        //System.out.println("Счет закрыт.");
    }

    public boolean isClosed() {
        return closed;
    }
}

