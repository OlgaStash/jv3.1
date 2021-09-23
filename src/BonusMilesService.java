public class BonusMilesService {
    public int calculate(int price) {
        int oneMile = 20;
        int miles = price / oneMile;
        return miles;
    }
}
