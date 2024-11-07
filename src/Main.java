public class Main {
    public static void main(String[] args) {
        System.out.println("***");

        //Task#1
        int[] payments = new int[5];
        payments[0] = 32592;
        payments[1] = 28519;
        payments[2] = 30410;
        payments[3] = 25173;
        payments[4] = 31684;
        int sum = 0;
        for (int element:payments){
            sum += element;
        }
        System.out.println("Сумма трат за месяц составила "
                +sum +" рублей.");
        System.out.println("#1 ***");

        //Task#2
        int max = payments[0];
        int min = payments[0];
        for (int element:payments){
            if (element>max){
                max = element;
            }
            if (element<min){
                min = element;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила "
                +min +" рублей. Максимальная сумма трат за неделю составила "
                +max +" рублей.");
        System.out.println("#2 ***");

        //Task#3
        float averageValue = (float)sum/payments.length;
        System.out.println("Средняя сумма трат за месяц составила "
                +averageValue +" рублей");
        System.out.println("#3 ***");

        //Task#4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1;i >= 0;i--){
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
        System.out.println("#4 ***");
    }
}