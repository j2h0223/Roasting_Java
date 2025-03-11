import java.util.*;

class HashMapEx1 {
    public static void main(String[] args){
        HashMap map = new HashMap();
        map.put("myId", "1234");
        map.put("asdf", "1111");
        map.put("asdf", "1234");

        try(Scanner scanner = new Scanner(System.in)){
            while(true){
                System.out.println("= input id, password =");
                System.out.print("id : ");
                String id = scanner.nextLine().trim();

                System.out.print("password : ");
                String password = scanner.nextLine().trim();
                System.out.println();

                if (!map.containsKey(id)){
                    System.out.println("Doesn't exist id" + "Please enter again.");
                    continue;
                }
                if(!(map.get(id)).equals(password)){
                    System.out.println("Doesn't match password Please enter again");
                }else{
                    System.out.println("id and password match");
                    break;
                }
            }   // while end
        }catch (Exception E){
            System.out.println(E.toString());
        }

    }   // main end
}
