package t;

import org.junit.jupiter.api.Test;
import t.ProductOfTheLastKNumbers.ProductOfNumbers;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class ProductOfTheLastKNumbersTest {
    ProductOfNumbers productOfNumbers = new ProductOfNumbers();

    @Test
    void test1() {
        productOfNumbers.add(3);        // [3]
        productOfNumbers.add(0);        // [3,0]
        productOfNumbers.add(2);        // [3,0,2]
        productOfNumbers.add(5);        // [3,0,2,5]
        productOfNumbers.add(4);        // [3,0,2,5,4]
        assertThat(productOfNumbers.getProduct(2)).isEqualTo(20); // return 20. The product of the last 2 numbers is 5 * 4 = 20
        assertThat(productOfNumbers.getProduct(3)).isEqualTo(40); // return 40. The product of the last 3 numbers is 2 * 5 * 4 = 40
        assertThat(productOfNumbers.getProduct(4)).isEqualTo(0); // return 0. The product of the last 4 numbers is 0 * 2 * 5 * 4 = 0
        productOfNumbers.add(8);        // [3,0,2,5,4,8]
        assertThat(productOfNumbers.getProduct(2)).isEqualTo(32); // return 32. The product of the last 2 numbers is 4 * 8 = 32
    }
}