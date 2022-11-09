public class Main {
    public static void main(String[] args) {

        person<String> iObj1 = new person<String>("Fadhlan Ashila");
        setcountry country1 = setcountry.Indonesia;
        System.out.println("Name");
        System.out.println(iObj1.getObject());
        System.out.println("Country of Origin");
        System.out.println(country1);

        person<String> iObj2 = new person<String>("Edward Kenway");
        setcountry country2 = setcountry.England;
        System.out.println("\nName");
        System.out.println(iObj2.getObject());
        System.out.println("Country of Origin");
        System.out.println(country2);

    }


}