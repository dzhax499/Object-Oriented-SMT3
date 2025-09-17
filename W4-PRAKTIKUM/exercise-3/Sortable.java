
abstract class Sortable {

    public abstract int compare(Sortable b);

    public static void shell_sort(Sortable[] a) {
        int n = a.length;

        // Start with a big gap, then reduce the gap
        for (int gap = n / 2; gap > 0; gap /= 2) {
            // Do a gapped insertion sort for this gap size
            for (int i = gap; i < n; i++) {
                Sortable temp = a[i];
                int j;

                // Shift earlier gap-sorted elements up until the correct location for a[i] is found
                for (j = i; j >= gap && a[j - gap].compare(temp) > 0; j -= gap) {
                    a[j] = a[j - gap];
                }

                // Put temp (the original a[i]) in its correct location
                a[j] = temp;
            }
        }
    }
}
