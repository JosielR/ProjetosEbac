package Mod11_ArrayListDomain;

import java.util.Comparator;

public class ArrayListCompNota implements Comparator<ArrayListAluno> {

    @Override
    public int compare(ArrayListAluno o1, ArrayListAluno o2) {
        return Double.compare(o1.getNota(), o2.getNota());
    }
}
