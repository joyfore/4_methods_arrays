class Main {

    static void familyArray() {

        String[] arr = { "Mom", "Dad", "Me", "Sister" };

        for (String i : arr) {

            System.out.println(i);
        }
    }


    static int[] numbersArray(int x, int y, int z) {

        int[] arr = { x, y, z };
        return arr;
    }

    static void correctAnswer(String[] array) {

        for (int i = 0; i < array.length; i++) {

            if (array[i].equals("Joice")) {

                System.out.println("Joice is in this array!");
            }
        }
    }

    public static void main(String[] args) {
        int[] newNumbers = numbersArray(2,4,5);
        for (int i : newNumbers) {

            System.out.println(i);
        }

        familyArray();

        String[] myFamily = {"Mom", "Joice", "Pet"};
        correctAnswer(myFamily);

        System.out.println(myFamily.length);
    }
}
