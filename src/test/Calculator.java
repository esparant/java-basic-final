package test;

public interface Calculator {
    int plus(int i, int j);

    int multiple(int i, int j);

    default int exec(int i, int j) {

        return i + j;
    }
}

