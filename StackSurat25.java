public class StackSurat25 {
    Surat25[] stack;
    int top;
    int size;

    public StackSurat25(int size) {
        this.size = size;
        stack = new Surat25[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Surat25 s) {
        if (!isFull()) {
            top++;
            stack[top] = s;
        } else {
            System.out.println("Stack penuh!");
        }
    }

    public Surat25 pop() {
        if (!isEmpty()) {
            return stack[top--];
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    public Surat25 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            return null;
        }
    }

    public boolean cariSurat(String nama) {
        for (int i = 0; i <= top; i++) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                return true;
            }
        }
        return false;
    }
}
