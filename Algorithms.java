public class Algorithms {
    //Basic array search
    public static void main(String[] args) {
        int a[] = {10, 20, 30, 40, 50, 60, 70, 80, 90};

        int searchElement = 50;

        searchArr(a, searchElement);
        
    }

    public static void searchArr(int[] a, int searchElement) {
        boolean flag = false;

        for(int i = 0; i < a.length -1; i++) {
            if(searchElement == a[i]){
                System.out.println("Element found at index: " + i);
                flag = true;
                break;
            } else if(flag == false){
                System.out.println("Not found");
                break;
            }
        }
    }
}

