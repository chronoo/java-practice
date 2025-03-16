package t;

/**
 * https://leetcode.com/problems/design-parking-system
 */
public class DesignParkingSystem {
    static class ParkingSystem {
        private final int[] park;

        public ParkingSystem(int big, int medium, int small) {
            park = new int[]{0, big, medium, small};
        }

        public boolean addCar(int carType) {
            park[carType]--;
            return park[carType] >= 0;
        }
    }
}
