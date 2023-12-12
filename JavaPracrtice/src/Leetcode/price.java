package Leetcode;

public class price {
    public static void main(String[] args) {
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        System.out.println("Пример 1: " + maxProfit(prices1)); // Ожидаемый результат: 5

        int[] prices2 = {7, 6, 4, 3, 1};
        System.out.println("Пример 2: " + maxProfit(prices2)); // Ожидаемый результат: 0
    }

    public static int maxProfit(int[] prices) {
        int lsf = Integer.MAX_VALUE; // по крайней мере, пока
        int op = 0; // общая прибыль
        int pist = 0; // прибыль при продаже сегодня

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < lsf){ // если мы нашли новое значение покупки, которое больше, чем предыдущее
                lsf = prices[i]; // обновите наш минимум на данный момент
            }
            pist = prices[i] - lsf; // расчет прибыли при продаже сегодня с помощью, Buy - sell
            if(op < pist){ // если пост будет больше, чем наша предыдущая общая прибыль
                op = pist; // обновить общую прибыль
            }
        }
        return op; // return op
    }
}