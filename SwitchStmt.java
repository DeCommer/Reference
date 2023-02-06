public class SwitchStmt {

    public static void main(String[] args) {
 
        String[] names = {"Joseph", "Constance", "Spoons"};
 
        int likes = names.length;

        switch (likes) {
            case 0:
                System.out.println("no one likes this");
            case 1:
                System.out.println(String.format("%s likes this", names[0]));
            case 2:
                System.out.println(String.format("%s and %s like this", names[0], names[1]));
            case 3:
                System.out.println(String.format("%s, %s and %s like this", names[0], names[1], names[2]));
            default:
                System.out.println(String.format("%s, %s and %d others like this", names[0], names[1], likes-2));
        }
 
    }    
}
