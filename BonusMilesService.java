public class BonusMilesService {
    public long calculate ( int cost ) {
        int price = 20;
        long miles = cost / price;
        return miles;
    }
}
