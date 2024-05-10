public class Main {

    public static void main(String[] args) {

        int[] array = {1, 5, 0, 6, 3, 0, 0, 4};

        System.out.println(countEvens(array));
        System.out.println(findMinMaxDifference(array));
        System.out.println(hasZeroNeighbors(array));

    }

    public static int countEvens(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int findMinMaxDifference(int[] arr) {
        // Проверяем, что массив не пустой
        if (arr.length == 0) {
            throw new IllegalArgumentException("Массив не должен быть пустым");
        }
        int min = arr[0];
        int max = arr[0];

        // Находим минимальный и максимальный элементы в массиве
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max - min;
    }

    public static boolean hasZeroNeighbors(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0 && arr[i + 1] == 0) {  // проверяем соседние элементы на нулевое значение
                return true;  // если найдены два соседних нуля, возвращаем true
            }
        }
        return false;  // если ни одной пары соседних нулей не найдено
    }

}