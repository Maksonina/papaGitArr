public class ArrStr{
    public static void main(String[] args) {
        String g = "иван Иванов";
        String b = "иван иванов";
        checkUserName(g,b);
    }
    public static void checkUserName(String g,String b){
        if(g.equalsIgnoreCase(b)){
            System.out.println("Ваше имя имеет длину "+g.length()+" символов");
        }
        else System.out.println("Выберите другое имя!");

    }
}

