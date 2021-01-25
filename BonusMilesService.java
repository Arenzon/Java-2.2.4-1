public class BonusMilesService {
    public long calculate(int cost) {
        int price = 40;
        long miles = cost / price;
        return miles;
    }
}
