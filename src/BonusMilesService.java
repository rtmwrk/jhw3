public class BonusMilesService {
    public int calculate(int priceTicket) {
        // var bonusRation - стоимость бонусной мили в денежных единицах
        int bonusRatio = 20;
        // var milesBuy - количество бонусных миль за покупку билета
        // Дробную часть бонусной мили отбрасываем
        int milesBuy = priceTicket / bonusRatio;

        return milesBuy;
    }
}
