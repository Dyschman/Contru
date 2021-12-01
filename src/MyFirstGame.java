public class MyFirstGame {
    public static void main(String[]args) {
    int compNumber=50;
    int userNumber=10;
    System.out.println("Щ1эдвгъадзэ!!!");
    while (true) {
            if (userNumber == compNumber) {
                System.out.println("Утек1уащ, къигъахъуэ!!!");
                break;
            }  if (userNumber > compNumber){
            System.out.println("Нэхъыбэ иптхащ "+ userNumber+"");
            userNumber--;
            }if (userNumber < compNumber) {
                System.out.println("Нэхъ мащ1э иптхар "+ userNumber+"");
                userNumber++;
            }
        }
        System.out.println("Джэгур иухащ!");
    }
}
