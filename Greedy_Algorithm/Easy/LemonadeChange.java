package Data_Structures_Algorithms.Greedy_Algorithm.Easy;

public class LemonadeChange {

        public static void main(String[] args) {
            int[] bills = {5, 5, 5, 10, 20};
            System.out.print("Queues of customers: ");
            for (int bill : bills) {
                System.out.print(bill + " ");
            }
            System.out.println();
            LemonadeChange solution = new LemonadeChange();
            boolean ans = solution.lemonadeChange(bills);
            if (ans)
                System.out.println("It is possible to provide change for all customers.");
            else
                System.out.println("It is not possible to provide change for all customers.");
        }

        public boolean lemonadeChange(int[] bills) {
    
            int five = 0;
            int ten = 0;
    
            for(int i=0;i<bills.length;i++){
                if(bills[i]==5)
                    five += 1;
                else if(bills[i]==10){
                    if(five <= 0)
                        return false;
                    five -= 1;
                    ten += 1;
                }else{
                    if(five <= 0)
                        return false;
                    if(ten <= 0)
                        if(five < 3)
                            return false;
                        else
                            five -= 3;
                    else if(five>0 && ten>0){
                        five -= 1;
                        ten -= 1;
                    }
                }
            }
            return true;
    }
}
