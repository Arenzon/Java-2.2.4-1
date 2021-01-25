public class BonusMilesService {
    public long calculate(int cost) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;

        long miles = cost / price;


        return miles;
    }
}